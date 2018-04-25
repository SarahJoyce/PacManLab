
public abstract class MovingObjects extends GameObject {
	
	boolean isMoving;
	
	protected MovingObjects(int currentX, int currentY, boolean isMoving) {
		super(currentX, currentY);
		this.isMoving = isMoving;
	}
	
	protected boolean isCollided;
	
	protected void moveRight() {}
	protected void moveLeft() {}
	protected void moveDown() {}
	protected void moreUp() {}
	protected void die() {}
	
	protected void updatePos() {}

}
