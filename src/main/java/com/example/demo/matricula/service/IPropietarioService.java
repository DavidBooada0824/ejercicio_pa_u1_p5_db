package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Propietario;

public interface IPropietarioService {
	
	public void ingresar(Propietario propietario);

	public Propietario buscar(String cedula);
	
	public void modificar(Propietario propietario);

	public void borrar(String cedula);


}
