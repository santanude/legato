package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap
 *
 */
public class PortConvsIdToAggLinkMapBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap> {

    private NRPNaturalNumber _conversationId;
    private NRPNaturalNumber _linkId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> augmentation = Collections.emptyMap();

    public PortConvsIdToAggLinkMapBuilder() {
    }
    public PortConvsIdToAggLinkMapBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap arg) {
        this._conversationId = arg.getConversationId();
        this._linkId = arg.getLinkId();
    }

    public PortConvsIdToAggLinkMapBuilder(PortConvsIdToAggLinkMap base) {
        this._conversationId = base.getConversationId();
        this._linkId = base.getLinkId();
        if (base instanceof PortConvsIdToAggLinkMapImpl) {
            PortConvsIdToAggLinkMapImpl impl = (PortConvsIdToAggLinkMapImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap) {
            this._conversationId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap)arg).getConversationId();
            this._linkId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap)arg).getLinkId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPConversationIdToAggrgationLinkMap] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPNaturalNumber getConversationId() {
        return _conversationId;
    }
    
    public NRPNaturalNumber getLinkId() {
        return _linkId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PortConvsIdToAggLinkMapBuilder setConversationId(final NRPNaturalNumber value) {
        this._conversationId = value;
        return this;
    }
    
     
    public PortConvsIdToAggLinkMapBuilder setLinkId(final NRPNaturalNumber value) {
        this._linkId = value;
        return this;
    }
    
    public PortConvsIdToAggLinkMapBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PortConvsIdToAggLinkMapBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PortConvsIdToAggLinkMap build() {
        return new PortConvsIdToAggLinkMapImpl(this);
    }

    private static final class PortConvsIdToAggLinkMapImpl implements PortConvsIdToAggLinkMap {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap.class;
        }

        private final NRPNaturalNumber _conversationId;
        private final NRPNaturalNumber _linkId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> augmentation = Collections.emptyMap();

        private PortConvsIdToAggLinkMapImpl(PortConvsIdToAggLinkMapBuilder base) {
            this._conversationId = base.getConversationId();
            this._linkId = base.getLinkId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPNaturalNumber getConversationId() {
            return _conversationId;
        }
        
        @Override
        public NRPNaturalNumber getLinkId() {
            return _linkId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_conversationId);
            result = prime * result + Objects.hashCode(_linkId);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap)obj;
            if (!Objects.equals(_conversationId, other.getConversationId())) {
                return false;
            }
            if (!Objects.equals(_linkId, other.getLinkId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PortConvsIdToAggLinkMapImpl otherImpl = (PortConvsIdToAggLinkMapImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PortConvsIdToAggLinkMap [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_conversationId != null) {
                builder.append("_conversationId=");
                builder.append(_conversationId);
                builder.append(", ");
            }
            if (_linkId != null) {
                builder.append("_linkId=");
                builder.append(_linkId);
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
