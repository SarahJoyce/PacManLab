import java.time.*;

public class PowerPellet extends GameObject{
	
	//The ghosts eaten are worth in order 200, 400, 800, 1600
	
	int time = 0; //in seconds
	boolean ppState = false; //the world is initially not in a power pellet state
	
	public PowerPellet(int xpos, int ypos) {
		super.xposition = xpos;
		super.yposition = ypos;
	}

	//sets time = 15 seconds and decreases the time second by second when ppState = true;
	//when time = 0; ppState returns to false
	public int decreaseTime(int time, boolean ppState) {
		return 0;
	}
	
}
