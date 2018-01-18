package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.TerminationDirection;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LpList;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LtpSpec;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * grouping G_LogicalTerminationPoint {
 *     list lpList {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         leaf layerProtocolName {
 *             type LayerProtocolName;
 *         }
 *         container lpSpec {
 *             container adapterSpec {
 *                 uses G_ConnectionPointAndAdapterSpec;
 *             }
 *             container terminationSpec {
 *                 uses G_TerminationSpec;
 *             }
 *             list adapterPropertySpecList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 uses G_AdapterPropertySpec;
 *             }
 *             container providerViewSpec {
 *                 uses G_ProviderViewSpec;
 *             }
 *             list serverSpecList {
 *                 key "uuid"
 *                 leaf uuid {
 *                     type string;
 *                 }
 *                 uses G_ServerSpec;
 *             }
 *             uses G_LayerProtocolSpec;
 *         }
 *         leaf configuredClientCapacity {
 *             type string;
 *         }
 *         leaf lpDirection {
 *             type TerminationDirection;
 *         }
 *         leaf terminationState {
 *             type string;
 *         }
 *         uses G_LayerProtocol;
 *     }
 *     container ltpSpec {
 *         uses G_LtpSpec;
 *     }
 *     leaf ltpDirection {
 *         type TerminationDirection;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_LogicalTerminationPoint</i>
 *
 */
public interface GLogicalTerminationPoint
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "G_LogicalTerminationPoint").intern();

    /**
     * Ordered list of LayerProtocols that this LTP is comprised of where the first 
     * entry in the list is the lowest server layer (e.g. physical)
     *
     *
     *
     * @return <code>java.util.List</code> <code>lpList</code>, or <code>null</code> if not present
     */
    List<LpList> getLpList();
    
    /**
     * The specification of the LTP defines internal structure of the LTP. The 
     * specification allowsinterpretation of organisation of LPs making up the LTP and 
     * also identifies which inter-LTPassociations are valid.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_logicalterminationpoint.LtpSpec</code> <code>ltpSpec</code>, or <code>null</code> if not present
     */
    LtpSpec getLtpSpec();
    
    /**
     * The overall directionality of the LTP.- A BIDIRECTIONAL LTP must have at least 
     * some LPs that are BIDIRECTIONAL but may also have some SINK and/or SOURCE LPs.- 
     * A SINK LTP can only contain SINK LPs- A SOURCE LTP can only contain SOURCE LPs
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.TerminationDirection</code> <code>ltpDirection</code>, or <code>null</code> if not present
     */
    TerminationDirection getLtpDirection();

}

