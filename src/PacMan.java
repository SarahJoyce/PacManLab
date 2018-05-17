
public class PacMan extends MovingObjects {

	final int initialX;
	final int initialY;
	String direction;

	int numLives = 3;

	public PacMan() {
		super(0, 0, false);
		super.objectType = ObjectType.PACMAN;
		initialX = 0;
		initialY = 0;
		direction = "right";
	}

	public PacMan(int xpos, int ypos, boolean isMoving, String dir) {
		super(xpos, ypos, isMoving);
		super.objectType = ObjectType.PACMAN;
		initialX = xpos;
		initialY = ypos;
		direction = dir;
	}

	@Override

	// when pacman gets hit by ghost test if lives is greater than 0 is so call die
	// if not end game
	public void die() {
		super.xposition = initialX;
		super.yposition = initialY;
		numLives--;
		System.out.println("You died. " + numLives + " Lives Remaining");
	}

}
