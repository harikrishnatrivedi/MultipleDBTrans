/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.model.barcode.QualityTypeMaster;

/**
 * @author harikrishna.trivedi
 *
 */
 
public interface QualityTypeMasterService {
 
	QualityTypeMaster findByQualityTypeMasterCode(String paramStrQualityTypeMasterCode);
     
    void saveQualityTypeMaster(QualityTypeMaster paramObjQualityTypeMaster);
     
    void updateQualityTypeMaster(QualityTypeMaster paramObjQualityTypeMaster);
     
    void deleteQualityTypeMasterByQualityTypeMasterCode(String paramStrQualityTypeMasterCode);
 
    List<QualityTypeMaster> findAllQualityTypeMaster(); 
     
    //boolean isQualityTestCodeUnique(String qltyTestCode);
 
    //BigDecimal countQulityTestByQltyTestCode(String qltyTestCode);
}