package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPVlanTag;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * grouping G_NRP_PcpColorId {
 *     leaf vlanTag {
 *         type NRP_VlanTag;
 *     }
 *     leaf-list pcpValue {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf color {
 *         type NRP_FrameColor;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_PcpColorId</i>
 *
 */
public interface GNRPPcpColorId
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "G_NRP_PcpColorId").intern();

    /**
     * Which vlan tag pcp to be used for color identier, S tag or C tag. S-tag is not 
     * valid for EvcEndPoint. 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPVlanTag</code> <code>vlanTag</code>, or <code>null</code> if not present
     */
    NRPVlanTag getVlanTag();
    
    /**
     * List PCP values map to the same color.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pcpValue</code>, or <code>null</code> if not present
     */
    List<NRPNaturalNumber> getPcpValue();
    
    /**
     * Green or Yellow.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor</code> <code>color</code>, or <code>null</code> if not present
     */
    NRPFrameColor getColor();

}

