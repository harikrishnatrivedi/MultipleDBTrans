/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.barcode.QualityParameterMaster;
import org.qrbarcode.model.barcode.QualitySubTypeMaster;
import org.springframework.stereotype.Repository;
 


/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("qualityParameterMaster")
public class QualityParameterMasterDAOImpl 
	extends GenericDAOImpl<QualityParameterMaster, Integer>
	implements QualityParameterMasterDAO {
 
    public QualityParameterMaster findQualityParameterMasterByQualityParamCode(String paramStrQualityParamCode) {
    	Criteria criteria = currentPrimarySession().createCriteria(QualityParameterMaster.class);
        criteria.add(Restrictions.eq("qtyParamCode", paramStrQualityParamCode));
        System.out.println("Before error");
        return (QualityParameterMaster) criteria.uniqueResult();
    }
    
    public void saveQualityParameterMaster(QualityParameterMaster paramObjQualityParameterMaster) {
        persist(paramObjQualityParameterMaster,currentPrimarySession());
    }
 
    public void deleteQualityParameterMasterByQualityParamCode(String paramStrQualityParamCode) {
        Query query = currentPrimarySession().createSQLQuery("delete from QualityParameterMaster where qtyParamCode= :qtyParamCode");
        query.setString("qtyParamCode", paramStrQualityParamCode);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<QualityParameterMaster> findAllQualityParameterMaster() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<QualityParameterMaster>) criteria.list();
    }
    
    @SuppressWarnings("unchecked")
    public List<QualityParameterMaster> findAllQualityParameterMasterByQualityParamCode(String paramStrQualityParamCode) {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("qtyParamCode", paramStrQualityParamCode));
        return (List<QualityParameterMaster>) criteria.list();
    }
    
    @SuppressWarnings("unchecked")
    public List<QualityParameterMaster> findAllQualityParameterMasterByQualityTypeAndSubTypeCode(String paramStrQualityTypeCode,String paramStrQualitySubTypeCode) {
        
        Criteria criteria = currentPrimarySession().createCriteria(QualityParameterMaster.class).setFetchMode("objQtyTypeMaster", FetchMode.JOIN).setFetchMode("objQtySubTypeMaster", FetchMode.JOIN);
        criteria.add(Restrictions.eq("objQtyTypeMaster.qtyTypeCode", paramStrQualityTypeCode));
        criteria.add(Restrictions.eq("objQtySubTypeMaster.qtySubTypeCode", paramStrQualitySubTypeCode));
        return (List<QualityParameterMaster>) criteria.list();
    }
    
}
