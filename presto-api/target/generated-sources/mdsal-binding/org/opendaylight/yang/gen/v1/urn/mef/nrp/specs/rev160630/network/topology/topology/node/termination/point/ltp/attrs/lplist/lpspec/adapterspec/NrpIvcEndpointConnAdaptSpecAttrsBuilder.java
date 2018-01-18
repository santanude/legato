package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPEndPointRole;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs
 *
 */
public class NrpIvcEndpointConnAdaptSpecAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs> {

    private java.lang.String _ivcEndPointId;
    private List<IvcEndPointMap> _ivcEndPointMap;
    private NRPEndPointRole _ivcEndPointRole;
    private java.lang.Boolean _subscriberMegMipEnabled;
    private java.lang.Boolean _testMegEnabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> augmentation = Collections.emptyMap();

    public NrpIvcEndpointConnAdaptSpecAttrsBuilder() {
    }
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec arg) {
        this._ivcEndPointId = arg.getIvcEndPointId();
        this._testMegEnabled = arg.isTestMegEnabled();
        this._ivcEndPointRole = arg.getIvcEndPointRole();
        this._ivcEndPointMap = arg.getIvcEndPointMap();
        this._subscriberMegMipEnabled = arg.isSubscriberMegMipEnabled();
    }

    public NrpIvcEndpointConnAdaptSpecAttrsBuilder(NrpIvcEndpointConnAdaptSpecAttrs base) {
        this._ivcEndPointId = base.getIvcEndPointId();
        this._ivcEndPointMap = base.getIvcEndPointMap();
        this._ivcEndPointRole = base.getIvcEndPointRole();
        this._subscriberMegMipEnabled = base.isSubscriberMegMipEnabled();
        this._testMegEnabled = base.isTestMegEnabled();
        if (base instanceof NrpIvcEndpointConnAdaptSpecAttrsImpl) {
            NrpIvcEndpointConnAdaptSpecAttrsImpl impl = (NrpIvcEndpointConnAdaptSpecAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec) {
            this._ivcEndPointId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec)arg).getIvcEndPointId();
            this._testMegEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec)arg).isTestMegEnabled();
            this._ivcEndPointRole = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec)arg).getIvcEndPointRole();
            this._ivcEndPointMap = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec)arg).getIvcEndPointMap();
            this._subscriberMegMipEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec)arg).isSubscriberMegMipEnabled();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPIvcEndpointConnAdaptSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getIvcEndPointId() {
        return _ivcEndPointId;
    }
    
    public List<IvcEndPointMap> getIvcEndPointMap() {
        return _ivcEndPointMap;
    }
    
    public NRPEndPointRole getIvcEndPointRole() {
        return _ivcEndPointRole;
    }
    
    public java.lang.Boolean isSubscriberMegMipEnabled() {
        return _subscriberMegMipEnabled;
    }
    
    public java.lang.Boolean isTestMegEnabled() {
        return _testMegEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder setIvcEndPointId(final java.lang.String value) {
        this._ivcEndPointId = value;
        return this;
    }
    
     
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder setIvcEndPointMap(final List<IvcEndPointMap> value) {
        this._ivcEndPointMap = value;
        return this;
    }
    
     
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder setIvcEndPointRole(final NRPEndPointRole value) {
        this._ivcEndPointRole = value;
        return this;
    }
    
     
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder setSubscriberMegMipEnabled(final java.lang.Boolean value) {
        this._subscriberMegMipEnabled = value;
        return this;
    }
    
     
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder setTestMegEnabled(final java.lang.Boolean value) {
        this._testMegEnabled = value;
        return this;
    }
    
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NrpIvcEndpointConnAdaptSpecAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NrpIvcEndpointConnAdaptSpecAttrs build() {
        return new NrpIvcEndpointConnAdaptSpecAttrsImpl(this);
    }

    private static final class NrpIvcEndpointConnAdaptSpecAttrsImpl implements NrpIvcEndpointConnAdaptSpecAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs.class;
        }

        private final java.lang.String _ivcEndPointId;
        private final List<IvcEndPointMap> _ivcEndPointMap;
        private final NRPEndPointRole _ivcEndPointRole;
        private final java.lang.Boolean _subscriberMegMipEnabled;
        private final java.lang.Boolean _testMegEnabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> augmentation = Collections.emptyMap();

        private NrpIvcEndpointConnAdaptSpecAttrsImpl(NrpIvcEndpointConnAdaptSpecAttrsBuilder base) {
            this._ivcEndPointId = base.getIvcEndPointId();
            this._ivcEndPointMap = base.getIvcEndPointMap();
            this._ivcEndPointRole = base.getIvcEndPointRole();
            this._subscriberMegMipEnabled = base.isSubscriberMegMipEnabled();
            this._testMegEnabled = base.isTestMegEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getIvcEndPointId() {
            return _ivcEndPointId;
        }
        
        @Override
        public List<IvcEndPointMap> getIvcEndPointMap() {
            return _ivcEndPointMap;
        }
        
        @Override
        public NRPEndPointRole getIvcEndPointRole() {
            return _ivcEndPointRole;
        }
        
        @Override
        public java.lang.Boolean isSubscriberMegMipEnabled() {
            return _subscriberMegMipEnabled;
        }
        
        @Override
        public java.lang.Boolean isTestMegEnabled() {
            return _testMegEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ivcEndPointId);
            result = prime * result + Objects.hashCode(_ivcEndPointMap);
            result = prime * result + Objects.hashCode(_ivcEndPointRole);
            result = prime * result + Objects.hashCode(_subscriberMegMipEnabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs)obj;
            if (!Objects.equals(_ivcEndPointId, other.getIvcEndPointId())) {
                return false;
            }
            if (!Objects.equals(_ivcEndPointMap, other.getIvcEndPointMap())) {
                return false;
            }
            if (!Objects.equals(_ivcEndPointRole, other.getIvcEndPointRole())) {
                return false;
            }
            if (!Objects.equals(_subscriberMegMipEnabled, other.isSubscriberMegMipEnabled())) {
                return false;
            }
            if (!Objects.equals(_testMegEnabled, other.isTestMegEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NrpIvcEndpointConnAdaptSpecAttrsImpl otherImpl = (NrpIvcEndpointConnAdaptSpecAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NrpIvcEndpointConnAdaptSpecAttrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ivcEndPointId != null) {
                builder.append("_ivcEndPointId=");
                builder.append(_ivcEndPointId);
                builder.append(", ");
            }
            if (_ivcEndPointMap != null) {
                builder.append("_ivcEndPointMap=");
                builder.append(_ivcEndPointMap);
                builder.append(", ");
            }
            if (_ivcEndPointRole != null) {
                builder.append("_ivcEndPointRole=");
                builder.append(_ivcEndPointRole);
                builder.append(", ");
            }
            if (_subscriberMegMipEnabled != null) {
                builder.append("_subscriberMegMipEnabled=");
                builder.append(_subscriberMegMipEnabled);
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
