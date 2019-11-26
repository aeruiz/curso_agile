package edu.grupoesfera.asignador;

import java.util.List;

import edu.grupoesfera.modelo.Envio;
import net.bytebuddy.implementation.bytecode.Throw;




public class AsignadorVehiculos {
	public Envio asignar(List<String> paquetes) {
		
		Envio envio = new Envio();
		if(paquetes.size() < 5)
			envio.setVehiculo("BICICLETA");
		else if(paquetes.size() < 10)
			envio.setVehiculo("MOTO");
		else if(paquetes.size() < 30)
			envio.setVehiculo("AUTO");
		else {
			throw new RuntimeException();
		}
		return envio;
	}
}
