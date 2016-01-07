/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.model.barcode.QualityParameterMaster;

/**
 * @author harikrishna.trivedi
 *
 */
 
public interface QualityParameterMasterService {
 
	QualityParameterMaster findQualityParameterMasterByQualityParamCode(String paramStrQualityParameterMasterCode);
     
    void saveQualityParameterMaster(QualityParameterMaster paramObjQualityParameterMaster);
     
    void updateQualityParameterMaster(QualityParameterMaster paramObjQualityParameterMaster);
     
    void deleteQualityParameterMasterByQualityParamCode(String paramStrQualityParameterMasterCode);
 
    List<QualityParameterMaster> findAllQualityParameterMaster(); 
     
    public List<QualityParameterMaster> findAllQualityParameterMasterByQualityTypeAndSubTypeCode(String paramStrQualityTypeCode,String paramStrQualitySubTypeCode);
    
}