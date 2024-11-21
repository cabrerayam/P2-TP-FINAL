package TP_Final_Programacion2;

public abstract class DecoradorVehiculo implements Vehiculo {

	private Vehiculo vehiculo;
	
	public DecoradorVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	@Override
	public String decorar() {
		return vehiculo.decorar();
	}
	
	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return vehiculo.obtenerPrecioTotal();
	}
	
}
