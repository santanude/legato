package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPhysicalLayer;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPInterfaceResiliency;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncMode;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_TerminationSpec {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_TerminationSpec</i>
 *
 */
public interface GNRPTerminationSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_TerminationSpec").intern();

    /**
     * This attribute is a list of physical layers, one for each physical link 
     * implementing the UNI orENNI. Different physical links can use different physical
     * layers. The Physical Layer for eachphysical link implementing the UNI or ENNI 
     * MUST be one of the PHYs listed in IEEE Std 802.3 -2012 but excluding 
     * 1000BASE-PX-D and 1000BASE-PX-U. Reference MEF 10.3, Section 9.2.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPhysicalLayer</code> <code>physicalLayer</code>, or <code>null</code> if not present
     */
    NRPPhysicalLayer getPhysicalLayer();
    
    /**
     * &amp;lt;p&amp;gt;The Synchronous Mode Service Attribute is a list with one item 
     * for each of the physicallinks. When the value of an item is 
     * &amp;quot;Enabled,&amp;quot; the bits transmitted from the CEN tothe CE on the 
     * physical link corresponding to the item can be used by the CE as a bit 
     * clockreference. Reference MEF 10.3, Section 9.3.&amp;lt;/p&amp;gt;
     *
     *
     *
     * @return <code>java.util.List</code> <code>syncMode</code>, or <code>null</code> if not present
     */
    List<SyncMode> getSyncMode();
    
    /**
     * This attribute specifies the number of links at the Ethernet Service Interface 
     * (UNI or ENNI).MEF 10.3, Section 9.4.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>numberOfLinks</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getNumberOfLinks();
    
    /**
     * This attribute value is one of None, 2-Link Active/Standby, All Active, or 
     * Other. MEF 10.3,Section 9.5. MEF 10.3.2, MEF 26.2
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPInterfaceResiliency</code> <code>resiliency</code>, or <code>null</code> if not present
     */
    NRPInterfaceResiliency getResiliency();
    
    /**
     * The Port Conversation ID to Aggregation Link Map Attribute is applicable only 
     * when theEthernetServiceInterface resiliency attribute has the value of All 
     * Active. Its value is a PortConversation ID to Aggregation Link Map as defined in
     * IEEE Std 802.1AX - 2014. MEF 10.3.2
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap</code> <code>portConvsIdToAggLinkMap</code>, or <code>null</code> if not present
     */
    PortConvsIdToAggLinkMap getPortConvsIdToAggLinkMap();
    
    /**
     * This value limits the length of frames carried by an EVC/OVC that associates an 
     * EVC/OVC EndPoint. The minimum of this maxinum number for UNI and ENNI are 
     * different. MEF 10.3, Section9.7.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>maxFrameSize</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getMaxFrameSize();
    
    /**
     * When the value of the Link OAM attribute is Enabled, Link OAM musd tbe run on 
     * all physical linksin the UNI/ENNI. MEF 10.3, Section 9.16.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>linkOamEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isLinkOamEnabled();
    
    /**
     * When the value of the Token Share Service attribute is Enabled, at least one 
     * Envelope at theUNI/ENNI MUST be able to have two or more Bandwidth Profiles 
     * mapped to it. MEF 6.2, Section8.2.1.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>tokenShareEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTokenShareEnabled();
    
    /**
     * MEF 10.3, Section 9.1.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serviceProviderUniId</code>, or <code>null</code> if not present
     */
    java.lang.String getServiceProviderUniId();

}

