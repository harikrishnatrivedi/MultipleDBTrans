/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.barcode.QualityParameterMaster;



/**
 * @author harikrishna.trivedi
 *
 */
public interface QualityParameterMasterDAO 
	extends GenericDAO<QualityParameterMaster, Integer> {
 
	public QualityParameterMaster findQualityParameterMasterByQualityParamCode(String paramStrQualityParameterCode);
 
    public void saveQualityParameterMaster(QualityParameterMaster paramObjQualityParameterMaster);
     
    public void deleteQualityParameterMasterByQualityParamCode(String paramStrQualityParamCode);
     
    public List<QualityParameterMaster> findAllQualityParameterMaster();
    
    public List<QualityParameterMaster> findAllQualityParameterMasterByQualityTypeAndSubTypeCode(String paramStrQualityTypeCode,String paramStrQualitySubTypeCode);
}