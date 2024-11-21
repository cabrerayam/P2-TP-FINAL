package TP_Final_Programacion2;

public class Mp3 extends DecoradorVehiculo {
		
		private double agregado = 44;

		public Mp3(Vehiculo vehiculo) {
			super(vehiculo);
		}
		
		@Override
		public String decorar() {
			return super.decorar() + "[con Mp3]";
		}

		@Override
		public double obtenerPrecioTotal() {
			// TODO Auto-generated method stub
			return super.obtenerPrecioTotal() + agregado;
		}

}
