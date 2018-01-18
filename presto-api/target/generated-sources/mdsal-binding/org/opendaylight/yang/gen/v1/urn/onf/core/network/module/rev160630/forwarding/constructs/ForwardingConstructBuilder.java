package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.ForwardingDirection;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcRoute;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.LayerProtocolName;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct
 *
 */
public class ForwardingConstructBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct> {

    private List<FcPort> _fcPort;
    private List<FcRoute> _fcRoute;
    private FcSpec _fcSpec;
    private ForwardingDirection _forwardingDirection;
    private ForwardingConstructKey _key;
    private LayerProtocolName _layerProtocolName;
    private List<java.lang.String> _lowerLevelFc;
    private java.lang.String _uuid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> augmentation = Collections.emptyMap();

    public ForwardingConstructBuilder() {
    }
    public ForwardingConstructBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct arg) {
        this._layerProtocolName = arg.getLayerProtocolName();
        this._lowerLevelFc = arg.getLowerLevelFc();
        this._fcRoute = arg.getFcRoute();
        this._fcPort = arg.getFcPort();
        this._fcSpec = arg.getFcSpec();
        this._forwardingDirection = arg.getForwardingDirection();
    }

    public ForwardingConstructBuilder(ForwardingConstruct base) {
        if (base.getKey() == null) {
            this._key = new ForwardingConstructKey(
                base.getUuid()
            );
            this._uuid = base.getUuid();
        } else {
            this._key = base.getKey();
            this._uuid = _key.getUuid();
        }
        this._fcPort = base.getFcPort();
        this._fcRoute = base.getFcRoute();
        this._fcSpec = base.getFcSpec();
        this._forwardingDirection = base.getForwardingDirection();
        this._layerProtocolName = base.getLayerProtocolName();
        this._lowerLevelFc = base.getLowerLevelFc();
        if (base instanceof ForwardingConstructImpl) {
            ForwardingConstructImpl impl = (ForwardingConstructImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct) {
            this._layerProtocolName = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct)arg).getLayerProtocolName();
            this._lowerLevelFc = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct)arg).getLowerLevelFc();
            this._fcRoute = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct)arg).getFcRoute();
            this._fcPort = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct)arg).getFcPort();
            this._fcSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct)arg).getFcSpec();
            this._forwardingDirection = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct)arg).getForwardingDirection();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GForwardingConstruct] \n" +
              "but was: " + arg
            );
        }
    }

    public List<FcPort> getFcPort() {
        return _fcPort;
    }
    
    public List<FcRoute> getFcRoute() {
        return _fcRoute;
    }
    
    public FcSpec getFcSpec() {
        return _fcSpec;
    }
    
    public ForwardingDirection getForwardingDirection() {
        return _forwardingDirection;
    }
    
    public ForwardingConstructKey getKey() {
        return _key;
    }
    
    public LayerProtocolName getLayerProtocolName() {
        return _layerProtocolName;
    }
    
    public List<java.lang.String> getLowerLevelFc() {
        return _lowerLevelFc;
    }
    
    public java.lang.String getUuid() {
        return _uuid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ForwardingConstructBuilder setFcPort(final List<FcPort> value) {
        this._fcPort = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setFcRoute(final List<FcRoute> value) {
        this._fcRoute = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setFcSpec(final FcSpec value) {
        this._fcSpec = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setForwardingDirection(final ForwardingDirection value) {
        this._forwardingDirection = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setKey(final ForwardingConstructKey value) {
        this._key = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLayerProtocolName(final LayerProtocolName value) {
        this._layerProtocolName = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setLowerLevelFc(final List<java.lang.String> value) {
        this._lowerLevelFc = value;
        return this;
    }
    
     
    public ForwardingConstructBuilder setUuid(final java.lang.String value) {
        this._uuid = value;
        return this;
    }
    
    public ForwardingConstructBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ForwardingConstructBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ForwardingConstruct build() {
        return new ForwardingConstructImpl(this);
    }

    private static final class ForwardingConstructImpl implements ForwardingConstruct {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct.class;
        }

        private final List<FcPort> _fcPort;
        private final List<FcRoute> _fcRoute;
        private final FcSpec _fcSpec;
        private final ForwardingDirection _forwardingDirection;
        private final ForwardingConstructKey _key;
        private final LayerProtocolName _layerProtocolName;
        private final List<java.lang.String> _lowerLevelFc;
        private final java.lang.String _uuid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> augmentation = Collections.emptyMap();

        private ForwardingConstructImpl(ForwardingConstructBuilder base) {
            if (base.getKey() == null) {
                this._key = new ForwardingConstructKey(
                    base.getUuid()
                );
                this._uuid = base.getUuid();
            } else {
                this._key = base.getKey();
                this._uuid = _key.getUuid();
            }
            this._fcPort = base.getFcPort();
            this._fcRoute = base.getFcRoute();
            this._fcSpec = base.getFcSpec();
            this._forwardingDirection = base.getForwardingDirection();
            this._layerProtocolName = base.getLayerProtocolName();
            this._lowerLevelFc = base.getLowerLevelFc();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<FcPort> getFcPort() {
            return _fcPort;
        }
        
        @Override
        public List<FcRoute> getFcRoute() {
            return _fcRoute;
        }
        
        @Override
        public FcSpec getFcSpec() {
            return _fcSpec;
        }
        
        @Override
        public ForwardingDirection getForwardingDirection() {
            return _forwardingDirection;
        }
        
        @Override
        public ForwardingConstructKey getKey() {
            return _key;
        }
        
        @Override
        public LayerProtocolName getLayerProtocolName() {
            return _layerProtocolName;
        }
        
        @Override
        public List<java.lang.String> getLowerLevelFc() {
            return _lowerLevelFc;
        }
        
        @Override
        public java.lang.String getUuid() {
            return _uuid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fcPort);
            result = prime * result + Objects.hashCode(_fcRoute);
            result = prime * result + Objects.hashCode(_fcSpec);
            result = prime * result + Objects.hashCode(_forwardingDirection);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_layerProtocolName);
            result = prime * result + Objects.hashCode(_lowerLevelFc);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct)obj;
            if (!Objects.equals(_fcPort, other.getFcPort())) {
                return false;
            }
            if (!Objects.equals(_fcRoute, other.getFcRoute())) {
                return false;
            }
            if (!Objects.equals(_fcSpec, other.getFcSpec())) {
                return false;
            }
            if (!Objects.equals(_forwardingDirection, other.getForwardingDirection())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_layerProtocolName, other.getLayerProtocolName())) {
                return false;
            }
            if (!Objects.equals(_lowerLevelFc, other.getLowerLevelFc())) {
                return false;
            }
            if (!Objects.equals(_uuid, other.getUuid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ForwardingConstructImpl otherImpl = (ForwardingConstructImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ForwardingConstruct [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fcPort != null) {
                builder.append("_fcPort=");
                builder.append(_fcPort);
                builder.append(", ");
            }
            if (_fcRoute != null) {
                builder.append("_fcRoute=");
                builder.append(_fcRoute);
                builder.append(", ");
            }
            if (_fcSpec != null) {
                builder.append("_fcSpec=");
                builder.append(_fcSpec);
                builder.append(", ");
            }
            if (_forwardingDirection != null) {
                builder.append("_forwardingDirection=");
                builder.append(_forwardingDirection);
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
            if (_lowerLevelFc != null) {
                builder.append("_lowerLevelFc=");
                builder.append(_lowerLevelFc);
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
