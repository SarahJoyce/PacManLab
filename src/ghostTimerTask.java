import java.util.TimerTask;

public class ghostTimerTask extends TimerTask {
	
	World game;

	public ghostTimerTask(World world) {
		game = world;
	}
	
	@Override
	public void run() {
		game.Inky.reset();
		game.Blinky.reset();
		game.Pinky.reset();
		game.Clyde.reset();
	}

}
