/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.barcode.QualitySubTypeMaster;



/**
 * @author harikrishna.trivedi
 *
 */
public interface QualitySubTypeMasterDao 
	extends GenericDAO<QualitySubTypeMaster, Integer> {
 
	QualitySubTypeMaster findByQltySubTypeMasterCode(String qltySubTypeMasterCode);
 
    void saveQualitySubTypeMaster(QualitySubTypeMaster qualitySubTypeMaster);
     
    void deleteQualitySubTypeMasterByQualitySubTypeMasterCode(String qltySubTypeMasterCode);
     
    List<QualitySubTypeMaster> findAllQualitySubTypeMaster();
    
}