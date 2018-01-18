package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1
 *
 */
public class FcPort1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1> {

    private CTagVlanId _cTagVlanId;


    public FcPort1Builder() {
    }

    public FcPort1Builder(FcPort1 base) {
        this._cTagVlanId = base.getCTagVlanId();
    }


    public CTagVlanId getCTagVlanId() {
        return _cTagVlanId;
    }

     
    public FcPort1Builder setCTagVlanId(final CTagVlanId value) {
        this._cTagVlanId = value;
        return this;
    }

    @Override
    public FcPort1 build() {
        return new FcPort1Impl(this);
    }

    private static final class FcPort1Impl implements FcPort1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1.class;
        }

        private final CTagVlanId _cTagVlanId;


        private FcPort1Impl(FcPort1Builder base) {
            this._cTagVlanId = base.getCTagVlanId();
        }

        @Override
        public CTagVlanId getCTagVlanId() {
            return _cTagVlanId;
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
            result = prime * result + Objects.hashCode(_cTagVlanId);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1 other = (org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.FcPort1)obj;
            if (!Objects.equals(_cTagVlanId, other.getCTagVlanId())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "FcPort1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_cTagVlanId != null) {
                builder.append("_cTagVlanId=");
                builder.append(_cTagVlanId);
            }
            return builder.append(']').toString();
        }
    }

}
