package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IVehiculoRepo;
import com.example.demo.matricula.repo.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	@Override
	public void ingresar(Vehiculo vehiculo) {
		this.iVehiculoRepo.crear(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.seleccionar(placa);
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
	this.iVehiculoRepo.actualizar(vehiculo);	
	}

	@Override
	public void borrar(String placa) {
		this.iVehiculoRepo.eliminar(placa);
	}
	
	

}
