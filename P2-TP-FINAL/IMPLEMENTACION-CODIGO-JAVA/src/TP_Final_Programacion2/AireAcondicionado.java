package TP_Final_Programacion2;

public class AireAcondicionado extends DecoradorVehiculo {
	
	private double agregado = 55;

	public AireAcondicionado(Vehiculo vehiculo) {
		super(vehiculo);
	}
	
	@Override
	public String decorar() {
		return super.decorar() + "[con Aire Acondicionado]";
	}

	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.obtenerPrecioTotal() + agregado;
	}

}
