package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.EgressBwpUni;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * grouping G_NRP_UNI_TerminationSpec {
 *     leaf defaultCeVlanId {
 *         type NRP_PositiveInteger;
 *     }
 *     leaf uniMegEnabled {
 *         type boolean;
 *     }
 *     leaf elmiEnabled {
 *         type boolean;
 *     }
 *     leaf serviceprovideruniprofile {
 *         type string;
 *     }
 *     leaf operatoruniprofile {
 *         type string;
 *     }
 *     container ingressBwpUni {
 *         leaf bwpFlowIndex {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf cir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cbs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf ebs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf couplingFlag {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf colorMode {
 *             type NRP_ColorMode;
 *         }
 *         leaf rank {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf tokenRequestOffset {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_BwpFlow;
 *     }
 *     container egressBwpUni {
 *         leaf bwpFlowIndex {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf cir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf cbs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eir {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf eirMax {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf ebs {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf couplingFlag {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf colorMode {
 *             type NRP_ColorMode;
 *         }
 *         leaf rank {
 *             type NRP_PositiveInteger;
 *         }
 *         leaf tokenRequestOffset {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_BwpFlow;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_UNI_TerminationSpec</i>
 *
 */
public interface GNRPUNITerminationSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "G_NRP_UNI_TerminationSpec").intern();

    /**
     * This is the CE-VLAN ID value assigned to Untagged Service Frames and Priority 
     * Tagged ServiceFrames. In MEF 10.3, it is called CE Vlan ID for untagged and 
     * priority tagged service frames.MEF 10.3, Section 9.9.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPPositiveInteger</code> <code>defaultCeVlanId</code>, or <code>null</code> if not present
     */
    NRPPositiveInteger getDefaultCeVlanId();
    
    /**
     * When the value of the UNI MEG Service Attribute is Enabled, the CEN MUST meet 
     * the mandatoryrequirements in MEF 30.1 that apply to the UNI MEG MEF 10.3, 
     * Section 9.17.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>uniMegEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isUniMegEnabled();
    
    /**
     * When the value of the E-LMI Service Attribute is Enabled, the CEN MUST meet the 
     * mandatoryrequirements in MEF 16 that apply to the UNI-N. MEF 10.3, Section 9.18
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>elmiEnabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isElmiEnabled();
    
    /**
     * @return <code>java.lang.String</code> <code>serviceprovideruniprofile</code>, or <code>null</code> if not present
     */
    java.lang.String getServiceprovideruniprofile();
    
    /**
     * @return <code>java.lang.String</code> <code>operatoruniprofile</code>, or <code>null</code> if not present
     */
    java.lang.String getOperatoruniprofile();
    
    /**
     * MEF 10.3, Section 9.14
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.IngressBwpUni</code> <code>ingressBwpUni</code>, or <code>null</code> if not present
     */
    IngressBwpUni getIngressBwpUni();
    
    /**
     * MEF 10.3, Section 9.15
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_uni_terminationspec.EgressBwpUni</code> <code>egressBwpUni</code>, or <code>null</code> if not present
     */
    EgressBwpUni getEgressBwpUni();

}

