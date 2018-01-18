package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.EndpointMapForm;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap
 *
 */
public class IvcEndPointMapBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap> {

    private EndpointMapForm _endpointMapForm;
    private IvcEndPointMapKey _key;
    private NRPPositiveInteger _vlanId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> augmentation = Collections.emptyMap();

    public IvcEndPointMapBuilder() {
    }
    public IvcEndPointMapBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap arg) {
        this._vlanId = arg.getVlanId();
        this._endpointMapForm = arg.getEndpointMapForm();
    }

    public IvcEndPointMapBuilder(IvcEndPointMap base) {
        if (base.getKey() == null) {
            this._key = new IvcEndPointMapKey(
                base.getVlanId()
            );
            this._vlanId = base.getVlanId();
        } else {
            this._key = base.getKey();
            this._vlanId = _key.getVlanId();
        }
        this._endpointMapForm = base.getEndpointMapForm();
        if (base instanceof IvcEndPointMapImpl) {
            IvcEndPointMapImpl impl = (IvcEndPointMapImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap) {
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap)arg).getVlanId();
            this._endpointMapForm = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap)arg).getEndpointMapForm();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEndPointMap] \n" +
              "but was: " + arg
            );
        }
    }

    public EndpointMapForm getEndpointMapForm() {
        return _endpointMapForm;
    }
    
    public IvcEndPointMapKey getKey() {
        return _key;
    }
    
    public NRPPositiveInteger getVlanId() {
        return _vlanId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public IvcEndPointMapBuilder setEndpointMapForm(final EndpointMapForm value) {
        this._endpointMapForm = value;
        return this;
    }
    
     
    public IvcEndPointMapBuilder setKey(final IvcEndPointMapKey value) {
        this._key = value;
        return this;
    }
    
     
    public IvcEndPointMapBuilder setVlanId(final NRPPositiveInteger value) {
        this._vlanId = value;
        return this;
    }
    
    public IvcEndPointMapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IvcEndPointMapBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IvcEndPointMap build() {
        return new IvcEndPointMapImpl(this);
    }

    private static final class IvcEndPointMapImpl implements IvcEndPointMap {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap.class;
        }

        private final EndpointMapForm _endpointMapForm;
        private final IvcEndPointMapKey _key;
        private final NRPPositiveInteger _vlanId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> augmentation = Collections.emptyMap();

        private IvcEndPointMapImpl(IvcEndPointMapBuilder base) {
            if (base.getKey() == null) {
                this._key = new IvcEndPointMapKey(
                    base.getVlanId()
                );
                this._vlanId = base.getVlanId();
            } else {
                this._key = base.getKey();
                this._vlanId = _key.getVlanId();
            }
            this._endpointMapForm = base.getEndpointMapForm();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public EndpointMapForm getEndpointMapForm() {
            return _endpointMapForm;
        }
        
        @Override
        public IvcEndPointMapKey getKey() {
            return _key;
        }
        
        @Override
        public NRPPositiveInteger getVlanId() {
            return _vlanId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_endpointMapForm);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_vlanId);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap)obj;
            if (!Objects.equals(_endpointMapForm, other.getEndpointMapForm())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vlanId, other.getVlanId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IvcEndPointMapImpl otherImpl = (IvcEndPointMapImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap>> e : augmentation.entrySet()) {
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
            java.lang.String name = "IvcEndPointMap [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_endpointMapForm != null) {
                builder.append("_endpointMapForm=");
                builder.append(_endpointMapForm);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vlanId != null) {
                builder.append("_vlanId=");
                builder.append(_vlanId);
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
