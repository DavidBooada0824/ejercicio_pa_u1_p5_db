package com.example.demo.matricula.service;

import com.example.demo.matricula.repo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresar(Matricula matricula);



	public void generar(String cedula, String placa);

}
