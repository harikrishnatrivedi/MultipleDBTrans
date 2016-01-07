package org.qrbarcode.controller;

import javax.servlet.http.HttpServletRequest;

import org.qrbarcode.model.UpdateLength;
import org.qrbarcode.model.barcode.POBarcode;
import org.qrbarcode.service.POBarcodeService;
import org.qrbarcode.service.UpdateLengthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LengthUpdateController
{
  @Autowired
  private UpdateLengthService objUpdateLengthService;
  
  @Autowired
  private POBarcodeService objPOBarcodeService;
  
  @Autowired
  MessageSource messageSource;
  
  @RequestMapping(value = {"/",  "/scanLengthBarCode" }, method = RequestMethod.GET)
  public String scanBarCodeForLength(ModelMap model) {
  	UpdateLength updateLength = new UpdateLength();
      model.addAttribute("updateLength", updateLength);
      System.out.println("updateLength : "+updateLength);
      return "barcodedescanlength";
  }
  
  @RequestMapping(value = {"/",  "/scanLengthBarCode" }, method = RequestMethod.POST)
  public String getBarCodeLengthDtl(UpdateLength updateLength, BindingResult result, ModelMap redirectedModel) {
  	System.out.println("updateLength:::::::::::::::::"+updateLength);
  	System.out.println("updateLength.getBarCode() : "+updateLength.getBarCode());
  	POBarcode pOBarcode=objPOBarcodeService.getPOBarcodeByBarcode(updateLength.getBarCode());
  	if(pOBarcode==null) {
  		FieldError noBarcodeFoundError=new FieldError("barCode","barCode","Barcode not found.");//messageSource.getMessage("barcode.notfound", new String[]{updateLength.getBarCode()}, Locale.getDefault()));
          result.addError(noBarcodeFoundError);
  		return "barcodedescanlength";
  	}else if(pOBarcode.getMrnNo()!=null) {
  		System.out.println("System.out.println(pOBarcode.getMrnNo());" + pOBarcode.getMrnNo());
  		FieldError mRNGeneratedError =new FieldError("barCode","barCode","MRN already generated.");//messageSource.getMessage("barcode.MRNIssued", new String[]{updateLength.getBarCode()}, Locale.getDefault()));
          result.addError(mRNGeneratedError);
  		return "barcodedescanlength";
  	}
  	System.out.println((pOBarcode.getMrnNo()!=null));
  	updateLength.setBarCode(pOBarcode.getBarCode());
  	updateLength.setItem(pOBarcode.getItem());
  	updateLength.setItemDesc(pOBarcode.getProductName());
  	updateLength.setOldLength(pOBarcode.getLength());
  	System.out.println("updateLength:::::::"+updateLength);
  	redirectedModel.clear();
  	redirectedModel.addAttribute("updateLength", updateLength);
  	
  	return "barcodedescanlength";
  }
  
  @RequestMapping(value = {"/updateLengthForBarCode" }, method = RequestMethod.POST)
  public String editBarCodeLengthDtl(UpdateLength lengthUpdate, BindingResult result, ModelMap redirectedModel) {
  	try {
  		objUpdateLengthService.updateLength(lengthUpdate);
  	}catch(Exception ex){
  		FieldError commonError = 
  				new FieldError("barCode","barCode",ex.getMessage());
  		result.addError(commonError);
  		return "barcodedescanlength";
  	}
  	return "success";
  }
  
  @RequestMapping(value = "/test", method = RequestMethod.GET) 
  public String getAbcd(HttpServletRequest request) {
  	return "test";
  }
  
  /*protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {*/
 /* private static final long serialVersionUID = 1L;
  @RequestMapping(value = "/test", method = RequestMethod.POST) //, consumes = MediaType.ALL_VALUE)
  public @ResponseBody void getScanBarcode(HttpServletRequest request,
   HttpServletResponse response,@RequestParam("blob") Part part) throws ServletException, IOException {

		Result result = null;
		Connection connection;
		Statement statement;
		String barCodeResult = "";
		String resultBarcode="";
		
		if (txtBarcode != null) {
			request.getParameter("txtBarcode").toString();
			System.out.println("barCodeResult :"+txtBarcode);
		} else {
			//Part part = request.getPart("blob");
			String fileName = null;
			try {

				//part = request.getPart("blob");
				fileName = null;

				InputStream is = part.getInputStream();
				BufferedImage image = ImageIO.read(is);

				if (image != null) {
					Reader reader = new MultiFormatReader();
					LuminanceSource source = new BufferedImageLuminanceSource(image);
					BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
					result = new MultiFormatReader().decode(bitmap);
					System.out.println("result : "+result.getText());
					response.getWriter().print("barcode: "+result.getText());
				}
				
			} catch (ReaderException re) {
				System.out.println("RE : " + re.toString());
				// re.getStackTrace();
				// re.getLocalizedMessage();
				// re.printStackTrace();
				response.getWriter().print("error");
			} catch (Exception ex) {
				ex.printStackTrace();
				response.getWriter().print("Exception");
				// return "EX : "+ex.getMessage();
			}
		}
		
	}*/
  
}
