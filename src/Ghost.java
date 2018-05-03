import java.util.Random;

public class Ghost extends MovingObjects{
	
	private final int initialX;
	private final int initialY;
	
	int xpos;
	int ypos;
	
	boolean ghostState;
	
	public Ghost() {
		super(0,0,false);
		initialX = 0;
		initialY = 0;
		ghostState = false;
	}
	
	public Ghost(int xpos, int ypos, boolean isMoving, boolean state) {
		super(xpos, ypos, isMoving);
		initialX = xpos;
		initialY = ypos;
		this.xpos = xpos;
		this.ypos = ypos;
		ghostState = state;
	}
	
	//function to determine the ghosts' random movement
	public int nextPosn(int currentX, int currentY) {
		Random dir = new Random();
		int direction = 1 + dir.nextInt(4);
		return direction;
	}
	
	@Override
	public void die() {
		xpos = initialX;
		ypos = initialY;
	}

}
