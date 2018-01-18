package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * container ltp-attrs {
 *     list lpList {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         leaf layerProtocolName {
 *             type LayerProtocolName;
 *         }
 *         container lpSpec {
 *             container adapterSpec {
 *                 uses G_ConnectionPointAndAdapterSpec;
 *             }
 *             container terminationSpec {
 *                 uses G_TerminationSpec;
 *             }
 *             list adapterPropertySpecList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 uses G_AdapterPropertySpec;
 *             }
 *             container providerViewSpec {
 *                 uses G_ProviderViewSpec;
 *             }
 *             list serverSpecList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 uses G_ServerSpec;
 *             }
 *             uses G_LayerProtocolSpec;
 *         }
 *         leaf configuredClientCapacity {
 *             type string;
 *         }
 *         leaf lpDirection {
 *             type TerminationDirection;
 *         }
 *         leaf terminationState {
 *             type string;
 *         }
 *         uses G_LayerProtocol;
 *     }
 *     container ltpSpec {
 *         uses G_LtpSpec;
 *     }
 *     leaf ltpDirection {
 *         type TerminationDirection;
 *     }
 *     uses G_LogicalTerminationPoint;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/network-topology/topology/node/termination-point/(urn:onf:core-network-module?revision=2016-06-30)ltp-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrsBuilder
 *
 */
public interface LtpAttrs
    extends
    ChildOf<TerminationPoint1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>,
    GLogicalTerminationPoint
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "ltp-attrs").intern();


}

