package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;

public class NRPNaturalNumber
 implements Serializable {
    private static final long serialVersionUID = -3759847548488927443L;
    private final java.lang.Long _value;

    private static void check_valueRange(final long value) {
        if (value >= 1L && value <= 4294967295L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1..4294967295]].", value));
    }

    @ConstructorProperties("value")
    public NRPNaturalNumber(java.lang.Long _value) {
        if (_value != null) {
            check_valueRange(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NRPNaturalNumber(NRPNaturalNumber source) {
        this._value = source._value;
    }

    public static NRPNaturalNumber getDefaultInstance(String defaultValue) {
        return new NRPNaturalNumber(java.lang.Long.valueOf(defaultValue));
    }

    public java.lang.Long getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
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
        NRPNaturalNumber other = (NRPNaturalNumber) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
        }
        return builder.append(']').toString();
    }
}

