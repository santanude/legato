package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPInterfaceResiliency {
    NONE(0, "NONE"),
    
    _2LINKACTIVESTANDBY(1, "2_LINK_ACTIVE_STANDBY"),
    
    ALLACTIVE(2, "ALL_ACTIVE"),
    
    OTHER(3, "OTHER")
    ;

    private static final java.util.Map<java.lang.Integer, NRPInterfaceResiliency> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPInterfaceResiliency> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPInterfaceResiliency enumItem : NRPInterfaceResiliency.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPInterfaceResiliency(int value, java.lang.String name) {
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
     * @return corresponding NRPInterfaceResiliency item
     */
    public static NRPInterfaceResiliency forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
