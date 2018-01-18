package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container nrp-ce-fcspec-attrs {
 *     leaf connectionType {
 *         type NRP_ConnectionType;
 *     }
 *     leaf unicastFrameDelivery {
 *         type NRP_ServiceFrameDelivery;
 *     }
 *     leaf multicastFrameDelivery {
 *         type NRP_ServiceFrameDelivery;
 *     }
 *     leaf broadcastFrameDelivery {
 *         type NRP_ServiceFrameDelivery;
 *     }
 *     leaf vcMaxServiceFrame {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf vcId {
 *         type NRP_PositiveInteger;
 *     }
 *     uses G_NRP_CeFcSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/forwarding-constructs/forwarding-construct/fcSpec/(urn:mef:nrp-specs?revision=2016-06-30)nrp-ce-fcspec-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrsBuilder
 *
 */
public interface NrpCeFcspecAttrs
    extends
    ChildOf<FcSpec1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>,
    GNRPCeFcSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "nrp-ce-fcspec-attrs").intern();


}

