package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.EndpointMapForm;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_EndPointMap {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_EndPointMap</i>
 *
 */
public interface GNRPEndPointMap
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_EndPointMap").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getVlanId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.EndpointMapForm</code> <code>endpointMapForm</code>, or <code>null</code> if not present
     */
    EndpointMapForm getEndpointMapForm();

}

