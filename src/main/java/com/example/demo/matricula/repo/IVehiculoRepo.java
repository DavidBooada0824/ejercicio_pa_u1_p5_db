package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void crear (Vehiculo vehiculo);
	
	public Vehiculo seleccionar(String placa);
	
	public void actualizar(Vehiculo vehiculo);
	
	public void eliminar(String placa);
	
	

}
