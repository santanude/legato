package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GServerSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * list serverSpecList {
 *     key "uuid"
 *     leaf uuid {
 *         type string;
 *     }
 *     uses G_ServerSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_LayerProtocolSpec/serverSpecList</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecListKey
 *
 */
public interface ServerSpecList
    extends
    ChildOf<GLayerProtocolSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>,
    GServerSpec,
    Identifiable<ServerSpecListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "serverSpecList").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ServerSpecListKey getKey();

}

