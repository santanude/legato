package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;

public enum ActivationStatus {
    INACTIVE(0, "INACTIVE"),
    
    ACTIVE(1, "ACTIVE"),
    
    FAILED(2, "FAILED")
    ;

    private static final java.util.Map<java.lang.Integer, ActivationStatus> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ActivationStatus> b = com.google.common.collect.ImmutableMap.builder();
        for (ActivationStatus enumItem : ActivationStatus.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private ActivationStatus(int value, java.lang.String name) {
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
     * @return corresponding ActivationStatus item
     */
    public static ActivationStatus forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
