package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * Ordered list of LayerProtocols that this LTP is comprised of where the first 
 * entry in the list is the lowest server layer (e.g. physical)
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * list lpList {
 *     key "uuid"
 *     leaf uuid {
 *         type string;
 *     }
 *     leaf layerProtocolName {
 *         type LayerProtocolName;
 *     }
 *     container lpSpec {
 *         container adapterSpec {
 *             uses G_ConnectionPointAndAdapterSpec;
 *         }
 *         container terminationSpec {
 *             uses G_TerminationSpec;
 *         }
 *         list adapterPropertySpecList {
 *             key "uuid"
 *             leaf uuid {
 *                 type string;
 *             }
 *             uses G_AdapterPropertySpec;
 *         }
 *         container providerViewSpec {
 *             uses G_ProviderViewSpec;
 *         }
 *         list serverSpecList {
 *             key "uuid"
 *             leaf uuid {
 *                 type string;
 *             }
 *             uses G_ServerSpec;
 *         }
 *         uses G_LayerProtocolSpec;
 *     }
 *     leaf configuredClientCapacity {
 *         type string;
 *     }
 *     leaf lpDirection {
 *         type TerminationDirection;
 *     }
 *     leaf terminationState {
 *         type string;
 *     }
 *     uses G_LayerProtocol;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_LogicalTerminationPoint/lpList</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpListKey
 *
 */
public interface LpList
    extends
    ChildOf<GLogicalTerminationPoint>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>,
    GLayerProtocol,
    Identifiable<LpListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "lpList").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    LpListKey getKey();

}

