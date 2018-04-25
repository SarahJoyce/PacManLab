
public abstract class MovingObjects extends GameObject {
	
	boolean isMoving;
	int currentX;
	int currentY;
	
	protected MovingObjects(int currentX, int currentY, boolean isMoving) {
		super(currentX, currentY);
		this.currentX = currentX;
		this.currentY = currentY;
		this.isMoving = isMoving;
	}
	
	protected boolean isCollided;
	
	protected void moveRight() {currentX++;}
	protected void moveLeft() {currentX--;}
	protected void moveDown() {currentY--;}
	protected void moreUp() {currentY++;}
	protected void die() {} //test number of lives if more than 1 reset PacMan and ghosts to start but leave
							//pellets and points and fruit
	
	protected void updatePos() {}

}
