package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * choice identifier {
 *     case dei-color-id {
 *         container deiColorId {
 *             leaf vlanTag {
 *                 type NRP_VlanTag;
 *             }
 *             leaf-list deiValue {
 *                 type NRP_NaturalNumber;
 *             }
 *             leaf color {
 *                 type NRP_FrameColor;
 *             }
 *             uses G_NRP_DeiColorId;
 *         }
 *     }
 *     case desp-color-id {
 *         container despColorId {
 *             leaf ipVersion {
 *                 type NRP_IpVersion;
 *             }
 *             leaf-list dscpValue {
 *                 type NRP_NaturalNumber;
 *             }
 *             leaf color {
 *                 type NRP_FrameColor;
 *             }
 *             uses G_NRP_DespColorId;
 *         }
 *     }
 *     case pcp-color-id {
 *         container pcpColorId {
 *             leaf vlanTag {
 *                 type NRP_VlanTag;
 *             }
 *             leaf-list pcpValue {
 *                 type NRP_NaturalNumber;
 *             }
 *             leaf color {
 *                 type NRP_FrameColor;
 *             }
 *             uses G_NRP_PcpColorId;
 *         }
 *     }
 *     case sap-color-id {
 *         container serviceAccessPointColorId {
 *             leaf color {
 *                 type NRP_FrameColor;
 *             }
 *             uses G_NRP_ServiceAccessPointColorId;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_ColorIdentifier/identifier</i>
 *
 */
public interface Identifier
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "identifier").intern();


}

