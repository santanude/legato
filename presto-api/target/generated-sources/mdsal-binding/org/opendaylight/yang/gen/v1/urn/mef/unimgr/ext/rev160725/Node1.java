package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Node;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings;

public interface Node1
    extends
    DataObject,
    Augmentation<Node>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings</code> <code>connectionSettings</code>, or <code>null</code> if not present
     */
    ConnectionSettings getConnectionSettings();

}

