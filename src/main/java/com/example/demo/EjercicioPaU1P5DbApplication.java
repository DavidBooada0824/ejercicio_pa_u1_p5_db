package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matricula.repo.modelo.Propietario;
import com.example.demo.matricula.repo.modelo.Vehiculo;
import com.example.demo.matricula.service.IMatriculaService;
import com.example.demo.matricula.service.IPropietarioService;
import com.example.demo.matricula.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPaU1P5DbApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		1. Crear un vehículo.
		
		Vehiculo vehi = new Vehiculo();
		
		vehi.setMarca("Galardi");
		vehi.setPlaca("IP267W");
		vehi.setPrecio(new BigDecimal(20000));
		vehi.setTipo("pesado");
		this.iVehiculoService.ingresar(vehi);
//		2. Crear un propietario.
		
		Propietario prop = new Propietario();
		
		prop.setApellido("Boada");
		prop.setCedula("1720030723");
		prop.setGenero("Masculino");
		prop.setNombre("David");
		
		this.iPropietarioService.ingresar(prop);
		System.out.println(prop);
//		3. Actualizar 2 atributos del propietario creado en el punto 2.
		
		prop.setApellido("Aguacondo");
		prop.setNombre("fernando");
		this.iPropietarioService.buscar("1720030723");
		this.iPropietarioService.modificar(prop);
		System.err.println("Se modificaron campos del Propietario: " );
		System.err.println(prop);
//		4. Realizar una matrícula de vehículo a partir de los datos: cédula y placa del vehículo utilizados
//		en los puntos 1 y 2.
		this.iMatriculaService.generar("1720030723", "IP267W");
//		
	}

}
