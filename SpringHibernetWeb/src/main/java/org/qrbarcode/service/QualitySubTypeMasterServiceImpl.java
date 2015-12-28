/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.dao.QualitySubTypeMasterDao;
import org.qrbarcode.model.barcode.QualitySubTypeMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author harikrishna.trivedi
 *
 */

@Service("qualityTestService")
@Transactional
public class QualitySubTypeMasterServiceImpl implements QualitySubTypeMasterService {
 
    @Autowired
    private QualitySubTypeMasterDao objQualitySubTypeMasterDao;
     
    public QualitySubTypeMaster findByQualitySubTypeMasterCode(String paramStrQualitySubTypeMasterCode) {
    	
        return objQualitySubTypeMasterDao.findByQltySubTypeMasterCode(paramStrQualitySubTypeMasterCode);
    }
 
    public void saveQualitySubTypeMaster(QualitySubTypeMaster objQualitySubTypeMaster) {
    	objQualitySubTypeMasterDao.saveQualitySubTypeMaster(objQualitySubTypeMaster);
    }
 
    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends. 
     */
    public void updateQualitySubTypeMaster(QualitySubTypeMaster objQualitySubTypeMaster) {
    	objQualitySubTypeMasterDao.saveQualitySubTypeMaster(objQualitySubTypeMaster);
    }
 
    public void deleteQualitySubTypeMasterByQualitySubTypeMasterCode(String paramStrQualitySubTypeMasterCode) {
    	objQualitySubTypeMasterDao.deleteQualitySubTypeMasterByQualitySubTypeMasterCode(paramStrQualitySubTypeMasterCode);
    }
    public List<QualitySubTypeMaster> findAllQualitySubTypeMaster() {
        return objQualitySubTypeMasterDao.findAllQualitySubTypeMaster();
    }
}
