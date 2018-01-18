package org.opendaylight.yang.gen.v1.urn.mef.nrp.bandwidth.profile.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPColorMode;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-bandwidth-profile</b>
 * <pre>
 * grouping G_NRP_BwpFlow {
 *     leaf bwpFlowIndex {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf cir {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf cirMax {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf cbs {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf eir {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf eirMax {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf ebs {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf couplingFlag {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf colorMode {
 *         type NRP_ColorMode;
 *     }
 *     leaf rank {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf tokenRequestOffset {
 *         type NRP_NaturalNumber;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-bandwidth-profile/G_NRP_BwpFlow</i>
 *
 */
public interface GNRPBwpFlow
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-bandwidth-profile",
        "2016-06-30", "G_NRP_BwpFlow").intern();

    /**
     * The index i=1,2,...,n is used to index the Bandwidth Profile Flow among all 
     * Bandwidth ProfileFlows that are mapped to a given Envelope
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>bwpFlowIndex</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getBwpFlowIndex();
    
    /**
     * Committed Information Rate that limits the average rate of frames that will be 
     * declaredGreen. In bits per second.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>cir</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getCir();
    
    /**
     * Maximum Committed Information Rate that limits the rate of tokens added to the 
     * committed tokenbucket. In bits per second.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>cirMax</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getCirMax();
    
    /**
     * Committed Burst Size that limits the maximum number of bytes available for a 
     * burst of framesthat will be declared Green, in bytes,
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>cbs</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getCbs();
    
    /**
     * Excess Information Rate that limits the average rate of frames that will be 
     * declared Yellow, inbits per second.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>eir</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getEir();
    
    /**
     * Maximum Excess Infor-mation Rate that Limits the rate of tokens added to the 
     * excess tokenbucket, in bits per second.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>eirMax</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getEirMax();
    
    /**
     * Excessive Burst Size that limits the maximum number of bytes available for a 
     * burst of framesthat will be declared Yellow, in bytes.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>ebs</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getEbs();
    
    /**
     * Coupling Flag that Determines if overflow Green tokens can be used as Yellow 
     * tokens. Value 0 forNO and value 1 for YES.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>couplingFlag</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getCouplingFlag();
    
    /**
     * Color Mode that Indicates whether the Color Identifier of the frame is 
     * considered by theBandwidth Profile Algorithm.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPColorMode</code> <code>colorMode</code>, or <code>null</code> if not present
     */
    NRPColorMode getColorMode();
    
    /**
     * Bandwidth prorile flow rank in an associated Envelope.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>rank</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getRank();
    
    /**
     * Adjusts the number of tokens requested for each external interface frame.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPNaturalNumber</code> <code>tokenRequestOffset</code>, or <code>null</code> if not present
     */
    NRPNaturalNumber getTokenRequestOffset();

}

