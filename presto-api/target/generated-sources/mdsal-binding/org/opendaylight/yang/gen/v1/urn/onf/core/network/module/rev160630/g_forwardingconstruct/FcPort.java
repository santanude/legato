package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The association of the FC to LTPs is made via FcPorts (essentially the ports of 
 * the FC).
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * list fcPort {
 *     key "topology" 
 * "node" 
 * "tp"
 *     leaf role {
 *         type PortRole;
 *     }
 *     leaf fcPortDirection {
 *         type PortDirection;
 *     }
 *     leaf topology {
 *         type topology-ref;
 *     }
 *     leaf node {
 *         type node-ref;
 *     }
 *     leaf tp {
 *         type tp-ref;
 *     }
 *     uses G_FcPort;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_ForwardingConstruct/fcPort</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPortBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPortKey
 *
 */
public interface FcPort
    extends
    ChildOf<GForwardingConstruct>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>,
    GFcPort,
    Identifiable<FcPortKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "fcPort").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPortKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FcPortKey getKey();

}

