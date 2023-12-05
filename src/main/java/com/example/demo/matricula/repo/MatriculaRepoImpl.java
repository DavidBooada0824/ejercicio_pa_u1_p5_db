package com.example.demo.matricula.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Matricula;

@Repository
public class MatriculaRepoImpl  implements IMatriculaRepo{
	
	private List<Matricula> base = new ArrayList<>();

	@Override
	public void crear(Matricula matricula) {
		base.add(matricula);
		
	}
//


}
