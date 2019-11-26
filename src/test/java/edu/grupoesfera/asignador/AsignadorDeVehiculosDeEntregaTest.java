package edu.grupoesfera.asignador;

import org.junit.Test;

import edu.grupoesfera.modelo.Envio;

import static org.assertj.core.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

public class AsignadorDeVehiculosDeEntregaTest {

	@Test
	public void cincoPaquetes() {

		List<String> paquetes = new LinkedList<>();
		paquetes.add("paquetes");
		paquetes.add("perro");

		AsignadorVehiculos asignador = new AsignadorVehiculos();
		Envio envio = asignador.asignar(paquetes);
		assertThat(envio.getVehiculo()).isEqualTo("BICICLETA");

	}

	@Test
	public void cincoADiezPaquetes() {

		List<String> paquetes = new LinkedList<>();
		for (int i = 0; i < 8; i++) {
			paquetes.add("paquetes");
		}

		AsignadorVehiculos asignador = new AsignadorVehiculos();
		Envio envio = asignador.asignar(paquetes);
		assertThat(envio.getVehiculo()).isEqualTo("MOTO");

	}

	@Test
	public void diezATreintaPaquetes() {

		List<String> paquetes = new LinkedList<>();
		for (int i = 0; i < 22; i++) {
			paquetes.add("paquetes");
		}
		AsignadorVehiculos asignador = new AsignadorVehiculos();
		Envio envio = asignador.asignar(paquetes);
		assertThat(envio.getVehiculo()).isEqualTo("AUTO");

	}
}
