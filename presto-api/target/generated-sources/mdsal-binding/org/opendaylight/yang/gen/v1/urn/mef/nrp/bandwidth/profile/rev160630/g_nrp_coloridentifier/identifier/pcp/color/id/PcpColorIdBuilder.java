package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPFrameColor;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPVlanTag;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId
 *
 */
public class PcpColorIdBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId> {

    private NRPFrameColor _color;
    private List<NRPNaturalNumber> _pcpValue;
    private NRPVlanTag _vlanTag;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> augmentation = Collections.emptyMap();

    public PcpColorIdBuilder() {
    }
    public PcpColorIdBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId arg) {
        this._vlanTag = arg.getVlanTag();
        this._pcpValue = arg.getPcpValue();
        this._color = arg.getColor();
    }

    public PcpColorIdBuilder(PcpColorId base) {
        this._color = base.getColor();
        this._pcpValue = base.getPcpValue();
        this._vlanTag = base.getVlanTag();
        if (base instanceof PcpColorIdImpl) {
            PcpColorIdImpl impl = (PcpColorIdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId) {
            this._vlanTag = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId)arg).getVlanTag();
            this._pcpValue = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId)arg).getPcpValue();
            this._color = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId)arg).getColor();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPPcpColorId] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPFrameColor getColor() {
        return _color;
    }
    
    public List<NRPNaturalNumber> getPcpValue() {
        return _pcpValue;
    }
    
    public NRPVlanTag getVlanTag() {
        return _vlanTag;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PcpColorIdBuilder setColor(final NRPFrameColor value) {
        this._color = value;
        return this;
    }
    
     
    public PcpColorIdBuilder setPcpValue(final List<NRPNaturalNumber> value) {
        this._pcpValue = value;
        return this;
    }
    
     
    public PcpColorIdBuilder setVlanTag(final NRPVlanTag value) {
        this._vlanTag = value;
        return this;
    }
    
    public PcpColorIdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PcpColorIdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PcpColorId build() {
        return new PcpColorIdImpl(this);
    }

    private static final class PcpColorIdImpl implements PcpColorId {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId.class;
        }

        private final NRPFrameColor _color;
        private final List<NRPNaturalNumber> _pcpValue;
        private final NRPVlanTag _vlanTag;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> augmentation = Collections.emptyMap();

        private PcpColorIdImpl(PcpColorIdBuilder base) {
            this._color = base.getColor();
            this._pcpValue = base.getPcpValue();
            this._vlanTag = base.getVlanTag();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>>singletonMap(e.getKey(), e.getValue());
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
        public List<NRPNaturalNumber> getPcpValue() {
            return _pcpValue;
        }
        
        @Override
        public NRPVlanTag getVlanTag() {
            return _vlanTag;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_pcpValue);
            result = prime * result + Objects.hashCode(_vlanTag);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId)obj;
            if (!Objects.equals(_color, other.getColor())) {
                return false;
            }
            if (!Objects.equals(_pcpValue, other.getPcpValue())) {
                return false;
            }
            if (!Objects.equals(_vlanTag, other.getVlanTag())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PcpColorIdImpl otherImpl = (PcpColorIdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.g_nrp_coloridentifier.identifier.pcp.color.id.PcpColorId>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PcpColorId [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_color != null) {
                builder.append("_color=");
                builder.append(_color);
                builder.append(", ");
            }
            if (_pcpValue != null) {
                builder.append("_pcpValue=");
                builder.append(_pcpValue);
                builder.append(", ");
            }
            if (_vlanTag != null) {
                builder.append("_vlanTag=");
                builder.append(_vlanTag);
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
