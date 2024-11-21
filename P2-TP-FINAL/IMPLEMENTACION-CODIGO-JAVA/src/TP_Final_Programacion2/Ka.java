package TP_Final_Programacion2;

public class Ka extends Auto {

	public Ka() {
		super.setPrecioBase(80);
	}


	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}

	@Override
	public String decorar() {
		return super.decorar() + " - Ka - ";
	}
}
