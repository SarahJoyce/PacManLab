import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PacManGame extends JFrame{
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		
		PacMan player = new PacMan();
		Ghost Inky = new Ghost();
		Ghost Blinky = new Ghost();
		Ghost Pinky = new Ghost();
		Ghost Clyde = new Ghost();
	
		World game = new World(player, Inky, Blinky, Pinky, Clyde);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacManGame window = new PacManGame();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public PacManGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		FlowLayout flow = new FlowLayout();
		contentPane.setLayout(flow);
		setContentPane(contentPane);
	}
	
}
