package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * References the specification that describes the capability and internal 
 * structure of of the FC(e.g. The arrangement of switches for a particular 
 * instance is described by a referencedFcSpec). The specification allows 
 * interpretation of FcPort role and switch configurations etc.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * container fcSpec {
 *     leaf uuid {
 *         type string;
 *     }
 *     list fcPortSpec {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         list ingressFcPortSet {
 *             key "topology" 
 *         "node" 
 *         "tp"
 *             leaf topology {
 *                 type topology-ref;
 *             }
 *             leaf node {
 *                 type node-ref;
 *             }
 *             leaf tp {
 *                 type tp-ref;
 *             }
 *             uses ltp-ref;
 *         }
 *         list egressFcPortSet {
 *             key "topology" 
 *         "node" 
 *         "tp"
 *             leaf topology {
 *                 type topology-ref;
 *             }
 *             leaf node {
 *                 type node-ref;
 *             }
 *             leaf tp {
 *                 type tp-ref;
 *             }
 *             uses ltp-ref;
 *         }
 *         leaf role {
 *             type role;
 *         }
 *         uses G_FcPortSetSpec;
 *     }
 *     uses G_FcSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_ForwardingConstruct/fcSpec</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpecBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpecBuilder
 *
 */
public interface FcSpec
    extends
    ChildOf<GForwardingConstruct>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>,
    GFcSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "fcSpec").intern();


}

