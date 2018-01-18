package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPColorIdentifier;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * container despColorId {
 *     leaf ipVersion {
 *         type NRP_IpVersion;
 *     }
 *     leaf-list dscpValue {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf color {
 *         type NRP_FrameColor;
 *     }
 *     uses G_NRP_DespColorId;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_ColorIdentifier/identifier/desp-color-id/despColorId</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorIdBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorIdBuilder
 *
 */
public interface DespColorId
    extends
    ChildOf<GNRPColorIdentifier>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>,
    GNRPDespColorId
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "despColorId").intern();


}

