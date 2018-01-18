package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * grouping G_NRP_AggLinkDepth {
 *     container nrp_vlanId {
 *         leaf vid {
 *             type NRP_PositiveInteger;
 *         }
 *         uses G_NRP_VlanId;
 *     }
 *     leaf nrp_linkNumber {
 *         type NRP_NaturalNumber;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_AggLinkDepth</i>
 *
 */
public interface GNRPAggLinkDepth
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "G_NRP_AggLinkDepth").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId</code> <code>nrpVlanId</code>, or <code>null</code> if not present
     */
    NrpVlanId getNrpVlanId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>nrpLinkNumber</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getNrpLinkNumber();

}

