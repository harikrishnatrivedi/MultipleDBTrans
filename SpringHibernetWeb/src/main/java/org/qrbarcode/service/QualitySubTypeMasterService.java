/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.model.barcode.QualitySubTypeMaster;

/**
 * @author harikrishna.trivedi
 *
 */
 
public interface QualitySubTypeMasterService {
 
	QualitySubTypeMaster findByQualitySubTypeMasterCode(String paramStrQualitySubTypeCode);
     
    void saveQualitySubTypeMaster(QualitySubTypeMaster paramObjQualitySubTypeMaster);
     
    void updateQualitySubTypeMaster(QualitySubTypeMaster paramObjQualitySubTypeMaster);
     
    void deleteQualitySubTypeMasterByQualitySubTypeMasterCode(String paramStrQualitySubTypeCode);
 
    List<QualitySubTypeMaster> findAllQualitySubTypeMaster(); 
     
    List<QualitySubTypeMaster> findAllQualitySubTypeMasterByTypeCode(String paramStrTypeCode);
}