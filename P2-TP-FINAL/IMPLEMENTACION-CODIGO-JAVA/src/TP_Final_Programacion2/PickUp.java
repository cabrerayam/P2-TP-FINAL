package TP_Final_Programacion2;

public abstract class PickUp extends VehiculoImpl {

	@Override
	public String decorar() {
		return super.decorar() + " Pickup";
	}
	
}
