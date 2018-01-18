package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1
 *
 */
public class Node1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1> {

    private ConnectionSettings _connectionSettings;


    public Node1Builder() {
    }

    public Node1Builder(Node1 base) {
        this._connectionSettings = base.getConnectionSettings();
    }


    public ConnectionSettings getConnectionSettings() {
        return _connectionSettings;
    }

     
    public Node1Builder setConnectionSettings(final ConnectionSettings value) {
        this._connectionSettings = value;
        return this;
    }

    @Override
    public Node1 build() {
        return new Node1Impl(this);
    }

    private static final class Node1Impl implements Node1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1.class;
        }

        private final ConnectionSettings _connectionSettings;


        private Node1Impl(Node1Builder base) {
            this._connectionSettings = base.getConnectionSettings();
        }

        @Override
        public ConnectionSettings getConnectionSettings() {
            return _connectionSettings;
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
            result = prime * result + Objects.hashCode(_connectionSettings);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1 other = (org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1)obj;
            if (!Objects.equals(_connectionSettings, other.getConnectionSettings())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "Node1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_connectionSettings != null) {
                builder.append("_connectionSettings=");
                builder.append(_connectionSettings);
            }
            return builder.append(']').toString();
        }
    }

}
