import javax.swing.*;

//Don't change this except for the name of the JFrame

public class Program {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("PAC-MAN");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new PacManGame(new GraphicsEngine()));
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
