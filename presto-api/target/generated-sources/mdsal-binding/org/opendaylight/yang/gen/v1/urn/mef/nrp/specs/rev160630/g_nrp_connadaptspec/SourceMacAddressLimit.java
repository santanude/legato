package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.types.rev160630.GNRPSourceMacAddressLimit;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.GNRPConnAdaptSpec;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * MEF 10.3, Section 10.9
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-nrp-specs</b>
 * <pre>
 * container sourceMacAddressLimit {
 *     leaf enabled {
 *         type boolean;
 *     }
 *     leaf limit {
 *         type NRP_NaturalNumber;
 *     }
 *     leaf timeInterval {
 *         type NRP_NaturalNumber;
 *     }
 *     uses G_NRP_SourceMacAddressLimit;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-nrp-specs/G_NRP_ConnAdaptSpec/sourceMacAddressLimit</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimitBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimitBuilder
 *
 */
public interface SourceMacAddressLimit
    extends
    ChildOf<GNRPConnAdaptSpec>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.g_nrp_connadaptspec.SourceMacAddressLimit>,
    GNRPSourceMacAddressLimit
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:nrp-specs",
        "2016-06-30", "sourceMacAddressLimit").intern();


}

