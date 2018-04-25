
public class Ghost extends MovingObjects{
	
	boolean ghostState;
	
	public Ghost() {
		super(0,0,false);
		ghostState = false;
	}
	
	public Ghost(int xpos, int ypos, boolean isMoving, boolean state) {
		super(xpos, ypos, isMoving);
		ghostState = state;
	}
	
	//function to determine the ghosts' random movement
	public int nextPosn(int currentX, int currentY) {
		return 0;
	}

}
