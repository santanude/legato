package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.EgressBwpUni;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs
 *
 */
public class NrpUniTerminationAttrsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs> {

    private NRPPositiveInteger _defaultCeVlanId;
    private EgressBwpUni _egressBwpUni;
    private IngressBwpUni _ingressBwpUni;
    private java.lang.String _operatoruniprofile;
    private java.lang.String _serviceprovideruniprofile;
    private java.lang.Boolean _elmiEnabled;
    private java.lang.Boolean _uniMegEnabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> augmentation = Collections.emptyMap();

    public NrpUniTerminationAttrsBuilder() {
    }
    public NrpUniTerminationAttrsBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec arg) {
        this._defaultCeVlanId = arg.getDefaultCeVlanId();
        this._uniMegEnabled = arg.isUniMegEnabled();
        this._elmiEnabled = arg.isElmiEnabled();
        this._serviceprovideruniprofile = arg.getServiceprovideruniprofile();
        this._operatoruniprofile = arg.getOperatoruniprofile();
        this._ingressBwpUni = arg.getIngressBwpUni();
        this._egressBwpUni = arg.getEgressBwpUni();
    }

    public NrpUniTerminationAttrsBuilder(NrpUniTerminationAttrs base) {
        this._defaultCeVlanId = base.getDefaultCeVlanId();
        this._egressBwpUni = base.getEgressBwpUni();
        this._ingressBwpUni = base.getIngressBwpUni();
        this._operatoruniprofile = base.getOperatoruniprofile();
        this._serviceprovideruniprofile = base.getServiceprovideruniprofile();
        this._elmiEnabled = base.isElmiEnabled();
        this._uniMegEnabled = base.isUniMegEnabled();
        if (base instanceof NrpUniTerminationAttrsImpl) {
            NrpUniTerminationAttrsImpl impl = (NrpUniTerminationAttrsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec) {
            this._defaultCeVlanId = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).getDefaultCeVlanId();
            this._uniMegEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).isUniMegEnabled();
            this._elmiEnabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).isElmiEnabled();
            this._serviceprovideruniprofile = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).getServiceprovideruniprofile();
            this._operatoruniprofile = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).getOperatoruniprofile();
            this._ingressBwpUni = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).getIngressBwpUni();
            this._egressBwpUni = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec)arg).getEgressBwpUni();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPUNITerminationSpec] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPPositiveInteger getDefaultCeVlanId() {
        return _defaultCeVlanId;
    }
    
    public EgressBwpUni getEgressBwpUni() {
        return _egressBwpUni;
    }
    
    public IngressBwpUni getIngressBwpUni() {
        return _ingressBwpUni;
    }
    
    public java.lang.String getOperatoruniprofile() {
        return _operatoruniprofile;
    }
    
    public java.lang.String getServiceprovideruniprofile() {
        return _serviceprovideruniprofile;
    }
    
    public java.lang.Boolean isElmiEnabled() {
        return _elmiEnabled;
    }
    
    public java.lang.Boolean isUniMegEnabled() {
        return _uniMegEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NrpUniTerminationAttrsBuilder setDefaultCeVlanId(final NRPPositiveInteger value) {
        this._defaultCeVlanId = value;
        return this;
    }
    
     
    public NrpUniTerminationAttrsBuilder setEgressBwpUni(final EgressBwpUni value) {
        this._egressBwpUni = value;
        return this;
    }
    
     
    public NrpUniTerminationAttrsBuilder setIngressBwpUni(final IngressBwpUni value) {
        this._ingressBwpUni = value;
        return this;
    }
    
     
    public NrpUniTerminationAttrsBuilder setOperatoruniprofile(final java.lang.String value) {
        this._operatoruniprofile = value;
        return this;
    }
    
     
    public NrpUniTerminationAttrsBuilder setServiceprovideruniprofile(final java.lang.String value) {
        this._serviceprovideruniprofile = value;
        return this;
    }
    
     
    public NrpUniTerminationAttrsBuilder setElmiEnabled(final java.lang.Boolean value) {
        this._elmiEnabled = value;
        return this;
    }
    
     
    public NrpUniTerminationAttrsBuilder setUniMegEnabled(final java.lang.Boolean value) {
        this._uniMegEnabled = value;
        return this;
    }
    
    public NrpUniTerminationAttrsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NrpUniTerminationAttrsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NrpUniTerminationAttrs build() {
        return new NrpUniTerminationAttrsImpl(this);
    }

    private static final class NrpUniTerminationAttrsImpl implements NrpUniTerminationAttrs {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs.class;
        }

        private final NRPPositiveInteger _defaultCeVlanId;
        private final EgressBwpUni _egressBwpUni;
        private final IngressBwpUni _ingressBwpUni;
        private final java.lang.String _operatoruniprofile;
        private final java.lang.String _serviceprovideruniprofile;
        private final java.lang.Boolean _elmiEnabled;
        private final java.lang.Boolean _uniMegEnabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> augmentation = Collections.emptyMap();

        private NrpUniTerminationAttrsImpl(NrpUniTerminationAttrsBuilder base) {
            this._defaultCeVlanId = base.getDefaultCeVlanId();
            this._egressBwpUni = base.getEgressBwpUni();
            this._ingressBwpUni = base.getIngressBwpUni();
            this._operatoruniprofile = base.getOperatoruniprofile();
            this._serviceprovideruniprofile = base.getServiceprovideruniprofile();
            this._elmiEnabled = base.isElmiEnabled();
            this._uniMegEnabled = base.isUniMegEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPPositiveInteger getDefaultCeVlanId() {
            return _defaultCeVlanId;
        }
        
        @Override
        public EgressBwpUni getEgressBwpUni() {
            return _egressBwpUni;
        }
        
        @Override
        public IngressBwpUni getIngressBwpUni() {
            return _ingressBwpUni;
        }
        
        @Override
        public java.lang.String getOperatoruniprofile() {
            return _operatoruniprofile;
        }
        
        @Override
        public java.lang.String getServiceprovideruniprofile() {
            return _serviceprovideruniprofile;
        }
        
        @Override
        public java.lang.Boolean isElmiEnabled() {
            return _elmiEnabled;
        }
        
        @Override
        public java.lang.Boolean isUniMegEnabled() {
            return _uniMegEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_defaultCeVlanId);
            result = prime * result + Objects.hashCode(_egressBwpUni);
            result = prime * result + Objects.hashCode(_ingressBwpUni);
            result = prime * result + Objects.hashCode(_operatoruniprofile);
            result = prime * result + Objects.hashCode(_serviceprovideruniprofile);
            result = prime * result + Objects.hashCode(_elmiEnabled);
            result = prime * result + Objects.hashCode(_uniMegEnabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs)obj;
            if (!Objects.equals(_defaultCeVlanId, other.getDefaultCeVlanId())) {
                return false;
            }
            if (!Objects.equals(_egressBwpUni, other.getEgressBwpUni())) {
                return false;
            }
            if (!Objects.equals(_ingressBwpUni, other.getIngressBwpUni())) {
                return false;
            }
            if (!Objects.equals(_operatoruniprofile, other.getOperatoruniprofile())) {
                return false;
            }
            if (!Objects.equals(_serviceprovideruniprofile, other.getServiceprovideruniprofile())) {
                return false;
            }
            if (!Objects.equals(_elmiEnabled, other.isElmiEnabled())) {
                return false;
            }
            if (!Objects.equals(_uniMegEnabled, other.isUniMegEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NrpUniTerminationAttrsImpl otherImpl = (NrpUniTerminationAttrsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NrpUniTerminationAttrs [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_defaultCeVlanId != null) {
                builder.append("_defaultCeVlanId=");
                builder.append(_defaultCeVlanId);
                builder.append(", ");
            }
            if (_egressBwpUni != null) {
                builder.append("_egressBwpUni=");
                builder.append(_egressBwpUni);
                builder.append(", ");
            }
            if (_ingressBwpUni != null) {
                builder.append("_ingressBwpUni=");
                builder.append(_ingressBwpUni);
                builder.append(", ");
            }
            if (_operatoruniprofile != null) {
                builder.append("_operatoruniprofile=");
                builder.append(_operatoruniprofile);
                builder.append(", ");
            }
            if (_serviceprovideruniprofile != null) {
                builder.append("_serviceprovideruniprofile=");
                builder.append(_serviceprovideruniprofile);
                builder.append(", ");
            }
            if (_elmiEnabled != null) {
                builder.append("_elmiEnabled=");
                builder.append(_elmiEnabled);
                builder.append(", ");
            }
            if (_uniMegEnabled != null) {
                builder.append("_uniMegEnabled=");
                builder.append(_uniMegEnabled);
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
