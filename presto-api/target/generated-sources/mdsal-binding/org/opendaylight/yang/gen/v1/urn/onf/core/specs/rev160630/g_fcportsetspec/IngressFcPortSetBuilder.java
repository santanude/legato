package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet
 *
 */
public class IngressFcPortSetBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet> {

    private IngressFcPortSetKey _key;
    private NodeId _node;
    private TopologyId _topology;
    private TpId _tp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> augmentation = Collections.emptyMap();

    public IngressFcPortSetBuilder() {
    }
    public IngressFcPortSetBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef arg) {
        this._topology = arg.getTopology();
        this._node = arg.getNode();
        this._tp = arg.getTp();
    }

    public IngressFcPortSetBuilder(IngressFcPortSet base) {
        if (base.getKey() == null) {
            this._key = new IngressFcPortSetKey(
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
        if (base instanceof IngressFcPortSetImpl) {
            IngressFcPortSetImpl impl = (IngressFcPortSetImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef</li>
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef] \n" +
              "but was: " + arg
            );
        }
    }

    public IngressFcPortSetKey getKey() {
        return _key;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public TopologyId getTopology() {
        return _topology;
    }
    
    public TpId getTp() {
        return _tp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public IngressFcPortSetBuilder setKey(final IngressFcPortSetKey value) {
        this._key = value;
        return this;
    }
    
     
    public IngressFcPortSetBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public IngressFcPortSetBuilder setTopology(final TopologyId value) {
        this._topology = value;
        return this;
    }
    
     
    public IngressFcPortSetBuilder setTp(final TpId value) {
        this._tp = value;
        return this;
    }
    
    public IngressFcPortSetBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IngressFcPortSetBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IngressFcPortSet build() {
        return new IngressFcPortSetImpl(this);
    }

    private static final class IngressFcPortSetImpl implements IngressFcPortSet {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet.class;
        }

        private final IngressFcPortSetKey _key;
        private final NodeId _node;
        private final TopologyId _topology;
        private final TpId _tp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> augmentation = Collections.emptyMap();

        private IngressFcPortSetImpl(IngressFcPortSetBuilder base) {
            if (base.getKey() == null) {
                this._key = new IngressFcPortSetKey(
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
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public IngressFcPortSetKey getKey() {
            return _key;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_node);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet other = (org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
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
                IngressFcPortSetImpl otherImpl = (IngressFcPortSetImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet>> e : augmentation.entrySet()) {
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
            java.lang.String name = "IngressFcPortSet [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
