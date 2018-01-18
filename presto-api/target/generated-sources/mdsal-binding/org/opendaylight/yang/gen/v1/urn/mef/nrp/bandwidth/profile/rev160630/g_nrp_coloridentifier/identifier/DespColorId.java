package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.Identifier;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * case desp-color-id {
 *     container despColorId {
 *         leaf ipVersion {
 *             type NRP_IpVersion;
 *         }
 *         leaf-list dscpValue {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf color {
 *             type NRP_FrameColor;
 *         }
 *         uses G_NRP_DespColorId;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_ColorIdentifier/identifier/desp-color-id</i>
 *
 */
public interface DespColorId
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.DespColorId>,
    Identifier
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "desp-color-id").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId</code> <code>despColorId</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId getDespColorId();

}

