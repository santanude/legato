package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container ingressBwpFlow {
 *     leaf bwpFlowIndex {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf cir {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf cirMax {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf cbs {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf eir {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf eirMax {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf ebs {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf couplingFlag {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf colorMode {
 *         type NRP_ColorMode;
 *     }
 *     leaf rank {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf tokenRequestOffset {
 *         type NRP_NaturalNumber;
 *     }
 *     uses G_NRP_BwpFlow;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_ConnAdaptSpec/ingressBwpFlow</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlowBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlowBuilder
 *
 */
public interface IngressBwpFlow
    extends
    ChildOf<GNRPConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlow>,
    GNRPBwpFlow
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "ingressBwpFlow").intern();


}

