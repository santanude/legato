package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container nrp-conn-adapt-spec-attrs {
 *     container sourceMacAddressLimit {
 *         leaf enabled {
 *             type boolean;
 *         }
 *         leaf limit {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf timeInterval {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_SourceMacAddressLimit;
 *     }
 *     container CeExternalInterface {
 *         leaf physicalLayer {
 *             type NRP_PhysicalLayer;
 *         }
 *         list syncMode {
 *             key "linkId"
 *             leaf linkId {
 *                 type string;
 *             }
 *             leaf syncModeEnabled {
 *                 type boolean;
 *             }
 *             uses G_NRP_SyncModePerLink;
 *         }
 *         leaf numberOfLinks {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf resiliency {
 *             type NRP_InterfaceResiliency;
 *         }
 *         container portConvsIdToAggLinkMap {
 *             leaf conversationId {
 *                 type NRP_NaturalNumber;
 *             }
 *             leaf linkId {
 *                 type NRP_NaturalNumber;
 *             }
 *             uses G_NRP_ConversationIdToAggrgationLinkMap;
 *         }
 *         leaf maxFrameSize {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf linkOamEnabled {
 *             type boolean;
 *         }
 *         leaf tokenShareEnabled {
 *             type boolean;
 *         }
 *         leaf serviceProviderUniId {
 *             type string;
 *         }
 *         uses G_NRP_TerminationSpec;
 *     }
 *     container coloridentifier {
 *         choice identifier {
 *             case dei-color-id {
 *                 container deiColorId {
 *                     leaf vlanTag {
 *                         type NRP_VlanTag;
 *                     }
 *                     leaf-list deiValue {
 *                         type NRP_NaturalNumber;
 *                     }
 *                     leaf color {
 *                         type NRP_FrameColor;
 *                     }
 *                     uses G_NRP_DeiColorId;
 *                 }
 *             }
 *             case desp-color-id {
 *                 container despColorId {
 *                     leaf ipVersion {
 *                         type NRP_IpVersion;
 *                     }
 *                     leaf-list dscpValue {
 *                         type NRP_NaturalNumber;
 *                     }
 *                     leaf color {
 *                         type NRP_FrameColor;
 *                     }
 *                     uses G_NRP_DespColorId;
 *                 }
 *             }
 *             case pcp-color-id {
 *                 container pcpColorId {
 *                     leaf vlanTag {
 *                         type NRP_VlanTag;
 *                     }
 *                     leaf-list pcpValue {
 *                         type NRP_NaturalNumber;
 *                     }
 *                     leaf color {
 *                         type NRP_FrameColor;
 *                     }
 *                     uses G_NRP_PcpColorId;
 *                 }
 *             }
 *             case sap-color-id {
 *                 container serviceAccessPointColorId {
 *                     leaf color {
 *                         type NRP_FrameColor;
 *                     }
 *                     uses G_NRP_ServiceAccessPointColorId;
 *                 }
 *             }
 *         }
 *         uses G_NRP_ColorIdentifier;
 *     }
 *     container ingressBwpFlow {
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
 *     container egressBwpFlow {
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
 *     leaf l2cpAddressSet {
 *         type NRP_L2cpAddressSet;
 *     }
 *     list l2cpPeering {
 *         key "linkId"
 *         leaf destinationMacAddress {
 *             type string;
 *         }
 *         leaf protocolType {
 *             type NRP_ProtocolFrameType;
 *         }
 *         leaf linkId {
 *             type string;
 *         }
 *         leaf protocolId {
 *             type string;
 *         }
 *         uses G_NRP_L2cpPeering;
 *     }
 *     uses G_NRP_ConnAdaptSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/network-topology/topology/node/termination-point/(urn:onf:core-network-module?revision=2016-06-30)ltp-attrs/lpList/lpSpec/adapterSpec/(urn:mef:nrp-specs?revision=2016-06-30)nrp-conn-adapt-spec-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrsBuilder
 *
 */
public interface NrpConnAdaptSpecAttrs
    extends
    ChildOf<AdapterSpec1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>,
    GNRPConnAdaptSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "nrp-conn-adapt-spec-attrs").intern();


}

