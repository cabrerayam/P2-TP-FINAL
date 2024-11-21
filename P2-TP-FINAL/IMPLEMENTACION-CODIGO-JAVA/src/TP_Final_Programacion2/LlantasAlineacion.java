package TP_Final_Programacion2;

public class LlantasAlineacion extends DecoradorVehiculo {
	
	private double agregado = 66;

	public LlantasAlineacion(Vehiculo vehiculo) {
		super(vehiculo);
	}
	
	@Override
	public String decorar() {
		return super.decorar() + "[con Llantas de Alineacion]";
	}

	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.obtenerPrecioTotal() + agregado;
	}


}
