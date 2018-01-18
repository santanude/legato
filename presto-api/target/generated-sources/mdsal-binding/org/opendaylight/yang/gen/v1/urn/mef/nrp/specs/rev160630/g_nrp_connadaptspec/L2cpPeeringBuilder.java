package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPProtocolFrameType;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering
 *
 */
public class L2cpPeeringBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering> {

    private java.lang.String _destinationMacAddress;
    private L2cpPeeringKey _key;
    private java.lang.String _linkId;
    private java.lang.String _protocolId;
    private NRPProtocolFrameType _protocolType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> augmentation = Collections.emptyMap();

    public L2cpPeeringBuilder() {
    }
    public L2cpPeeringBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering arg) {
        this._destinationMacAddress = arg.getDestinationMacAddress();
        this._protocolType = arg.getProtocolType();
        this._linkId = arg.getLinkId();
        this._protocolId = arg.getProtocolId();
    }

    public L2cpPeeringBuilder(L2cpPeering base) {
        if (base.getKey() == null) {
            this._key = new L2cpPeeringKey(
                base.getLinkId()
            );
            this._linkId = base.getLinkId();
        } else {
            this._key = base.getKey();
            this._linkId = _key.getLinkId();
        }
        this._destinationMacAddress = base.getDestinationMacAddress();
        this._protocolId = base.getProtocolId();
        this._protocolType = base.getProtocolType();
        if (base instanceof L2cpPeeringImpl) {
            L2cpPeeringImpl impl = (L2cpPeeringImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering) {
            this._destinationMacAddress = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering)arg).getDestinationMacAddress();
            this._protocolType = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering)arg).getProtocolType();
            this._linkId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering)arg).getLinkId();
            this._protocolId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering)arg).getProtocolId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPL2cpPeering] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDestinationMacAddress() {
        return _destinationMacAddress;
    }
    
    public L2cpPeeringKey getKey() {
        return _key;
    }
    
    public java.lang.String getLinkId() {
        return _linkId;
    }
    
    public java.lang.String getProtocolId() {
        return _protocolId;
    }
    
    public NRPProtocolFrameType getProtocolType() {
        return _protocolType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public L2cpPeeringBuilder setDestinationMacAddress(final java.lang.String value) {
        this._destinationMacAddress = value;
        return this;
    }
    
     
    public L2cpPeeringBuilder setKey(final L2cpPeeringKey value) {
        this._key = value;
        return this;
    }
    
     
    public L2cpPeeringBuilder setLinkId(final java.lang.String value) {
        this._linkId = value;
        return this;
    }
    
     
    public L2cpPeeringBuilder setProtocolId(final java.lang.String value) {
        this._protocolId = value;
        return this;
    }
    
     
    public L2cpPeeringBuilder setProtocolType(final NRPProtocolFrameType value) {
        this._protocolType = value;
        return this;
    }
    
    public L2cpPeeringBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2cpPeeringBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2cpPeering build() {
        return new L2cpPeeringImpl(this);
    }

    private static final class L2cpPeeringImpl implements L2cpPeering {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering.class;
        }

        private final java.lang.String _destinationMacAddress;
        private final L2cpPeeringKey _key;
        private final java.lang.String _linkId;
        private final java.lang.String _protocolId;
        private final NRPProtocolFrameType _protocolType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> augmentation = Collections.emptyMap();

        private L2cpPeeringImpl(L2cpPeeringBuilder base) {
            if (base.getKey() == null) {
                this._key = new L2cpPeeringKey(
                    base.getLinkId()
                );
                this._linkId = base.getLinkId();
            } else {
                this._key = base.getKey();
                this._linkId = _key.getLinkId();
            }
            this._destinationMacAddress = base.getDestinationMacAddress();
            this._protocolId = base.getProtocolId();
            this._protocolType = base.getProtocolType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDestinationMacAddress() {
            return _destinationMacAddress;
        }
        
        @Override
        public L2cpPeeringKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getLinkId() {
            return _linkId;
        }
        
        @Override
        public java.lang.String getProtocolId() {
            return _protocolId;
        }
        
        @Override
        public NRPProtocolFrameType getProtocolType() {
            return _protocolType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destinationMacAddress);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_linkId);
            result = prime * result + Objects.hashCode(_protocolId);
            result = prime * result + Objects.hashCode(_protocolType);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering)obj;
            if (!Objects.equals(_destinationMacAddress, other.getDestinationMacAddress())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_linkId, other.getLinkId())) {
                return false;
            }
            if (!Objects.equals(_protocolId, other.getProtocolId())) {
                return false;
            }
            if (!Objects.equals(_protocolType, other.getProtocolType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2cpPeeringImpl otherImpl = (L2cpPeeringImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering>> e : augmentation.entrySet()) {
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
            java.lang.String name = "L2cpPeering [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destinationMacAddress != null) {
                builder.append("_destinationMacAddress=");
                builder.append(_destinationMacAddress);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_linkId != null) {
                builder.append("_linkId=");
                builder.append(_linkId);
                builder.append(", ");
            }
            if (_protocolId != null) {
                builder.append("_protocolId=");
                builder.append(_protocolId);
                builder.append(", ");
            }
            if (_protocolType != null) {
                builder.append("_protocolType=");
                builder.append(_protocolType);
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
