package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId;

public class FcPortKey
 implements Identifier<FcPort> {
    private static final long serialVersionUID = -4152336289255871507L;
    private final TopologyId _topology;
    private final NodeId _node;
    private final TpId _tp;


    public FcPortKey(NodeId _node, TopologyId _topology, TpId _tp) {
    
    
        this._topology = _topology;
        this._node = _node;
        this._tp = _tp;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FcPortKey(FcPortKey source) {
        this._topology = source._topology;
        this._node = source._node;
        this._tp = source._tp;
    }


    public TopologyId getTopology() {
        return _topology;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public TpId getTp() {
        return _tp;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_topology);
        result = prime * result + Objects.hashCode(_node);
        result = prime * result + Objects.hashCode(_tp);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FcPortKey other = (FcPortKey) obj;
        if (!Objects.equals(_topology, other._topology)) {
            return false;
        }
        if (!Objects.equals(_node, other._node)) {
            return false;
        }
        if (!Objects.equals(_tp, other._tp)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630.g_forwardingconstruct.FcPortKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_topology != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_topology=");
            builder.append(_topology);
        }
        if (_node != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_node=");
            builder.append(_node);
        }
        if (_tp != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tp=");
            builder.append(_tp);
        }
        return builder.append(']').toString();
    }
}

