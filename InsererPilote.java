import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.*;


public class InsererPilote extends JFrame implements ActionListener  {
		
		private JPanel panel = new JPanel();	
		private JButton bouton = new JButton("Insérer");
		private JTextField idPilote = new JTextField("ID");
		private JTextField nomPilote = new JTextField("Nom");
		private JTextField prenomPilote = new JTextField("Prénom");
		private JLabel intitulePage = new JLabel("Insérer un pilote : ");

		
		
		public InsererPilote(){
			
			bouton.addActionListener(this);
			
			panel.setLayout(new GridLayout(5, 1));
			
			this.setTitle("Insérer un pilote");
			
			this.setSize(500, 200);
			
			this.setLocationRelativeTo(null);
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setResizable(false);
			
			this.getContentPane().add(panel);

			panel.setBackground(Color.orange);
			

			panel.add(intitulePage);
			
			Font police = new Font("Arial", Font.ITALIC, 12);
			
			idPilote.setFont(police);
			idPilote.setPreferredSize(new Dimension(40, 30));
			idPilote.setForeground(Color.black);
			idPilote.setPreferredSize(new Dimension(300,30));
			panel.add(idPilote);
			
			nomPilote.setFont(police);
			nomPilote.setPreferredSize(new Dimension(40, 30));
			nomPilote.setForeground(Color.black);
			nomPilote.setPreferredSize(new Dimension(300,30));
			panel.add(nomPilote);
			
			prenomPilote.setFont(police);
			prenomPilote.setPreferredSize(new Dimension(40, 30));
			prenomPilote.setForeground(Color.black);
			prenomPilote.setPreferredSize(new Dimension(300,30));
			panel.add(prenomPilote);

			panel.add(bouton);
			
			this.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e){
		
			System.out.println("Saisie : " + idPilote.getText() + " | " + nomPilote.getText() + " | " + prenomPilote.getText());
			
		}

}

