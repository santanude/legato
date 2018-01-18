package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPServiceFrameDelivery {
    CONDITIONALLY(0, "CONDITIONALLY"),
    
    UNCONDITIONALLY(1, "UNCONDITIONALLY")
    ;

    private static final java.util.Map<java.lang.Integer, NRPServiceFrameDelivery> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPServiceFrameDelivery> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPServiceFrameDelivery enumItem : NRPServiceFrameDelivery.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPServiceFrameDelivery(int value, java.lang.String name) {
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
     * @return corresponding NRPServiceFrameDelivery item
     */
    public static NRPServiceFrameDelivery forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
