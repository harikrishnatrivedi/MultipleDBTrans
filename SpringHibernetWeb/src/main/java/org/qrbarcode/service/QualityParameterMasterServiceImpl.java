/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.dao.QualityParameterMasterDAO;
import org.qrbarcode.model.barcode.QualityParameterMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author harikrishna.trivedi
 *
 */

@Service//("qualityParameterMasterService")
@Transactional
public class QualityParameterMasterServiceImpl implements QualityParameterMasterService {
 
    @Autowired
    private QualityParameterMasterDAO objQualityTypeMasterDAO;
     
    public QualityParameterMaster findQualityParameterMasterByQualityParamCode(String paramStrQualityParameterMasterCode) {
    	
        return objQualityTypeMasterDAO.findQualityParameterMasterByQualityParamCode(paramStrQualityParameterMasterCode);
    }
 
    public void saveQualityParameterMaster(QualityParameterMaster paramObjQualityParameterMaster) {
    	objQualityTypeMasterDAO.saveQualityParameterMaster(paramObjQualityParameterMaster);
    }
 
    /*
     * Since the method is running with Transaction, No need to call hibernate update explicitly.
     * Just fetch the entity from db and update it with proper values within transaction.
     * It will be updated in db once transaction ends. 
     */
    public void updateQualityParameterMaster(QualityParameterMaster paramObjQualityParameterMaster) {
    	
    }
 
    public void deleteQualityParameterMasterByQualityParamCode(String paramStrQualityParameterMasterCode) {
    	objQualityTypeMasterDAO.deleteQualityParameterMasterByQualityParamCode(paramStrQualityParameterMasterCode);
    }
     
    public List<QualityParameterMaster> findAllQualityParameterMaster() {
        return objQualityTypeMasterDAO.findAllQualityParameterMaster();
    }
    
    public List<QualityParameterMaster> findAllQualityParameterMasterByQualityTypeAndSubTypeCode(String paramStrQualityTypeCode,String paramStrQualitySubTypeCode) {
        return objQualityTypeMasterDAO.findAllQualityParameterMasterByQualityTypeAndSubTypeCode(paramStrQualityTypeCode,paramStrQualitySubTypeCode);
    }
}
