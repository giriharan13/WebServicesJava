package com.giriharan.CelciusToFahrenheit;

import javax.xml.ws.BindingProvider;

import https.www_w3schools_com.xml.TempConvert;
import https.www_w3schools_com.xml.TempConvertSoap;

public class Converter {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("You need to pass only one temperature arg");
		}
		else {
			String temperatureInCelsius = args[0];
			TempConvert tempConvert = new TempConvert();
			TempConvertSoap tempConvertSoap = tempConvert.getTempConvertSoap();
			
			
			/* The web service communication maker libraries(used by wsdl2java and wsimport)
			 * doesn't allow http request due to security reasons.
			 * So we should change it to https request either by using the BinderProvider
			 * or you can directly change it in the WSDL java file. 
			 *
			 *(reference:https://stackoverflow.com/questions/13702022/calling-web-service-that-sits-on-a-load-balancer-with-jax-ws-returns-at-http-sta)
			 * 
			 * If you don't it gives this response -> The server sent HTTP status code 302: Moved Temporarily 
			 */
			
			BindingProvider bindingProvider = (BindingProvider) tempConvertSoap;
			bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,"https://www.w3schools.com/xml/tempconvert.asmx");
			
			String temperatureInFahrenheit = tempConvertSoap.celsiusToFahrenheit(temperatureInCelsius);
			System.out.println(temperatureInCelsius+" celcius = "+temperatureInFahrenheit+" fahrenheit!");
		}

	}

}
