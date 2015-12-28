/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
 
import org.qrbarcode.model.barcode.QualityTypeMaster;

/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("qyalityTypeMaster")
public class QualityTypeMasterDaoImpl 
	extends GenericDAOImpl<QualityTypeMaster, Integer> 
	implements QualityTypeMasterDao {
 
    public QualityTypeMaster findByQltyTypeMstCode(String qltyTypeMstCode) {
    	Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("qltyTypeMstCode", qltyTypeMstCode));
        System.out.println("Before error");
        //System.out.println("criteria.uniqueResult() :::: "+criteria.uniqueResult());
        return (QualityTypeMaster) criteria.uniqueResult();
        //return (POBarcode) criteria.list().get(0);
    }

    public void saveQualityTypeMaster(QualityTypeMaster qualityTypeMaster) {
        persist(qualityTypeMaster,currentPrimarySession());
    }

    public void deleteQualityTypeMasterByQualityTypeMasterCode(String qltyTypeMstCode) {
        Query query = currentPrimarySession().createSQLQuery("delete from QUALITY_SUB_TYPE_MST where QTY_TYPE_CODE= :qltyTypeMstCode");
        query.setString("qltyTypeMstCode", qltyTypeMstCode);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<QualityTypeMaster> findAllQualityTypeMaster() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<QualityTypeMaster>) criteria.list();
    }
}
