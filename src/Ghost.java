
public class Ghost extends MovingObjects{
	
	boolean ghostState;
	
	public Ghost() {
		super(0,0,0);
		ghostState = false;
	}
	
	public Ghost(int xpos, int ypos, int dir, boolean state) {
		super(xpos, ypos, dir);
		ghostState = state;
	}
	
	//function to determine the ghosts' random movement
	public int nextPosn(int currentX, int currentY) {
		return 0;
	}

}
