package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPColorMode;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni
 *
 */
public class IngressBwpUniBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni> {

    private NRPPositiveInteger _bwpFlowIndex;
    private NRPNaturalNumber _cbs;
    private NRPNaturalNumber _cir;
    private NRPNaturalNumber _cirMax;
    private NRPColorMode _colorMode;
    private NRPNaturalNumber _couplingFlag;
    private NRPNaturalNumber _ebs;
    private NRPNaturalNumber _eir;
    private NRPNaturalNumber _eirMax;
    private NRPPositiveInteger _rank;
    private NRPNaturalNumber _tokenRequestOffset;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> augmentation = Collections.emptyMap();

    public IngressBwpUniBuilder() {
    }
    public IngressBwpUniBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow arg) {
        this._bwpFlowIndex = arg.getBwpFlowIndex();
        this._cir = arg.getCir();
        this._cirMax = arg.getCirMax();
        this._cbs = arg.getCbs();
        this._eir = arg.getEir();
        this._eirMax = arg.getEirMax();
        this._ebs = arg.getEbs();
        this._couplingFlag = arg.getCouplingFlag();
        this._colorMode = arg.getColorMode();
        this._rank = arg.getRank();
        this._tokenRequestOffset = arg.getTokenRequestOffset();
    }

    public IngressBwpUniBuilder(IngressBwpUni base) {
        this._bwpFlowIndex = base.getBwpFlowIndex();
        this._cbs = base.getCbs();
        this._cir = base.getCir();
        this._cirMax = base.getCirMax();
        this._colorMode = base.getColorMode();
        this._couplingFlag = base.getCouplingFlag();
        this._ebs = base.getEbs();
        this._eir = base.getEir();
        this._eirMax = base.getEirMax();
        this._rank = base.getRank();
        this._tokenRequestOffset = base.getTokenRequestOffset();
        if (base instanceof IngressBwpUniImpl) {
            IngressBwpUniImpl impl = (IngressBwpUniImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow) {
            this._bwpFlowIndex = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getBwpFlowIndex();
            this._cir = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getCir();
            this._cirMax = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getCirMax();
            this._cbs = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getCbs();
            this._eir = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getEir();
            this._eirMax = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getEirMax();
            this._ebs = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getEbs();
            this._couplingFlag = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getCouplingFlag();
            this._colorMode = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getColorMode();
            this._rank = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getRank();
            this._tokenRequestOffset = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow)arg).getTokenRequestOffset();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630.GNRPBwpFlow] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPPositiveInteger getBwpFlowIndex() {
        return _bwpFlowIndex;
    }
    
    public NRPNaturalNumber getCbs() {
        return _cbs;
    }
    
    public NRPNaturalNumber getCir() {
        return _cir;
    }
    
    public NRPNaturalNumber getCirMax() {
        return _cirMax;
    }
    
    public NRPColorMode getColorMode() {
        return _colorMode;
    }
    
    public NRPNaturalNumber getCouplingFlag() {
        return _couplingFlag;
    }
    
    public NRPNaturalNumber getEbs() {
        return _ebs;
    }
    
    public NRPNaturalNumber getEir() {
        return _eir;
    }
    
    public NRPNaturalNumber getEirMax() {
        return _eirMax;
    }
    
    public NRPPositiveInteger getRank() {
        return _rank;
    }
    
    public NRPNaturalNumber getTokenRequestOffset() {
        return _tokenRequestOffset;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public IngressBwpUniBuilder setBwpFlowIndex(final NRPPositiveInteger value) {
        this._bwpFlowIndex = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setCbs(final NRPNaturalNumber value) {
        this._cbs = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setCir(final NRPNaturalNumber value) {
        this._cir = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setCirMax(final NRPNaturalNumber value) {
        this._cirMax = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setColorMode(final NRPColorMode value) {
        this._colorMode = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setCouplingFlag(final NRPNaturalNumber value) {
        this._couplingFlag = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setEbs(final NRPNaturalNumber value) {
        this._ebs = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setEir(final NRPNaturalNumber value) {
        this._eir = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setEirMax(final NRPNaturalNumber value) {
        this._eirMax = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setRank(final NRPPositiveInteger value) {
        this._rank = value;
        return this;
    }
    
     
    public IngressBwpUniBuilder setTokenRequestOffset(final NRPNaturalNumber value) {
        this._tokenRequestOffset = value;
        return this;
    }
    
    public IngressBwpUniBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IngressBwpUniBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IngressBwpUni build() {
        return new IngressBwpUniImpl(this);
    }

    private static final class IngressBwpUniImpl implements IngressBwpUni {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni.class;
        }

        private final NRPPositiveInteger _bwpFlowIndex;
        private final NRPNaturalNumber _cbs;
        private final NRPNaturalNumber _cir;
        private final NRPNaturalNumber _cirMax;
        private final NRPColorMode _colorMode;
        private final NRPNaturalNumber _couplingFlag;
        private final NRPNaturalNumber _ebs;
        private final NRPNaturalNumber _eir;
        private final NRPNaturalNumber _eirMax;
        private final NRPPositiveInteger _rank;
        private final NRPNaturalNumber _tokenRequestOffset;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> augmentation = Collections.emptyMap();

        private IngressBwpUniImpl(IngressBwpUniBuilder base) {
            this._bwpFlowIndex = base.getBwpFlowIndex();
            this._cbs = base.getCbs();
            this._cir = base.getCir();
            this._cirMax = base.getCirMax();
            this._colorMode = base.getColorMode();
            this._couplingFlag = base.getCouplingFlag();
            this._ebs = base.getEbs();
            this._eir = base.getEir();
            this._eirMax = base.getEirMax();
            this._rank = base.getRank();
            this._tokenRequestOffset = base.getTokenRequestOffset();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPPositiveInteger getBwpFlowIndex() {
            return _bwpFlowIndex;
        }
        
        @Override
        public NRPNaturalNumber getCbs() {
            return _cbs;
        }
        
        @Override
        public NRPNaturalNumber getCir() {
            return _cir;
        }
        
        @Override
        public NRPNaturalNumber getCirMax() {
            return _cirMax;
        }
        
        @Override
        public NRPColorMode getColorMode() {
            return _colorMode;
        }
        
        @Override
        public NRPNaturalNumber getCouplingFlag() {
            return _couplingFlag;
        }
        
        @Override
        public NRPNaturalNumber getEbs() {
            return _ebs;
        }
        
        @Override
        public NRPNaturalNumber getEir() {
            return _eir;
        }
        
        @Override
        public NRPNaturalNumber getEirMax() {
            return _eirMax;
        }
        
        @Override
        public NRPPositiveInteger getRank() {
            return _rank;
        }
        
        @Override
        public NRPNaturalNumber getTokenRequestOffset() {
            return _tokenRequestOffset;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bwpFlowIndex);
            result = prime * result + Objects.hashCode(_cbs);
            result = prime * result + Objects.hashCode(_cir);
            result = prime * result + Objects.hashCode(_cirMax);
            result = prime * result + Objects.hashCode(_colorMode);
            result = prime * result + Objects.hashCode(_couplingFlag);
            result = prime * result + Objects.hashCode(_ebs);
            result = prime * result + Objects.hashCode(_eir);
            result = prime * result + Objects.hashCode(_eirMax);
            result = prime * result + Objects.hashCode(_rank);
            result = prime * result + Objects.hashCode(_tokenRequestOffset);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni)obj;
            if (!Objects.equals(_bwpFlowIndex, other.getBwpFlowIndex())) {
                return false;
            }
            if (!Objects.equals(_cbs, other.getCbs())) {
                return false;
            }
            if (!Objects.equals(_cir, other.getCir())) {
                return false;
            }
            if (!Objects.equals(_cirMax, other.getCirMax())) {
                return false;
            }
            if (!Objects.equals(_colorMode, other.getColorMode())) {
                return false;
            }
            if (!Objects.equals(_couplingFlag, other.getCouplingFlag())) {
                return false;
            }
            if (!Objects.equals(_ebs, other.getEbs())) {
                return false;
            }
            if (!Objects.equals(_eir, other.getEir())) {
                return false;
            }
            if (!Objects.equals(_eirMax, other.getEirMax())) {
                return false;
            }
            if (!Objects.equals(_rank, other.getRank())) {
                return false;
            }
            if (!Objects.equals(_tokenRequestOffset, other.getTokenRequestOffset())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IngressBwpUniImpl otherImpl = (IngressBwpUniImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni>> e : augmentation.entrySet()) {
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
            java.lang.String name = "IngressBwpUni [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bwpFlowIndex != null) {
                builder.append("_bwpFlowIndex=");
                builder.append(_bwpFlowIndex);
                builder.append(", ");
            }
            if (_cbs != null) {
                builder.append("_cbs=");
                builder.append(_cbs);
                builder.append(", ");
            }
            if (_cir != null) {
                builder.append("_cir=");
                builder.append(_cir);
                builder.append(", ");
            }
            if (_cirMax != null) {
                builder.append("_cirMax=");
                builder.append(_cirMax);
                builder.append(", ");
            }
            if (_colorMode != null) {
                builder.append("_colorMode=");
                builder.append(_colorMode);
                builder.append(", ");
            }
            if (_couplingFlag != null) {
                builder.append("_couplingFlag=");
                builder.append(_couplingFlag);
                builder.append(", ");
            }
            if (_ebs != null) {
                builder.append("_ebs=");
                builder.append(_ebs);
                builder.append(", ");
            }
            if (_eir != null) {
                builder.append("_eir=");
                builder.append(_eir);
                builder.append(", ");
            }
            if (_eirMax != null) {
                builder.append("_eirMax=");
                builder.append(_eirMax);
                builder.append(", ");
            }
            if (_rank != null) {
                builder.append("_rank=");
                builder.append(_rank);
                builder.append(", ");
            }
            if (_tokenRequestOffset != null) {
                builder.append("_tokenRequestOffset=");
                builder.append(_tokenRequestOffset);
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
