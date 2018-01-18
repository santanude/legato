package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.ForwardingDirection;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.LayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRoute;
import java.util.List;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * grouping G_ForwardingConstruct {
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
 *         uses G_FcSpec;
 *     }
 *     leaf forwardingDirection {
 *         type ForwardingDirection;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_ForwardingConstruct</i>
 *
 */
public interface GForwardingConstruct
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "G_ForwardingConstruct").intern();

    /**
     * The layerProtocol at which the FC enables potential for forwarding.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.LayerProtocolName</code> <code>layerProtocolName</code>, or <code>null</code> if not present
     */
    LayerProtocolName getLayerProtocolName();
    
    /**
     * An FC object supports a recursive aggregation relationship such that the 
     * internal constructionof an FC can be exposed as multiple lower level FC objects 
     * (partitioning). Aggregation is usedas for the FD to allow changes in hierarchy.
     *
     *
     *
     * @return <code>java.util.List</code> <code>lowerLevelFc</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getLowerLevelFc();
    
    /**
     * An FC object can have zero or more routes, each of which is defined as a list of
     * lower level FCobjects describing the flow across the network.
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcRoute</code>, or <code>null</code> if not present
     */
    List<FcRoute> getFcRoute();
    
    /**
     * The association of the FC to LTPs is made via FcPorts (essentially the ports of 
     * the FC).
     *
     *
     *
     * @return <code>java.util.List</code> <code>fcPort</code>, or <code>null</code> if not present
     */
    List<FcPort> getFcPort();
    
    /**
     * References the specification that describes the capability and internal 
     * structure of of the FC(e.g. The arrangement of switches for a particular 
     * instance is described by a referencedFcSpec). The specification allows 
     * interpretation of FcPort role and switch configurations etc.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec</code> <code>fcSpec</code>, or <code>null</code> if not present
     */
    FcSpec getFcSpec();
    
    /**
     * The directionality of the ForwardingConstruct. Is applicable to simple 
     * ForwardingConstructswhere all FcPorts are BIDIRECTIONAL (the ForwardingConstruct
     * will be BIDIRECTIONAL) orUNIDIRECTIONAL (the ForwardingConstruct will be 
     * UNIDIRECTIONAL). Is not present in more complexcases.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.ForwardingDirection</code> <code>forwardingDirection</code>, or <code>null</code> if not present
     */
    ForwardingDirection getForwardingDirection();

}

