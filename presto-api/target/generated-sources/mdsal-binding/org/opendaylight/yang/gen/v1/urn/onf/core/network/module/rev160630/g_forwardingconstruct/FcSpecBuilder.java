package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec
 *
 */
public class FcSpecBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec> {

    private List<FcPortSpec> _fcPortSpec;
    private java.lang.String _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> augmentation = Collections.emptyMap();

    public FcSpecBuilder() {
    }
    public FcSpecBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec arg) {
        this._uuid = arg.getUuid();
        this._fcPortSpec = arg.getFcPortSpec();
    }

    public FcSpecBuilder(FcSpec base) {
        this._fcPortSpec = base.getFcPortSpec();
        this._uuid = base.getUuid();
        if (base instanceof FcSpecImpl) {
            FcSpecImpl impl = (FcSpecImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec) {
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec)arg).getUuid();
            this._fcPortSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec)arg).getFcPortSpec();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public List<FcPortSpec> getFcPortSpec() {
        return _fcPortSpec;
    }
    
    public java.lang.String getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FcSpecBuilder setFcPortSpec(final List<FcPortSpec> value) {
        this._fcPortSpec = value;
        return this;
    }
    
     
    public FcSpecBuilder setUuid(final java.lang.String value) {
        this._uuid = value;
        return this;
    }
    
    public FcSpecBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FcSpecBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FcSpec build() {
        return new FcSpecImpl(this);
    }

    private static final class FcSpecImpl implements FcSpec {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec.class;
        }

        private final List<FcPortSpec> _fcPortSpec;
        private final java.lang.String _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> augmentation = Collections.emptyMap();

        private FcSpecImpl(FcSpecBuilder base) {
            this._fcPortSpec = base.getFcPortSpec();
            this._uuid = base.getUuid();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<FcPortSpec> getFcPortSpec() {
            return _fcPortSpec;
        }
        
        @Override
        public java.lang.String getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fcPortSpec);
            result = prime * result + Objects.hashCode(_uuid);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec)obj;
            if (!Objects.equals(_fcPortSpec, other.getFcPortSpec())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FcSpecImpl otherImpl = (FcSpecImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FcSpec [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fcPortSpec != null) {
                builder.append("_fcPortSpec=");
                builder.append(_fcPortSpec);
                builder.append(", ");
            }
            if (_uuid != null) {
                builder.append("_uuid=");
                builder.append(_uuid);
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
