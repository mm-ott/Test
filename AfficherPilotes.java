import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class AfficherPilotes extends JFrame {
	
	public AfficherPilotes(){
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(5, 1));
		
		this.setTitle("Liste des pilotes");
		
		this.setSize(500, 600);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);
		
		this.getContentPane().add(panel);
	
		panel.setBackground(Color.white);
		
		this.setVisible(true);
	}
	
}
