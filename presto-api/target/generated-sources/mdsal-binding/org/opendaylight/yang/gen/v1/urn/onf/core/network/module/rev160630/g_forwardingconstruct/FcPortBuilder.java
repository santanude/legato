package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.PortRole;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.PortDirection;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort
 *
 */
public class FcPortBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort> {

    private PortDirection _fcPortDirection;
    private FcPortKey _key;
    private NodeId _node;
    private PortRole _role;
    private TopologyId _topology;
    private TpId _tp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> augmentation = Collections.emptyMap();

    public FcPortBuilder() {
    }
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort arg) {
        this._role = arg.getRole();
        this._fcPortDirection = arg.getFcPortDirection();
        this._topology = arg.getTopology();
        this._node = arg.getNode();
        this._tp = arg.getTp();
    }
    public FcPortBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef arg) {
        this._topology = arg.getTopology();
        this._node = arg.getNode();
        this._tp = arg.getTp();
    }

    public FcPortBuilder(FcPort base) {
        if (base.getKey() == null) {
            this._key = new FcPortKey(
                base.getNode(), 
                base.getTopology(), 
                base.getTp()
            );
            this._node = base.getNode();
            this._topology = base.getTopology();
            this._tp = base.getTp();
        } else {
            this._key = base.getKey();
            this._node = _key.getNode();
            this._topology = _key.getTopology();
            this._tp = _key.getTp();
        }
        this._fcPortDirection = base.getFcPortDirection();
        this._role = base.getRole();
        if (base instanceof FcPortImpl) {
            FcPortImpl impl = (FcPortImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef</li>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef) {
            this._topology = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef)arg).getTopology();
            this._node = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef)arg).getNode();
            this._tp = ((org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef)arg).getTp();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort) {
            this._role = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort)arg).getRole();
            this._fcPortDirection = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort)arg).getFcPortDirection();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef, org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GFcPort] \n" +
              "but was: " + arg
            );
        }
    }

    public PortDirection getFcPortDirection() {
        return _fcPortDirection;
    }
    
    public FcPortKey getKey() {
        return _key;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public PortRole getRole() {
        return _role;
    }
    
    public TopologyId getTopology() {
        return _topology;
    }
    
    public TpId getTp() {
        return _tp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FcPortBuilder setFcPortDirection(final PortDirection value) {
        this._fcPortDirection = value;
        return this;
    }
    
     
    public FcPortBuilder setKey(final FcPortKey value) {
        this._key = value;
        return this;
    }
    
     
    public FcPortBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public FcPortBuilder setRole(final PortRole value) {
        this._role = value;
        return this;
    }
    
     
    public FcPortBuilder setTopology(final TopologyId value) {
        this._topology = value;
        return this;
    }
    
     
    public FcPortBuilder setTp(final TpId value) {
        this._tp = value;
        return this;
    }
    
    public FcPortBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public FcPortBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FcPort build() {
        return new FcPortImpl(this);
    }

    private static final class FcPortImpl implements FcPort {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort.class;
        }

        private final PortDirection _fcPortDirection;
        private final FcPortKey _key;
        private final NodeId _node;
        private final PortRole _role;
        private final TopologyId _topology;
        private final TpId _tp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> augmentation = Collections.emptyMap();

        private FcPortImpl(FcPortBuilder base) {
            if (base.getKey() == null) {
                this._key = new FcPortKey(
                    base.getNode(), 
                    base.getTopology(), 
                    base.getTp()
                );
                this._node = base.getNode();
                this._topology = base.getTopology();
                this._tp = base.getTp();
            } else {
                this._key = base.getKey();
                this._node = _key.getNode();
                this._topology = _key.getTopology();
                this._tp = _key.getTp();
            }
            this._fcPortDirection = base.getFcPortDirection();
            this._role = base.getRole();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public PortDirection getFcPortDirection() {
            return _fcPortDirection;
        }
        
        @Override
        public FcPortKey getKey() {
            return _key;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public PortRole getRole() {
            return _role;
        }
        
        @Override
        public TopologyId getTopology() {
            return _topology;
        }
        
        @Override
        public TpId getTp() {
            return _tp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_fcPortDirection);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_role);
            result = prime * result + Objects.hashCode(_topology);
            result = prime * result + Objects.hashCode(_tp);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort)obj;
            if (!Objects.equals(_fcPortDirection, other.getFcPortDirection())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_role, other.getRole())) {
                return false;
            }
            if (!Objects.equals(_topology, other.getTopology())) {
                return false;
            }
            if (!Objects.equals(_tp, other.getTp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FcPortImpl otherImpl = (FcPortImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FcPort [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_fcPortDirection != null) {
                builder.append("_fcPortDirection=");
                builder.append(_fcPortDirection);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_role != null) {
                builder.append("_role=");
                builder.append(_role);
                builder.append(", ");
            }
            if (_topology != null) {
                builder.append("_topology=");
                builder.append(_topology);
                builder.append(", ");
            }
            if (_tp != null) {
                builder.append("_tp=");
                builder.append(_tp);
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
