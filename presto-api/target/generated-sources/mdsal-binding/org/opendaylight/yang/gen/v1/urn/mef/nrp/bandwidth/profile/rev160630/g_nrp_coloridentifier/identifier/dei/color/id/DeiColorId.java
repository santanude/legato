package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.dei.color.id;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDeiColorId;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPColorIdentifier;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * container deiColorId {
 *     leaf vlanTag {
 *         type NRP_VlanTag;
 *     }
 *     leaf-list deiValue {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf color {
 *         type NRP_FrameColor;
 *     }
 *     uses G_NRP_DeiColorId;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_ColorIdentifier/identifier/dei-color-id/deiColorId</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.dei.color.id.DeiColorIdBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.dei.color.id.DeiColorIdBuilder
 *
 */
public interface DeiColorId
    extends
    ChildOf<GNRPColorIdentifier>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.dei.color.id.DeiColorId>,
    GNRPDeiColorId
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "deiColorId").intern();


}

