package com.example.demo.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IPropietarioRepo;
import com.example.demo.matricula.repo.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;
	@Override
	public void ingresar(Propietario propietario) {
		this.iPropietarioRepo.crear(propietario);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.selecionar(cedula);
	}

	@Override
	public void modificar(Propietario propietario) {
		this.iPropietarioRepo.actualizar(propietario);
	}

	@Override
	public void borrar(String cedula) {
		
		this.iPropietarioRepo.eliminar(cedula);
		
	}


}
