package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPPcpOrDiscard {
    DISCARD(0, "DISCARD"),
    
    _0(1, "0"),
    
    _1(2, "1"),
    
    _2(3, "2"),
    
    _3(4, "3"),
    
    _4(5, "4"),
    
    _5(6, "5"),
    
    _6(7, "6"),
    
    _7(8, "7")
    ;

    private static final java.util.Map<java.lang.Integer, NRPPcpOrDiscard> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPPcpOrDiscard> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPPcpOrDiscard enumItem : NRPPcpOrDiscard.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPPcpOrDiscard(int value, java.lang.String name) {
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
     * @return corresponding NRPPcpOrDiscard item
     */
    public static NRPPcpOrDiscard forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
