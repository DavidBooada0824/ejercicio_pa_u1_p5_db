package com.example.demo.matricula.service;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IMatriculaRepo;
import com.example.demo.matricula.repo.IPropietarioRepo;
import com.example.demo.matricula.repo.IVehiculoRepo;
import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.repo.modelo.Propietario;
import com.example.demo.matricula.repo.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Autowired
	private IVehiculoRepo iVehiculoRepo;

	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Override
	public void ingresar(Matricula matricula) {
		this.iMatriculaRepo.crear(matricula);

	}

	@Override
	public void generar(String cedula, String placa) {
		
		
		Propietario pro = this.iPropietarioRepo.selecionar(cedula);
		Vehiculo vehi = this.iVehiculoRepo.seleccionar(placa);

		if (vehi.getTipo().equals("pesado")) {
			BigDecimal matriculaActual = vehi.getPrecio();
			BigDecimal matriculaFinal = matriculaActual.multiply(new BigDecimal(0.25));
			Matricula matri = new Matricula();
			matri.setFecha(LocalDateTime.now());
			matri.setNumero("M01");
			matri.setPropietario(pro);
			matri.setVehiculo(vehi);
			matri.setValor(matriculaFinal);
			System.out.println(matriculaFinal);
			if (matriculaFinal.compareTo(new BigDecimal(2200)) > 0) {
				matriculaFinal = matriculaFinal.subtract(matriculaFinal.multiply(new BigDecimal(0.05)));
				matri.setValor(matriculaFinal);
				System.out.println(matriculaFinal);

			}
	
			this.iMatriculaRepo.crear(matri);
			System.out.println(matri);

		} else {
			BigDecimal matriculaActual = vehi.getPrecio();
			BigDecimal matriculaFinal = matriculaActual.multiply(new BigDecimal(0.20));
			Matricula matri = new Matricula();
			matri.setFecha(LocalDateTime.now());
			matri.setNumero("M01");
			matri.setPropietario(pro);
			matri.setVehiculo(vehi);
			matri.setValor(matriculaFinal);
			
			if (matriculaFinal.compareTo(new BigDecimal(2200)) > 0) {
				matriculaFinal = matriculaFinal.subtract(matriculaFinal.multiply(new BigDecimal(0.05)));
				matri.setValor(matriculaFinal);
				System.out.println(matriculaFinal);
				
			}
		
			this.iMatriculaRepo.crear(matri);
			System.out.println(matri);
		}
		

	}

}
