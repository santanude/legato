package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid
 *
 */
public class CvidBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid> {

    private CvidKey _key;
    private NRPPositiveInteger _vid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> augmentation = Collections.emptyMap();

    public CvidBuilder() {
    }

    public CvidBuilder(Cvid base) {
        if (base.getKey() == null) {
            this._key = new CvidKey(
                base.getVid()
            );
            this._vid = base.getVid();
        } else {
            this._key = base.getKey();
            this._vid = _key.getVid();
        }
        if (base instanceof CvidImpl) {
            CvidImpl impl = (CvidImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CvidKey getKey() {
        return _key;
    }
    
    public NRPPositiveInteger getVid() {
        return _vid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CvidBuilder setKey(final CvidKey value) {
        this._key = value;
        return this;
    }
    
     
    public CvidBuilder setVid(final NRPPositiveInteger value) {
        this._vid = value;
        return this;
    }
    
    public CvidBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CvidBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cvid build() {
        return new CvidImpl(this);
    }

    private static final class CvidImpl implements Cvid {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid.class;
        }

        private final CvidKey _key;
        private final NRPPositiveInteger _vid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> augmentation = Collections.emptyMap();

        private CvidImpl(CvidBuilder base) {
            if (base.getKey() == null) {
                this._key = new CvidKey(
                    base.getVid()
                );
                this._vid = base.getVid();
            } else {
                this._key = base.getKey();
                this._vid = _key.getVid();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CvidKey getKey() {
            return _key;
        }
        
        @Override
        public NRPPositiveInteger getVid() {
            return _vid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vid);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vid, other.getVid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CvidImpl otherImpl = (CvidImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Cvid [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vid != null) {
                builder.append("_vid=");
                builder.append(_vid);
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
