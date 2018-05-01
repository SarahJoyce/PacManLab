import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PacManGame {
	
	public static void main(String[] args) {
		
		/*JFrame window = new JFrame();
		window.setBounds(0,0,500,500);
		FlowLayout flow = new FlowLayout();
		window.setLayout(flow);*/
		//^might want to move this to world???^/
		
		PacMan player = new PacMan();
		Ghost Inky = new Ghost();
		Ghost Blinky = new Ghost();
		Ghost Pinky = new Ghost();
		Ghost Clyde = new Ghost();
	
		World game = new World(player, Inky, Blinky, Pinky, Clyde);
		game.draw();
	}
		
}
