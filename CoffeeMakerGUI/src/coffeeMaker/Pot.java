package coffeeMaker;

public class Pot {
	int capacidadPot;
        SensorPot sesor = new SensorPot();
	WarmerPlate calentador = new WarmerPlate();
        
	public Pot() {
		// TODO Auto-generated constructor stub
	}
        
        public int getCapacidadPot() {
		return capacidadPot;
	}

	public void setCapacidadPot(int capacidadPot) {
		this.capacidadPot = capacidadPot;
	}
	
        public void headPot(int ParamatePot) {
            calentador.getState(sesor.getState(ParamatePot));
            
            
               }

  
}
