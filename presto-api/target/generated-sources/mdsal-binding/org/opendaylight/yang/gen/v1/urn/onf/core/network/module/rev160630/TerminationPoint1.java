package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.node.TerminationPoint;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs;

public interface TerminationPoint1
    extends
    DataObject,
    Augmentation<TerminationPoint>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.network.topology.topology.node.termination.point.LtpAttrs</code> <code>ltpAttrs</code>, or <code>null</code> if not present
     */
    LtpAttrs getLtpAttrs();

}

