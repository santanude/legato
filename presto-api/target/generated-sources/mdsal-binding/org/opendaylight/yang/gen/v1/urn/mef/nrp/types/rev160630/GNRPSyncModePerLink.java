package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * grouping G_NRP_SyncModePerLink {
 *     leaf linkId {
 *         type string;
 *     }
 *     leaf syncModeEnabled {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_SyncModePerLink</i>
 *
 */
public interface GNRPSyncModePerLink
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "G_NRP_SyncModePerLink").intern();

    /**
     * @return <code>java.lang.String</code> <code>linkId</code>, or <code>null</code> if not present
     */
    java.lang.String getLinkId();
    
    /**
     * @return <code>java.lang.Boolean</code> <code>syncModeEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSyncModeEnabled();

}

