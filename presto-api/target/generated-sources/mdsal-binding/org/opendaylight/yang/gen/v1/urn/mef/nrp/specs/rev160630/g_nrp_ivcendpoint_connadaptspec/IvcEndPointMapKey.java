package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

public class IvcEndPointMapKey
 implements Identifier<IvcEndPointMap> {
    private static final long serialVersionUID = 5236791508082687292L;
    private final NRPPositiveInteger _vlanId;


    public IvcEndPointMapKey(NRPPositiveInteger _vlanId) {
    
    
        this._vlanId = _vlanId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IvcEndPointMapKey(IvcEndPointMapKey source) {
        this._vlanId = source._vlanId;
    }


    public NRPPositiveInteger getVlanId() {
        return _vlanId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vlanId);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        IvcEndPointMapKey other = (IvcEndPointMapKey) obj;
        if (!Objects.equals(_vlanId, other._vlanId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_ivcendpoint_connadaptspec.IvcEndPointMapKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vlanId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vlanId=");
            builder.append(_vlanId);
        }
        return builder.append(']').toString();
    }
}

