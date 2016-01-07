package org.qrbarcode.serviceDao;


import org.qrbarcode.dao.AssignHeatControlNoDAO;
import org.qrbarcode.dao.GenericDAOImpl;
import org.qrbarcode.dao.POBarcodeDAO;
import org.qrbarcode.dao.QualityTestDAO;
import org.qrbarcode.model.barcode.POBarcode;
import org.qrbarcode.model.barcode.QualityTest;
import org.qrbarcode.model.nav.AssignHeatControlNo;
import org.qrbarcode.model.nav.ItemEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ControlHeatUpdateServiceDAOImpl
  extends GenericDAOImpl<Object, Integer>
  implements ControlHeatUpdateServiceDAO
{
	  @Autowired
	  private POBarcodeDAO objPoBarcodeDAO;
	  
	  @Autowired
	  private QualityTestDAO objQualityTestDAO;
	  
	  @Autowired
	  private AssignHeatControlNoDAO objAssignHeatControlNoDAO;
	  
  public void addQualityTestUpdatePOBarcode(QualityTest paramObjQualityTest) throws Exception
  {
	  try {
		  POBarcode objPOBarcode=objPoBarcodeDAO.getPOBarcodeByBarcode(paramObjQualityTest.getBarCode());
		  objPOBarcode.setControlId(paramObjQualityTest.getControlNo());
		  objPOBarcode.setHeatNo(paramObjQualityTest.getHeatNo());
		  System.out.println("before saveQualityTest()");
		  objQualityTestDAO.saveQualityTest(paramObjQualityTest);
		  System.out.println("after saveQualityTest()");
		  
		  System.out.println("before (PObarcode update)");
		  objPoBarcodeDAO.updatePOBarcode(objPOBarcode);
		  System.out.println("after (PObarcode update)");
		  
		  int totQty = objPoBarcodeDAO.getTotQtyBarcodeByMRNNo(objPOBarcode.getMrnNo());
		  System.out.println();
		  if(totQty==1){
			  AssignHeatControlNo objAssignHeatControlNo=new AssignHeatControlNo();
			  ItemEntry objItemEntry=new ItemEntry();
			  objItemEntry.setEntryNo(objAssignHeatControlNoDAO.getMaxEntryNoFromAssignHeatControlNo());
			  objItemEntry.setItemNo(objPOBarcode.getItem());
			  objAssignHeatControlNo.setObjItemEntry(objItemEntry);
			  objAssignHeatControlNo.setLineNo(Integer.parseInt(objPOBarcode.getLineNo()));
			  objAssignHeatControlNo.setMrn(objPOBarcode.getMrnNo());
			  objAssignHeatControlNo.setQuantity(objPOBarcode.getLength());
			  objAssignHeatControlNo.setReject(Short.parseShort("1"));
			  objAssignHeatControlNo.setUserId("vishal.mehra");
			  objAssignHeatControlNo.setControlNo(objPOBarcode.getControlId());
			  objAssignHeatControlNo.setHeatNo(objPOBarcode.getHeatNo());
			  objAssignHeatControlNoDAO.addAssignHeatControlNo(objAssignHeatControlNo);
		  }
	  }catch(Exception ex){
		  ex.printStackTrace();
		  throw ex;
	  }
  }
}
