
public class PacMan extends MovingObjects{
	
	int points;
	int xpos;
	int ypos;
	
	public PacMan() {
		super(0,0,false);
		points = 0;
	}
	
	public PacMan(int xpos, int ypos, boolean isMoving, int p) {
		super(xpos, ypos, isMoving);
		this.xpos = xpos;
		this.ypos = ypos;
		points = p;
	}
	
	//make the food disappear and add points to the score
	public void eat() {}

}
