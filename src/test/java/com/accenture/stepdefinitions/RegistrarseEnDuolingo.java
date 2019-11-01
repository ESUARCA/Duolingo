package com.accenture.stepdefinitions;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.accenture.tasks.RealizarRegistro;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistrarseEnDuolingo {
	
	private Actor actor = Actor.named("Administrator");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;
	
	@Before
	public void configuracioInicial() {
		actor.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@When("^Registra en Duolingo seleccionando (.*) con intensidad (.*)$")
    public void registra_en_duolingo_seleccionando_espaol_con_intensidad_regular(String lenguaje, String intensidad) {
     RealizarRegistro.conDatos(lenguaje, intensidad);
    }

    @Then("^Para emprender un idioma$")
    public void para_emprender_un_idioma() {
       
    }
}