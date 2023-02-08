package State;

public class Running implements State {

	private StopWatch stopWatch;

	public Running(StopWatch stopWatch) {
		this.stopWatch = stopWatch;
	}

	@Override
	public void Click() {
		stopWatch.setState(new Stopped(stopWatch));
		System.out.println("Running");
	}

}
