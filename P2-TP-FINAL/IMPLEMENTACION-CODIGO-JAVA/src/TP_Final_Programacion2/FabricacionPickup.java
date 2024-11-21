package TP_Final_Programacion2;

public class FabricacionPickup extends FabricacionVehiculo {
	
	public FabricacionPickup(Vehiculo vehiculo) {
		super(vehiculo);
		// TODO Auto-generated constructor stub
	}
	
    @Override
    protected void realizarEtapa(String etapa) {
        System.out.println("Procesando etapa para PICKUP (): " + super.getVehiculo().decorar() + etapa);
    }
}
