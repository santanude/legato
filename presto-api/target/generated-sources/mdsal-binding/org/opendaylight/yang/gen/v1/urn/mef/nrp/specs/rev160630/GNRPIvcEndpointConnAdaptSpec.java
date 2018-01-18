package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPEndPointRole;
import java.util.List;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_IvcEndpoint_ConnAdaptSpec {
 *     leaf ivcEndPointId {
 *         type string;
 *     }
 *     leaf testMegEnabled {
 *         type boolean;
 *     }
 *     leaf ivcEndPointRole {
 *         type NRP_EndPointRole;
 *     }
 *     list ivcEndPointMap {
 *         key "vlanId"
 *         leaf vlanId {
 *             type NRP_PositiveInteger;
 *         }
 *         choice endpoint-map-form {
 *             case map-form-e {
 *                 list enni-svid {
 *                     key "vid"
 *                     leaf vid {
 *                         type NRP_PositiveInteger;
 *                     }
 *                 }
 *             }
 *             case map-form-t {
 *                 leaf root-svid {
 *                     type NRP_PositiveInteger;
 *                 }
 *                 leaf leaf-svid {
 *                     type NRP_PositiveInteger;
 *                 }
 *             }
 *             case map-form-u {
 *                 list cvid {
 *                     key "vid"
 *                     leaf vid {
 *                         type NRP_PositiveInteger;
 *                     }
 *                 }
 *             }
 *             case map-form-v {
 *                 leaf vuni-vid {
 *                     type NRP_PositiveInteger;
 *                 }
 *                 list enni-cevid {
 *                     key "vid"
 *                     leaf vid {
 *                         type NRP_PositiveInteger;
 *                     }
 *                 }
 *             }
 *         }
 *         uses G_NRP_EndPointMap;
 *     }
 *     leaf subscriberMegMipEnabled {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_IvcEndpoint_ConnAdaptSpec</i>
 *
 */
public interface GNRPIvcEndpointConnAdaptSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_IvcEndpoint_ConnAdaptSpec").intern();

    /**
     * The EVC End Point Identification. This attribute is adapted from MEF 26.2. MEF 
     * 10.3 uses "EVCper UNI" for EVC End Point, therefore there is no identificaiton 
     * attribute.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>ivcEndPointId</code>, or <code>null</code> if not present
     */
    java.lang.String getIvcEndPointId();
    
    /**
     * When the value of the Test MEG Service Attribute is Enabled, the CEN MUST meet 
     * the mandatoryrequirements in Section 7.5 of MEF 30.1. that apply to the Test MEG
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>testMegEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isTestMegEnabled();
    
    /**
     * The EVC End Point Role is ROOF or LEAF.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPEndPointRole</code> <code>ivcEndPointRole</code>, or <code>null</code> if not present
     */
    NRPEndPointRole getIvcEndPointRole();
    
    /**
     * This attribute provides the list of CE-VLAN IDs that maps to the EVC. MEF 10.3 
     * and MEF 6.2 listthis attriubte (CE-VLAN ID/EVC map) as UNI service attribute 
     * while MEF 26.2 decided to move thison as endpoint service attribute, just as MEF
     * 10.1 and MEF 6.1 did. Decided to move this one toendpoint to be consistent. To 
     * be consitent, changing its name to EvcEntPointMap (MEF 26.2 listsas OVC Endpoint
     * Map).
     *
     *
     *
     * @return <code>java.util.List</code> <code>ivcEndPointMap</code>, or <code>null</code> if not present
     */
    List<IvcEndPointMap> getIvcEndPointMap();
    
    /**
     * When the value of the Subscriber MEG MIP Service Attribute is Enabled, the CEN 
     * MUST instantiatea Subscriber Level MIP.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>subscriberMegMipEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isSubscriberMegMipEnabled();

}

