package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSyncModePerLink;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * &amp;lt;p&amp;gt;The Synchronous Mode Service Attribute is a list with one item for 
 * of the physicallinks. When the value of an item is &amp;quot;Enabled,&amp;quot; the 
 * transmitted from the CEN tothe CE on the physical link corresponding to the 
 * can be used by the CE as a bit clockreference. Reference MEF 10.3, Section 
 * 9.3.&amp;lt;/p&amp;gt;
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * list syncMode {
 *     key "linkId"
 *     leaf linkId {
 *         type string;
 *     }
 *     leaf syncModeEnabled {
 *         type boolean;
 *     }
 *     uses G_NRP_SyncModePerLink;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_TerminationSpec/syncMode</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncModeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncModeBuilder
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncModeKey
 *
 */
public interface SyncMode
    extends
    ChildOf<GNRPTerminationSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncMode>,
    GNRPSyncModePerLink,
    Identifiable<SyncModeKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "syncMode").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncModeKey</code> <code>key</code>, or <code>null</code> if not present
     */
    SyncModeKey getKey();

}

