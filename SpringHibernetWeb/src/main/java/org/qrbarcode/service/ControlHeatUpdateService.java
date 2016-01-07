package org.qrbarcode.service;


import org.qrbarcode.model.barcode.QualityTest;

public abstract interface ControlHeatUpdateService {
	
	public abstract void addQualityTestUpdatePOBarcode(QualityTest qualityTest) throws Exception;
	
}
