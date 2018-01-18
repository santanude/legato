package org.opendaylight.yang.gen.v1.urn.onf.core.network.module.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-network-module</b>
 * <pre>
 * grouping G_FcRoute {
 *     leaf uuid {
 *         type string;
 *     }
 *     leaf-list fc {
 *         type leafref;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-network-module/G_FcRoute</i>
 *
 */
public interface GFcRoute
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-network-module",
        "2016-06-30", "G_FcRoute").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * The list of FCs describing the route of an FC.
     *
     *
     *
     * @return <code>java.util.List</code> <code>fc</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getFc();

}

