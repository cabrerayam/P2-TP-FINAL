package TP_Final_Programacion2;

public class FabricacionAuto extends FabricacionVehiculo {
	
	public FabricacionAuto(Vehiculo vehiculo) {
		super(vehiculo);
		// TODO Auto-generated constructor stub
	}

    @Override
    protected void realizarEtapa(String etapa) {
        System.out.println("Procesando etapa para AUTO (): "+  super.getVehiculo().decorar() + etapa);
    }
}
