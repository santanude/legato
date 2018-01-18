package org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_layerprotocolspec.AdapterSpec;
import org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs;

public interface AdapterSpec1
    extends
    DataObject,
    Augmentation<AdapterSpec>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpConnAdaptSpecAttrs</code> <code>nrpConnAdaptSpecAttrs</code>, or <code>null</code> if not present
     */
    NrpConnAdaptSpecAttrs getNrpConnAdaptSpecAttrs();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpIvcEndpointConnAdaptSpecAttrs</code> <code>nrpIvcEndpointConnAdaptSpecAttrs</code>, or <code>null</code> if not present
     */
    NrpIvcEndpointConnAdaptSpecAttrs getNrpIvcEndpointConnAdaptSpecAttrs();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.nrp.specs.rev160630.network.topology.topology.node.termination.point.ltp.attrs.lplist.lpspec.adapterspec.NrpEvcEndpointConnAdaptSpecAttrs</code> <code>nrpEvcEndpointConnAdaptSpecAttrs</code>, or <code>null</code> if not present
     */
    NrpEvcEndpointConnAdaptSpecAttrs getNrpEvcEndpointConnAdaptSpecAttrs();

}

