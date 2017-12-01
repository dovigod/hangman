import javax.swing.*;
import java.awt.*;

public class StartPanel extends JPanel {

	private JButton btnStart,btnHelp;
	private JLabel lblTitle,lblImage;
	private ImageIcon imageHangMan;
	private Font fnt;
	
	public StartPanel() {
		
		setPreferredSize(new Dimension(400,400));
		setBackground(Color.white);
		setLayout(null);
		
		fnt = new Font("consolas",Font.BOLD,15);
		
		lblTitle = new JLabel("HANG MAN GAME");
		lblTitle.setFont(new Font("consolas",Font.BOLD,45));
		lblTitle.setBounds(30,100,340,50);
		add(lblTitle);
		
		imageHangMan = new ImageIcon("Images/hangman.png");
		
		lblImage = new JLabel(imageHangMan);
		lblImage.setBounds(185, 170, 200, 200);
		add(lblImage);
		
		btnStart = new JButton("START");
		btnStart.setBounds(50,220,130,30);
		btnStart.setFont(fnt);
		btnStart.setBackground(Color.white);
		add(btnStart);
	
		btnHelp = new JButton("HOW TO PLAY");
		btnHelp.setBackground(Color.white);
		btnHelp.setBounds(50,280,130,30);
		add(btnHelp);
		
		
		
	}
	
}
