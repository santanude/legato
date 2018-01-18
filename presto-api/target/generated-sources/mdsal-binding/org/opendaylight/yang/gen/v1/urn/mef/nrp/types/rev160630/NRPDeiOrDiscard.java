package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPDeiOrDiscard {
    DISCARD(0, "DISCARD"),
    
    _0(1, "0"),
    
    _1(2, "1")
    ;

    private static final java.util.Map<java.lang.Integer, NRPDeiOrDiscard> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPDeiOrDiscard> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPDeiOrDiscard enumItem : NRPDeiOrDiscard.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPDeiOrDiscard(int value, java.lang.String name) {
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
     * @return corresponding NRPDeiOrDiscard item
     */
    public static NRPDeiOrDiscard forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
