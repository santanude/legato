package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * The LpSpec identifies the internal structure of the LP explaining internal 
 * flexibilities, degreeof termination and degree of adaptation on both client and 
 * server side.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * container lpSpec {
 *     container adapterSpec {
 *         uses G_ConnectionPointAndAdapterSpec;
 *     }
 *     container terminationSpec {
 *         uses G_TerminationSpec;
 *     }
 *     list adapterPropertySpecList {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         uses G_AdapterPropertySpec;
 *     }
 *     container providerViewSpec {
 *         uses G_ProviderViewSpec;
 *     }
 *     list serverSpecList {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         uses G_ServerSpec;
 *     }
 *     uses G_LayerProtocolSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_LayerProtocol/lpSpec</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpecBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpecBuilder
 *
 */
public interface LpSpec
    extends
    ChildOf<GLayerProtocol>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>,
    GLayerProtocolSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "lpSpec").intern();


}

