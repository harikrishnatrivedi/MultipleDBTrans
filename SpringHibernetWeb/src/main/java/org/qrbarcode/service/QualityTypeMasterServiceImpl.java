/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.dao.QualityTestDAO;
import org.qrbarcode.dao.QualityTypeMasterDAO;
import org.qrbarcode.model.barcode.QualityTypeMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author harikrishna.trivedi
 *
 */

@Service//("qualityTypeMasterService")
@Transactional
public class QualityTypeMasterServiceImpl implements QualityTypeMasterService {
 
    @Autowired
    private QualityTypeMasterDAO objQualityTypeMasterDAO;
     
    public QualityTypeMaster findByQualityTypeMasterCode(String qltyTestCode) {
    	
        return objQualityTypeMasterDAO.findByQltyTypeMstCode(qltyTestCode);
    }
 
    public void saveQualityTypeMaster(QualityTypeMaster paramObjQualityTypeMaster) {
    	objQualityTypeMasterDAO.saveQualityTypeMaster(paramObjQualityTypeMaster);
    }
 
    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends. 
     */
    public void updateQualityTypeMaster(QualityTypeMaster paramObjQualityTypeMaster) {
    	
    }
 
    public void deleteQualityTypeMasterByQualityTypeMasterCode(String paramStrQualityTypeMasterCode) {
    	objQualityTypeMasterDAO.deleteQualityTypeMasterByQualityTypeMasterCode(paramStrQualityTypeMasterCode);
    }
     
    public List<QualityTypeMaster> findAllQualityTypeMaster() {
    	System.out.println("QualityTypeMasterListServiceImpl");
        return objQualityTypeMasterDAO.findAllQualityTypeMaster();
    }
}
