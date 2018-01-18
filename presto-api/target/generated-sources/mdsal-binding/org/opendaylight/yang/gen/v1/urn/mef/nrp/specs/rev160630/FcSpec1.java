package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcSpec;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs;

public interface FcSpec1
    extends
    DataObject,
    Augmentation<FcSpec>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.forwarding.constructs.forwarding.construct.fcspec.NrpCeFcspecAttrs</code> <code>nrpCeFcspecAttrs</code>, or <code>null</code> if not present
     */
    NrpCeFcspecAttrs getNrpCeFcspecAttrs();

}

