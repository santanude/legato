package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.TerminationDirection;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LtpSpec;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs
 *
 */
public class LtpAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs> {

    private List<LpList> _lpList;
    private TerminationDirection _ltpDirection;
    private LtpSpec _ltpSpec;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> augmentation = Collections.emptyMap();

    public LtpAttrsBuilder() {
    }
    public LtpAttrsBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint arg) {
        this._lpList = arg.getLpList();
        this._ltpSpec = arg.getLtpSpec();
        this._ltpDirection = arg.getLtpDirection();
    }

    public LtpAttrsBuilder(LtpAttrs base) {
        this._lpList = base.getLpList();
        this._ltpDirection = base.getLtpDirection();
        this._ltpSpec = base.getLtpSpec();
        if (base instanceof LtpAttrsImpl) {
            LtpAttrsImpl impl = (LtpAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint) {
            this._lpList = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint)arg).getLpList();
            this._ltpSpec = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint)arg).getLtpSpec();
            this._ltpDirection = ((org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint)arg).getLtpDirection();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.GLogicalTerminationPoint] \n" +
              "but was: " + arg
            );
        }
    }

    public List<LpList> getLpList() {
        return _lpList;
    }
    
    public TerminationDirection getLtpDirection() {
        return _ltpDirection;
    }
    
    public LtpSpec getLtpSpec() {
        return _ltpSpec;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public LtpAttrsBuilder setLpList(final List<LpList> value) {
        this._lpList = value;
        return this;
    }
    
     
    public LtpAttrsBuilder setLtpDirection(final TerminationDirection value) {
        this._ltpDirection = value;
        return this;
    }
    
     
    public LtpAttrsBuilder setLtpSpec(final LtpSpec value) {
        this._ltpSpec = value;
        return this;
    }
    
    public LtpAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LtpAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public LtpAttrs build() {
        return new LtpAttrsImpl(this);
    }

    private static final class LtpAttrsImpl implements LtpAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs.class;
        }

        private final List<LpList> _lpList;
        private final TerminationDirection _ltpDirection;
        private final LtpSpec _ltpSpec;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> augmentation = Collections.emptyMap();

        private LtpAttrsImpl(LtpAttrsBuilder base) {
            this._lpList = base.getLpList();
            this._ltpDirection = base.getLtpDirection();
            this._ltpSpec = base.getLtpSpec();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<LpList> getLpList() {
            return _lpList;
        }
        
        @Override
        public TerminationDirection getLtpDirection() {
            return _ltpDirection;
        }
        
        @Override
        public LtpSpec getLtpSpec() {
            return _ltpSpec;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lpList);
            result = prime * result + Objects.hashCode(_ltpDirection);
            result = prime * result + Objects.hashCode(_ltpSpec);
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs)obj;
            if (!Objects.equals(_lpList, other.getLpList())) {
                return false;
            }
            if (!Objects.equals(_ltpDirection, other.getLtpDirection())) {
                return false;
            }
            if (!Objects.equals(_ltpSpec, other.getLtpSpec())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LtpAttrsImpl otherImpl = (LtpAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "LtpAttrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_lpList != null) {
                builder.append("_lpList=");
                builder.append(_lpList);
                builder.append(", ");
            }
            if (_ltpDirection != null) {
                builder.append("_ltpDirection=");
                builder.append(_ltpDirection);
                builder.append(", ");
            }
            if (_ltpSpec != null) {
                builder.append("_ltpSpec=");
                builder.append(_ltpSpec);
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
