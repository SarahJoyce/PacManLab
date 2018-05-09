
public class Ghost extends MovingObjects{
	
	private final int initialX;
	private final int initialY;
	
	int xpos;
	int ypos;
	
	boolean ghostState;
	
	GameObject.ObjectType oldType;
	
	public Ghost() {
		super(0,0,false);
		initialX = 0;
		initialY = 0;
		ghostState = false;
		oldType = GameObject.ObjectType.EMPTY;
	}
	
	public Ghost(int xpos, int ypos, boolean isMoving, boolean state, GameObject.ObjectType oldType) {
		super(xpos, ypos, isMoving);
		initialX = xpos;
		initialY = ypos;
		this.xpos = xpos;
		this.ypos = ypos;
		ghostState = state;
		this.oldType = oldType;
	}
	
	//function to determine the ghosts' random movement
	public void nextPosn(int direc) {

		if (direc == 0) {
			moveRight();
		}
		else if (direc == 1) {
			moveDown();
		}
		else if (direc == 2) {
			moveLeft();
		}
		else {
			moveUp();
		}
	}
	
	@Override
	public void die() {
		xpos = initialX;
		ypos = initialY;
	}

}
