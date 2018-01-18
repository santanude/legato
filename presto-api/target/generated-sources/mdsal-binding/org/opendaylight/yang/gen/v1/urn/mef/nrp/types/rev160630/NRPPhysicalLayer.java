package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;

public enum NRPPhysicalLayer {
    _10BASE2(0, "10BASE2"),
    
    _10BASE5(1, "10BASE5"),
    
    _10BASEF(2, "10BASE_F"),
    
    _10BASEFB(3, "10BASE_FB"),
    
    _10BASEFL(4, "10BASE_FL"),
    
    _10BASEFP(5, "10BASE_FP"),
    
    _10BASET(6, "10BASE_T"),
    
    _10BASETE(7, "10BASE_TE"),
    
    _10BROAD36(8, "10BROAD36"),
    
    _10PASSTS(9, "10PASS_TS"),
    
    _100BASEBX10(10, "100BASE_BX10"),
    
    _100BASEFX(11, "100BASE_FX"),
    
    _100BASELX10(12, "100BASE_LX10"),
    
    _100BASET(13, "100BASE_T"),
    
    _100BASET2(14, "100BASE_T2"),
    
    _100BASET4(15, "100BASE_T4"),
    
    _100BASETX(16, "100BASE_TX"),
    
    _100BASEX(17, "100BASE_X"),
    
    _1000BASEBX10(18, "1000BASE_BX10"),
    
    _1000BASECX(19, "1000BASE_CX"),
    
    _1000BASEKX(20, "1000BASE_KX"),
    
    _1000BASELX(21, "1000BASE_LX"),
    
    _1000BASELX10(22, "1000BASE_LX10"),
    
    _1000BASEPX10(23, "1000BASE_PX10"),
    
    _1000BASEPX20(24, "1000BASE_PX20"),
    
    _1000BASESX(25, "1000BASE_SX"),
    
    _1000BASET(26, "1000BASE_T"),
    
    _1000BASEX(27, "1000BASE_X"),
    
    _10GBASECX4(28, "10GBASE_CX4"),
    
    _10GBASEE(29, "10GBASE_E"),
    
    _10GBASEER(30, "10GBASE_ER"),
    
    _10GBASEEW(31, "10GBASE_EW"),
    
    _10GBASEKR(32, "10GBASE_KR"),
    
    _10GBASEKX4(33, "10GBASE_KX4"),
    
    _10GBASEL(34, "10GBASE_L"),
    
    _10GBASELR(35, "10GBASE_LR"),
    
    _10GBASELRM(36, "10GBASE_LRM"),
    
    _10GBASELW(37, "10GBASE_LW"),
    
    _10GBASELX4(38, "10GBASE_LX4"),
    
    _10GBASEPR(39, "10GBASE_PR"),
    
    _10GBASEPRX(40, "10GBASE_PRX"),
    
    _10GBASER(41, "10GBASE_R"),
    
    _10GBASES(42, "10GBASE_S"),
    
    _10GBASESR(43, "10GBASE_SR"),
    
    _10GBASESW(44, "10GBASE_SW"),
    
    _10GBASET(45, "10GBASE_T"),
    
    _10GBASEW(46, "10GBASE_W"),
    
    _10GBASEX(47, "10GBASE_X"),
    
    _100GBASER(48, "100GBASE_R"),
    
    _100GBASECR10(49, "100GBASE_CR10"),
    
    _100GBASEER4(50, "100GBASE_ER4"),
    
    _100GBASELR4(51, "100GBASE_LR4"),
    
    _100GBASESR10(52, "100GBASE_SR10"),
    
    _40GBASER(53, "40GBASE_R"),
    
    _40GBASECR4(54, "40GBASE_CR4"),
    
    _40GBASEFR(55, "40GBASE__FR"),
    
    _40GBASEKR4(56, "40GBASE_KR4"),
    
    _40GBASELR4(57, "40GBASE_LR4"),
    
    _40GBASESR4(58, "40GBASE_SR4"),
    
    _1BASE5(59, "1BASE5"),
    
    _2BASETL(60, "2BASE_TL"),
    
    _1GEPON(61, "1G_EPON"),
    
    _10GEPON(62, "10G_EPON"),
    
    _101GEPON(63, "10_1G_EPON"),
    
    _1010GEPON(64, "10_10G_EPON"),
    
    NONE(65, "NONE")
    ;

    private static final java.util.Map<java.lang.Integer, NRPPhysicalLayer> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NRPPhysicalLayer> b = com.google.common.collect.ImmutableMap.builder();
        for (NRPPhysicalLayer enumItem : NRPPhysicalLayer.values()) {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private final java.lang.String name;
    private final int value;

    private NRPPhysicalLayer(int value, java.lang.String name) {
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
     * @return corresponding NRPPhysicalLayer item
     */
    public static NRPPhysicalLayer forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
