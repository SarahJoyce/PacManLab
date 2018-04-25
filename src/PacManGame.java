
public class PacManGame {
	
	public static void main(String[] args) {
		
		PacMan player = new PacMan();
		Ghost Inky = new Ghost();
		Ghost Blinky = new Ghost();
		Ghost Pinky = new Ghost();
		Ghost Clyde = new Ghost();
	
		World game = new World(player, Inky, Blinky, Pinky, Clyde);
		game.draw();
		
		System.out.println("I ran");
	}
		
}
