package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * grouping G_NRP_SourceMacAddressLimit {
 *     leaf enabled {
 *         type boolean;
 *     }
 *     leaf limit {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf timeInterval {
 *         type NRP_NaturalNumber;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_SourceMacAddressLimit</i>
 *
 */
public interface GNRPSourceMacAddressLimit
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "G_NRP_SourceMacAddressLimit").intern();

    /**
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnabled();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>limit</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getLimit();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>timeInterval</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getTimeInterval();

}

