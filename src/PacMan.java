
public class PacMan extends MovingObjects{
	
	int points;
	
	public PacMan() {
		super(0,0,0);
		points = 0;
	}
	
	public PacMan(int xpos, int ypos, int dir, int p) {
		super(xpos, ypos, dir);
		points = p;
	}
	
	//make the food disappear and add points to the score
	public void eat() {}

}
