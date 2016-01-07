/**
 * 
 */
package org.qrbarcode.dao;

import java.util.List;

import org.qrbarcode.model.barcode.QualityParameterDetails;



/**
 * @author harikrishna.trivedi
 *
 */
public interface QualityParameterDetailsDAO 
	extends GenericDAO<QualityParameterDetails, Integer> {
 
	public QualityParameterDetails findQualityParameterDetailsByQualityParameterDetailsId(int paramIntQualityParameterId);
 
    public void saveQualityParameterDetails(QualityParameterDetails paramObjQualityParameterDetails);
     
    public void deleteQualityParameterDetailsByQualityParameterDetailsId(int paramIntQualityParameterId);
     
    public List<QualityParameterDetails> findAllQualityParameterDetails();
    
}