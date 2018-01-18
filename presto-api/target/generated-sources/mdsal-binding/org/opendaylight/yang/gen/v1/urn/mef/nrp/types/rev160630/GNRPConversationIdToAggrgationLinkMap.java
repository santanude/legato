package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * grouping G_NRP_ConversationIdToAggrgationLinkMap {
 *     leaf conversationId {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf linkId {
 *         type NRP_NaturalNumber;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_ConversationIdToAggrgationLinkMap</i>
 *
 */
public interface GNRPConversationIdToAggrgationLinkMap
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "G_NRP_ConversationIdToAggrgationLinkMap").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>conversationId</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getConversationId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>linkId</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getLinkId();

}

