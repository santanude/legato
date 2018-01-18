package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

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
 * list ivcEndPointMap {
 *     key "vlanId"
 *     leaf vlanId {
 *         type NRP_PositiveInteger;
 *     }
 *     choice endpoint-map-form {
 *         case map-form-e {
 *             list enni-svid {
 *                 key "vid"
 *                 leaf vid {
 *                     type NRP_PositiveInteger;
 *                 }
 *             }
 *         }
 *         case map-form-t {
 *             leaf root-svid {
 *                 type NRP_PositiveInteger;
 *             }
 *             leaf leaf-svid {
 *                 type NRP_PositiveInteger;
 *             }
 *         }
 *         case map-form-u {
 *             list cvid {
 *                 key "vid"
 *                 leaf vid {
 *                     type NRP_PositiveInteger;
 *                 }
 *             }
 *         }
 *         case map-form-v {
 *             leaf vuni-vid {
 *                 type NRP_PositiveInteger;
 *             }
 *             list enni-cevid {
 *                 key "vid"
 *                 leaf vid {
 *                     type NRP_PositiveInteger;
 *                 }
 *             }
 *         }
 *     }
 *     uses G_NRP_EndPointMap;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_IvcEndpoint_ConnAdaptSpec/ivcEndPointMap</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMapBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMapBuilder
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMapKey
 *
 */
public interface IvcEndPointMap
    extends
    ChildOf<GNRPIvcEndpointConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>,
    GNRPEndPointMap,
    Identifiable<IvcEndPointMapKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "ivcEndPointMap").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMapKey</code> <code>key</code>, or <code>null</code> if not present
     */
    IvcEndPointMapKey getKey();

}

