package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpTerminationSpecAttrs;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1
 *
 */
public class TerminationSpec1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1> {

    private NrpTerminationSpecAttrs _nrpTerminationSpecAttrs;
    private NrpUniTerminationAttrs _nrpUniTerminationAttrs;


    public TerminationSpec1Builder() {
    }

    public TerminationSpec1Builder(TerminationSpec1 base) {
        this._nrpTerminationSpecAttrs = base.getNrpTerminationSpecAttrs();
        this._nrpUniTerminationAttrs = base.getNrpUniTerminationAttrs();
    }


    public NrpTerminationSpecAttrs getNrpTerminationSpecAttrs() {
        return _nrpTerminationSpecAttrs;
    }
    
    public NrpUniTerminationAttrs getNrpUniTerminationAttrs() {
        return _nrpUniTerminationAttrs;
    }

     
    public TerminationSpec1Builder setNrpTerminationSpecAttrs(final NrpTerminationSpecAttrs value) {
        this._nrpTerminationSpecAttrs = value;
        return this;
    }
    
     
    public TerminationSpec1Builder setNrpUniTerminationAttrs(final NrpUniTerminationAttrs value) {
        this._nrpUniTerminationAttrs = value;
        return this;
    }

    @Override
    public TerminationSpec1 build() {
        return new TerminationSpec1Impl(this);
    }

    private static final class TerminationSpec1Impl implements TerminationSpec1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1.class;
        }

        private final NrpTerminationSpecAttrs _nrpTerminationSpecAttrs;
        private final NrpUniTerminationAttrs _nrpUniTerminationAttrs;


        private TerminationSpec1Impl(TerminationSpec1Builder base) {
            this._nrpTerminationSpecAttrs = base.getNrpTerminationSpecAttrs();
            this._nrpUniTerminationAttrs = base.getNrpUniTerminationAttrs();
        }

        @Override
        public NrpTerminationSpecAttrs getNrpTerminationSpecAttrs() {
            return _nrpTerminationSpecAttrs;
        }
        
        @Override
        public NrpUniTerminationAttrs getNrpUniTerminationAttrs() {
            return _nrpUniTerminationAttrs;
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
            result = prime * result + Objects.hashCode(_nrpTerminationSpecAttrs);
            result = prime * result + Objects.hashCode(_nrpUniTerminationAttrs);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1 other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.TerminationSpec1)obj;
            if (!Objects.equals(_nrpTerminationSpecAttrs, other.getNrpTerminationSpecAttrs())) {
                return false;
            }
            if (!Objects.equals(_nrpUniTerminationAttrs, other.getNrpUniTerminationAttrs())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "TerminationSpec1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nrpTerminationSpecAttrs != null) {
                builder.append("_nrpTerminationSpecAttrs=");
                builder.append(_nrpTerminationSpecAttrs);
                builder.append(", ");
            }
            if (_nrpUniTerminationAttrs != null) {
                builder.append("_nrpUniTerminationAttrs=");
                builder.append(_nrpUniTerminationAttrs);
            }
            return builder.append(']').toString();
        }
    }

}
