package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPL2cpAddressSet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlow;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.Coloridentifier;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.EgressBwpFlow;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_ConnAdaptSpec {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_ConnAdaptSpec</i>
 *
 */
public interface GNRPConnAdaptSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_ConnAdaptSpec").intern();

    /**
     * MEF 10.3, Section 10.9
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit</code> <code>sourceMacAddressLimit</code>, or <code>null</code> if not present
     */
    SourceMacAddressLimit getSourceMacAddressLimit();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface</code> <code>ceExternalInterface</code>, or <code>null</code> if not present
     */
    CeExternalInterface getCeExternalInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.Coloridentifier</code> <code>coloridentifier</code>, or <code>null</code> if not present
     */
    Coloridentifier getColoridentifier();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlow</code> <code>ingressBwpFlow</code>, or <code>null</code> if not present
     */
    IngressBwpFlow getIngressBwpFlow();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.EgressBwpFlow</code> <code>egressBwpFlow</code>, or <code>null</code> if not present
     */
    EgressBwpFlow getEgressBwpFlow();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPL2cpAddressSet</code> <code>l2cpAddressSet</code>, or <code>null</code> if not present
     */
    NRPL2cpAddressSet getL2cpAddressSet();
    
    /**
     * The L2CP Peering service attribute value MUST be an empty list, or a listof 
     * entries identifying protocols to be Peered where each entry consists 
     * of{Destination Address, Protocol Identifier} or {Destination Address, 
     * ProtocolIdentifier, Link Identifier}.MEF 45, Section 8.2
     *
     *
     *
     * @return <code>java.util.List</code> <code>l2cpPeering</code>, or <code>null</code> if not present
     */
    List<L2cpPeering> getL2cpPeering();

}

