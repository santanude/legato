package org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.core.specs.rev160630.g_fcspec.FcPortSpec;
import java.util.List;

/**
 * <p>This class represents the following YANG schema fragment defined in module <b>onf-core-specs</b>
 * <pre>
 * grouping G_FcSpec {
 *     leaf uuid {
 *         type string;
 *     }
 *     list fcPortSpec {
 *         key "uuid"
 *         leaf uuid {
 *             type string;
 *         }
 *         list ingressFcPortSet {
 *             key "topology" 
 *         "node" 
 *         "tp"
 *             leaf topology {
 *                 type topology-ref;
 *             }
 *             leaf node {
 *                 type node-ref;
 *             }
 *             leaf tp {
 *                 type tp-ref;
 *             }
 *             uses ltp-ref;
 *         }
 *         list egressFcPortSet {
 *             key "topology" 
 *         "node" 
 *         "tp"
 *             leaf topology {
 *                 type topology-ref;
 *             }
 *             leaf node {
 *                 type node-ref;
 *             }
 *             leaf tp {
 *                 type tp-ref;
 *             }
 *             uses ltp-ref;
 *         }
 *         leaf role {
 *             type role;
 *         }
 *         uses G_FcPortSetSpec;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>onf-core-specs/G_FcSpec</i>
 *
 */
public interface GFcSpec
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:core-specs",
        "2016-06-30", "G_FcSpec").intern();

    /**
     * @return <code>java.lang.String</code> <code>uuid</code>, or <code>null</code> if not present
     */
    java.lang.String getUuid();
    
    /**
     * @return <code>java.util.List</code> <code>fcPortSpec</code>, or <code>null</code> if not present
     */
    List<FcPortSpec> getFcPortSpec();

}

