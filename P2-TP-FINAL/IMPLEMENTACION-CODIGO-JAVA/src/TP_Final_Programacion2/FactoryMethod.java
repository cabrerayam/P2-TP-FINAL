package TP_Final_Programacion2;

public class FactoryMethod {

	public VehiculoImpl crearVehiculo(String tipo) {
		
		switch(tipo) {
			case "mondeo":
				return new Mondeo();
			case "focus":
				return new Focus();
			case "ka":
				return new Ka();
			case "ranger":
				return new Ranger();
			case "raptor":
				return new Raptor();
			default:
				System.out.println("Error creando vehiculo");
				return null;
		}	
	}
}
