package TP_Final_Programacion2;

public class Focus extends Auto {

	public Focus() {
		super.setPrecioBase(150);
	}


	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}

	@Override
	public String decorar() {
		return super.decorar() + " - Focus - ";
	}
}
