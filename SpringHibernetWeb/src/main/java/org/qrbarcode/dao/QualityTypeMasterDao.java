/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.barcode.QualityTypeMaster;

/**
 * @author harikrishna.trivedi
 *
 */
public interface QualityTypeMasterDao 
	extends GenericDAO<QualityTypeMaster, Integer> {
 
	QualityTypeMaster findByQltyTypeMstCode(String qltyTypeMstCode);
 
    void saveQualityTypeMaster(QualityTypeMaster qualityTypeMaster);
     
    void deleteQualityTypeMasterByQualityTypeMasterCode(String qltyTypeMstCode);
     
    List<QualityTypeMaster> findAllQualityTypeMaster();
    
}