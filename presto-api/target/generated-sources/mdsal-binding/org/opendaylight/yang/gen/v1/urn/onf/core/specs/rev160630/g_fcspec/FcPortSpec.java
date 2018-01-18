package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * list fcPortSpec {
 *     key "uuid"
 *     leaf uuid {
 *         type string;
 *     }
 *     list ingressFcPortSet {
 *         key "topology" 
 *     "node" 
 *     "tp"
 *         leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *         leaf tp {
 *             type tp-ref;
 *         }
 *         uses ltp-ref;
 *     }
 *     list egressFcPortSet {
 *         key "topology" 
 *     "node" 
 *     "tp"
 *         leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *         leaf tp {
 *             type tp-ref;
 *         }
 *         uses ltp-ref;
 *     }
 *     leaf role {
 *         type role;
 *     }
 *     uses G_FcPortSetSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_FcSpec/fcPortSpec</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpecBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpecBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpecKey
 *
 */
public interface FcPortSpec
    extends
    ChildOf<GFcSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>,
    GFcPortSetSpec,
    Identifiable<FcPortSpecKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "fcPortSpec").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpecKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FcPortSpecKey getKey();

}

