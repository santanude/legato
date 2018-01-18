package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * The L2CP Peering service attribute value MUST be an empty list, or a listof 
 * entries identifying protocols to be Peered where each entry consists 
 * of{Destination Address, Protocol Identifier} or {Destination Address, 
 * ProtocolIdentifier, Link Identifier}.MEF 45, Section 8.2
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * list l2cpPeering {
 *     key "linkId"
 *     leaf destinationMacAddress {
 *         type string;
 *     }
 *     leaf protocolType {
 *         type NRP_ProtocolFrameType;
 *     }
 *     leaf linkId {
 *         type string;
 *     }
 *     leaf protocolId {
 *         type string;
 *     }
 *     uses G_NRP_L2cpPeering;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_ConnAdaptSpec/l2cpPeering</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeeringBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeeringBuilder
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeeringKey
 *
 */
public interface L2cpPeering
    extends
    ChildOf<GNRPConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>,
    GNRPL2cpPeering,
    Identifiable<L2cpPeeringKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "l2cpPeering").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeeringKey</code> <code>key</code>, or <code>null</code> if not present
     */
    L2cpPeeringKey getKey();

}

