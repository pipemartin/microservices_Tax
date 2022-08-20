package com.juan.clase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
public class ControllerCalculator {
	
	@Value("${app.message,error}")
	private String mensajeError;
	
	@Value("${cambio.trmPesos}")
	private int trmCol;
	
	@GetMapping("/sumar/{a}/{b}")
	public int sumar(@PathVariable int a, @PathVariable int b) {
		Respuesta res = new Respuesta(a,b,a+b);
		
		return res.getRespuesta();
	}
	
	@GetMapping("/restar/{a}/{b}")
	public Respuesta restar(@PathVariable int a, @PathVariable int b) { 
		return new Respuesta(a,b,a-b);
	}
	
	@GetMapping("/multiplicar/{a}/{b}")
	public Respuesta multiplicar(@PathVariable int a, @PathVariable int b) {
		if(b==0) {
			return new Respuesta(a,b,mensajeError);
		} 
		return new Respuesta(a,b,a*b);
	}
	@GetMapping("/usdToCol/{a}")
	public Cambio usdToCol(@PathVariable int a) {
		int respuesta = trmCol * a;
		return new Cambio(respuesta,trmCol,a);
	}
	@GetMapping("/colToUsd/{a}")
	public Cambio colToUsd(@PathVariable int a) {
		int respuesta =  a/ trmCol;
		return new Cambio(a,trmCol,respuesta);
	}
}


//CNTRL + SHIFT + o -> organiza el codigo
// CNTRL + SHIFT + f -> organiza 