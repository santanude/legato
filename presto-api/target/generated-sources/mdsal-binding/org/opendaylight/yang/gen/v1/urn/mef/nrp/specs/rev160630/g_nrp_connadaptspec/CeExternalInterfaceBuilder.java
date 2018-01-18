package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPhysicalLayer;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.PortConvsIdToAggLinkMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPInterfaceResiliency;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_terminationspec.SyncMode;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface
 *
 */
public class CeExternalInterfaceBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface> {

    private NRPNaturalNumber _maxFrameSize;
    private NRPNaturalNumber _numberOfLinks;
    private NRPPhysicalLayer _physicalLayer;
    private PortConvsIdToAggLinkMap _portConvsIdToAggLinkMap;
    private NRPInterfaceResiliency _resiliency;
    private java.lang.String _serviceProviderUniId;
    private List<SyncMode> _syncMode;
    private java.lang.Boolean _linkOamEnabled;
    private java.lang.Boolean _tokenShareEnabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> augmentation = Collections.emptyMap();

    public CeExternalInterfaceBuilder() {
    }
    public CeExternalInterfaceBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec arg) {
        this._physicalLayer = arg.getPhysicalLayer();
        this._syncMode = arg.getSyncMode();
        this._numberOfLinks = arg.getNumberOfLinks();
        this._resiliency = arg.getResiliency();
        this._portConvsIdToAggLinkMap = arg.getPortConvsIdToAggLinkMap();
        this._maxFrameSize = arg.getMaxFrameSize();
        this._linkOamEnabled = arg.isLinkOamEnabled();
        this._tokenShareEnabled = arg.isTokenShareEnabled();
        this._serviceProviderUniId = arg.getServiceProviderUniId();
    }

    public CeExternalInterfaceBuilder(CeExternalInterface base) {
        this._maxFrameSize = base.getMaxFrameSize();
        this._numberOfLinks = base.getNumberOfLinks();
        this._physicalLayer = base.getPhysicalLayer();
        this._portConvsIdToAggLinkMap = base.getPortConvsIdToAggLinkMap();
        this._resiliency = base.getResiliency();
        this._serviceProviderUniId = base.getServiceProviderUniId();
        this._syncMode = base.getSyncMode();
        this._linkOamEnabled = base.isLinkOamEnabled();
        this._tokenShareEnabled = base.isTokenShareEnabled();
        if (base instanceof CeExternalInterfaceImpl) {
            CeExternalInterfaceImpl impl = (CeExternalInterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec) {
            this._physicalLayer = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getPhysicalLayer();
            this._syncMode = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getSyncMode();
            this._numberOfLinks = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getNumberOfLinks();
            this._resiliency = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getResiliency();
            this._portConvsIdToAggLinkMap = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getPortConvsIdToAggLinkMap();
            this._maxFrameSize = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getMaxFrameSize();
            this._linkOamEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).isLinkOamEnabled();
            this._tokenShareEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).isTokenShareEnabled();
            this._serviceProviderUniId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec)arg).getServiceProviderUniId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPNaturalNumber getMaxFrameSize() {
        return _maxFrameSize;
    }
    
    public NRPNaturalNumber getNumberOfLinks() {
        return _numberOfLinks;
    }
    
    public NRPPhysicalLayer getPhysicalLayer() {
        return _physicalLayer;
    }
    
    public PortConvsIdToAggLinkMap getPortConvsIdToAggLinkMap() {
        return _portConvsIdToAggLinkMap;
    }
    
    public NRPInterfaceResiliency getResiliency() {
        return _resiliency;
    }
    
    public java.lang.String getServiceProviderUniId() {
        return _serviceProviderUniId;
    }
    
    public List<SyncMode> getSyncMode() {
        return _syncMode;
    }
    
    public java.lang.Boolean isLinkOamEnabled() {
        return _linkOamEnabled;
    }
    
    public java.lang.Boolean isTokenShareEnabled() {
        return _tokenShareEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public CeExternalInterfaceBuilder setMaxFrameSize(final NRPNaturalNumber value) {
        this._maxFrameSize = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setNumberOfLinks(final NRPNaturalNumber value) {
        this._numberOfLinks = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setPhysicalLayer(final NRPPhysicalLayer value) {
        this._physicalLayer = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setPortConvsIdToAggLinkMap(final PortConvsIdToAggLinkMap value) {
        this._portConvsIdToAggLinkMap = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setResiliency(final NRPInterfaceResiliency value) {
        this._resiliency = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setServiceProviderUniId(final java.lang.String value) {
        this._serviceProviderUniId = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setSyncMode(final List<SyncMode> value) {
        this._syncMode = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setLinkOamEnabled(final java.lang.Boolean value) {
        this._linkOamEnabled = value;
        return this;
    }
    
     
    public CeExternalInterfaceBuilder setTokenShareEnabled(final java.lang.Boolean value) {
        this._tokenShareEnabled = value;
        return this;
    }
    
    public CeExternalInterfaceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CeExternalInterfaceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CeExternalInterface build() {
        return new CeExternalInterfaceImpl(this);
    }

    private static final class CeExternalInterfaceImpl implements CeExternalInterface {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface.class;
        }

        private final NRPNaturalNumber _maxFrameSize;
        private final NRPNaturalNumber _numberOfLinks;
        private final NRPPhysicalLayer _physicalLayer;
        private final PortConvsIdToAggLinkMap _portConvsIdToAggLinkMap;
        private final NRPInterfaceResiliency _resiliency;
        private final java.lang.String _serviceProviderUniId;
        private final List<SyncMode> _syncMode;
        private final java.lang.Boolean _linkOamEnabled;
        private final java.lang.Boolean _tokenShareEnabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> augmentation = Collections.emptyMap();

        private CeExternalInterfaceImpl(CeExternalInterfaceBuilder base) {
            this._maxFrameSize = base.getMaxFrameSize();
            this._numberOfLinks = base.getNumberOfLinks();
            this._physicalLayer = base.getPhysicalLayer();
            this._portConvsIdToAggLinkMap = base.getPortConvsIdToAggLinkMap();
            this._resiliency = base.getResiliency();
            this._serviceProviderUniId = base.getServiceProviderUniId();
            this._syncMode = base.getSyncMode();
            this._linkOamEnabled = base.isLinkOamEnabled();
            this._tokenShareEnabled = base.isTokenShareEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPNaturalNumber getMaxFrameSize() {
            return _maxFrameSize;
        }
        
        @Override
        public NRPNaturalNumber getNumberOfLinks() {
            return _numberOfLinks;
        }
        
        @Override
        public NRPPhysicalLayer getPhysicalLayer() {
            return _physicalLayer;
        }
        
        @Override
        public PortConvsIdToAggLinkMap getPortConvsIdToAggLinkMap() {
            return _portConvsIdToAggLinkMap;
        }
        
        @Override
        public NRPInterfaceResiliency getResiliency() {
            return _resiliency;
        }
        
        @Override
        public java.lang.String getServiceProviderUniId() {
            return _serviceProviderUniId;
        }
        
        @Override
        public List<SyncMode> getSyncMode() {
            return _syncMode;
        }
        
        @Override
        public java.lang.Boolean isLinkOamEnabled() {
            return _linkOamEnabled;
        }
        
        @Override
        public java.lang.Boolean isTokenShareEnabled() {
            return _tokenShareEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxFrameSize);
            result = prime * result + Objects.hashCode(_numberOfLinks);
            result = prime * result + Objects.hashCode(_physicalLayer);
            result = prime * result + Objects.hashCode(_portConvsIdToAggLinkMap);
            result = prime * result + Objects.hashCode(_resiliency);
            result = prime * result + Objects.hashCode(_serviceProviderUniId);
            result = prime * result + Objects.hashCode(_syncMode);
            result = prime * result + Objects.hashCode(_linkOamEnabled);
            result = prime * result + Objects.hashCode(_tokenShareEnabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface)obj;
            if (!Objects.equals(_maxFrameSize, other.getMaxFrameSize())) {
                return false;
            }
            if (!Objects.equals(_numberOfLinks, other.getNumberOfLinks())) {
                return false;
            }
            if (!Objects.equals(_physicalLayer, other.getPhysicalLayer())) {
                return false;
            }
            if (!Objects.equals(_portConvsIdToAggLinkMap, other.getPortConvsIdToAggLinkMap())) {
                return false;
            }
            if (!Objects.equals(_resiliency, other.getResiliency())) {
                return false;
            }
            if (!Objects.equals(_serviceProviderUniId, other.getServiceProviderUniId())) {
                return false;
            }
            if (!Objects.equals(_syncMode, other.getSyncMode())) {
                return false;
            }
            if (!Objects.equals(_linkOamEnabled, other.isLinkOamEnabled())) {
                return false;
            }
            if (!Objects.equals(_tokenShareEnabled, other.isTokenShareEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CeExternalInterfaceImpl otherImpl = (CeExternalInterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>> e : augmentation.entrySet()) {
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
            java.lang.String name = "CeExternalInterface [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_maxFrameSize != null) {
                builder.append("_maxFrameSize=");
                builder.append(_maxFrameSize);
                builder.append(", ");
            }
            if (_numberOfLinks != null) {
                builder.append("_numberOfLinks=");
                builder.append(_numberOfLinks);
                builder.append(", ");
            }
            if (_physicalLayer != null) {
                builder.append("_physicalLayer=");
                builder.append(_physicalLayer);
                builder.append(", ");
            }
            if (_portConvsIdToAggLinkMap != null) {
                builder.append("_portConvsIdToAggLinkMap=");
                builder.append(_portConvsIdToAggLinkMap);
                builder.append(", ");
            }
            if (_resiliency != null) {
                builder.append("_resiliency=");
                builder.append(_resiliency);
                builder.append(", ");
            }
            if (_serviceProviderUniId != null) {
                builder.append("_serviceProviderUniId=");
                builder.append(_serviceProviderUniId);
                builder.append(", ");
            }
            if (_syncMode != null) {
                builder.append("_syncMode=");
                builder.append(_syncMode);
                builder.append(", ");
            }
            if (_linkOamEnabled != null) {
                builder.append("_linkOamEnabled=");
                builder.append(_linkOamEnabled);
                builder.append(", ");
            }
            if (_tokenShareEnabled != null) {
                builder.append("_tokenShareEnabled=");
                builder.append(_tokenShareEnabled);
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
