package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPIpVersion;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId
 *
 */
public class DespColorIdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId> {

    private NRPFrameColor _color;
    private List<NRPNaturalNumber> _dscpValue;
    private NRPIpVersion _ipVersion;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> augmentation = Collections.emptyMap();

    public DespColorIdBuilder() {
    }
    public DespColorIdBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId arg) {
        this._ipVersion = arg.getIpVersion();
        this._dscpValue = arg.getDscpValue();
        this._color = arg.getColor();
    }

    public DespColorIdBuilder(DespColorId base) {
        this._color = base.getColor();
        this._dscpValue = base.getDscpValue();
        this._ipVersion = base.getIpVersion();
        if (base instanceof DespColorIdImpl) {
            DespColorIdImpl impl = (DespColorIdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId) {
            this._ipVersion = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId)arg).getIpVersion();
            this._dscpValue = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId)arg).getDscpValue();
            this._color = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId)arg).getColor();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPDespColorId] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPFrameColor getColor() {
        return _color;
    }
    
    public List<NRPNaturalNumber> getDscpValue() {
        return _dscpValue;
    }
    
    public NRPIpVersion getIpVersion() {
        return _ipVersion;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DespColorIdBuilder setColor(final NRPFrameColor value) {
        this._color = value;
        return this;
    }
    
     
    public DespColorIdBuilder setDscpValue(final List<NRPNaturalNumber> value) {
        this._dscpValue = value;
        return this;
    }
    
     
    public DespColorIdBuilder setIpVersion(final NRPIpVersion value) {
        this._ipVersion = value;
        return this;
    }
    
    public DespColorIdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DespColorIdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DespColorId build() {
        return new DespColorIdImpl(this);
    }

    private static final class DespColorIdImpl implements DespColorId {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId.class;
        }

        private final NRPFrameColor _color;
        private final List<NRPNaturalNumber> _dscpValue;
        private final NRPIpVersion _ipVersion;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> augmentation = Collections.emptyMap();

        private DespColorIdImpl(DespColorIdBuilder base) {
            this._color = base.getColor();
            this._dscpValue = base.getDscpValue();
            this._ipVersion = base.getIpVersion();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPFrameColor getColor() {
            return _color;
        }
        
        @Override
        public List<NRPNaturalNumber> getDscpValue() {
            return _dscpValue;
        }
        
        @Override
        public NRPIpVersion getIpVersion() {
            return _ipVersion;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_color);
            result = prime * result + Objects.hashCode(_dscpValue);
            result = prime * result + Objects.hashCode(_ipVersion);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId)obj;
            if (!Objects.equals(_color, other.getColor())) {
                return false;
            }
            if (!Objects.equals(_dscpValue, other.getDscpValue())) {
                return false;
            }
            if (!Objects.equals(_ipVersion, other.getIpVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DespColorIdImpl otherImpl = (DespColorIdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.desp.color.id.DespColorId>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DespColorId [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_color != null) {
                builder.append("_color=");
                builder.append(_color);
                builder.append(", ");
            }
            if (_dscpValue != null) {
                builder.append("_dscpValue=");
                builder.append(_dscpValue);
                builder.append(", ");
            }
            if (_ipVersion != null) {
                builder.append("_ipVersion=");
                builder.append(_ipVersion);
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
