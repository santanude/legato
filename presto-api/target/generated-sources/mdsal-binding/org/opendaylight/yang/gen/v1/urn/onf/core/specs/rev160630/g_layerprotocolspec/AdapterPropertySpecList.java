package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GAdapterPropertySpec;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * list adapterPropertySpecList {
 *     key "uuid"
 *     leaf uuid {
 *         type string;
 *     }
 *     uses G_AdapterPropertySpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_LayerProtocolSpec/adapterPropertySpecList</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecListKey
 *
 */
public interface AdapterPropertySpecList
    extends
    ChildOf<GLayerProtocolSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecList>,
    GAdapterPropertySpec,
    Identifiable<AdapterPropertySpecListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "adapterPropertySpecList").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    AdapterPropertySpecListKey getKey();

}

