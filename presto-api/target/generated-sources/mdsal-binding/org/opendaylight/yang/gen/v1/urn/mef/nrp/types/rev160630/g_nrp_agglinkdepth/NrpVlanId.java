package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPAggLinkDepth;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPVlanId;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * container nrp_vlanId {
 *     leaf vid {
 *         type NRP_PositiveInteger;
 *     }
 *     uses G_NRP_VlanId;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_AggLinkDepth/nrp_vlanId</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanIdBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanIdBuilder
 *
 */
public interface NrpVlanId
    extends
    ChildOf<GNRPAggLinkDepth>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>,
    GNRPVlanId
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "nrp_vlanId").intern();


}

