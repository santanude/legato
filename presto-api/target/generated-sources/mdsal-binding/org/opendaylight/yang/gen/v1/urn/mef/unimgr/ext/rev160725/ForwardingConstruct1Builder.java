package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1
 *
 */
public class ForwardingConstruct1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1> {

    private UnimgrAttrs _unimgrAttrs;


    public ForwardingConstruct1Builder() {
    }

    public ForwardingConstruct1Builder(ForwardingConstruct1 base) {
        this._unimgrAttrs = base.getUnimgrAttrs();
    }


    public UnimgrAttrs getUnimgrAttrs() {
        return _unimgrAttrs;
    }

     
    public ForwardingConstruct1Builder setUnimgrAttrs(final UnimgrAttrs value) {
        this._unimgrAttrs = value;
        return this;
    }

    @Override
    public ForwardingConstruct1 build() {
        return new ForwardingConstruct1Impl(this);
    }

    private static final class ForwardingConstruct1Impl implements ForwardingConstruct1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1.class;
        }

        private final UnimgrAttrs _unimgrAttrs;


        private ForwardingConstruct1Impl(ForwardingConstruct1Builder base) {
            this._unimgrAttrs = base.getUnimgrAttrs();
        }

        @Override
        public UnimgrAttrs getUnimgrAttrs() {
            return _unimgrAttrs;
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
            result = prime * result + Objects.hashCode(_unimgrAttrs);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1 other = (org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1)obj;
            if (!Objects.equals(_unimgrAttrs, other.getUnimgrAttrs())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "ForwardingConstruct1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_unimgrAttrs != null) {
                builder.append("_unimgrAttrs=");
                builder.append(_unimgrAttrs);
            }
            return builder.append(']').toString();
        }
    }

}
