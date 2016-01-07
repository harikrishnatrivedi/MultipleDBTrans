/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.qrbarcode.model.barcode.QualityParameterDetails;
import org.qrbarcode.model.barcode.QualitySubTypeMaster;
import org.springframework.stereotype.Repository;
 


/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("qualityParameterDetails")
public class QualityParameterDetailsDAOImpl 
	extends GenericDAOImpl<QualityParameterDetails, Integer>
	implements QualityParameterDetailsDAO {
 
    public QualityParameterDetails findQualityParameterDetailsByQualityParameterDetailsId(int paramIntQualityParamId) {
    	Criteria criteria = currentPrimarySession().createCriteria(QualityParameterDetails.class);
        criteria.add(Restrictions.eq("qtpmId", paramIntQualityParamId));
        System.out.println("Before error");
        return (QualityParameterDetails) criteria.uniqueResult();
    }
    
    public void saveQualityParameterDetails(QualityParameterDetails paramObjQualityParameterDetails) {
        persist(paramObjQualityParameterDetails,currentPrimarySession());
    }
 
    public void deleteQualityParameterDetailsByQualityParameterDetailsId(int paramIntQualityParamId) {
        Query query = currentPrimarySession().createSQLQuery("delete from QualityParameterDetails where qtpmId= :qtpmId");
        query.setInteger("qtpmId", paramIntQualityParamId);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<QualityParameterDetails> findAllQualityParameterDetails() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<QualityParameterDetails>) criteria.list();
    }
    
    @SuppressWarnings("unchecked")
    public List<QualityParameterDetails> findAllQualityParameterDetailsByQualityParamId(int paramIntQualityParamId) {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("qtpmId", paramIntQualityParamId));
        return (List<QualityParameterDetails>) criteria.list();
    }
    
}
