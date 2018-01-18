package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1
 *
 */
public class TerminationPoint1Builder implements Builder<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1> {

    private LtpAttrs _ltpAttrs;


    public TerminationPoint1Builder() {
    }

    public TerminationPoint1Builder(TerminationPoint1 base) {
        this._ltpAttrs = base.getLtpAttrs();
    }


    public LtpAttrs getLtpAttrs() {
        return _ltpAttrs;
    }

     
    public TerminationPoint1Builder setLtpAttrs(final LtpAttrs value) {
        this._ltpAttrs = value;
        return this;
    }

    @Override
    public TerminationPoint1 build() {
        return new TerminationPoint1Impl(this);
    }

    private static final class TerminationPoint1Impl implements TerminationPoint1 {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1.class;
        }

        private final LtpAttrs _ltpAttrs;


        private TerminationPoint1Impl(TerminationPoint1Builder base) {
            this._ltpAttrs = base.getLtpAttrs();
        }

        @Override
        public LtpAttrs getLtpAttrs() {
            return _ltpAttrs;
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
            result = prime * result + Objects.hashCode(_ltpAttrs);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1 other = (org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.TerminationPoint1)obj;
            if (!Objects.equals(_ltpAttrs, other.getLtpAttrs())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "TerminationPoint1 [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ltpAttrs != null) {
                builder.append("_ltpAttrs=");
                builder.append(_ltpAttrs);
            }
            return builder.append(']').toString();
        }
    }

}
