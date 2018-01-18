package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.forwarding.constructs.ForwardingConstruct;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs;

public interface ForwardingConstruct1
    extends
    DataObject,
    Augmentation<ForwardingConstruct>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.forwarding.constructs.forwarding.construct.UnimgrAttrs</code> <code>unimgrAttrs</code>, or <code>null</code> if not present
     */
    UnimgrAttrs getUnimgrAttrs();

}

