package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlow;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.Coloridentifier;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.EgressBwpFlow;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPL2cpAddressSet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs
 *
 */
public class NrpConnAdaptSpecAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs> {

    private CeExternalInterface _ceExternalInterface;
    private Coloridentifier _coloridentifier;
    private EgressBwpFlow _egressBwpFlow;
    private IngressBwpFlow _ingressBwpFlow;
    private NRPL2cpAddressSet _l2cpAddressSet;
    private List<L2cpPeering> _l2cpPeering;
    private SourceMacAddressLimit _sourceMacAddressLimit;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> augmentation = Collections.emptyMap();

    public NrpConnAdaptSpecAttrsBuilder() {
    }
    public NrpConnAdaptSpecAttrsBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec arg) {
        this._sourceMacAddressLimit = arg.getSourceMacAddressLimit();
        this._ceExternalInterface = arg.getCeExternalInterface();
        this._coloridentifier = arg.getColoridentifier();
        this._ingressBwpFlow = arg.getIngressBwpFlow();
        this._egressBwpFlow = arg.getEgressBwpFlow();
        this._l2cpAddressSet = arg.getL2cpAddressSet();
        this._l2cpPeering = arg.getL2cpPeering();
    }

    public NrpConnAdaptSpecAttrsBuilder(NrpConnAdaptSpecAttrs base) {
        this._ceExternalInterface = base.getCeExternalInterface();
        this._coloridentifier = base.getColoridentifier();
        this._egressBwpFlow = base.getEgressBwpFlow();
        this._ingressBwpFlow = base.getIngressBwpFlow();
        this._l2cpAddressSet = base.getL2cpAddressSet();
        this._l2cpPeering = base.getL2cpPeering();
        this._sourceMacAddressLimit = base.getSourceMacAddressLimit();
        if (base instanceof NrpConnAdaptSpecAttrsImpl) {
            NrpConnAdaptSpecAttrsImpl impl = (NrpConnAdaptSpecAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec) {
            this._sourceMacAddressLimit = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getSourceMacAddressLimit();
            this._ceExternalInterface = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getCeExternalInterface();
            this._coloridentifier = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getColoridentifier();
            this._ingressBwpFlow = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getIngressBwpFlow();
            this._egressBwpFlow = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getEgressBwpFlow();
            this._l2cpAddressSet = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getL2cpAddressSet();
            this._l2cpPeering = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec)arg).getL2cpPeering();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public CeExternalInterface getCeExternalInterface() {
        return _ceExternalInterface;
    }
    
    public Coloridentifier getColoridentifier() {
        return _coloridentifier;
    }
    
    public EgressBwpFlow getEgressBwpFlow() {
        return _egressBwpFlow;
    }
    
    public IngressBwpFlow getIngressBwpFlow() {
        return _ingressBwpFlow;
    }
    
    public NRPL2cpAddressSet getL2cpAddressSet() {
        return _l2cpAddressSet;
    }
    
    public List<L2cpPeering> getL2cpPeering() {
        return _l2cpPeering;
    }
    
    public SourceMacAddressLimit getSourceMacAddressLimit() {
        return _sourceMacAddressLimit;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NrpConnAdaptSpecAttrsBuilder setCeExternalInterface(final CeExternalInterface value) {
        this._ceExternalInterface = value;
        return this;
    }
    
     
    public NrpConnAdaptSpecAttrsBuilder setColoridentifier(final Coloridentifier value) {
        this._coloridentifier = value;
        return this;
    }
    
     
    public NrpConnAdaptSpecAttrsBuilder setEgressBwpFlow(final EgressBwpFlow value) {
        this._egressBwpFlow = value;
        return this;
    }
    
     
    public NrpConnAdaptSpecAttrsBuilder setIngressBwpFlow(final IngressBwpFlow value) {
        this._ingressBwpFlow = value;
        return this;
    }
    
     
    public NrpConnAdaptSpecAttrsBuilder setL2cpAddressSet(final NRPL2cpAddressSet value) {
        this._l2cpAddressSet = value;
        return this;
    }
    
     
    public NrpConnAdaptSpecAttrsBuilder setL2cpPeering(final List<L2cpPeering> value) {
        this._l2cpPeering = value;
        return this;
    }
    
     
    public NrpConnAdaptSpecAttrsBuilder setSourceMacAddressLimit(final SourceMacAddressLimit value) {
        this._sourceMacAddressLimit = value;
        return this;
    }
    
    public NrpConnAdaptSpecAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NrpConnAdaptSpecAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NrpConnAdaptSpecAttrs build() {
        return new NrpConnAdaptSpecAttrsImpl(this);
    }

    private static final class NrpConnAdaptSpecAttrsImpl implements NrpConnAdaptSpecAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs.class;
        }

        private final CeExternalInterface _ceExternalInterface;
        private final Coloridentifier _coloridentifier;
        private final EgressBwpFlow _egressBwpFlow;
        private final IngressBwpFlow _ingressBwpFlow;
        private final NRPL2cpAddressSet _l2cpAddressSet;
        private final List<L2cpPeering> _l2cpPeering;
        private final SourceMacAddressLimit _sourceMacAddressLimit;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> augmentation = Collections.emptyMap();

        private NrpConnAdaptSpecAttrsImpl(NrpConnAdaptSpecAttrsBuilder base) {
            this._ceExternalInterface = base.getCeExternalInterface();
            this._coloridentifier = base.getColoridentifier();
            this._egressBwpFlow = base.getEgressBwpFlow();
            this._ingressBwpFlow = base.getIngressBwpFlow();
            this._l2cpAddressSet = base.getL2cpAddressSet();
            this._l2cpPeering = base.getL2cpPeering();
            this._sourceMacAddressLimit = base.getSourceMacAddressLimit();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public CeExternalInterface getCeExternalInterface() {
            return _ceExternalInterface;
        }
        
        @Override
        public Coloridentifier getColoridentifier() {
            return _coloridentifier;
        }
        
        @Override
        public EgressBwpFlow getEgressBwpFlow() {
            return _egressBwpFlow;
        }
        
        @Override
        public IngressBwpFlow getIngressBwpFlow() {
            return _ingressBwpFlow;
        }
        
        @Override
        public NRPL2cpAddressSet getL2cpAddressSet() {
            return _l2cpAddressSet;
        }
        
        @Override
        public List<L2cpPeering> getL2cpPeering() {
            return _l2cpPeering;
        }
        
        @Override
        public SourceMacAddressLimit getSourceMacAddressLimit() {
            return _sourceMacAddressLimit;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ceExternalInterface);
            result = prime * result + Objects.hashCode(_coloridentifier);
            result = prime * result + Objects.hashCode(_egressBwpFlow);
            result = prime * result + Objects.hashCode(_ingressBwpFlow);
            result = prime * result + Objects.hashCode(_l2cpAddressSet);
            result = prime * result + Objects.hashCode(_l2cpPeering);
            result = prime * result + Objects.hashCode(_sourceMacAddressLimit);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs)obj;
            if (!Objects.equals(_ceExternalInterface, other.getCeExternalInterface())) {
                return false;
            }
            if (!Objects.equals(_coloridentifier, other.getColoridentifier())) {
                return false;
            }
            if (!Objects.equals(_egressBwpFlow, other.getEgressBwpFlow())) {
                return false;
            }
            if (!Objects.equals(_ingressBwpFlow, other.getIngressBwpFlow())) {
                return false;
            }
            if (!Objects.equals(_l2cpAddressSet, other.getL2cpAddressSet())) {
                return false;
            }
            if (!Objects.equals(_l2cpPeering, other.getL2cpPeering())) {
                return false;
            }
            if (!Objects.equals(_sourceMacAddressLimit, other.getSourceMacAddressLimit())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NrpConnAdaptSpecAttrsImpl otherImpl = (NrpConnAdaptSpecAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NrpConnAdaptSpecAttrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ceExternalInterface != null) {
                builder.append("_ceExternalInterface=");
                builder.append(_ceExternalInterface);
                builder.append(", ");
            }
            if (_coloridentifier != null) {
                builder.append("_coloridentifier=");
                builder.append(_coloridentifier);
                builder.append(", ");
            }
            if (_egressBwpFlow != null) {
                builder.append("_egressBwpFlow=");
                builder.append(_egressBwpFlow);
                builder.append(", ");
            }
            if (_ingressBwpFlow != null) {
                builder.append("_ingressBwpFlow=");
                builder.append(_ingressBwpFlow);
                builder.append(", ");
            }
            if (_l2cpAddressSet != null) {
                builder.append("_l2cpAddressSet=");
                builder.append(_l2cpAddressSet);
                builder.append(", ");
            }
            if (_l2cpPeering != null) {
                builder.append("_l2cpPeering=");
                builder.append(_l2cpPeering);
                builder.append(", ");
            }
            if (_sourceMacAddressLimit != null) {
                builder.append("_sourceMacAddressLimit=");
                builder.append(_sourceMacAddressLimit);
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
