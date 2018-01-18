package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPColorIdentifier;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container coloridentifier {
 *     choice identifier {
 *         case dei-color-id {
 *             container deiColorId {
 *                 leaf vlanTag {
 *                     type NRP_VlanTag;
 *                 }
 *                 leaf-list deiValue {
 *                     type NRP_NaturalNumber;
 *                 }
 *                 leaf color {
 *                     type NRP_FrameColor;
 *                 }
 *                 uses G_NRP_DeiColorId;
 *             }
 *         }
 *         case desp-color-id {
 *             container despColorId {
 *                 leaf ipVersion {
 *                     type NRP_IpVersion;
 *                 }
 *                 leaf-list dscpValue {
 *                     type NRP_NaturalNumber;
 *                 }
 *                 leaf color {
 *                     type NRP_FrameColor;
 *                 }
 *                 uses G_NRP_DespColorId;
 *             }
 *         }
 *         case pcp-color-id {
 *             container pcpColorId {
 *                 leaf vlanTag {
 *                     type NRP_VlanTag;
 *                 }
 *                 leaf-list pcpValue {
 *                     type NRP_NaturalNumber;
 *                 }
 *                 leaf color {
 *                     type NRP_FrameColor;
 *                 }
 *                 uses G_NRP_PcpColorId;
 *             }
 *         }
 *         case sap-color-id {
 *             container serviceAccessPointColorId {
 *                 leaf color {
 *                     type NRP_FrameColor;
 *                 }
 *                 uses G_NRP_ServiceAccessPointColorId;
 *             }
 *         }
 *     }
 *     uses G_NRP_ColorIdentifier;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_ConnAdaptSpec/coloridentifier</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.ColoridentifierBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.ColoridentifierBuilder
 *
 */
public interface Coloridentifier
    extends
    ChildOf<GNRPConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.Coloridentifier>,
    GNRPColorIdentifier
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "coloridentifier").intern();


}

