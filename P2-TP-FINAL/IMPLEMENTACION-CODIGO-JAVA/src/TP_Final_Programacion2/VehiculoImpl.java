package TP_Final_Programacion2;

public abstract class VehiculoImpl implements Vehiculo {
	
	private double precioBase;
	
	public double getPrecioBase() {
		return precioBase;
	}

	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/*
	@Override
	public double obtenerPrecioTotal() {
		return 0;
	}
	*/
	
	@Override
	public String decorar() {
		return "Vehiculo";
	}
	
	    
}
