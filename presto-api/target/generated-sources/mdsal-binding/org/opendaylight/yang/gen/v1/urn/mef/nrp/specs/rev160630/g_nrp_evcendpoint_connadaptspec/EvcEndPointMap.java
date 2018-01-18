package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * This attribute provides the list of CE-VLAN IDs that maps to the EVC. MEF 10.3 
 * and MEF 6.2 listthis attriubte (CE-VLAN ID/EVC map) as UNI service attribute 
 * while MEF 26.2 decided to move thison as endpoint service attribute, just as 
 * 10.1 and MEF 6.1 did. Decided to move this one toendpoint to be consistent. To 
 * be consitent, changing its name to EvcEntPointMap (MEF 26.2 listsas OVC 
 * Map).
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * list evcEndPointMap {
 *     key "vid"
 *     leaf vid {
 *         type NRP_PositiveInteger;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_EvcEndpoint_ConnAdaptSpec/evcEndPointMap</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMapBuilder
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMapKey
 *
 */
public interface EvcEndPointMap
    extends
    ChildOf<GNRPEvcEndpointConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMap>,
    Identifiable<EvcEndPointMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "evcEndPointMap").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>vid</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getVid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMapKey</code> <code>key</code>, or <code>null</code> if not present
     */
    EvcEndPointMapKey getKey();

}

