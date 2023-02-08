package State;

public class StopWatch {
	
	
	private State state = new Stopped(this);
	
    public void Click() {
    	state.Click();
    }
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
