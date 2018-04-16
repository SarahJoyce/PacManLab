
public abstract class MovingObjects extends GameObject {
	
	int direction;
	
	protected MovingObjects(int currentX, int currentY, int direction) {
		super(currentX, currentY);
		this.direction = direction;
	}
	
	protected boolean isCollided;
	
	protected void moveRight() {}
	protected void moveLeft() {}
	protected void moveDown() {}
	protected void moreUp() {}
	protected void die() {}
	
	protected void updatePos() {}

}
