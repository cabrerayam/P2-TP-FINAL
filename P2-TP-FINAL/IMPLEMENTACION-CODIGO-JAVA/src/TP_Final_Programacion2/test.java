package TP_Final_Programacion2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryMethod factory = new FactoryMethod();
		
		Vehiculo mondeo1 = factory.crearVehiculo("mondeo");			
		Vehiculo ranger1 = factory.crearVehiculo("ranger");
		Vehiculo raptor1 = factory.crearVehiculo("raptor");
		
		ranger1 = new AireAcondicionado(ranger1);	
		mondeo1 = new Mp3(new AireAcondicionado(mondeo1));
		raptor1 = new LlantasAlineacion(new AireAcondicionado(new Mp3(new Player(raptor1))));
		
		
		// Listar Vehiculos Pedidos
		
		System.out.println("------------------------------------");
		System.out.println("Listar Vehiculos Pedidos");
		System.out.println("------------------------------------");
		
		System.out.println(mondeo1.decorar());
		System.out.println(mondeo1.obtenerPrecioTotal());
		
		System.out.println("------------------------------------");
		
		System.out.println(ranger1.decorar());
		System.out.println(ranger1.obtenerPrecioTotal());
		
		System.out.println("------------------------------------");
		
		System.out.println(raptor1.decorar());
		System.out.println(raptor1.obtenerPrecioTotal());
		
		
		// Fabricar Vehiculos
		
		System.out.println("------------------------------------");
		System.out.println("Fabricacion de Vehiculos");
		System.out.println("------------------------------------");
		
		FabricacionVehiculo fabricacionModeo1 = new FabricacionAuto(mondeo1);	
		fabricacionModeo1.fabricar();
		
		System.out.println("------------------------------------");
		
		FabricacionVehiculo fabricacionRanger1 = new FabricacionPickup(ranger1);	
		fabricacionRanger1.fabricar();
			
		System.out.println("------------------------------------");
		
		FabricacionVehiculo fabricacionRaptor1 = new FabricacionPickup(raptor1);	
		fabricacionRaptor1.fabricar();

	}

}
