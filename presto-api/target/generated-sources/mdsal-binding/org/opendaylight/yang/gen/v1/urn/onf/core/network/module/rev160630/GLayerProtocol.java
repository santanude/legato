package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.TerminationDirection;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.LayerProtocolName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * grouping G_LayerProtocol {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_LayerProtocol</i>
 *
 */
public interface GLayerProtocol
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "G_LayerProtocol").intern();

    /**
     * Indicate the specific layer-protocol described by the LayerProtocol entity.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.LayerProtocolName</code> <code>layerProtocolName</code>, or <code>null</code> if not present
     */
    LayerProtocolName getLayerProtocolName();
    
    /**
     * The LpSpec identifies the internal structure of the LP explaining internal 
     * flexibilities, degreeof termination and degree of adaptation on both client and 
     * server side.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec</code> <code>lpSpec</code>, or <code>null</code> if not present
     */
    LpSpec getLpSpec();
    
    /**
     * Provides a summarized view of the client capacity that is configurable for use. 
     * Note the cleintLTP association should provide all necessary detail hence this 
     * attribute is questionable.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>configuredClientCapacity</code>, or <code>null</code> if not present
     */
    java.lang.String getConfiguredClientCapacity();
    
    /**
     * The overall directionality of the LP.- A BIDIRECTIONAL LP will have some SINK 
     * and/or SOURCE flowss.- A SINK LP can only contain elements with SINK flows or 
     * CONTRA_DIRECTION_SOURCE flows- A SOURCE LP can only contain SOURCE flows or 
     * CONTRA_DIRECTION_SINK flows
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.TerminationDirection</code> <code>lpDirection</code>, or <code>null</code> if not present
     */
    TerminationDirection getLpDirection();
    
    /**
     * Indicates whether the layer is terminated and if so how.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>terminationState</code>, or <code>null</code> if not present
     */
    java.lang.String getTerminationState();

}

