
public abstract class MovingObjects extends GameObject {

	boolean isMoving;

	protected MovingObjects(int currentX, int currentY, boolean isMoving) {
		super(currentX, currentY);
		this.isMoving = isMoving;
	}

	protected boolean isCollided;

	protected void moveRight() {
		super.xposition++;
	}

	protected void moveLeft() {
		super.xposition--;
	}

	protected void moveDown() {
		super.yposition++;
	}

	protected void moveUp() {
		super.yposition--;
	}

	protected void die() {
	} // test number of lives if more than 1 reset PacMan and ghosts to start but
		// leave
		// pellets and points and fruit

	protected void updatePos() {
	}

}
