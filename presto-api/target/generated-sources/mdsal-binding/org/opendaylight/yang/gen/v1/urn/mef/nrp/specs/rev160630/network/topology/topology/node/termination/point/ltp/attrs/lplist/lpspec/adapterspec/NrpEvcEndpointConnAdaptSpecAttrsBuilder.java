package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_evcendpoint_connadaptspec.EvcEndPointMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.L2cpPeering;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.IngressBwpFlow;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.Coloridentifier;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.EgressBwpFlow;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPL2cpAddressSet;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPEvcEndPointRole;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs
 *
 */
public class NrpEvcEndpointConnAdaptSpecAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs> {

    private CeExternalInterface _ceExternalInterface;
    private Coloridentifier _coloridentifier;
    private EgressBwpFlow _egressBwpFlow;
    private NRPPositiveInteger _evcEndPointId;
    private List<EvcEndPointMap> _evcEndPointMap;
    private NRPEvcEndPointRole _evcEndPointRole;
    private IngressBwpFlow _ingressBwpFlow;
    private NRPL2cpAddressSet _l2cpAddressSet;
    private List<L2cpPeering> _l2cpPeering;
    private SourceMacAddressLimit _sourceMacAddressLimit;
    private java.lang.Boolean _subscriberMegMipEbabled;
    private java.lang.Boolean _testMegEnabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> augmentation = Collections.emptyMap();

    public NrpEvcEndpointConnAdaptSpecAttrsBuilder() {
    }
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec arg) {
        this._evcEndPointId = arg.getEvcEndPointId();
        this._testMegEnabled = arg.isTestMegEnabled();
        this._evcEndPointRole = arg.getEvcEndPointRole();
        this._evcEndPointMap = arg.getEvcEndPointMap();
        this._subscriberMegMipEbabled = arg.isSubscriberMegMipEbabled();
        this._sourceMacAddressLimit = arg.getSourceMacAddressLimit();
        this._ceExternalInterface = arg.getCeExternalInterface();
        this._coloridentifier = arg.getColoridentifier();
        this._ingressBwpFlow = arg.getIngressBwpFlow();
        this._egressBwpFlow = arg.getEgressBwpFlow();
        this._l2cpAddressSet = arg.getL2cpAddressSet();
        this._l2cpPeering = arg.getL2cpPeering();
    }
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec arg) {
        this._sourceMacAddressLimit = arg.getSourceMacAddressLimit();
        this._ceExternalInterface = arg.getCeExternalInterface();
        this._coloridentifier = arg.getColoridentifier();
        this._ingressBwpFlow = arg.getIngressBwpFlow();
        this._egressBwpFlow = arg.getEgressBwpFlow();
        this._l2cpAddressSet = arg.getL2cpAddressSet();
        this._l2cpPeering = arg.getL2cpPeering();
    }

    public NrpEvcEndpointConnAdaptSpecAttrsBuilder(NrpEvcEndpointConnAdaptSpecAttrs base) {
        this._ceExternalInterface = base.getCeExternalInterface();
        this._coloridentifier = base.getColoridentifier();
        this._egressBwpFlow = base.getEgressBwpFlow();
        this._evcEndPointId = base.getEvcEndPointId();
        this._evcEndPointMap = base.getEvcEndPointMap();
        this._evcEndPointRole = base.getEvcEndPointRole();
        this._ingressBwpFlow = base.getIngressBwpFlow();
        this._l2cpAddressSet = base.getL2cpAddressSet();
        this._l2cpPeering = base.getL2cpPeering();
        this._sourceMacAddressLimit = base.getSourceMacAddressLimit();
        this._subscriberMegMipEbabled = base.isSubscriberMegMipEbabled();
        this._testMegEnabled = base.isTestMegEnabled();
        if (base instanceof NrpEvcEndpointConnAdaptSpecAttrsImpl) {
            NrpEvcEndpointConnAdaptSpecAttrsImpl impl = (NrpEvcEndpointConnAdaptSpecAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec</li>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec) {
            this._evcEndPointId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec)arg).getEvcEndPointId();
            this._testMegEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec)arg).isTestMegEnabled();
            this._evcEndPointRole = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec)arg).getEvcEndPointRole();
            this._evcEndPointMap = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec)arg).getEvcEndPointMap();
            this._subscriberMegMipEbabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec)arg).isSubscriberMegMipEbabled();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec, org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPEvcEndpointConnAdaptSpec] \n" +
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
    
    public NRPPositiveInteger getEvcEndPointId() {
        return _evcEndPointId;
    }
    
    public List<EvcEndPointMap> getEvcEndPointMap() {
        return _evcEndPointMap;
    }
    
    public NRPEvcEndPointRole getEvcEndPointRole() {
        return _evcEndPointRole;
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
    
    public java.lang.Boolean isSubscriberMegMipEbabled() {
        return _subscriberMegMipEbabled;
    }
    
    public java.lang.Boolean isTestMegEnabled() {
        return _testMegEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setCeExternalInterface(final CeExternalInterface value) {
        this._ceExternalInterface = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setColoridentifier(final Coloridentifier value) {
        this._coloridentifier = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setEgressBwpFlow(final EgressBwpFlow value) {
        this._egressBwpFlow = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setEvcEndPointId(final NRPPositiveInteger value) {
        this._evcEndPointId = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setEvcEndPointMap(final List<EvcEndPointMap> value) {
        this._evcEndPointMap = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setEvcEndPointRole(final NRPEvcEndPointRole value) {
        this._evcEndPointRole = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setIngressBwpFlow(final IngressBwpFlow value) {
        this._ingressBwpFlow = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setL2cpAddressSet(final NRPL2cpAddressSet value) {
        this._l2cpAddressSet = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setL2cpPeering(final List<L2cpPeering> value) {
        this._l2cpPeering = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setSourceMacAddressLimit(final SourceMacAddressLimit value) {
        this._sourceMacAddressLimit = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setSubscriberMegMipEbabled(final java.lang.Boolean value) {
        this._subscriberMegMipEbabled = value;
        return this;
    }
    
     
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder setTestMegEnabled(final java.lang.Boolean value) {
        this._testMegEnabled = value;
        return this;
    }
    
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NrpEvcEndpointConnAdaptSpecAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NrpEvcEndpointConnAdaptSpecAttrs build() {
        return new NrpEvcEndpointConnAdaptSpecAttrsImpl(this);
    }

    private static final class NrpEvcEndpointConnAdaptSpecAttrsImpl implements NrpEvcEndpointConnAdaptSpecAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs.class;
        }

        private final CeExternalInterface _ceExternalInterface;
        private final Coloridentifier _coloridentifier;
        private final EgressBwpFlow _egressBwpFlow;
        private final NRPPositiveInteger _evcEndPointId;
        private final List<EvcEndPointMap> _evcEndPointMap;
        private final NRPEvcEndPointRole _evcEndPointRole;
        private final IngressBwpFlow _ingressBwpFlow;
        private final NRPL2cpAddressSet _l2cpAddressSet;
        private final List<L2cpPeering> _l2cpPeering;
        private final SourceMacAddressLimit _sourceMacAddressLimit;
        private final java.lang.Boolean _subscriberMegMipEbabled;
        private final java.lang.Boolean _testMegEnabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> augmentation = Collections.emptyMap();

        private NrpEvcEndpointConnAdaptSpecAttrsImpl(NrpEvcEndpointConnAdaptSpecAttrsBuilder base) {
            this._ceExternalInterface = base.getCeExternalInterface();
            this._coloridentifier = base.getColoridentifier();
            this._egressBwpFlow = base.getEgressBwpFlow();
            this._evcEndPointId = base.getEvcEndPointId();
            this._evcEndPointMap = base.getEvcEndPointMap();
            this._evcEndPointRole = base.getEvcEndPointRole();
            this._ingressBwpFlow = base.getIngressBwpFlow();
            this._l2cpAddressSet = base.getL2cpAddressSet();
            this._l2cpPeering = base.getL2cpPeering();
            this._sourceMacAddressLimit = base.getSourceMacAddressLimit();
            this._subscriberMegMipEbabled = base.isSubscriberMegMipEbabled();
            this._testMegEnabled = base.isTestMegEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>>singletonMap(e.getKey(), e.getValue());
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
        public NRPPositiveInteger getEvcEndPointId() {
            return _evcEndPointId;
        }
        
        @Override
        public List<EvcEndPointMap> getEvcEndPointMap() {
            return _evcEndPointMap;
        }
        
        @Override
        public NRPEvcEndPointRole getEvcEndPointRole() {
            return _evcEndPointRole;
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
        
        @Override
        public java.lang.Boolean isSubscriberMegMipEbabled() {
            return _subscriberMegMipEbabled;
        }
        
        @Override
        public java.lang.Boolean isTestMegEnabled() {
            return _testMegEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_evcEndPointId);
            result = prime * result + Objects.hashCode(_evcEndPointMap);
            result = prime * result + Objects.hashCode(_evcEndPointRole);
            result = prime * result + Objects.hashCode(_ingressBwpFlow);
            result = prime * result + Objects.hashCode(_l2cpAddressSet);
            result = prime * result + Objects.hashCode(_l2cpPeering);
            result = prime * result + Objects.hashCode(_sourceMacAddressLimit);
            result = prime * result + Objects.hashCode(_subscriberMegMipEbabled);
            result = prime * result + Objects.hashCode(_testMegEnabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs)obj;
            if (!Objects.equals(_ceExternalInterface, other.getCeExternalInterface())) {
                return false;
            }
            if (!Objects.equals(_coloridentifier, other.getColoridentifier())) {
                return false;
            }
            if (!Objects.equals(_egressBwpFlow, other.getEgressBwpFlow())) {
                return false;
            }
            if (!Objects.equals(_evcEndPointId, other.getEvcEndPointId())) {
                return false;
            }
            if (!Objects.equals(_evcEndPointMap, other.getEvcEndPointMap())) {
                return false;
            }
            if (!Objects.equals(_evcEndPointRole, other.getEvcEndPointRole())) {
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
            if (!Objects.equals(_subscriberMegMipEbabled, other.isSubscriberMegMipEbabled())) {
                return false;
            }
            if (!Objects.equals(_testMegEnabled, other.isTestMegEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NrpEvcEndpointConnAdaptSpecAttrsImpl otherImpl = (NrpEvcEndpointConnAdaptSpecAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NrpEvcEndpointConnAdaptSpecAttrs [";
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
            if (_evcEndPointId != null) {
                builder.append("_evcEndPointId=");
                builder.append(_evcEndPointId);
                builder.append(", ");
            }
            if (_evcEndPointMap != null) {
                builder.append("_evcEndPointMap=");
                builder.append(_evcEndPointMap);
                builder.append(", ");
            }
            if (_evcEndPointRole != null) {
                builder.append("_evcEndPointRole=");
                builder.append(_evcEndPointRole);
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
                builder.append(", ");
            }
            if (_subscriberMegMipEbabled != null) {
                builder.append("_subscriberMegMipEbabled=");
                builder.append(_subscriberMegMipEbabled);
                builder.append(", ");
            }
            if (_testMegEnabled != null) {
                builder.append("_testMegEnabled=");
                builder.append(_testMegEnabled);
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
