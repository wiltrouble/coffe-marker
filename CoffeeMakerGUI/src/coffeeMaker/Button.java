package coffeeMaker;

public class Button {
	public boolean state;
        public Button(boolean state){
            this.state=state;
        }
	public void on() {
		state=true;
	}
	public void off() {
		state=false;
	}
}
