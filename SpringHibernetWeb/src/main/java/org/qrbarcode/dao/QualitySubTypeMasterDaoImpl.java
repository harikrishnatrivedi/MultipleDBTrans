/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.barcode.QualitySubTypeMaster;
import org.springframework.stereotype.Repository;
 


/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("qualitySubTypeMaster")
public class QualitySubTypeMasterDAOImpl 
	extends GenericDAOImpl<QualitySubTypeMaster, Integer>
	implements QualitySubTypeMasterDAO {
 
    public QualitySubTypeMaster findByQltySubTypeMasterCode(String qltySubTypeMasterCode) {
    	Criteria criteria = currentPrimarySession().createCriteria(QualitySubTypeMaster.class);
        criteria.add(Restrictions.eq("qtySubTypeCode", qltySubTypeMasterCode));
        System.out.println("Before error");
        return (QualitySubTypeMaster) criteria.uniqueResult();
    }
    
    public void saveQualitySubTypeMaster(QualitySubTypeMaster qualitySubTypeMaster) {
        persist(qualitySubTypeMaster,currentPrimarySession());
    }
 
    public void deleteQualitySubTypeMasterByQualitySubTypeMasterCode(String qltySubTypeMasterCode) {
        Query query = currentPrimarySession().createSQLQuery("delete from QUALITY_SUB_TYPE_MST where QTY_SUB_TYPE_CODE = :qltySubTypeMasterCode");
        query.setString("qltySubTypeMasterCode", qltySubTypeMasterCode);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<QualitySubTypeMaster> findAllQualitySubTypeMaster() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<QualitySubTypeMaster>) criteria.list();
    }
    
    @SuppressWarnings("unchecked")
    public List<QualitySubTypeMaster> findAllQualitySubTypeMasterByTypeCode(String paramStrTypeCode) {
        Criteria criteria = currentPrimarySession().createCriteria(QualitySubTypeMaster.class).setFetchMode("objQualityTypeMaster", FetchMode.JOIN);
        criteria.add(Restrictions.eq("objQualityTypeMaster.qtyTypeCode", paramStrTypeCode));
        return (List<QualitySubTypeMaster>) criteria.list();
    }
    
}
