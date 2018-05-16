import java.awt.Color;

public class Ghost extends MovingObjects {
	private final int initialX;
	private final int initialY;
	private final Color initialColor;

	boolean isEdible;
	Color color;

	GameObject.ObjectType oldType;

	public Ghost() {
		super(0, 0, false);
		super.objectType = ObjectType.GHOST;
		initialX = 0;
		initialY = 0;
		initialColor = Color.PINK;
		isEdible = false;
		oldType = GameObject.ObjectType.EMPTY;
	}

	public Ghost(int xpos, int ypos, boolean isMoving, boolean edible, GameObject.ObjectType oldType, Color color) {
		super(xpos, ypos, isMoving);
		super.objectType = ObjectType.GHOST;
		initialX = xpos;
		initialY = ypos;
		initialColor = color;
		isEdible = edible;
		this.oldType = oldType;
		this.color = color;
	}

	// function to determine the ghosts' random movement
	public void nextPosn(int direc) {

		if (direc == 0) {
			moveRight();
		} else if (direc == 1) {
			moveDown();
		} else if (direc == 2) {
			moveLeft();
		} else {
			moveUp();
		}
	}

	@Override
	public void die() {
		super.xposition = initialX;
		super.yposition = initialY;
	}

	public void makeEdible() {
		this.isEdible = true;
		color = Color.WHITE;
	}
	
	public void reset() {
		this.isEdible = false;
		color = initialColor;
	}
}
