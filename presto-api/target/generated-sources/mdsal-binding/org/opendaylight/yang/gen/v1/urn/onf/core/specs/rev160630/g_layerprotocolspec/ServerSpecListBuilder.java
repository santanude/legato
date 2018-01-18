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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList
 *
 */
public class ServerSpecListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList> {

    private ServerSpecListKey _key;
    private java.lang.String _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> augmentation = Collections.emptyMap();

    public ServerSpecListBuilder() {
    }

    public ServerSpecListBuilder(ServerSpecList base) {
        if (base.getKey() == null) {
            this._key = new ServerSpecListKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        if (base instanceof ServerSpecListImpl) {
            ServerSpecListImpl impl = (ServerSpecListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ServerSpecListKey getKey() {
        return _key;
    }
    
    public java.lang.String getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ServerSpecListBuilder setKey(final ServerSpecListKey value) {
        this._key = value;
        return this;
    }
    
     
    public ServerSpecListBuilder setUuid(final java.lang.String value) {
        this._uuid = value;
        return this;
    }
    
    public ServerSpecListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ServerSpecListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ServerSpecList build() {
        return new ServerSpecListImpl(this);
    }

    private static final class ServerSpecListImpl implements ServerSpecList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList.class;
        }

        private final ServerSpecListKey _key;
        private final java.lang.String _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> augmentation = Collections.emptyMap();

        private ServerSpecListImpl(ServerSpecListBuilder base) {
            if (base.getKey() == null) {
                this._key = new ServerSpecListKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ServerSpecListKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList other = (org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServerSpecListImpl otherImpl = (ServerSpecListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.ServerSpecList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ServerSpecList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
