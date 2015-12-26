/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.dao.QualityTestDao;
import org.qrbarcode.model.barcode.QualityTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author harikrishna.trivedi
 *
 */

@Service("qualityTestService")
@Transactional
public class QualityTestServiceImpl implements QualityTestService {
 
    @Autowired
    private QualityTestDao dao;
     
    public QualityTest findByQltyTestCode(String qltyTestCode) {
    	
        return dao.findByQltyTestCode(qltyTestCode);
    }
 
    public void saveQualityTest(QualityTest qualityTest) {
        dao.saveQualityTest(qualityTest);
    }
 
    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends. 
     */
    public void updateQualityTest(QualityTest qualityTest) {
    	
    }
 
    public void deleteQualityTestByQltyTestCode(String qualityTestCode) {
        dao.deleteQualityTestByQltyTestCode(qualityTestCode);
    }
     
    public List<QualityTest> findAllQualityTest() {
        return dao.findAllQualityTest();
    }
}
