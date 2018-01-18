package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.TerminationDirection;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.LayerProtocolName;
import java.util.Objects;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_layerprotocol.LpSpec;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList
 *
 */
public class LpListBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList> {

    private java.lang.String _configuredClientCapacity;
    private LpListKey _key;
    private LayerProtocolName _layerProtocolName;
    private TerminationDirection _lpDirection;
    private LpSpec _lpSpec;
    private java.lang.String _terminationState;
    private java.lang.String _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> augmentation = Collections.emptyMap();

    public LpListBuilder() {
    }
    public LpListBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol arg) {
        this._layerProtocolName = arg.getLayerProtocolName();
        this._lpSpec = arg.getLpSpec();
        this._configuredClientCapacity = arg.getConfiguredClientCapacity();
        this._lpDirection = arg.getLpDirection();
        this._terminationState = arg.getTerminationState();
    }

    public LpListBuilder(LpList base) {
        if (base.getKey() == null) {
            this._key = new LpListKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._configuredClientCapacity = base.getConfiguredClientCapacity();
        this._layerProtocolName = base.getLayerProtocolName();
        this._lpDirection = base.getLpDirection();
        this._lpSpec = base.getLpSpec();
        this._terminationState = base.getTerminationState();
        if (base instanceof LpListImpl) {
            LpListImpl impl = (LpListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol) {
            this._layerProtocolName = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol)arg).getLayerProtocolName();
            this._lpSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol)arg).getLpSpec();
            this._configuredClientCapacity = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol)arg).getConfiguredClientCapacity();
            this._lpDirection = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol)arg).getLpDirection();
            this._terminationState = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol)arg).getTerminationState();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLayerProtocol] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getConfiguredClientCapacity() {
        return _configuredClientCapacity;
    }
    
    public LpListKey getKey() {
        return _key;
    }
    
    public LayerProtocolName getLayerProtocolName() {
        return _layerProtocolName;
    }
    
    public TerminationDirection getLpDirection() {
        return _lpDirection;
    }
    
    public LpSpec getLpSpec() {
        return _lpSpec;
    }
    
    public java.lang.String getTerminationState() {
        return _terminationState;
    }
    
    public java.lang.String getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LpListBuilder setConfiguredClientCapacity(final java.lang.String value) {
        this._configuredClientCapacity = value;
        return this;
    }
    
     
    public LpListBuilder setKey(final LpListKey value) {
        this._key = value;
        return this;
    }
    
     
    public LpListBuilder setLayerProtocolName(final LayerProtocolName value) {
        this._layerProtocolName = value;
        return this;
    }
    
     
    public LpListBuilder setLpDirection(final TerminationDirection value) {
        this._lpDirection = value;
        return this;
    }
    
     
    public LpListBuilder setLpSpec(final LpSpec value) {
        this._lpSpec = value;
        return this;
    }
    
     
    public LpListBuilder setTerminationState(final java.lang.String value) {
        this._terminationState = value;
        return this;
    }
    
     
    public LpListBuilder setUuid(final java.lang.String value) {
        this._uuid = value;
        return this;
    }
    
    public LpListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LpListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LpList build() {
        return new LpListImpl(this);
    }

    private static final class LpListImpl implements LpList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList.class;
        }

        private final java.lang.String _configuredClientCapacity;
        private final LpListKey _key;
        private final LayerProtocolName _layerProtocolName;
        private final TerminationDirection _lpDirection;
        private final LpSpec _lpSpec;
        private final java.lang.String _terminationState;
        private final java.lang.String _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> augmentation = Collections.emptyMap();

        private LpListImpl(LpListBuilder base) {
            if (base.getKey() == null) {
                this._key = new LpListKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._configuredClientCapacity = base.getConfiguredClientCapacity();
            this._layerProtocolName = base.getLayerProtocolName();
            this._lpDirection = base.getLpDirection();
            this._lpSpec = base.getLpSpec();
            this._terminationState = base.getTerminationState();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getConfiguredClientCapacity() {
            return _configuredClientCapacity;
        }
        
        @Override
        public LpListKey getKey() {
            return _key;
        }
        
        @Override
        public LayerProtocolName getLayerProtocolName() {
            return _layerProtocolName;
        }
        
        @Override
        public TerminationDirection getLpDirection() {
            return _lpDirection;
        }
        
        @Override
        public LpSpec getLpSpec() {
            return _lpSpec;
        }
        
        @Override
        public java.lang.String getTerminationState() {
            return _terminationState;
        }
        
        @Override
        public java.lang.String getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configuredClientCapacity);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_layerProtocolName);
            result = prime * result + Objects.hashCode(_lpDirection);
            result = prime * result + Objects.hashCode(_lpSpec);
            result = prime * result + Objects.hashCode(_terminationState);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList)obj;
            if (!Objects.equals(_configuredClientCapacity, other.getConfiguredClientCapacity())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocolName, other.getLayerProtocolName())) {
                return false;
            }
            if (!Objects.equals(_lpDirection, other.getLpDirection())) {
                return false;
            }
            if (!Objects.equals(_lpSpec, other.getLpSpec())) {
                return false;
            }
            if (!Objects.equals(_terminationState, other.getTerminationState())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LpListImpl otherImpl = (LpListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LpList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_configuredClientCapacity != null) {
                builder.append("_configuredClientCapacity=");
                builder.append(_configuredClientCapacity);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_layerProtocolName != null) {
                builder.append("_layerProtocolName=");
                builder.append(_layerProtocolName);
                builder.append(", ");
            }
            if (_lpDirection != null) {
                builder.append("_lpDirection=");
                builder.append(_lpDirection);
                builder.append(", ");
            }
            if (_lpSpec != null) {
                builder.append("_lpSpec=");
                builder.append(_lpSpec);
                builder.append(", ");
            }
            if (_terminationState != null) {
                builder.append("_terminationState=");
                builder.append(_terminationState);
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
