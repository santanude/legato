package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container nrp-uni-termination-attrs {
 *     leaf defaultCeVlanId {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf uniMegEnabled {
 *         type boolean;
 *     }
 *     leaf elmiEnabled {
 *         type boolean;
 *     }
 *     leaf serviceprovideruniprofile {
 *         type string;
 *     }
 *     leaf operatoruniprofile {
 *         type string;
 *     }
 *     container ingressBwpUni {
 *         leaf bwpFlowIndex {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf cir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cbs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf ebs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf couplingFlag {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf colorMode {
 *             type NRP_ColorMode;
 *         }
 *         leaf rank {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf tokenRequestOffset {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_BwpFlow;
 *     }
 *     container egressBwpUni {
 *         leaf bwpFlowIndex {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf cir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cbs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf ebs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf couplingFlag {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf colorMode {
 *             type NRP_ColorMode;
 *         }
 *         leaf rank {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf tokenRequestOffset {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_BwpFlow;
 *     }
 *     uses G_NRP_UNI_TerminationSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/network-topology/topology/node/termination-point/(urn:onf:core-network-module?revision=2016-06-30)ltp-attrs/lpList/lpSpec/terminationSpec/(urn:mef:nrp-specs?revision=2016-06-30)nrp-uni-termination-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrsBuilder
 *
 */
public interface NrpUniTerminationAttrs
    extends
    ChildOf<TerminationSpec1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>,
    GNRPUNITerminationSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "nrp-uni-termination-attrs").intern();


}

