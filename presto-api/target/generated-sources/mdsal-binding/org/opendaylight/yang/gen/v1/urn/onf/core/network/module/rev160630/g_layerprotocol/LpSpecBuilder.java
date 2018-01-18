package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.TerminationSpec;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterSpec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecList;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec
 *
 */
public class LpSpecBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec> {

    private List<AdapterPropertySpecList> _adapterPropertySpecList;
    private AdapterSpec _adapterSpec;
    private ProviderViewSpec _providerViewSpec;
    private List<ServerSpecList> _serverSpecList;
    private TerminationSpec _terminationSpec;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> augmentation = Collections.emptyMap();

    public LpSpecBuilder() {
    }
    public LpSpecBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec arg) {
        this._adapterSpec = arg.getAdapterSpec();
        this._terminationSpec = arg.getTerminationSpec();
        this._adapterPropertySpecList = arg.getAdapterPropertySpecList();
        this._providerViewSpec = arg.getProviderViewSpec();
        this._serverSpecList = arg.getServerSpecList();
    }

    public LpSpecBuilder(LpSpec base) {
        this._adapterPropertySpecList = base.getAdapterPropertySpecList();
        this._adapterSpec = base.getAdapterSpec();
        this._providerViewSpec = base.getProviderViewSpec();
        this._serverSpecList = base.getServerSpecList();
        this._terminationSpec = base.getTerminationSpec();
        if (base instanceof LpSpecImpl) {
            LpSpecImpl impl = (LpSpecImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec) {
            this._adapterSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec)arg).getAdapterSpec();
            this._terminationSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec)arg).getTerminationSpec();
            this._adapterPropertySpecList = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec)arg).getAdapterPropertySpecList();
            this._providerViewSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec)arg).getProviderViewSpec();
            this._serverSpecList = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec)arg).getServerSpecList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GLayerProtocolSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AdapterPropertySpecList> getAdapterPropertySpecList() {
        return _adapterPropertySpecList;
    }
    
    public AdapterSpec getAdapterSpec() {
        return _adapterSpec;
    }
    
    public ProviderViewSpec getProviderViewSpec() {
        return _providerViewSpec;
    }
    
    public List<ServerSpecList> getServerSpecList() {
        return _serverSpecList;
    }
    
    public TerminationSpec getTerminationSpec() {
        return _terminationSpec;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LpSpecBuilder setAdapterPropertySpecList(final List<AdapterPropertySpecList> value) {
        this._adapterPropertySpecList = value;
        return this;
    }
    
     
    public LpSpecBuilder setAdapterSpec(final AdapterSpec value) {
        this._adapterSpec = value;
        return this;
    }
    
     
    public LpSpecBuilder setProviderViewSpec(final ProviderViewSpec value) {
        this._providerViewSpec = value;
        return this;
    }
    
     
    public LpSpecBuilder setServerSpecList(final List<ServerSpecList> value) {
        this._serverSpecList = value;
        return this;
    }
    
     
    public LpSpecBuilder setTerminationSpec(final TerminationSpec value) {
        this._terminationSpec = value;
        return this;
    }
    
    public LpSpecBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LpSpecBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LpSpec build() {
        return new LpSpecImpl(this);
    }

    private static final class LpSpecImpl implements LpSpec {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec.class;
        }

        private final List<AdapterPropertySpecList> _adapterPropertySpecList;
        private final AdapterSpec _adapterSpec;
        private final ProviderViewSpec _providerViewSpec;
        private final List<ServerSpecList> _serverSpecList;
        private final TerminationSpec _terminationSpec;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> augmentation = Collections.emptyMap();

        private LpSpecImpl(LpSpecBuilder base) {
            this._adapterPropertySpecList = base.getAdapterPropertySpecList();
            this._adapterSpec = base.getAdapterSpec();
            this._providerViewSpec = base.getProviderViewSpec();
            this._serverSpecList = base.getServerSpecList();
            this._terminationSpec = base.getTerminationSpec();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AdapterPropertySpecList> getAdapterPropertySpecList() {
            return _adapterPropertySpecList;
        }
        
        @Override
        public AdapterSpec getAdapterSpec() {
            return _adapterSpec;
        }
        
        @Override
        public ProviderViewSpec getProviderViewSpec() {
            return _providerViewSpec;
        }
        
        @Override
        public List<ServerSpecList> getServerSpecList() {
            return _serverSpecList;
        }
        
        @Override
        public TerminationSpec getTerminationSpec() {
            return _terminationSpec;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_adapterPropertySpecList);
            result = prime * result + Objects.hashCode(_adapterSpec);
            result = prime * result + Objects.hashCode(_providerViewSpec);
            result = prime * result + Objects.hashCode(_serverSpecList);
            result = prime * result + Objects.hashCode(_terminationSpec);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec)obj;
            if (!Objects.equals(_adapterPropertySpecList, other.getAdapterPropertySpecList())) {
                return false;
            }
            if (!Objects.equals(_adapterSpec, other.getAdapterSpec())) {
                return false;
            }
            if (!Objects.equals(_providerViewSpec, other.getProviderViewSpec())) {
                return false;
            }
            if (!Objects.equals(_serverSpecList, other.getServerSpecList())) {
                return false;
            }
            if (!Objects.equals(_terminationSpec, other.getTerminationSpec())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LpSpecImpl otherImpl = (LpSpecImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "LpSpec [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_adapterPropertySpecList != null) {
                builder.append("_adapterPropertySpecList=");
                builder.append(_adapterPropertySpecList);
                builder.append(", ");
            }
            if (_adapterSpec != null) {
                builder.append("_adapterSpec=");
                builder.append(_adapterSpec);
                builder.append(", ");
            }
            if (_providerViewSpec != null) {
                builder.append("_providerViewSpec=");
                builder.append(_providerViewSpec);
                builder.append(", ");
            }
            if (_serverSpecList != null) {
                builder.append("_serverSpecList=");
                builder.append(_serverSpecList);
                builder.append(", ");
            }
            if (_terminationSpec != null) {
                builder.append("_terminationSpec=");
                builder.append(_terminationSpec);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
