package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPEvcEndPointRole;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMap;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_EvcEndpoint_ConnAdaptSpec {
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
 *     leaf evcEndPointId {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf testMegEnabled {
 *         type boolean;
 *     }
 *     leaf evcEndPointRole {
 *         type NRP_EvcEndPointRole;
 *     }
 *     list evcEndPointMap {
 *         key "vid"
 *         leaf vid {
 *             type NRP_PositiveInteger;
 *         }
 *     }
 *     leaf subscriberMegMipEbabled {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_EvcEndpoint_ConnAdaptSpec</i>
 *
 */
public interface GNRPEvcEndpointConnAdaptSpec
    extends
    DataObject,
    GNRPConnAdaptSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_EvcEndpoint_ConnAdaptSpec").intern();

    /**
     * The EVC End Point Identification. This attribute is adapted from MEF 26.2. MEF 
     * 10.3 uses "EVCper UNI" for EVC End Point, therefore there is no identificaiton 
     * attribute.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>evcEndPointId</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getEvcEndPointId();
    
    /**
     * When the value of the Test MEG Service Attribute is Enabled, the CEN MUST meet 
     * the mandatoryrequirements in Section 7.5 of MEF 30.1. that apply to the Test MEG
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>testMegEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTestMegEnabled();
    
    /**
     * The EVC End Point Role is ROOF or LEAF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPEvcEndPointRole</code> <code>evcEndPointRole</code>, or <code>null</code> if not present
     */
    NRPEvcEndPointRole getEvcEndPointRole();
    
    /**
     * This attribute provides the list of CE-VLAN IDs that maps to the EVC. MEF 10.3 
     * and MEF 6.2 listthis attriubte (CE-VLAN ID/EVC map) as UNI service attribute 
     * while MEF 26.2 decided to move thison as endpoint service attribute, just as MEF
     * 10.1 and MEF 6.1 did. Decided to move this one toendpoint to be consistent. To 
     * be consitent, changing its name to EvcEntPointMap (MEF 26.2 listsas OVC Endpoint
     * Map).
     *
     *
     *
     * @return <code>java.util.List</code> <code>evcEndPointMap</code>, or <code>null</code> if not present
     */
    List<EvcEndPointMap> getEvcEndPointMap();
    
    /**
     * When the value of the Subscriber MEG MIP Service Attribute is Enabled, the CEN 
     * MUST instantiatea Subscriber Level MIP.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>subscriberMegMipEbabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSubscriberMegMipEbabled();

}

