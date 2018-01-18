package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * grouping G_NRP_ServiceAccessPointColorId {
 *     leaf color {
 *         type NRP_FrameColor;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_ServiceAccessPointColorId</i>
 *
 */
public interface GNRPServiceAccessPointColorId
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "G_NRP_ServiceAccessPointColorId").intern();

    /**
     * Green or Yellow.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor</code> <code>color</code>, or <code>null</code> if not present
     */
    NRPFrameColor getColor();

}

