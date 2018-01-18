package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Host;
import java.util.Collections;
import java.util.Map;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings
 *
 */
public class ConnectionSettingsBuilder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings> {

    private Host _host;
    private java.lang.String _password;
    private java.lang.String _userName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> augmentation = Collections.emptyMap();

    public ConnectionSettingsBuilder() {
    }

    public ConnectionSettingsBuilder(ConnectionSettings base) {
        this._host = base.getHost();
        this._password = base.getPassword();
        this._userName = base.getUserName();
        if (base instanceof ConnectionSettingsImpl) {
            ConnectionSettingsImpl impl = (ConnectionSettingsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Host getHost() {
        return _host;
    }
    
    public java.lang.String getPassword() {
        return _password;
    }
    
    public java.lang.String getUserName() {
        return _userName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ConnectionSettingsBuilder setHost(final Host value) {
        this._host = value;
        return this;
    }
    
     
    public ConnectionSettingsBuilder setPassword(final java.lang.String value) {
        this._password = value;
        return this;
    }
    
     
    public ConnectionSettingsBuilder setUserName(final java.lang.String value) {
        this._userName = value;
        return this;
    }
    
    public ConnectionSettingsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectionSettingsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectionSettings build() {
        return new ConnectionSettingsImpl(this);
    }

    private static final class ConnectionSettingsImpl implements ConnectionSettings {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings.class;
        }

        private final Host _host;
        private final java.lang.String _password;
        private final java.lang.String _userName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> augmentation = Collections.emptyMap();

        private ConnectionSettingsImpl(ConnectionSettingsBuilder base) {
            this._host = base.getHost();
            this._password = base.getPassword();
            this._userName = base.getUserName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Host getHost() {
            return _host;
        }
        
        @Override
        public java.lang.String getPassword() {
            return _password;
        }
        
        @Override
        public java.lang.String getUserName() {
            return _userName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_host);
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_userName);
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings other = (org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings)obj;
            if (!Objects.equals(_host, other.getHost())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_userName, other.getUserName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionSettingsImpl otherImpl = (ConnectionSettingsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>> e : augmentation.entrySet()) {
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
            java.lang.String name = "ConnectionSettings [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_host != null) {
                builder.append("_host=");
                builder.append(_host);
                builder.append(", ");
            }
            if (_password != null) {
                builder.append("_password=");
                builder.append(_password);
                builder.append(", ");
            }
            if (_userName != null) {
                builder.append("_userName=");
                builder.append(_userName);
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
