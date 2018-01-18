package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPServiceFrameDelivery;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPConnectionType;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_CeFcSpec {
 *     leaf connectionType {
 *         type NRP_ConnectionType;
 *     }
 *     leaf unicastFrameDelivery {
 *         type NRP_ServiceFrameDelivery;
 *     }
 *     leaf multicastFrameDelivery {
 *         type NRP_ServiceFrameDelivery;
 *     }
 *     leaf broadcastFrameDelivery {
 *         type NRP_ServiceFrameDelivery;
 *     }
 *     leaf vcMaxServiceFrame {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf vcId {
 *         type NRP_PositiveInteger;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_CeFcSpec</i>
 *
 */
public interface GNRPCeFcSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_CeFcSpec").intern();

    /**
     * Virtual connection (EVC or OVC).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPConnectionType</code> <code>connectionType</code>, or <code>null</code> if not present
     */
    NRPConnectionType getConnectionType();
    
    /**
     * A Data Service Frame with a unicast Destination MAC Address is defined to be a 
     * Multicast DataService Frame. Reference MEF 10.3, Section 8.5.2.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPServiceFrameDelivery</code> <code>unicastFrameDelivery</code>, or <code>null</code> if not present
     */
    NRPServiceFrameDelivery getUnicastFrameDelivery();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPServiceFrameDelivery</code> <code>multicastFrameDelivery</code>, or <code>null</code> if not present
     */
    NRPServiceFrameDelivery getMulticastFrameDelivery();
    
    /**
     * A Data Service Frame with a broadcast Destination MAC Address is defined to be a
     * Broadcast DataService Frame. Reference MEF 10.3, Section 8.5.2 for EVC and MEF 
     * 26.1, Section x.y for OVC.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPServiceFrameDelivery</code> <code>broadcastFrameDelivery</code>, or <code>null</code> if not present
     */
    NRPServiceFrameDelivery getBroadcastFrameDelivery();
    
    /**
     * The value for the EVC or OVC Maximum Service Frame Size is a positive integer 
     * inbytes. Reference MEF 10.3, Section 8.9 for EVC and MEF 26.1 Section x.y for 
     * OVC.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>vcMaxServiceFrame</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getVcMaxServiceFrame();
    
    /**
     * The EVC ID is an arbitrary string administered by the Service Provider that is 
     * used to identifyan EVC within the CEN. MEF 10.3, Section 8.2.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>vcId</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getVcId();

}

