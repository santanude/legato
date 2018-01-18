package org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630;

public enum PortDirection {
    BIDIRECTIONAL(0, "BIDIRECTIONAL"),
    
    INPUT(1, "INPUT"),
    
    OUTPUT(2, "OUTPUT"),
    
    UNIDENTIFIEDORUNKNOWN(3, "UNIDENTIFIED_OR_UNKNOWN")
    ;

    private static final java.util.Map<java.lang.Integer, PortDirection> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, PortDirection> b = com.google.common.collect.ImmutableMap.builder();
        for (PortDirection enumItem : PortDirection.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private PortDirection(int value, java.lang.String name) {
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
     * @return corresponding PortDirection item
     */
    public static PortDirection forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
