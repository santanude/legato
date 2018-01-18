package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.v.EnniCevid;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.EndpointMapForm;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * case map-form-v {
 *     leaf vuni-vid {
 *         type NRP_PositiveInteger;
 *     }
 *     list enni-cevid {
 *         key "vid"
 *         leaf vid {
 *             type NRP_PositiveInteger;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_EndPointMap/endpoint-map-form/map-form-v</i>
 *
 */
public interface MapFormV
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormV>,
    EndpointMapForm
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "map-form-v").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>vuniVid</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getVuniVid();
    
    /**
     * @return <code>java.util.List</code> <code>enniCevid</code>, or <code>null</code> if not present
     */
    List<EnniCevid> getEnniCevid();

}

