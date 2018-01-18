package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec
 *
 */
public class ProviderViewSpecBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec> {


    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> augmentation = Collections.emptyMap();

    public ProviderViewSpecBuilder() {
    }

    public ProviderViewSpecBuilder(ProviderViewSpec base) {
        if (base instanceof ProviderViewSpecImpl) {
            ProviderViewSpecImpl impl = (ProviderViewSpecImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public ProviderViewSpecBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProviderViewSpecBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProviderViewSpec build() {
        return new ProviderViewSpecImpl(this);
    }

    private static final class ProviderViewSpecImpl implements ProviderViewSpec {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec.class;
        }


        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> augmentation = Collections.emptyMap();

        private ProviderViewSpecImpl(ProviderViewSpecBuilder base) {
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec other = (org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProviderViewSpecImpl otherImpl = (ProviderViewSpecImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ProviderViewSpec>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ProviderViewSpec [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
