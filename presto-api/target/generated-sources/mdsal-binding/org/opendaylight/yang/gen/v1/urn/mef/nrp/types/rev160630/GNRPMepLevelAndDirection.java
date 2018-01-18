package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * grouping G_NRP_MepLevelAndDirection {
 *     leaf nrp_level {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf nrp_direction {
 *         type NRP_MepDirection;
 *     }
 *     leaf nrp_megId {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_MepLevelAndDirection</i>
 *
 */
public interface GNRPMepLevelAndDirection
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "G_NRP_MepLevelAndDirection").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>nrpLevel</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getNrpLevel();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPMepDirection</code> <code>nrpDirection</code>, or <code>null</code> if not present
     */
    NRPMepDirection getNrpDirection();
    
    /**
     * @return <code>java.lang.String</code> <code>nrpMegId</code>, or <code>null</code> if not present
     */
    java.lang.String getNrpMegId();

}

