import java.time.*;

public class PowerPellet extends GameObject{
	
	//The ghosts eaten are worth in order 200, 400, 800, 1600
	
	int time = 15; //in seconds
	boolean ppState = false;
	
	public PowerPellet(int xpos, int ypos) {
		super.xposition = xpos;
		super.yposition = ypos;
	}

	public int decreaseTime(int time, boolean ppState) {
		return 0;
	}
	
}
