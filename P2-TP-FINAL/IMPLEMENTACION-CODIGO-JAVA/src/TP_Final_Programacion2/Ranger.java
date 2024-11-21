package TP_Final_Programacion2;

public class Ranger extends PickUp {
	
	public Ranger() {
		super.setPrecioBase(180);
	}


	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}
	
	@Override
	public String decorar() {
		return super.decorar() + " - Ranger - ";
	}
	

}
