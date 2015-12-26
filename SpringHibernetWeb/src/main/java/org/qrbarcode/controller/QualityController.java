/**
 * 
 */
package org.qrbarcode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 *
 */

@Controller
public class QualityController {

	
	@Autowired
	  MessageSource messageSource;
	
	@RequestMapping(value = "/qualitycheck", method = RequestMethod.GET)
	  public String scanBarCodeForLength(ModelMap model) {
	  	UpdateLength updateLength = new UpdateLength();
	      model.addAttribute("updateLength", updateLength);
	      System.out.println("updateLength : "+updateLength);
	      return "qualitycheck";
	  }
}
