
public class PacMan extends MovingObjects{
	
	int xpos; int ypos;
	
	public PacMan() {
		xpos = super.xposition;
		ypos = super.yposition;
	}
	
	public PacMan(int xpos, int ypos) {
		super.xposition = xpos;
		super.yposition = ypos;
	}
	
	public void eat() {}

}
