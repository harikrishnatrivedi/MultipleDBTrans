/**
 * 
 */
package org.qrbarcode.service;

import java.util.List;

import org.qrbarcode.model.barcode.QualityTest;

/**
 * @author harikrishna.trivedi
 *
 */
 
public interface QualityTestService {
 
	QualityTest findByQltyTestCode(String qltyTestCode);
     
    void saveQualityTest(QualityTest qualityTest);
     
    void updateQualityTest(QualityTest qualityTest);
     
    void deleteQualityTestByQltyTestCode(String qltyTestCode);
 
    List<QualityTest> findAllQualityTest(); 
     
    public QualityTest findQutalityTestByqltyBarcode(String paramStrBarcode);
    
    //boolean isQualityTestCodeUnique(String qltyTestCode);
 
    //BigDecimal countQulityTestByQltyTestCode(String qltyTestCode);
}