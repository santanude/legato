package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container nrp-ivc-endpoint-conn-adapt-spec-attrs {
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
 *     uses G_NRP_IvcEndpoint_ConnAdaptSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/network-topology/topology/node/termination-point/(urn:onf:core-network-module?revision=2016-06-30)ltp-attrs/lpList/lpSpec/adapterSpec/(urn:mef:nrp-specs?revision=2016-06-30)nrp-ivc-endpoint-conn-adapt-spec-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrsBuilder
 *
 */
public interface NrpIvcEndpointConnAdaptSpecAttrs
    extends
    ChildOf<AdapterSpec1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>,
    GNRPIvcEndpointConnAdaptSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "nrp-ivc-endpoint-conn-adapt-spec-attrs").intern();


}

