package org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.Node1;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Host;
import org.opendaylight.yangtools.yang.binding.Augmentable;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>mef-unimgr-ext</b>
 * <pre>
 * container connection-settings {
 *     leaf userName {
 *         type string;
 *     }
 *     leaf password {
 *         type string;
 *     }
 *     leaf host {
 *         type host;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>mef-unimgr-ext/network-topology/topology/node/(urn:mef:unimgr-ext?revision=2016-07-25)connection-settings</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettingsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettingsBuilder
 *
 */
public interface ConnectionSettings
    extends
    ChildOf<Node1>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.mef.unimgr.ext.rev160725.network.topology.topology.node.ConnectionSettings>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:mef:unimgr-ext",
        "2016-07-25", "connection-settings").intern();

    /**
     * @return <code>java.lang.String</code> <code>userName</code>, or <code>null</code> if not present
     */
    java.lang.String getUserName();
    
    /**
     * @return <code>java.lang.String</code> <code>password</code>, or <code>null</code> if not present
     */
    java.lang.String getPassword();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Host</code> <code>host</code>, or <code>null</code> if not present
     */
    Host getHost();

}

