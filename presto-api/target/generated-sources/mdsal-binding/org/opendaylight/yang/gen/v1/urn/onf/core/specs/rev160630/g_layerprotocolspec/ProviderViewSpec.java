package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GProviderViewSpec;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * container providerViewSpec {
 *     uses G_ProviderViewSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_LayerProtocolSpec/providerViewSpec</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpecBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpecBuilder
 *
 */
public interface ProviderViewSpec
    extends
    ChildOf<GLayerProtocolSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>,
    GProviderViewSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "providerViewSpec").intern();


}

