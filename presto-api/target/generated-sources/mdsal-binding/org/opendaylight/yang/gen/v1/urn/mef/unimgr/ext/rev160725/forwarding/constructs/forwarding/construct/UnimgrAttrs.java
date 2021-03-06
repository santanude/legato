package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ForwardingConstruct1;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ActivationStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-unimgr-ext</b>
 * <pre>
 * container unimgr-attrs {
 *     leaf status {
 *         type status;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-unimgr-ext/forwarding-constructs/forwarding-construct/(urn:mef:unimgr-ext?revision=2016-07-25)unimgr-attrs</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrsBuilder
 *
 */
public interface UnimgrAttrs
    extends
    ChildOf<ForwardingConstruct1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:unimgr-ext",
        "2016-07-25", "unimgr-attrs").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.ActivationStatus</code> <code>status</code>, or <code>null</code> if not present
     */
    ActivationStatus getStatus();

}

