package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container nrp-termination-spec-attrs {
 *     leaf physicalLayer {
 *         type NRP_PhysicalLayer;
 *     }
 *     list syncMode {
 *         key "linkId"
 *         leaf linkId {
 *             type string;
 *         }
 *         leaf syncModeEnabled {
 *             type boolean;
 *         }
 *         uses G_NRP_SyncModePerLink;
 *     }
 *     leaf numberOfLinks {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf resiliency {
 *         type NRP_InterfaceResiliency;
 *     }
 *     container portConvsIdToAggLinkMap {
 *         leaf conversationId {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf linkId {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_ConversationIdToAggrgationLinkMap;
 *     }
 *     leaf maxFrameSize {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf linkOamEnabled {
 *         type boolean;
 *     }
 *     leaf tokenShareEnabled {
 *         type boolean;
 *     }
 *     leaf serviceProviderUniId {
 *         type string;
 *     }
 *     uses G_NRP_TerminationSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/network-topology/topology/node/termination-point/(urn:onf:core-network-module?revision=2016-06-30)ltp-attrs/lpList/lpSpec/terminationSpec/(urn:mef:nrp-specs?revision=2016-06-30)nrp-termination-spec-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpTerminationSpecAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpTerminationSpecAttrsBuilder
 *
 */
public interface NrpTerminationSpecAttrs
    extends
    ChildOf<TerminationSpec1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpTerminationSpecAttrs>,
    GNRPTerminationSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "nrp-termination-spec-attrs").intern();


}

