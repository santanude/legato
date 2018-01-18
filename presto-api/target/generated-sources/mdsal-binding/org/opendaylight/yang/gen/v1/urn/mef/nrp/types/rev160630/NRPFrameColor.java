package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPFrameColor {
    GREEN(0, "GREEN"),
    
    YELLOW(1, "YELLOW")
    ;

    private static final java.util.Map<java.lang.Integer, NRPFrameColor> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPFrameColor> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPFrameColor enumItem : NRPFrameColor.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPFrameColor(int value, java.lang.String name) {
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
     * @return corresponding NRPFrameColor item
     */
    public static NRPFrameColor forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
