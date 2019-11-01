package com.accenture.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class RealizarRegistro implements Task{	
	
	private String lenguaje;
	private String intensidad;
	
	public RealizarRegistro(String lenguaje, String intensidad) {
		this.lenguaje=lenguaje;
		this.intensidad=intensidad;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
	}
	
	public static RealizarRegistro conDatos(String lenguaje, String intensidad) {
		return instrumented(RealizarRegistro.class, lenguaje, intensidad);
	}

}
