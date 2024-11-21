package TP_Final_Programacion2;

public class Player extends DecoradorVehiculo {
	
	private double agregado = 12;

	public Player(Vehiculo vehiculo) {
		super(vehiculo);
	}
	
	@Override
	public String decorar() {
		return super.decorar() + "[con Player]";
	}

	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.obtenerPrecioTotal() + agregado;
	}


}
