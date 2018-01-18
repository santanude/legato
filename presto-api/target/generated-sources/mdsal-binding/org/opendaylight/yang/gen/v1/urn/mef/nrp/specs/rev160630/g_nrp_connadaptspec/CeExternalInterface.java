package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPTerminationSpec;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container CeExternalInterface {
 *     leaf physicalLayer {
 *         type NRP_PhysicalLayer;
 *     }
 *     list syncMode {
 *         key "linkId"
 *         leaf linkId {
 *             type string;
 *         }
 *         leaf syncModeEnabled {
 *             type boolean;
 *         }
 *         uses G_NRP_SyncModePerLink;
 *     }
 *     leaf numberOfLinks {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf resiliency {
 *         type NRP_InterfaceResiliency;
 *     }
 *     container portConvsIdToAggLinkMap {
 *         leaf conversationId {
 *             type NRP_NaturalNumber;
 *         }
 *         leaf linkId {
 *             type NRP_NaturalNumber;
 *         }
 *         uses G_NRP_ConversationIdToAggrgationLinkMap;
 *     }
 *     leaf maxFrameSize {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf linkOamEnabled {
 *         type boolean;
 *     }
 *     leaf tokenShareEnabled {
 *         type boolean;
 *     }
 *     leaf serviceProviderUniId {
 *         type string;
 *     }
 *     uses G_NRP_TerminationSpec;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_ConnAdaptSpec/CeExternalInterface</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterfaceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterfaceBuilder
 *
 */
public interface CeExternalInterface
    extends
    ChildOf<GNRPConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.CeExternalInterface>,
    GNRPTerminationSpec
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "CeExternalInterface").intern();


}

