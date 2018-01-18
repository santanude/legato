package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPEndPointRole {
    ROOT(0, "ROOT"),
    
    LEAF(1, "LEAF"),
    
    TRUNK(2, "TRUNK")
    ;

    private static final java.util.Map<java.lang.Integer, NRPEndPointRole> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPEndPointRole> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPEndPointRole enumItem : NRPEndPointRole.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPEndPointRole(int value, java.lang.String name) {
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
     * @return corresponding NRPEndPointRole item
     */
    public static NRPEndPointRole forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
