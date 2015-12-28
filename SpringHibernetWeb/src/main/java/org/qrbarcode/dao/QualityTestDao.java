/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.barcode.QualityTest;


/**
 * @author harikrishna.trivedi
 *
 */
public interface QualityTestDAO
	extends GenericDAO<QualityTest, Integer> {
 
	QualityTest findByQltyTestCode(String qltyTestCode);
 
    void saveQualityTest(QualityTest qltyTest);
     
    void deleteQualityTestByQltyTestCode(String qltyTestCode);
     
    List<QualityTest> findAllQualityTest();
    
}