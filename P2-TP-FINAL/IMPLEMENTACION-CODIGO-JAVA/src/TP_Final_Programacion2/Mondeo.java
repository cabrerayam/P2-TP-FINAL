package TP_Final_Programacion2;

public class Mondeo extends Auto {
		
	public Mondeo() {
		super.setPrecioBase(120);
	}


	@Override
	public double obtenerPrecioTotal() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}

	@Override
	public String decorar() {
		return super.decorar() + " - Mondeo - ";
	}
	

}
