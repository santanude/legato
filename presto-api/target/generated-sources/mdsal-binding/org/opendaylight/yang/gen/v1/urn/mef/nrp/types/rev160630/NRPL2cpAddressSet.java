package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPL2cpAddressSet {
    CTA(0, "CTA"),
    
    CTB(1, "CTB"),
    
    CTB2(2, "CTB2")
    ;

    private static final java.util.Map<java.lang.Integer, NRPL2cpAddressSet> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPL2cpAddressSet> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPL2cpAddressSet enumItem : NRPL2cpAddressSet.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPL2cpAddressSet(int value, java.lang.String name) {
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
     * @return corresponding NRPL2cpAddressSet item
     */
    public static NRPL2cpAddressSet forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
