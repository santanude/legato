package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPIpVersion {
    IPV4(0, "IPV4"),
    
    IPV6(1, "IPV6"),
    
    IPV4ANDIPV6(2, "IPV4_AND_IPV6")
    ;

    private static final java.util.Map<java.lang.Integer, NRPIpVersion> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPIpVersion> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPIpVersion enumItem : NRPIpVersion.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPIpVersion(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg integer value
     * @return corresponding NRPIpVersion item
     */
    public static NRPIpVersion forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
