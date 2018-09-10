package coffeeMaker;

public class Pot {
	int capacidadPot;
	public int getCapacidadPot() {
		return capacidadPot;
	}



	public void setCapacidadPot(int capacidadPot) {
		this.capacidadPot = capacidadPot;
	}



	
	



	SensorPot sesor=new SensorPot();
	
	WarmerPlate calentador=new WarmerPlate();
	
	
	
	
	public Pot() {
		// TODO Auto-generated constructor stub
	}
	/*	
	public void estadoPot() {
	//sesor.getState(capacidadPot);
	
	calentador.getState(sesor.getState(capacidadPot));
	}
		
	public void cargarPot(int capacidad) {
		capacidadPot=capacidad;
		//	sesor.getState(capacidadPot);
		
		calentador.getState(sesor.getState(capacidadPot));
			
}

public void ponerPotEnContenedor(){
	capacidadPot=1;
	//	sesor.getState(capacidadPot);
	calentador.getState(sesor.getState(capacidadPot));
}


public void sacarPot() {	
	capacidadPot=0;
	//	sesor.getState(capacidadPot);
	calentador.getState(sesor.getState(capacidadPot));
}

*/
	
	

public void headPot(int ParamatePot) {
	calentador.getState(sesor.getState(ParamatePot));
}

	
	
}
