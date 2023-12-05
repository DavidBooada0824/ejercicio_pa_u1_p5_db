package com.example.demo.matricula.repo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo {
	
	private List<Propietario> base = new ArrayList<>();

	@Override
	public void crear(Propietario propietario) {
		 base.add(propietario);
		
	}

	@Override
	public Propietario selecionar(String cedula) {
		
		for (Propietario prop1 : base ) {
			if(prop1.getCedula().equals(cedula)) {
				
				Propietario pro = new Propietario();
				pro.setApellido(prop1.getApellido());
				pro.setCedula(prop1.getCedula());
				pro.setNombre(prop1.getNombre());
				pro.setGenero(prop1.getGenero());
				
				return pro;
				
			}
		}
			
		
		return null;
	}



	@Override
	public void eliminar(String cedula) {
		Propietario pro = this.selecionar(cedula);
		
		base.remove(pro);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.selecionar(propietario.getCedula());
		this.crear(propietario);
		
	}
	
	

}
