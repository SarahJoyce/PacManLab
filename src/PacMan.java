
public class PacMan extends MovingObjects{
	
	final int initialX;
	final int initialY;
	
	int points;
	int numLives = 4;
	
	public PacMan() {
		super(0,0,false);
		super.objectType = ObjectType.PACMAN;
		initialX = 0;
		initialY = 0;
		points = 0;
	}
	
	public PacMan(int xpos, int ypos, boolean isMoving, int p) {
		super(xpos, ypos, isMoving);
		super.objectType = ObjectType.PACMAN;
		initialX = xpos;
		initialY = ypos;
		points = p;
	}
	
	//make the food disappear and add points to the score
	public void eat() {
		points++;
		//World.gameThings.EMPTY
	}
	
	@Override
	
	//when pacman gets hit by ghost test if lives is greater than 0 is so call die if not end game
	public void die() {
		super.xposition = initialX;
		super.xposition = initialY;
		numLives--;
	}

}
