package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;

public class AdapterPropertySpecListKey
 implements Identifier<AdapterPropertySpecList> {
    private static final long serialVersionUID = 4598301918631059548L;
    private final java.lang.String _uuid;


    public AdapterPropertySpecListKey(java.lang.String _uuid) {
    
    
        this._uuid = _uuid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AdapterPropertySpecListKey(AdapterPropertySpecListKey source) {
        this._uuid = source._uuid;
    }


    public java.lang.String getUuid() {
        return _uuid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_uuid);
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
        AdapterPropertySpecListKey other = (AdapterPropertySpecListKey) obj;
        if (!Objects.equals(_uuid, other._uuid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterPropertySpecListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_uuid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_uuid=");
            builder.append(_uuid);
        }
        return builder.append(']').toString();
    }
}

