package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ActivationStatus;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs
 *
 */
public class UnimgrAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs> {

    private ActivationStatus _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> augmentation = Collections.emptyMap();

    public UnimgrAttrsBuilder() {
    }

    public UnimgrAttrsBuilder(UnimgrAttrs base) {
        this._status = base.getStatus();
        if (base instanceof UnimgrAttrsImpl) {
            UnimgrAttrsImpl impl = (UnimgrAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ActivationStatus getStatus() {
        return _status;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UnimgrAttrsBuilder setStatus(final ActivationStatus value) {
        this._status = value;
        return this;
    }
    
    public UnimgrAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnimgrAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnimgrAttrs build() {
        return new UnimgrAttrsImpl(this);
    }

    private static final class UnimgrAttrsImpl implements UnimgrAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs.class;
        }

        private final ActivationStatus _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> augmentation = Collections.emptyMap();

        private UnimgrAttrsImpl(UnimgrAttrsBuilder base) {
            this._status = base.getStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ActivationStatus getStatus() {
            return _status;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_status);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs other = (org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs)obj;
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnimgrAttrsImpl otherImpl = (UnimgrAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UnimgrAttrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_status != null) {
                builder.append("_status=");
                builder.append(_status);
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
