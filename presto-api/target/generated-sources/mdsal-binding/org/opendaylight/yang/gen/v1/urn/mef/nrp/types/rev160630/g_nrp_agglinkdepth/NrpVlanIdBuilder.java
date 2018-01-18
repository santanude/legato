package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId
 *
 */
public class NrpVlanIdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId> {

    private NRPPositiveInteger _vid;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> augmentation = Collections.emptyMap();

    public NrpVlanIdBuilder() {
    }
    public NrpVlanIdBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPVlanId arg) {
        this._vid = arg.getVid();
    }

    public NrpVlanIdBuilder(NrpVlanId base) {
        this._vid = base.getVid();
        if (base instanceof NrpVlanIdImpl) {
            NrpVlanIdImpl impl = (NrpVlanIdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPVlanId</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPVlanId) {
            this._vid = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPVlanId)arg).getVid();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPVlanId] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPPositiveInteger getVid() {
        return _vid;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NrpVlanIdBuilder setVid(final NRPPositiveInteger value) {
        this._vid = value;
        return this;
    }
    
    public NrpVlanIdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NrpVlanIdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NrpVlanId build() {
        return new NrpVlanIdImpl(this);
    }

    private static final class NrpVlanIdImpl implements NrpVlanId {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId.class;
        }

        private final NRPPositiveInteger _vid;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> augmentation = Collections.emptyMap();

        private NrpVlanIdImpl(NrpVlanIdBuilder base) {
            this._vid = base.getVid();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPPositiveInteger getVid() {
            return _vid;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vid);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId)obj;
            if (!Objects.equals(_vid, other.getVid())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NrpVlanIdImpl otherImpl = (NrpVlanIdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.g_nrp_agglinkdepth.NrpVlanId>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NrpVlanId [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vid != null) {
                builder.append("_vid=");
                builder.append(_vid);
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
