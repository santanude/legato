package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPort;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface FcPort1
    extends
    DataObject,
    Augmentation<FcPort>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.CTagVlanId</code> <code>cTagVlanId</code>, or <code>null</code> if not present
     */
    CTagVlanId getCTagVlanId();

}

