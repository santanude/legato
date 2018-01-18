package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPServiceFrameDelivery;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPConnectionType;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs
 *
 */
public class NrpCeFcspecAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs> {

    private NRPServiceFrameDelivery _broadcastFrameDelivery;
    private NRPConnectionType _connectionType;
    private NRPServiceFrameDelivery _multicastFrameDelivery;
    private NRPServiceFrameDelivery _unicastFrameDelivery;
    private NRPPositiveInteger _vcId;
    private NRPPositiveInteger _vcMaxServiceFrame;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> augmentation = Collections.emptyMap();

    public NrpCeFcspecAttrsBuilder() {
    }
    public NrpCeFcspecAttrsBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec arg) {
        this._connectionType = arg.getConnectionType();
        this._unicastFrameDelivery = arg.getUnicastFrameDelivery();
        this._multicastFrameDelivery = arg.getMulticastFrameDelivery();
        this._broadcastFrameDelivery = arg.getBroadcastFrameDelivery();
        this._vcMaxServiceFrame = arg.getVcMaxServiceFrame();
        this._vcId = arg.getVcId();
    }

    public NrpCeFcspecAttrsBuilder(NrpCeFcspecAttrs base) {
        this._broadcastFrameDelivery = base.getBroadcastFrameDelivery();
        this._connectionType = base.getConnectionType();
        this._multicastFrameDelivery = base.getMulticastFrameDelivery();
        this._unicastFrameDelivery = base.getUnicastFrameDelivery();
        this._vcId = base.getVcId();
        this._vcMaxServiceFrame = base.getVcMaxServiceFrame();
        if (base instanceof NrpCeFcspecAttrsImpl) {
            NrpCeFcspecAttrsImpl impl = (NrpCeFcspecAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec) {
            this._connectionType = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec)arg).getConnectionType();
            this._unicastFrameDelivery = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec)arg).getUnicastFrameDelivery();
            this._multicastFrameDelivery = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec)arg).getMulticastFrameDelivery();
            this._broadcastFrameDelivery = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec)arg).getBroadcastFrameDelivery();
            this._vcMaxServiceFrame = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec)arg).getVcMaxServiceFrame();
            this._vcId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec)arg).getVcId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPCeFcSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPServiceFrameDelivery getBroadcastFrameDelivery() {
        return _broadcastFrameDelivery;
    }
    
    public NRPConnectionType getConnectionType() {
        return _connectionType;
    }
    
    public NRPServiceFrameDelivery getMulticastFrameDelivery() {
        return _multicastFrameDelivery;
    }
    
    public NRPServiceFrameDelivery getUnicastFrameDelivery() {
        return _unicastFrameDelivery;
    }
    
    public NRPPositiveInteger getVcId() {
        return _vcId;
    }
    
    public NRPPositiveInteger getVcMaxServiceFrame() {
        return _vcMaxServiceFrame;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NrpCeFcspecAttrsBuilder setBroadcastFrameDelivery(final NRPServiceFrameDelivery value) {
        this._broadcastFrameDelivery = value;
        return this;
    }
    
     
    public NrpCeFcspecAttrsBuilder setConnectionType(final NRPConnectionType value) {
        this._connectionType = value;
        return this;
    }
    
     
    public NrpCeFcspecAttrsBuilder setMulticastFrameDelivery(final NRPServiceFrameDelivery value) {
        this._multicastFrameDelivery = value;
        return this;
    }
    
     
    public NrpCeFcspecAttrsBuilder setUnicastFrameDelivery(final NRPServiceFrameDelivery value) {
        this._unicastFrameDelivery = value;
        return this;
    }
    
     
    public NrpCeFcspecAttrsBuilder setVcId(final NRPPositiveInteger value) {
        this._vcId = value;
        return this;
    }
    
     
    public NrpCeFcspecAttrsBuilder setVcMaxServiceFrame(final NRPPositiveInteger value) {
        this._vcMaxServiceFrame = value;
        return this;
    }
    
    public NrpCeFcspecAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NrpCeFcspecAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NrpCeFcspecAttrs build() {
        return new NrpCeFcspecAttrsImpl(this);
    }

    private static final class NrpCeFcspecAttrsImpl implements NrpCeFcspecAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs.class;
        }

        private final NRPServiceFrameDelivery _broadcastFrameDelivery;
        private final NRPConnectionType _connectionType;
        private final NRPServiceFrameDelivery _multicastFrameDelivery;
        private final NRPServiceFrameDelivery _unicastFrameDelivery;
        private final NRPPositiveInteger _vcId;
        private final NRPPositiveInteger _vcMaxServiceFrame;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> augmentation = Collections.emptyMap();

        private NrpCeFcspecAttrsImpl(NrpCeFcspecAttrsBuilder base) {
            this._broadcastFrameDelivery = base.getBroadcastFrameDelivery();
            this._connectionType = base.getConnectionType();
            this._multicastFrameDelivery = base.getMulticastFrameDelivery();
            this._unicastFrameDelivery = base.getUnicastFrameDelivery();
            this._vcId = base.getVcId();
            this._vcMaxServiceFrame = base.getVcMaxServiceFrame();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPServiceFrameDelivery getBroadcastFrameDelivery() {
            return _broadcastFrameDelivery;
        }
        
        @Override
        public NRPConnectionType getConnectionType() {
            return _connectionType;
        }
        
        @Override
        public NRPServiceFrameDelivery getMulticastFrameDelivery() {
            return _multicastFrameDelivery;
        }
        
        @Override
        public NRPServiceFrameDelivery getUnicastFrameDelivery() {
            return _unicastFrameDelivery;
        }
        
        @Override
        public NRPPositiveInteger getVcId() {
            return _vcId;
        }
        
        @Override
        public NRPPositiveInteger getVcMaxServiceFrame() {
            return _vcMaxServiceFrame;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_broadcastFrameDelivery);
            result = prime * result + Objects.hashCode(_connectionType);
            result = prime * result + Objects.hashCode(_multicastFrameDelivery);
            result = prime * result + Objects.hashCode(_unicastFrameDelivery);
            result = prime * result + Objects.hashCode(_vcId);
            result = prime * result + Objects.hashCode(_vcMaxServiceFrame);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs)obj;
            if (!Objects.equals(_broadcastFrameDelivery, other.getBroadcastFrameDelivery())) {
                return false;
            }
            if (!Objects.equals(_connectionType, other.getConnectionType())) {
                return false;
            }
            if (!Objects.equals(_multicastFrameDelivery, other.getMulticastFrameDelivery())) {
                return false;
            }
            if (!Objects.equals(_unicastFrameDelivery, other.getUnicastFrameDelivery())) {
                return false;
            }
            if (!Objects.equals(_vcId, other.getVcId())) {
                return false;
            }
            if (!Objects.equals(_vcMaxServiceFrame, other.getVcMaxServiceFrame())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NrpCeFcspecAttrsImpl otherImpl = (NrpCeFcspecAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NrpCeFcspecAttrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_broadcastFrameDelivery != null) {
                builder.append("_broadcastFrameDelivery=");
                builder.append(_broadcastFrameDelivery);
                builder.append(", ");
            }
            if (_connectionType != null) {
                builder.append("_connectionType=");
                builder.append(_connectionType);
                builder.append(", ");
            }
            if (_multicastFrameDelivery != null) {
                builder.append("_multicastFrameDelivery=");
                builder.append(_multicastFrameDelivery);
                builder.append(", ");
            }
            if (_unicastFrameDelivery != null) {
                builder.append("_unicastFrameDelivery=");
                builder.append(_unicastFrameDelivery);
                builder.append(", ");
            }
            if (_vcId != null) {
                builder.append("_vcId=");
                builder.append(_vcId);
                builder.append(", ");
            }
            if (_vcMaxServiceFrame != null) {
                builder.append("_vcMaxServiceFrame=");
                builder.append(_vcMaxServiceFrame);
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
