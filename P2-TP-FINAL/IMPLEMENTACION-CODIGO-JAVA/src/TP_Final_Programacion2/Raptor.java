package TP_Final_Programacion2;

public class Raptor extends PickUp {

	public Raptor() {
		super.setPrecioBase(250);
	}


	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}

	@Override
	public String decorar() {
		return super.decorar() + " - Raptor - ";
	}
}
