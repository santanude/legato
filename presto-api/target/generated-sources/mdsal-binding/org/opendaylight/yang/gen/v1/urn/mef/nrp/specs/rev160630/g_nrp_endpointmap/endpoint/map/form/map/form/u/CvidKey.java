package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

public class CvidKey
 implements Identifier<Cvid> {
    private static final long serialVersionUID = -512316978989362923L;
    private final NRPPositiveInteger _vid;


    public CvidKey(NRPPositiveInteger _vid) {
    
    
        this._vid = _vid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CvidKey(CvidKey source) {
        this._vid = source._vid;
    }


    public NRPPositiveInteger getVid() {
        return _vid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vid);
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
        CvidKey other = (CvidKey) obj;
        if (!Objects.equals(_vid, other._vid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_endpointmap.endpoint.map.form.map.form.u.CvidKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_vid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vid=");
            builder.append(_vid);
        }
        return builder.append(']').toString();
    }
}

