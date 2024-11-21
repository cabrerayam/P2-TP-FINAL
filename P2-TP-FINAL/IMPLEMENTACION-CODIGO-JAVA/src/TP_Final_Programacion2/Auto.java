package TP_Final_Programacion2;

public abstract class Auto extends VehiculoImpl{

	@Override
	public String decorar() {
		return super.decorar() + " Auto";
	}
	
}
