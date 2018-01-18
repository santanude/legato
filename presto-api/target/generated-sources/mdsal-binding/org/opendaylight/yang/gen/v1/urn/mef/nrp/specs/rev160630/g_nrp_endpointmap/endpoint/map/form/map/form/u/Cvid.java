package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * list cvid {
 *     key "vid"
 *     leaf vid {
 *         type NRP_PositiveInteger;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_EndPointMap/endpoint-map-form/map-form-u/cvid</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.CvidBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.CvidBuilder
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.CvidKey
 *
 */
public interface Cvid
    extends
    ChildOf<GNRPEndPointMap>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>,
    Identifiable<CvidKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "cvid").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>vid</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getVid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.CvidKey</code> <code>key</code>, or <code>null</code> if not present
     */
    CvidKey getKey();

}

