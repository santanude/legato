package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.TerminationSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterSpec;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecList;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * grouping G_LayerProtocolSpec {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_LayerProtocolSpec</i>
 *
 */
public interface GLayerProtocolSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "G_LayerProtocolSpec").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterSpec</code> <code>adapterSpec</code>, or <code>null</code> if not present
     */
    AdapterSpec getAdapterSpec();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.TerminationSpec</code> <code>terminationSpec</code>, or <code>null</code> if not present
     */
    TerminationSpec getTerminationSpec();
    
    /**
     * @return <code>java.util.List</code> <code>adapterPropertySpecList</code>, or <code>null</code> if not present
     */
    List<AdapterPropertySpecList> getAdapterPropertySpecList();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec</code> <code>providerViewSpec</code>, or <code>null</code> if not present
     */
    ProviderViewSpec getProviderViewSpec();
    
    /**
     * @return <code>java.util.List</code> <code>serverSpecList</code>, or <code>null</code> if not present
     */
    List<ServerSpecList> getServerSpecList();

}

