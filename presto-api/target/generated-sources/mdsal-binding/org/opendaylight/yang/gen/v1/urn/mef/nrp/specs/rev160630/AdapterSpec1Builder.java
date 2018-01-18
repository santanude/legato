package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1
 *
 */
public class AdapterSpec1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1> {

    private NrpConnAdaptSpecAttrs _nrpConnAdaptSpecAttrs;
    private NrpEvcEndpointConnAdaptSpecAttrs _nrpEvcEndpointConnAdaptSpecAttrs;
    private NrpIvcEndpointConnAdaptSpecAttrs _nrpIvcEndpointConnAdaptSpecAttrs;


    public AdapterSpec1Builder() {
    }

    public AdapterSpec1Builder(AdapterSpec1 base) {
        this._nrpConnAdaptSpecAttrs = base.getNrpConnAdaptSpecAttrs();
        this._nrpEvcEndpointConnAdaptSpecAttrs = base.getNrpEvcEndpointConnAdaptSpecAttrs();
        this._nrpIvcEndpointConnAdaptSpecAttrs = base.getNrpIvcEndpointConnAdaptSpecAttrs();
    }


    public NrpConnAdaptSpecAttrs getNrpConnAdaptSpecAttrs() {
        return _nrpConnAdaptSpecAttrs;
    }
    
    public NrpEvcEndpointConnAdaptSpecAttrs getNrpEvcEndpointConnAdaptSpecAttrs() {
        return _nrpEvcEndpointConnAdaptSpecAttrs;
    }
    
    public NrpIvcEndpointConnAdaptSpecAttrs getNrpIvcEndpointConnAdaptSpecAttrs() {
        return _nrpIvcEndpointConnAdaptSpecAttrs;
    }

     
    public AdapterSpec1Builder setNrpConnAdaptSpecAttrs(final NrpConnAdaptSpecAttrs value) {
        this._nrpConnAdaptSpecAttrs = value;
        return this;
    }
    
     
    public AdapterSpec1Builder setNrpEvcEndpointConnAdaptSpecAttrs(final NrpEvcEndpointConnAdaptSpecAttrs value) {
        this._nrpEvcEndpointConnAdaptSpecAttrs = value;
        return this;
    }
    
     
    public AdapterSpec1Builder setNrpIvcEndpointConnAdaptSpecAttrs(final NrpIvcEndpointConnAdaptSpecAttrs value) {
        this._nrpIvcEndpointConnAdaptSpecAttrs = value;
        return this;
    }

    @Override
    public AdapterSpec1 build() {
        return new AdapterSpec1Impl(this);
    }

    private static final class AdapterSpec1Impl implements AdapterSpec1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1.class;
        }

        private final NrpConnAdaptSpecAttrs _nrpConnAdaptSpecAttrs;
        private final NrpEvcEndpointConnAdaptSpecAttrs _nrpEvcEndpointConnAdaptSpecAttrs;
        private final NrpIvcEndpointConnAdaptSpecAttrs _nrpIvcEndpointConnAdaptSpecAttrs;


        private AdapterSpec1Impl(AdapterSpec1Builder base) {
            this._nrpConnAdaptSpecAttrs = base.getNrpConnAdaptSpecAttrs();
            this._nrpEvcEndpointConnAdaptSpecAttrs = base.getNrpEvcEndpointConnAdaptSpecAttrs();
            this._nrpIvcEndpointConnAdaptSpecAttrs = base.getNrpIvcEndpointConnAdaptSpecAttrs();
        }

        @Override
        public NrpConnAdaptSpecAttrs getNrpConnAdaptSpecAttrs() {
            return _nrpConnAdaptSpecAttrs;
        }
        
        @Override
        public NrpEvcEndpointConnAdaptSpecAttrs getNrpEvcEndpointConnAdaptSpecAttrs() {
            return _nrpEvcEndpointConnAdaptSpecAttrs;
        }
        
        @Override
        public NrpIvcEndpointConnAdaptSpecAttrs getNrpIvcEndpointConnAdaptSpecAttrs() {
            return _nrpIvcEndpointConnAdaptSpecAttrs;
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
            result = prime * result + Objects.hashCode(_nrpConnAdaptSpecAttrs);
            result = prime * result + Objects.hashCode(_nrpEvcEndpointConnAdaptSpecAttrs);
            result = prime * result + Objects.hashCode(_nrpIvcEndpointConnAdaptSpecAttrs);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1 other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.AdapterSpec1)obj;
            if (!Objects.equals(_nrpConnAdaptSpecAttrs, other.getNrpConnAdaptSpecAttrs())) {
                return false;
            }
            if (!Objects.equals(_nrpEvcEndpointConnAdaptSpecAttrs, other.getNrpEvcEndpointConnAdaptSpecAttrs())) {
                return false;
            }
            if (!Objects.equals(_nrpIvcEndpointConnAdaptSpecAttrs, other.getNrpIvcEndpointConnAdaptSpecAttrs())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "AdapterSpec1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nrpConnAdaptSpecAttrs != null) {
                builder.append("_nrpConnAdaptSpecAttrs=");
                builder.append(_nrpConnAdaptSpecAttrs);
                builder.append(", ");
            }
            if (_nrpEvcEndpointConnAdaptSpecAttrs != null) {
                builder.append("_nrpEvcEndpointConnAdaptSpecAttrs=");
                builder.append(_nrpEvcEndpointConnAdaptSpecAttrs);
                builder.append(", ");
            }
            if (_nrpIvcEndpointConnAdaptSpecAttrs != null) {
                builder.append("_nrpIvcEndpointConnAdaptSpecAttrs=");
                builder.append(_nrpIvcEndpointConnAdaptSpecAttrs);
            }
            return builder.append(']').toString();
        }
    }

}
