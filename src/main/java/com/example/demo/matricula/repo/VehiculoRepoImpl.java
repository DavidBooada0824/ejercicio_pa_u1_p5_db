package com.example.demo.matricula.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {
	
	private List<Vehiculo> base = new ArrayList<>();

	@Override
	public void crear(Vehiculo vehiculo) {
		base.add(vehiculo);
		
	}

	@Override
	public Vehiculo seleccionar(String placa) {
		for (Vehiculo vehi : base) {
			if(vehi.getPlaca().equals(placa));
			return vehi;
		}
		return null;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.seleccionar(vehiculo.getPlaca());
		this.crear(vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehi = this.seleccionar(placa);
		base.remove(vehi);
		
	}
	
	

}
