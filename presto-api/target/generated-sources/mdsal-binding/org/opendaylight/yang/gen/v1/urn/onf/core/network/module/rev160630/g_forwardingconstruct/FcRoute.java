package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcRoute;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * An FC object can have zero or more routes, each of which is defined as a list 
 * lower level FCobjects describing the flow across the network.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * list fcRoute {
 *     key "uuid"
 *     leaf uuid {
 *         type string;
 *     }
 *     leaf-list fc {
 *         type leafref;
 *     }
 *     uses G_FcRoute;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_ForwardingConstruct/fcRoute</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRouteBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRouteBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRouteKey
 *
 */
public interface FcRoute
    extends
    ChildOf<GForwardingConstruct>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRoute>,
    GFcRoute,
    Identifiable<FcRouteKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "fcRoute").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRouteKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FcRouteKey getKey();

}

