package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.PortRole;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.PortDirection;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.LtpRef;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * grouping G_FcPort {
 *     leaf topology {
 *         type topology-ref;
 *     }
 *     leaf node {
 *         type node-ref;
 *     }
 *     leaf tp {
 *         type tp-ref;
 *     }
 *     leaf role {
 *         type PortRole;
 *     }
 *     leaf fcPortDirection {
 *         type PortDirection;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_FcPort</i>
 *
 */
public interface GFcPort
    extends
    DataObject,
    LtpRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "G_FcPort").intern();

    /**
     * Each FcPort of the FC has a role (e.g., working, protection, protected, 
     * symmetric, hub, spoke,leaf, root) in the context of the FC with respect to the 
     * FC function.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.PortRole</code> <code>role</code>, or <code>null</code> if not present
     */
    PortRole getRole();
    
    /**
     * The orientation of defined flow at the FcPort.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.core.network.types.rev160630.PortDirection</code> <code>fcPortDirection</code>, or <code>null</code> if not present
     */
    PortDirection getFcPortDirection();

}

