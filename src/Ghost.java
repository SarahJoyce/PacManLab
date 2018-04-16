
public class Ghost extends MovingObjects{
	
	int xpos; int ypos;
	
	public Ghost() {
		xpos = super.xposition;
		ypos = super.yposition;
	}
	
	public Ghost(int xpos, int ypos) {
		super.xposition = xpos;
		super.yposition = ypos;
	}
	
	//function to determine the ghosts' random movement
	public int nextPosn(int currentX, int currentY) {
		return 0;
	}

}
