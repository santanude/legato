package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * module onf-core-network-module {
 *     yang-version 1;
 *     namespace "urn:onf:core-network-module";
 *     prefix "onf-cn";
 *
 *     import onf-core-specs { prefix "onf-cs"; }
 *     
 *     import network-topology { prefix "nt"; }
 *     
 *     import onf-core-network-types { prefix "onf-cnt"; }
 *     revision 2016-06-30 {
 *         description "";
 *     }
 *
 *     container forwarding-constructs {
 *         list forwarding-construct {
 *             key "uuid"
 *             leaf uuid {
 *                 type string;
 *             }
 *             leaf layerProtocolName {
 *                 type LayerProtocolName;
 *             }
 *             leaf-list lowerLevelFc {
 *                 type leafref;
 *             }
 *             list fcRoute {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 leaf-list fc {
 *                     type leafref;
 *                 }
 *                 uses G_FcRoute;
 *             }
 *             list fcPort {
 *                 key "topology" 
 *             "node" 
 *             "tp"
 *                 leaf role {
 *                     type PortRole;
 *                 }
 *                 leaf fcPortDirection {
 *                     type PortDirection;
 *                 }
 *                 leaf topology {
 *                     type topology-ref;
 *                 }
 *                 leaf node {
 *                     type node-ref;
 *                 }
 *                 leaf tp {
 *                     type tp-ref;
 *                 }
 *                 leaf cTagVlanId {
 *                     type cTagVlanId;
 *                 }
 *                 augment \(urn:onf:core-network-module)forwarding-constructs\(urn:onf:core-network-module)forwarding-construct\(urn:onf:core-network-module)fcPort {
 *                     status CURRENT;
 *                     leaf cTagVlanId {
 *                         type cTagVlanId;
 *                     }
 *                 }
 *                 uses G_FcPort;
 *             }
 *             container fcSpec {
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 list fcPortSpec {
 *                     key "uuid"
 *                     leaf uuid {
 *                         type string;
 *                     }
 *                     list ingressFcPortSet {
 *                         key "topology" 
 *                     "node" 
 *                     "tp"
 *                         leaf topology {
 *                             type topology-ref;
 *                         }
 *                         leaf node {
 *                             type node-ref;
 *                         }
 *                         leaf tp {
 *                             type tp-ref;
 *                         }
 *                         uses ltp-ref;
 *                     }
 *                     list egressFcPortSet {
 *                         key "topology" 
 *                     "node" 
 *                     "tp"
 *                         leaf topology {
 *                             type topology-ref;
 *                         }
 *                         leaf node {
 *                             type node-ref;
 *                         }
 *                         leaf tp {
 *                             type tp-ref;
 *                         }
 *                         uses ltp-ref;
 *                     }
 *                     leaf role {
 *                         type role;
 *                     }
 *                     uses G_FcPortSetSpec;
 *                 }
 *                 container nrp-ce-fcspec-attrs {
 *                     leaf connectionType {
 *                         type NRP_ConnectionType;
 *                     }
 *                     leaf unicastFrameDelivery {
 *                         type NRP_ServiceFrameDelivery;
 *                     }
 *                     leaf multicastFrameDelivery {
 *                         type NRP_ServiceFrameDelivery;
 *                     }
 *                     leaf broadcastFrameDelivery {
 *                         type NRP_ServiceFrameDelivery;
 *                     }
 *                     leaf vcMaxServiceFrame {
 *                         type NRP_PositiveInteger;
 *                     }
 *                     leaf vcId {
 *                         type NRP_PositiveInteger;
 *                     }
 *                     uses G_NRP_CeFcSpec;
 *                 }
 *                 augment \(urn:onf:core-network-module)forwarding-constructs\(urn:onf:core-network-module)forwarding-construct\(urn:onf:core-network-module)fcSpec {
 *                     status CURRENT;
 *                     container nrp-ce-fcspec-attrs {
 *                         leaf connectionType {
 *                             type NRP_ConnectionType;
 *                         }
 *                         leaf unicastFrameDelivery {
 *                             type NRP_ServiceFrameDelivery;
 *                         }
 *                         leaf multicastFrameDelivery {
 *                             type NRP_ServiceFrameDelivery;
 *                         }
 *                         leaf broadcastFrameDelivery {
 *                             type NRP_ServiceFrameDelivery;
 *                         }
 *                         leaf vcMaxServiceFrame {
 *                             type NRP_PositiveInteger;
 *                         }
 *                         leaf vcId {
 *                             type NRP_PositiveInteger;
 *                         }
 *                         uses G_NRP_CeFcSpec;
 *                     }
 *                 }
 *                 uses G_FcSpec;
 *             }
 *             leaf forwardingDirection {
 *                 type ForwardingDirection;
 *             }
 *             container unimgr-attrs {
 *                 leaf status {
 *                     type status;
 *                 }
 *             }
 *             augment \(urn:onf:core-network-module)forwarding-constructs\(urn:onf:core-network-module)forwarding-construct {
 *                 status CURRENT;
 *                 container unimgr-attrs {
 *                     leaf status {
 *                         type status;
 *                     }
 *                 }
 *             }
 *             uses G_ForwardingConstruct;
 *         }
 *     }
 *
 *     grouping G_ForwardingConstruct {
 *         leaf layerProtocolName {
 *             type LayerProtocolName;
 *         }
 *         leaf-list lowerLevelFc {
 *             type leafref;
 *         }
 *         list fcRoute {
 *             key "uuid"
 *             leaf uuid {
 *                 type string;
 *             }
 *             leaf-list fc {
 *                 type leafref;
 *             }
 *             uses G_FcRoute;
 *         }
 *         list fcPort {
 *             key "topology" 
 *         "node" 
 *         "tp"
 *             leaf role {
 *                 type PortRole;
 *             }
 *             leaf fcPortDirection {
 *                 type PortDirection;
 *             }
 *             leaf topology {
 *                 type topology-ref;
 *             }
 *             leaf node {
 *                 type node-ref;
 *             }
 *             leaf tp {
 *                 type tp-ref;
 *             }
 *             uses G_FcPort;
 *         }
 *         container fcSpec {
 *             leaf uuid {
 *                 type string;
 *             }
 *             list fcPortSpec {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 list ingressFcPortSet {
 *                     key "topology" 
 *                 "node" 
 *                 "tp"
 *                     leaf topology {
 *                         type topology-ref;
 *                     }
 *                     leaf node {
 *                         type node-ref;
 *                     }
 *                     leaf tp {
 *                         type tp-ref;
 *                     }
 *                     uses ltp-ref;
 *                 }
 *                 list egressFcPortSet {
 *                     key "topology" 
 *                 "node" 
 *                 "tp"
 *                     leaf topology {
 *                         type topology-ref;
 *                     }
 *                     leaf node {
 *                         type node-ref;
 *                     }
 *                     leaf tp {
 *                         type tp-ref;
 *                     }
 *                     uses ltp-ref;
 *                 }
 *                 leaf role {
 *                     type role;
 *                 }
 *                 uses G_FcPortSetSpec;
 *             }
 *             uses G_FcSpec;
 *         }
 *         leaf forwardingDirection {
 *             type ForwardingDirection;
 *         }
 *     }
 *     grouping G_FcRoute {
 *         leaf uuid {
 *             type string;
 *         }
 *         leaf-list fc {
 *             type leafref;
 *         }
 *     }
 *     grouping G_LogicalTerminationPoint {
 *         list lpList {
 *             key "uuid"
 *             leaf uuid {
 *                 type string;
 *             }
 *             leaf layerProtocolName {
 *                 type LayerProtocolName;
 *             }
 *             container lpSpec {
 *                 container adapterSpec {
 *                     uses G_ConnectionPointAndAdapterSpec;
 *                 }
 *                 container terminationSpec {
 *                     uses G_TerminationSpec;
 *                 }
 *                 list adapterPropertySpecList {
 *                     key "uuid"
 *                     leaf uuid {
 *                         type string;
 *                     }
 *                     uses G_AdapterPropertySpec;
 *                 }
 *                 container providerViewSpec {
 *                     uses G_ProviderViewSpec;
 *                 }
 *                 list serverSpecList {
 *                     key "uuid"
 *                     leaf uuid {
 *                         type string;
 *                     }
 *                     uses G_ServerSpec;
 *                 }
 *                 uses G_LayerProtocolSpec;
 *             }
 *             leaf configuredClientCapacity {
 *                 type string;
 *             }
 *             leaf lpDirection {
 *                 type TerminationDirection;
 *             }
 *             leaf terminationState {
 *                 type string;
 *             }
 *             uses G_LayerProtocol;
 *         }
 *         container ltpSpec {
 *             uses G_LtpSpec;
 *         }
 *         leaf ltpDirection {
 *             type TerminationDirection;
 *         }
 *     }
 *     grouping G_FcPort {
 *         leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *         leaf tp {
 *             type tp-ref;
 *         }
 *         leaf role {
 *             type PortRole;
 *         }
 *         leaf fcPortDirection {
 *             type PortDirection;
 *         }
 *     }
 *     grouping G_LayerProtocol {
 *         leaf layerProtocolName {
 *             type LayerProtocolName;
 *         }
 *         container lpSpec {
 *             container adapterSpec {
 *                 uses G_ConnectionPointAndAdapterSpec;
 *             }
 *             container terminationSpec {
 *                 uses G_TerminationSpec;
 *             }
 *             list adapterPropertySpecList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 uses G_AdapterPropertySpec;
 *             }
 *             container providerViewSpec {
 *                 uses G_ProviderViewSpec;
 *             }
 *             list serverSpecList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 uses G_ServerSpec;
 *             }
 *             uses G_LayerProtocolSpec;
 *         }
 *         leaf configuredClientCapacity {
 *             type string;
 *         }
 *         leaf lpDirection {
 *             type TerminationDirection;
 *         }
 *         leaf terminationState {
 *             type string;
 *         }
 *     }
 *
 *     augment \(urn:TBD:params:xml:ns:yang:network-topology)network-topology\(urn:TBD:params:xml:ns:yang:network-topology)topology\(urn:TBD:params:xml:ns:yang:network-topology)node\(urn:TBD:params:xml:ns:yang:network-topology)termination-point {
 *         status CURRENT;
 *         container ltp-attrs {
 *             list lpList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 leaf layerProtocolName {
 *                     type LayerProtocolName;
 *                 }
 *                 container lpSpec {
 *                     container adapterSpec {
 *                         uses G_ConnectionPointAndAdapterSpec;
 *                     }
 *                     container terminationSpec {
 *                         uses G_TerminationSpec;
 *                     }
 *                     list adapterPropertySpecList {
 *                         key "uuid"
 *                         leaf uuid {
 *                             type string;
 *                         }
 *                         uses G_AdapterPropertySpec;
 *                     }
 *                     container providerViewSpec {
 *                         uses G_ProviderViewSpec;
 *                     }
 *                     list serverSpecList {
 *                         key "uuid"
 *                         leaf uuid {
 *                             type string;
 *                         }
 *                         uses G_ServerSpec;
 *                     }
 *                     uses G_LayerProtocolSpec;
 *                 }
 *                 leaf configuredClientCapacity {
 *                     type string;
 *                 }
 *                 leaf lpDirection {
 *                     type TerminationDirection;
 *                 }
 *                 leaf terminationState {
 *                     type string;
 *                 }
 *                 uses G_LayerProtocol;
 *             }
 *             container ltpSpec {
 *                 uses G_LtpSpec;
 *             }
 *             leaf ltpDirection {
 *                 type TerminationDirection;
 *             }
 *             uses G_LogicalTerminationPoint;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface OnfCoreNetworkModuleData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs</code> <code>forwardingConstructs</code>, or <code>null</code> if not present
     */
    ForwardingConstructs getForwardingConstructs();

}

