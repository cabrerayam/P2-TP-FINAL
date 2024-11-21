package TP_Final_Programacion2;

public abstract class FabricacionVehiculo {
	
	private int etapaActual = 0;
	
	private String[] etapas = {
	        "Recepción y clasificación de piezas",
	        "Corte de piezas metálicas",
	        "Ensamblado de chasis y carrocería",
	        "Pintura",
	        "Ensamble de partes mecánicas",
	        "Terminación de exteriores",
	        "Acabados interiores",
	        "Verificación",
	        "Entrega"
	};
	
	private Vehiculo vehiculo;
	
	public FabricacionVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	public void fabricar() {
        while (etapaActual < etapas.length - 1) {
            avanzarEtapa();
        }
        System.out.println("Fabricación del Vehiculo y " + etapas[etapaActual] + " completada.");
    }

    public void avanzarEtapa() {
        if (etapaActual < etapas.length) {
            System.out.println("Completando etapa: " + etapas[etapaActual]);
            realizarEtapa(etapas[etapaActual]);
            etapaActual++;
        }
    }

    public String obtenerEstadoActual() {
        if (etapaActual < etapas.length) {
            return "Etapa actual: " + etapas[etapaActual];
        } else {
            return "Vehículo terminado.";
        }
    }

    // Método abstracto para personalizar etapas específicas
    protected abstract void realizarEtapa(String etapa);



	public Vehiculo getVehiculo() {
		return vehiculo;
	}



	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
    
    
	
}
