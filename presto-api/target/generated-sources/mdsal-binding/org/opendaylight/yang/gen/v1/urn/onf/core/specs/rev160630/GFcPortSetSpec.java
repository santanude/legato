package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.EgressFcPortSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcportsetspec.IngressFcPortSet;
import java.util.List;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * grouping G_FcPortSetSpec {
 *     leaf uuid {
 *         type string;
 *     }
 *     list ingressFcPortSet {
 *         key "topology" 
 *     "node" 
 *     "tp"
 *         leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *         leaf tp {
 *             type tp-ref;
 *         }
 *         uses ltp-ref;
 *     }
 *     list egressFcPortSet {
 *         key "topology" 
 *     "node" 
 *     "tp"
 *         leaf topology {
 *             type topology-ref;
 *         }
 *         leaf node {
 *             type node-ref;
 *         }
 *         leaf tp {
 *             type tp-ref;
 *         }
 *         uses ltp-ref;
 *     }
 *     leaf role {
 *         type role;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_FcPortSetSpec</i>
 *
 */
public interface GFcPortSetSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "G_FcPortSetSpec").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * @return <code>java.util.List</code> <code>ingressFcPortSet</code>, or <code>null</code> if not present
     */
    List<IngressFcPortSet> getIngressFcPortSet();
    
    /**
     * @return <code>java.util.List</code> <code>egressFcPortSet</code>, or <code>null</code> if not present
     */
    List<EgressFcPortSet> getEgressFcPortSet();
    
    /**
     * @return <code>java.lang.String</code> <code>role</code>, or <code>null</code> if not present
     */
    java.lang.String getRole();

}

