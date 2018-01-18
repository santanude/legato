package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * grouping ltp-ref {
 *     leaf topology {
 *         type topology-ref;
 *     }
 *     leaf node {
 *         type node-ref;
 *     }
 *     leaf tp {
 *         type tp-ref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/ltp-ref</i>
 *
 */
public interface LtpRef
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "ltp-ref").intern();

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId</code> <code>topology</code>, or <code>null</code> if not present
     */
    TopologyId getTopology();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>node</code>, or <code>null</code> if not present
     */
    NodeId getNode();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>tp</code>, or <code>null</code> if not present
     */
    TpId getTp();

}

