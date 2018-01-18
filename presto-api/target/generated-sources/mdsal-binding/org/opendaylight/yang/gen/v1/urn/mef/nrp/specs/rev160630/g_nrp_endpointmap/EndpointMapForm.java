package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * choice endpoint-map-form {
 *     case map-form-e {
 *         list enni-svid {
 *             key "vid"
 *             leaf vid {
 *                 type NRP_PositiveInteger;
 *             }
 *         }
 *     }
 *     case map-form-t {
 *         leaf root-svid {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf leaf-svid {
 *             type NRP_PositiveInteger;
 *         }
 *     }
 *     case map-form-u {
 *         list cvid {
 *             key "vid"
 *             leaf vid {
 *                 type NRP_PositiveInteger;
 *             }
 *         }
 *     }
 *     case map-form-v {
 *         leaf vuni-vid {
 *             type NRP_PositiveInteger;
 *         }
 *         list enni-cevid {
 *             key "vid"
 *             leaf vid {
 *                 type NRP_PositiveInteger;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_EndPointMap/endpoint-map-form</i>
 *
 */
public interface EndpointMapForm
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "endpoint-map-form").intern();


}

