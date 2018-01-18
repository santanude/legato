/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight;

//import static org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType.CONFIGURATION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnull;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.DataObjectModification;
import org.opendaylight.controller.md.sal.binding.api.DataTreeChangeListener;
import org.opendaylight.controller.md.sal.binding.api.DataTreeModification;
import org.opendaylight.controller.md.sal.binding.api.DataTreeIdentifier;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;
//import org.opendaylight.unimgr.mef.nrp.impl.connectivityservice.TapiConnectivityServiceImpl;
import org.opendaylight.yang.gen.v1.urn.mef.yang.mef.legato.services.rev171215.MefServices;
import org.opendaylight.yang.gen.v1.urn.mef.yang.mef.legato.services.rev171215.mef.services.carrier.ethernet.SubscriberServices;
import org.opendaylight.yang.gen.v1.urn.mef.yang.mef.legato.services.rev171215.mef.services.carrier.ethernet.subscriber.services.Evc;
import org.opendaylight.yang.gen.v1.urn.mef.yang.mef.legato.services.rev171215.mef.services.carrier.ethernet.subscriber.services.evc.cos.names.CosName;
import org.opendaylight.yang.gen.v1.urn.mef.yang.mef.legato.services.rev171215.mef.services.carrier.ethernet.subscriber.services.evc.end.points.EndPoint;
import org.opendaylight.yang.gen.v1.urn.mef.yang.mef.types.rev171215.VlanIdType;
/*import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.CreateConnectivityServiceInputBuilder;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.create.connectivity.service.input.ConnConstraintBuilder;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.create.connectivity.service.input.EndPointBuilder;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.connectivity.service.end.point.LayerProtocolBuilder;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.connectivity.service.end.point.LayerProtocol;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.common.rev170712.Eth;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.common.rev170712.PortDirection;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.ServiceType;
import org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.common.rev170712.Uuid;*/

import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.concepts.ListenerRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LegatoServiceController implements AutoCloseable, DataTreeChangeListener<MefServices> {

	private static final Logger LOG = LoggerFactory.getLogger(LegatoServiceController.class);
	private static final InstanceIdentifier<MefServices> SERVICE_IID = InstanceIdentifier.builder(MefServices.class).build();
	private DataBroker dataBroker;
	private ListenerRegistration<LegatoServiceController> dataTreeChangeListenerRegistration;
	//private static TapiConnectivityServiceImpl tapiConnectivityService;
	
	/*private static ModificationType WRITE = DataObjectModification.ModificationType.WRITE;
	private static ModificationType DELETE = DataObjectModification.ModificationType.DELETE;
	private static ModificationType SUBTREE_MODIFIED = DataObjectModification.ModificationType.SUBTREE_MODIFIED;
	*/
	
	
	public LegatoServiceController() {
	   }
	
	
	 public void setDataBroker(final DataBroker dataBroker) {
	        this.dataBroker = dataBroker;
	    }
	 
	 
	  public void init() {
	    	 LOG.info("Initializing int()...");
	    	 
	    	
	    	 dataTreeChangeListenerRegistration = dataBroker.registerDataTreeChangeListener(
	                 new DataTreeIdentifier<MefServices>(LogicalDatastoreType.CONFIGURATION, SERVICE_IID), this);
	    	 
	    	
	    	
	    }
	  
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	public void onDataTreeChanged(@Nonnull Collection<DataTreeModification<MefServices>> changes) {
		
		for(DataTreeModification<MefServices> change: changes) {
    		
    		LOG.info("inside onDataTreeChanged =========" + change.getRootNode().toString());
    		final DataObjectModification<MefServices> rootNode = change.getRootNode();
    		
    	
    		switch (rootNode.getModificationType()) {
    		
    		
                case SUBTREE_MODIFIED:
                    updateNode(change, dataBroker);
                    break;
                    
                case WRITE:
                    // Treat an overwrite as an update
                    boolean update = change.getRootNode().getDataBefore() != null;
                    
                    if (update) {
                        updateNode(change, dataBroker);
                    } else {
                        addNode(change, dataBroker);
                    }
                    break;
                    
                case DELETE:
                    deleteNode(change);
                    break;
                    
                default:
                    break;
            }
    		 
    		 
		}
		
	}
	
	
	private static void updateNode(DataTreeModification<MefServices> updateDataObject, DataBroker dataBroker){
		 
		LOG.info(" inside updateNode()");
		
		if (updateDataObject.getRootPath() != null && updateDataObject.getRootNode() != null) {
            LOG.info("Node {} ", updateDataObject.getRootNode().getIdentifier());
            
            DataObjectModification<MefServices> rootNode = updateDataObject.getRootNode();
			try{
				
				parseNode(rootNode);
			
			}catch(Exception ex){
				LOG.error("error "+ ex.getMessage() );
			}
        }			
		
		LOG.info("===END updateNode()==");
	}
	
	
	
	
	
	private static void addNode(DataTreeModification<MefServices> newDataObject, DataBroker dataBroker){
		 
		LOG.info(" inside addNode()");
		
		if (newDataObject.getRootPath() != null && newDataObject.getRootNode() != null) {
            LOG.info("uni node {} ", newDataObject.getRootNode().getIdentifier());
            
            DataObjectModification<MefServices> rootNode = newDataObject.getRootNode();
		
			try{
				 
				parseNode(rootNode);
				
			
			}catch(Exception ex){
				LOG.error("error "+ ex.getMessage() );
			}
			
        }			
		
		
		 LOG.info("===END addNode()==");
		
	}
	
	private static void deleteNode(DataTreeModification<MefServices> change){
		 
		LOG.info(" inside deleteNode()");
	}

	
	private static void parseNode(DataObjectModification<MefServices> rootNode){
		if(rootNode.getDataAfter().getCarrierEthernet().getSubscriberServices() != null){
			SubscriberServices subscriberServices = rootNode.getDataAfter().getCarrierEthernet().getSubscriberServices();
			LOG.info("HERE");
			
			List<Evc> evcList = subscriberServices.getEvc();
			if(evcList != null){
				for(Evc evc : evcList){
					LOG.info("EVC ID = " + evc.getEvcId().getValue() + ", MaxNumOfEvcEndPoint = " + evc.getMaxNumOfEvcEndPoint() + 
					", Max Frame = "+ evc.getMaxFrameSize().getValue() + ", status = " + evc.getStatus()
					+ ", max end point = " + evc.getMaxNumOfEvcEndPoint());
					
					if(evc.getCosNames().getCosName() != null){
						for(CosName cosName : evc.getCosNames().getCosName()){
							LOG.info("cosName = " + cosName.getName().getValue());
						}
					}
					
					
					if(evc.getEndPoints().getEndPoint() != null){
						for(EndPoint endPoint : evc.getEndPoints().getEndPoint()){
							LOG.info("UNI id = " + endPoint.getUniId().getValue().toString() + " , role name = " + endPoint.getRole().getName().toString()
							+ ", status = "+ endPoint.getStatus());
							
							 if(endPoint.getCeVlans().getCeVlan() != null){
								 for( VlanIdType vlanIdType : endPoint.getCeVlans().getCeVlan()){
									 LOG.info("vlanIdType id = " + vlanIdType.getValue());
								 }
							 }
						}
					}
					
				}
			}
			
			
			createConnection();
			
		}
	}
	
	
	
	private static void createConnection(){
		LOG.info("inside createConnection()");
	/*	
		 
   	 //////////////////////////////////////////////////
   	 CreateConnectivityServiceInputBuilder createConnServiceInputBuilder = new CreateConnectivityServiceInputBuilder();
   	 ConnConstraintBuilder connConstraintBuilder = new ConnConstraintBuilder();
   	 connConstraintBuilder.setServiceLevel("best-effort");
   	 connConstraintBuilder.setServiceType(ServiceType.PointToPointConnectivity);
   	 createConnServiceInputBuilder.setConnConstraint(connConstraintBuilder.build());
   	 //////////////////////////////////////////////////
   	 
   	 //////////////////////////////////////////////////
   	 
   	 EndPointBuilder endPointBuilder = new EndPointBuilder();
   	 LayerProtocolBuilder layerProtocolBuilder = new LayerProtocolBuilder();
   	 
   	 List<org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.create.connectivity.service.input.EndPoint> endpointList = new ArrayList<org.opendaylight.yang.gen.v1.urn.mef.yang.tapi.connectivity.rev170712.create.connectivity.service.input.EndPoint>(); 
   	 List<LayerProtocol> layerList = new ArrayList<LayerProtocol>();
   	 
   	 
   	 layerProtocolBuilder.setLocalId("eth");
   	 layerProtocolBuilder.setLayerProtocolName(Eth.class);
   	 
   	 layerList.add(layerProtocolBuilder.build());
   	 
   	 Uuid uuid =  new Uuid("123123123123");
   	 endPointBuilder.setServiceInterfacePoint(uuid);
   	 endPointBuilder.setDirection(PortDirection.Bidirectional);
   	 endPointBuilder.setLayerProtocol(layerList);
   	// endPointBuilder.setName(value);
   	 //endPointBuilder.setCapacity(value);
   	 endpointList.add(endPointBuilder.build()) ;
   	 
   	 endPointBuilder = new EndPointBuilder();
   	 
   	 Uuid uuid2 =  new Uuid("43926539302");
   	 endPointBuilder.setServiceInterfacePoint(uuid2);
   	 endPointBuilder.setDirection(PortDirection.Bidirectional);
   	 endPointBuilder.setLayerProtocol(layerList);
   	 //endPointBuilder.setRole(value);
   	// endPointBuilder.setName(value);
   	 //endPointBuilder.setCapacity(value);
   	 endpointList.add(endPointBuilder.build()) ;
   	 
   	 
   	 createConnServiceInputBuilder.setEndPoint(endpointList);
   	 //////////////////////////////////////////////////
   	 
   	 tapiConnectivityService.createConnectivityService(createConnServiceInputBuilder.build());
   	 
   	 LOG.info("REQUEST = " + createConnServiceInputBuilder.toString());
   	 */
	}
	
	
}
