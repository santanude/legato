package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit
 *
 */
public class SourceMacAddressLimitBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit> {

    private NRPNaturalNumber _limit;
    private NRPNaturalNumber _timeInterval;
    private java.lang.Boolean _enabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> augmentation = Collections.emptyMap();

    public SourceMacAddressLimitBuilder() {
    }
    public SourceMacAddressLimitBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit arg) {
        this._enabled = arg.isEnabled();
        this._limit = arg.getLimit();
        this._timeInterval = arg.getTimeInterval();
    }

    public SourceMacAddressLimitBuilder(SourceMacAddressLimit base) {
        this._limit = base.getLimit();
        this._timeInterval = base.getTimeInterval();
        this._enabled = base.isEnabled();
        if (base instanceof SourceMacAddressLimitImpl) {
            SourceMacAddressLimitImpl impl = (SourceMacAddressLimitImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit) {
            this._enabled = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit)arg).isEnabled();
            this._limit = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit)arg).getLimit();
            this._timeInterval = ((org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit)arg).getTimeInterval();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit] \n" +
              "but was: " + arg
            );
        }
    }

    public NRPNaturalNumber getLimit() {
        return _limit;
    }
    
    public NRPNaturalNumber getTimeInterval() {
        return _timeInterval;
    }
    
    public java.lang.Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SourceMacAddressLimitBuilder setLimit(final NRPNaturalNumber value) {
        this._limit = value;
        return this;
    }
    
     
    public SourceMacAddressLimitBuilder setTimeInterval(final NRPNaturalNumber value) {
        this._timeInterval = value;
        return this;
    }
    
     
    public SourceMacAddressLimitBuilder setEnabled(final java.lang.Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public SourceMacAddressLimitBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SourceMacAddressLimitBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SourceMacAddressLimit build() {
        return new SourceMacAddressLimitImpl(this);
    }

    private static final class SourceMacAddressLimitImpl implements SourceMacAddressLimit {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit.class;
        }

        private final NRPNaturalNumber _limit;
        private final NRPNaturalNumber _timeInterval;
        private final java.lang.Boolean _enabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> augmentation = Collections.emptyMap();

        private SourceMacAddressLimitImpl(SourceMacAddressLimitBuilder base) {
            this._limit = base.getLimit();
            this._timeInterval = base.getTimeInterval();
            this._enabled = base.isEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NRPNaturalNumber getLimit() {
            return _limit;
        }
        
        @Override
        public NRPNaturalNumber getTimeInterval() {
            return _timeInterval;
        }
        
        @Override
        public java.lang.Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_limit);
            result = prime * result + Objects.hashCode(_timeInterval);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit)obj;
            if (!Objects.equals(_limit, other.getLimit())) {
                return false;
            }
            if (!Objects.equals(_timeInterval, other.getTimeInterval())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SourceMacAddressLimitImpl otherImpl = (SourceMacAddressLimitImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SourceMacAddressLimit [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_limit != null) {
                builder.append("_limit=");
                builder.append(_limit);
                builder.append(", ");
            }
            if (_timeInterval != null) {
                builder.append("_timeInterval=");
                builder.append(_timeInterval);
                builder.append(", ");
            }
            if (_enabled != null) {
                builder.append("_enabled=");
                builder.append(_enabled);
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
