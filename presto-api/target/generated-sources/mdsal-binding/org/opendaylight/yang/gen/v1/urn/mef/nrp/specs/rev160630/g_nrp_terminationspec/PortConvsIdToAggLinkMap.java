package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap;

/**
 * The Port Conversation ID to Aggregation Link Map Attribute is applicable only 
 * when theEthernetServiceInterface resiliency attribute has the value of All 
 * Active. Its value is a PortConversation ID to Aggregation Link Map as defined 
 * IEEE Std 802.1AX - 2014. MEF 10.3.2
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container portConvsIdToAggLinkMap {
 *     leaf conversationId {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf linkId {
 *         type NRP_NaturalNumber;
 *     }
 *     uses G_NRP_ConversationIdToAggrgationLinkMap;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_TerminationSpec/portConvsIdToAggLinkMap</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMapBuilder
 *
 */
public interface PortConvsIdToAggLinkMap
    extends
    ChildOf<GNRPTerminationSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>,
    GNRPConversationIdToAggrgationLinkMap
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "portConvsIdToAggLinkMap").intern();


}

