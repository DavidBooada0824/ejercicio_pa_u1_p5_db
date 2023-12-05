package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Vehiculo;

public interface IVehiculoService {
	
public void ingresar (Vehiculo vehiculo);
	
	public Vehiculo buscar(String placa);
	
	public void modificar(Vehiculo vehiculo);
	
	public void borrar(String placa);
	

}
