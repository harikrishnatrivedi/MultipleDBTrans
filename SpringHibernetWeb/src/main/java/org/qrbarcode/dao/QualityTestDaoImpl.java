/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.qrbarcode.model.barcode.QualityTest;

/**
 * @author harikrishna.trivedi
 *
 */ 
@Repository("qltyTestCode")
public class QualityTestDaoImpl 
	extends GenericDAOImpl<QualityTest, Integer>
	implements  QualityTestDAO {
 
    public QualityTest findByQltyTestCode(String qltyTestCode) {
    	Criteria criteria = createEntityCriteria(currentPrimarySession());
        criteria.add(Restrictions.eq("qltyTestCode", qltyTestCode));
        System.out.println("Before error");
        //System.out.println("criteria.uniqueResult() :::: "+criteria.uniqueResult());
        return (QualityTest) criteria.uniqueResult();
        //return (POBarcode) criteria.list().get(0);
    }
    
    public void saveQualityTest(QualityTest qualityTest) {
        currentPrimarySession().persist(qualityTest);
    }
 
    public void deleteQualityTestByQltyTestCode(String qltyTestCode) {
        Query query = currentPrimarySession().createSQLQuery("delete from QUALITY_TEST where qltyTestCode = :qltyTestCode");
        query.setString("qltyTestCode", qltyTestCode);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<QualityTest> findAllQualityTest() {
        Criteria criteria = createEntityCriteria(currentPrimarySession());
        return (List<QualityTest>) criteria.list();
    }
 
   /*public QualityTest findQutalityTestByqltyTestCode(String qltyTestCode) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("qltyTestCode", qltyTestCode));
        return (QualityTest) criteria.uniqueResult();
    }*/
}
