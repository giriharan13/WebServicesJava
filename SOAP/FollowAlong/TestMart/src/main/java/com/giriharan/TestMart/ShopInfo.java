package com.giriharan.TestMart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.giriharan.TestMart.buisness.InfoServiceImpl;

@WebService
@SOAPBinding(style=Style.RPC) // Style.RPC will have schema definition in wsdl itself but Style.DOCUMENT will have a separate document for schema definition
public class ShopInfo {
	
	InfoServiceImpl infoService = new InfoServiceImpl();
	
	@WebMethod
	@WebResult(partName="lookUpOutput") // @WebResult for specifying the wsdl name for output and @WebParam for input
	public String getInfo(@WebParam(partName = "lookUpInput") String property) {
		return infoService.getInfo(property);
	}

}
