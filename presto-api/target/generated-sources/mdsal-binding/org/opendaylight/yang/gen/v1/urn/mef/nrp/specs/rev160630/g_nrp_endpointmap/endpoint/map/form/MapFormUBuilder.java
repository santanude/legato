package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.Cvid;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU
 *
 */
public class MapFormUBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU> {

    private List<Cvid> _cvid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> augmentation = Collections.emptyMap();

    public MapFormUBuilder() {
    }

    public MapFormUBuilder(MapFormU base) {
        this._cvid = base.getCvid();
        if (base instanceof MapFormUImpl) {
            MapFormUImpl impl = (MapFormUImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Cvid> getCvid() {
        return _cvid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MapFormUBuilder setCvid(final List<Cvid> value) {
        this._cvid = value;
        return this;
    }
    
    public MapFormUBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MapFormUBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MapFormU build() {
        return new MapFormUImpl(this);
    }

    private static final class MapFormUImpl implements MapFormU {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU.class;
        }

        private final List<Cvid> _cvid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> augmentation = Collections.emptyMap();

        private MapFormUImpl(MapFormUBuilder base) {
            this._cvid = base.getCvid();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Cvid> getCvid() {
            return _cvid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cvid);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU)obj;
            if (!Objects.equals(_cvid, other.getCvid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MapFormUImpl otherImpl = (MapFormUImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.MapFormU>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MapFormU [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cvid != null) {
                builder.append("_cvid=");
                builder.append(_cvid);
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
