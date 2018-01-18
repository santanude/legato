package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPIpVersion;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * grouping G_NRP_DespColorId {
 *     leaf ipVersion {
 *         type NRP_IpVersion;
 *     }
 *     leaf-list dscpValue {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf color {
 *         type NRP_FrameColor;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_DespColorId</i>
 *
 */
public interface GNRPDespColorId
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "G_NRP_DespColorId").intern();

    /**
     * IPv4, or IPv6, or both IPv4 and IPv6.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPIpVersion</code> <code>ipVersion</code>, or <code>null</code> if not present
     */
    NRPIpVersion getIpVersion();
    
    /**
     * List DSCP values map to the same color.
     *
     *
     *
     * @return <code>java.util.List</code> <code>dscpValue</code>, or <code>null</code> if not present
     */
    List<NRPNaturalNumber> getDscpValue();
    
    /**
     * Green or Yellow
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor</code> <code>color</code>, or <code>null</code> if not present
     */
    NRPFrameColor getColor();

}

