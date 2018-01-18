package org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-types</b>
 * <pre>
 * grouping G_NRP_L2cpPeering {
 *     leaf destinationMacAddress {
 *         type string;
 *     }
 *     leaf protocolType {
 *         type NRP_ProtocolFrameType;
 *     }
 *     leaf linkId {
 *         type string;
 *     }
 *     leaf protocolId {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-types/G_NRP_L2cpPeering</i>
 *
 */
public interface GNRPL2cpPeering
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-types",
        "2016-06-30", "G_NRP_L2cpPeering").intern();

    /**
     * The destination address determines the intended recipient device for the frame.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>destinationMacAddress</code>, or <code>null</code> if not present
     */
    java.lang.String getDestinationMacAddress();
    
    /**
     * Protocol Identifier is either an LLC Address or an Ethertype, and it could have 
     * subtypes. The list specifies only the L2CP Frames thatare to be Peered. Any L2CP
     * Frame that is not Peered will either be Discarded or Passedas a result of the 
     * flow charts and requirements specified in MEF 45, Section 9.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.NRPProtocolFrameType</code> <code>protocolType</code>, or <code>null</code> if not present
     */
    NRPProtocolFrameType getProtocolType();
    
    /**
     * Identifies the physical link identifier for protocols (e.g. LLDP, ESMC) that can
     * operate over the individual physical links.If no link identifier is specified 
     * then the list entry will apply to all physical links. MEF 45, Section 8.2
     *
     *
     *
     * @return <code>java.lang.String</code> <code>linkId</code>, or <code>null</code> if not present
     */
    java.lang.String getLinkId();
    
    /**
     * @return <code>java.lang.String</code> <code>protocolId</code>, or <code>null</code> if not present
     */
    java.lang.String getProtocolId();

}

