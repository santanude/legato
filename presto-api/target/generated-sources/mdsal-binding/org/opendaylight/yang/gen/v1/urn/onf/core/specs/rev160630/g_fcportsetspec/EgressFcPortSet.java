package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * list egressFcPortSet {
 *     key "topology" 
 * "node" 
 * "tp"
 *     leaf topology {
 *         type topology-ref;
 *     }
 *     leaf node {
 *         type node-ref;
 *     }
 *     leaf tp {
 *         type tp-ref;
 *     }
 *     uses ltp-ref;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_FcPortSetSpec/egressFcPortSet</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSetBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSetBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSetKey
 *
 */
public interface EgressFcPortSet
    extends
    ChildOf<GFcPortSetSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSet>,
    LtpRef,
    Identifiable<EgressFcPortSetKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "egressFcPortSet").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSetKey</code> <code>key</code>, or <code>null</code> if not present
     */
    EgressFcPortSetKey getKey();

}

