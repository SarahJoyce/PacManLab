
public class PacManGame {
	
	public static void main(String[] args) {
		int PacInitX = 0; int PacInitY = 0;
		int GhostInitX = 0; int GhostInitY = 0;
		
		PacMan player = new PacMan(PacInitX, PacInitY);
		Ghost Inky = new Ghost(GhostInitX, GhostInitY);
		Ghost Blinky = new Ghost(GhostInitX, GhostInitY);
		Ghost Pinky = new Ghost(GhostInitX, GhostInitY);
		Ghost Clyde = new Ghost(GhostInitX, GhostInitY);
	
		World game = new World(player, Inky, Blinky, Pinky, Clyde);
	}
		
}
