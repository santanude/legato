package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs
 *
 */
public class ForwardingConstructsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs> {

    private List<ForwardingConstruct> _forwardingConstruct;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> augmentation = Collections.emptyMap();

    public ForwardingConstructsBuilder() {
    }

    public ForwardingConstructsBuilder(ForwardingConstructs base) {
        this._forwardingConstruct = base.getForwardingConstruct();
        if (base instanceof ForwardingConstructsImpl) {
            ForwardingConstructsImpl impl = (ForwardingConstructsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<ForwardingConstruct> getForwardingConstruct() {
        return _forwardingConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ForwardingConstructsBuilder setForwardingConstruct(final List<ForwardingConstruct> value) {
        this._forwardingConstruct = value;
        return this;
    }
    
    public ForwardingConstructsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ForwardingConstructsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ForwardingConstructs build() {
        return new ForwardingConstructsImpl(this);
    }

    private static final class ForwardingConstructsImpl implements ForwardingConstructs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs.class;
        }

        private final List<ForwardingConstruct> _forwardingConstruct;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> augmentation = Collections.emptyMap();

        private ForwardingConstructsImpl(ForwardingConstructsBuilder base) {
            this._forwardingConstruct = base.getForwardingConstruct();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<ForwardingConstruct> getForwardingConstruct() {
            return _forwardingConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_forwardingConstruct);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs)obj;
            if (!Objects.equals(_forwardingConstruct, other.getForwardingConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ForwardingConstructsImpl otherImpl = (ForwardingConstructsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.ForwardingConstructs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ForwardingConstructs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_forwardingConstruct != null) {
                builder.append("_forwardingConstruct=");
                builder.append(_forwardingConstruct);
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
