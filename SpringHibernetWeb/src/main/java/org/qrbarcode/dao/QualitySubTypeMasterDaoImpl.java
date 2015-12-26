/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.barcode.QualitySubTypeMaster;
import org.springframework.stereotype.Repository;
 


/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("qualitySubTypeMaster")
public class QualitySubTypeMasterDaoImpl 
	extends GenericDAOImpl<QualitySubTypeMaster, Integer>
	implements QualitySubTypeMasterDao {
 
    public QualitySubTypeMaster findByQltySubTypeMasterCode(String qltySubTypeMasterCode) {
    	Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("qltySubTypeMasterCode", qltySubTypeMasterCode));
        System.out.println("Before error");
        return (QualitySubTypeMaster) criteria.uniqueResult();
    }
    
    public void saveQualitySubTypeMaster(QualitySubTypeMaster qualitySubTypeMaster) {
        persist(qualitySubTypeMaster,currentPrimarySession());
    }
 
    public void deleteQualitySubTypeMasterByQltySubTypeMasterCode(String qltySubTypeMasterCode) {
        Query query = currentPrimarySession().createSQLQuery("delete from QUALITY_SUB_TYPE_MST where QTY_SUB_TYPE_CODE = :qltySubTypeMasterCode");
        query.setString("qltySubTypeMasterCode", qltySubTypeMasterCode);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<QualitySubTypeMaster> findAllQualitySubTypeMaster() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<QualitySubTypeMaster>) criteria.list();
    }
 
   public QualitySubTypeMaster findPOBarcodeByQltySubTypeMasterCode(String qltySubTypeMasterCode) {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("qltySubTypeMasterCode", qltySubTypeMasterCode));
        return (QualitySubTypeMaster) criteria.uniqueResult();
    }
}
