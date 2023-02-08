package State;

public class Stopped implements State {
	private StopWatch stopWatch;

	public Stopped(StopWatch stopWatch) {
		this.stopWatch = stopWatch;
	}

	@Override
	public void Click() {
		stopWatch.setState(new Running(stopWatch));
		System.out.println("Stopped");
	}

}
