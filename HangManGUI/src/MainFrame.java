import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		StartPanel startPanel = new StartPanel();
		frame.getContentPane().add(startPanel);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
