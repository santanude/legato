package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1
 *
 */
public class FcSpec1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1> {

    private NrpCeFcspecAttrs _nrpCeFcspecAttrs;


    public FcSpec1Builder() {
    }

    public FcSpec1Builder(FcSpec1 base) {
        this._nrpCeFcspecAttrs = base.getNrpCeFcspecAttrs();
    }


    public NrpCeFcspecAttrs getNrpCeFcspecAttrs() {
        return _nrpCeFcspecAttrs;
    }

     
    public FcSpec1Builder setNrpCeFcspecAttrs(final NrpCeFcspecAttrs value) {
        this._nrpCeFcspecAttrs = value;
        return this;
    }

    @Override
    public FcSpec1 build() {
        return new FcSpec1Impl(this);
    }

    private static final class FcSpec1Impl implements FcSpec1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1.class;
        }

        private final NrpCeFcspecAttrs _nrpCeFcspecAttrs;


        private FcSpec1Impl(FcSpec1Builder base) {
            this._nrpCeFcspecAttrs = base.getNrpCeFcspecAttrs();
        }

        @Override
        public NrpCeFcspecAttrs getNrpCeFcspecAttrs() {
            return _nrpCeFcspecAttrs;
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
            result = prime * result + Objects.hashCode(_nrpCeFcspecAttrs);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1 other = (org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.FcSpec1)obj;
            if (!Objects.equals(_nrpCeFcspecAttrs, other.getNrpCeFcspecAttrs())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "FcSpec1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nrpCeFcspecAttrs != null) {
                builder.append("_nrpCeFcspecAttrs=");
                builder.append(_nrpCeFcspecAttrs);
            }
            return builder.append(']').toString();
        }
    }

}
