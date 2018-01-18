package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpTerminationSpecAttrs;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.TerminationSpec;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs;

public interface TerminationSpec1
    extends
    DataObject,
    Augmentation<TerminationSpec>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpTerminationSpecAttrs</code> <code>nrpTerminationSpecAttrs</code>, or <code>null</code> if not present
     */
    NrpTerminationSpecAttrs getNrpTerminationSpecAttrs();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.terminationspec.NrpUniTerminationAttrs</code> <code>nrpUniTerminationAttrs</code>, or <code>null</code> if not present
     */
    NrpUniTerminationAttrs getNrpUniTerminationAttrs();

}

