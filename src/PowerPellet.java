import java.time.*;
import java.util.Timer;
import java.util.TimerTask;

public class PowerPellet extends GameObject{
	
	//The ghosts eaten are worth in order 200, 400, 800, 1600
	
	int seconds = 15;
	boolean ppState = true;
	Timer timer;
	
	public PowerPellet(int xpos, int ypos, int seconds) {
		super(xpos, ypos);
		this.seconds = seconds;
		timer = new Timer();
		timer.schedule(new PowerPelletWorld(), seconds);
	}
	
	class PowerPelletWorld extends TimerTask {
        public void run() {
            ppState = false;
            timer.cancel(); //Terminate the timer thread
        }
    }
	
}
