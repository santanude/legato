package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec
 *
 */
public class FcPortSpecBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec> {

    private List<EgressFcPortSet> _egressFcPortSet;
    private List<IngressFcPortSet> _ingressFcPortSet;
    private FcPortSpecKey _key;
    private java.lang.String _role;
    private java.lang.String _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> augmentation = Collections.emptyMap();

    public FcPortSpecBuilder() {
    }
    public FcPortSpecBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec arg) {
        this._uuid = arg.getUuid();
        this._ingressFcPortSet = arg.getIngressFcPortSet();
        this._egressFcPortSet = arg.getEgressFcPortSet();
        this._role = arg.getRole();
    }

    public FcPortSpecBuilder(FcPortSpec base) {
        if (base.getKey() == null) {
            this._key = new FcPortSpecKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._egressFcPortSet = base.getEgressFcPortSet();
        this._ingressFcPortSet = base.getIngressFcPortSet();
        this._role = base.getRole();
        if (base instanceof FcPortSpecImpl) {
            FcPortSpecImpl impl = (FcPortSpecImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec) {
            this._uuid = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec)arg).getUuid();
            this._ingressFcPortSet = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec)arg).getIngressFcPortSet();
            this._egressFcPortSet = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec)arg).getEgressFcPortSet();
            this._role = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec)arg).getRole();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.GFcPortSetSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public List<EgressFcPortSet> getEgressFcPortSet() {
        return _egressFcPortSet;
    }
    
    public List<IngressFcPortSet> getIngressFcPortSet() {
        return _ingressFcPortSet;
    }
    
    public FcPortSpecKey getKey() {
        return _key;
    }
    
    public java.lang.String getRole() {
        return _role;
    }
    
    public java.lang.String getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FcPortSpecBuilder setEgressFcPortSet(final List<EgressFcPortSet> value) {
        this._egressFcPortSet = value;
        return this;
    }
    
     
    public FcPortSpecBuilder setIngressFcPortSet(final List<IngressFcPortSet> value) {
        this._ingressFcPortSet = value;
        return this;
    }
    
     
    public FcPortSpecBuilder setKey(final FcPortSpecKey value) {
        this._key = value;
        return this;
    }
    
     
    public FcPortSpecBuilder setRole(final java.lang.String value) {
        this._role = value;
        return this;
    }
    
     
    public FcPortSpecBuilder setUuid(final java.lang.String value) {
        this._uuid = value;
        return this;
    }
    
    public FcPortSpecBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FcPortSpecBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FcPortSpec build() {
        return new FcPortSpecImpl(this);
    }

    private static final class FcPortSpecImpl implements FcPortSpec {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec.class;
        }

        private final List<EgressFcPortSet> _egressFcPortSet;
        private final List<IngressFcPortSet> _ingressFcPortSet;
        private final FcPortSpecKey _key;
        private final java.lang.String _role;
        private final java.lang.String _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> augmentation = Collections.emptyMap();

        private FcPortSpecImpl(FcPortSpecBuilder base) {
            if (base.getKey() == null) {
                this._key = new FcPortSpecKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._egressFcPortSet = base.getEgressFcPortSet();
            this._ingressFcPortSet = base.getIngressFcPortSet();
            this._role = base.getRole();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<EgressFcPortSet> getEgressFcPortSet() {
            return _egressFcPortSet;
        }
        
        @Override
        public List<IngressFcPortSet> getIngressFcPortSet() {
            return _ingressFcPortSet;
        }
        
        @Override
        public FcPortSpecKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getRole() {
            return _role;
        }
        
        @Override
        public java.lang.String getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_egressFcPortSet);
            result = prime * result + Objects.hashCode(_ingressFcPortSet);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_role);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec other = (org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec)obj;
            if (!Objects.equals(_egressFcPortSet, other.getEgressFcPortSet())) {
                return false;
            }
            if (!Objects.equals(_ingressFcPortSet, other.getIngressFcPortSet())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_role, other.getRole())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FcPortSpecImpl otherImpl = (FcPortSpecImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FcPortSpec [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_egressFcPortSet != null) {
                builder.append("_egressFcPortSet=");
                builder.append(_egressFcPortSet);
                builder.append(", ");
            }
            if (_ingressFcPortSet != null) {
                builder.append("_ingressFcPortSet=");
                builder.append(_ingressFcPortSet);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_role != null) {
                builder.append("_role=");
                builder.append(_role);
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
