package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLtpSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The specification of the LTP defines internal structure of the LTP. The 
 * specification allowsinterpretation of organisation of LPs making up the LTP and 
 * also identifies which inter-LTPassociations are valid.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * container ltpSpec {
 *     uses G_LtpSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_LogicalTerminationPoint/ltpSpec</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LtpSpecBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LtpSpecBuilder
 *
 */
public interface LtpSpec
    extends
    ChildOf<GLogicalTerminationPoint>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LtpSpec>,
    GLtpSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "ltpSpec").intern();


}

