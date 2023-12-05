package com.example.demo.matricula.repo;


import com.example.demo.matricula.repo.modelo.Propietario;

public interface IPropietarioRepo {
	
	public void crear(Propietario propietario);

	public Propietario selecionar(String cedula);

	public void actualizar(Propietario propietario);

	public void eliminar(String cedula);

}
