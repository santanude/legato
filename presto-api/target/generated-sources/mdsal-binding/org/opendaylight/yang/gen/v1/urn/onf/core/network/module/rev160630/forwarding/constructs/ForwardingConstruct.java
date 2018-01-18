package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * list forwarding-construct {
 *     key "uuid"
 *     leaf uuid {
 *         type string;
 *     }
 *     leaf layerProtocolName {
 *         type LayerProtocolName;
 *     }
 *     leaf-list lowerLevelFc {
 *         type leafref;
 *     }
 *     list fcRoute {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         leaf-list fc {
 *             type leafref;
 *         }
 *         uses G_FcRoute;
 *     }
 *     list fcPort {
 *         key "topology" 
 *     "node" 
 *     "tp"
 *         leaf role {
 *             type PortRole;
 *         }
 *         leaf fcPortDirection {
 *             type PortDirection;
 *         }
 *         leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *         leaf tp {
 *             type tp-ref;
 *         }
 *         leaf cTagVlanId {
 *             type cTagVlanId;
 *         }
 *         augment \(urn:onf:core-network-module)forwarding-constructs\(urn:onf:core-network-module)forwarding-construct\(urn:onf:core-network-module)fcPort {
 *             status CURRENT;
 *             leaf cTagVlanId {
 *                 type cTagVlanId;
 *             }
 *         }
 *         uses G_FcPort;
 *     }
 *     container fcSpec {
 *         leaf uuid {
 *             type string;
 *         }
 *         list fcPortSpec {
 *             key "uuid"
 *             leaf uuid {
 *                 type string;
 *             }
 *             list ingressFcPortSet {
 *                 key "topology" 
 *             "node" 
 *             "tp"
 *                 leaf topology {
 *                     type topology-ref;
 *                 }
 *                 leaf node {
 *                     type node-ref;
 *                 }
 *                 leaf tp {
 *                     type tp-ref;
 *                 }
 *                 uses ltp-ref;
 *             }
 *             list egressFcPortSet {
 *                 key "topology" 
 *             "node" 
 *             "tp"
 *                 leaf topology {
 *                     type topology-ref;
 *                 }
 *                 leaf node {
 *                     type node-ref;
 *                 }
 *                 leaf tp {
 *                     type tp-ref;
 *                 }
 *                 uses ltp-ref;
 *             }
 *             leaf role {
 *                 type role;
 *             }
 *             uses G_FcPortSetSpec;
 *         }
 *         container nrp-ce-fcspec-attrs {
 *             leaf connectionType {
 *                 type NRP_ConnectionType;
 *             }
 *             leaf unicastFrameDelivery {
 *                 type NRP_ServiceFrameDelivery;
 *             }
 *             leaf multicastFrameDelivery {
 *                 type NRP_ServiceFrameDelivery;
 *             }
 *             leaf broadcastFrameDelivery {
 *                 type NRP_ServiceFrameDelivery;
 *             }
 *             leaf vcMaxServiceFrame {
 *                 type NRP_PositiveInteger;
 *             }
 *             leaf vcId {
 *                 type NRP_PositiveInteger;
 *             }
 *             uses G_NRP_CeFcSpec;
 *         }
 *         augment \(urn:onf:core-network-module)forwarding-constructs\(urn:onf:core-network-module)forwarding-construct\(urn:onf:core-network-module)fcSpec {
 *             status CURRENT;
 *             container nrp-ce-fcspec-attrs {
 *                 leaf connectionType {
 *                     type NRP_ConnectionType;
 *                 }
 *                 leaf unicastFrameDelivery {
 *                     type NRP_ServiceFrameDelivery;
 *                 }
 *                 leaf multicastFrameDelivery {
 *                     type NRP_ServiceFrameDelivery;
 *                 }
 *                 leaf broadcastFrameDelivery {
 *                     type NRP_ServiceFrameDelivery;
 *                 }
 *                 leaf vcMaxServiceFrame {
 *                     type NRP_PositiveInteger;
 *                 }
 *                 leaf vcId {
 *                     type NRP_PositiveInteger;
 *                 }
 *                 uses G_NRP_CeFcSpec;
 *             }
 *         }
 *         uses G_FcSpec;
 *     }
 *     leaf forwardingDirection {
 *         type ForwardingDirection;
 *     }
 *     container unimgr-attrs {
 *         leaf status {
 *             type status;
 *         }
 *     }
 *     augment \(urn:onf:core-network-module)forwarding-constructs\(urn:onf:core-network-module)forwarding-construct {
 *         status CURRENT;
 *         container unimgr-attrs {
 *             leaf status {
 *                 type status;
 *             }
 *         }
 *     }
 *     uses G_ForwardingConstruct;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/forwarding-constructs/forwarding-construct</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstructBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstructBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstructKey
 *
 */
public interface ForwardingConstruct
    extends
    ChildOf<ForwardingConstructs>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>,
    GForwardingConstruct,
    Identifiable<ForwardingConstructKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "forwarding-construct").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstructKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ForwardingConstructKey getKey();

}

