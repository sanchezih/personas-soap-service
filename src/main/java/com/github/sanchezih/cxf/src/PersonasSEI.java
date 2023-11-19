package com.github.sanchezih.cxf.src;

import java.util.List;

import javax.jws.WebService;

/**
 * SEI (Service Endpoint Interface)
 * 
 * Interface que realiza el crud de personas
 * 
 * @author ihsanch
 *
 */
@WebService(name = "PersonasSEI", targetNamespace = "http://src.cxf.sanchezih.github.com/")
public interface PersonasSEI {

	/**
	 * Agrega una persona al conjunto
	 * 
	 * @param persona
	 */
	public void addPersona(Persona persona);

	/**
	 * Retorna una persona del conjunto. Si la persona no existe se lanza una
	 * excepcion
	 * 
	 * @param nombre
	 * @return
	 * @throws Exception
	 */
	public Persona getPersona(String nombre) throws Exception;

	/**
	 * Retorna el conjunto de personas
	 * 
	 * @return
	 */
	public List<Persona> getPersonas();

	/**
	 * Elimina una persona del conjunto. Si la persona no existe se lanza una
	 * excepcion
	 * 
	 * @param nombre
	 * @throws Exception
	 */
	public void removePersona(String nombre) throws Exception;
}
