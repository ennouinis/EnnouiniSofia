package myViews;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
//import maPremiereApplicationBancaire.MonPortefeuille;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GererMonPortefeuille {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GererMonPortefeuille window = new GererMonPortefeuille();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GererMonPortefeuille() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		
		  frame.setTitle("BANQUE ANNECIENNE");
		  frame.setSize(1000, 700);
		  frame.setLocationRelativeTo(null);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.getContentPane().setLayout(null);
		  frame.setVisible(true);
		  
		  
		  JLabel lblBanqueAnnecienne = new JLabel("BANQUE ANNECIENNE");
			lblBanqueAnnecienne.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
			lblBanqueAnnecienne.setForeground(new Color(0, 102, 255));
			lblBanqueAnnecienne.setBounds(223, 25, 266, 46);
			frame.getContentPane().add(lblBanqueAnnecienne);
			
			JButton btnAjouterClientParticulier = new JButton("Ajouter client particulier");
			btnAjouterClientParticulier.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AjouterClientParticulier(); 
				}
			});
			btnAjouterClientParticulier.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAjouterClientParticulier.setForeground(SystemColor.textHighlight);
			btnAjouterClientParticulier.setBounds(220, 150, 230, 36);
			frame.getContentPane().add(btnAjouterClientParticulier);
			
			JButton btnAjouterClientProfessionnel = new JButton("Ajouter client professionnel");
			btnAjouterClientProfessionnel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AjouterClientProfessionnel(); 
				}
			});
			btnAjouterClientProfessionnel.setForeground(SystemColor.textHighlight);
			btnAjouterClientProfessionnel.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAjouterClientProfessionnel.setBounds(220, 200, 230, 36);
			frame.getContentPane().add(btnAjouterClientProfessionnel);
			
			JLabel lblGestionDeProtefeuille = new JLabel("Gestion de portefeuille clients");
			lblGestionDeProtefeuille.setHorizontalAlignment(SwingConstants.CENTER);
			lblGestionDeProtefeuille.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblGestionDeProtefeuille.setBounds(233, 82, 213, 14);
			frame.getContentPane().add(lblGestionDeProtefeuille);
			
			JButton btnAfficherMonPortefeuilleClients = new JButton("Afficher mon portefeuille clients");
			btnAfficherMonPortefeuilleClients.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//new AfficherMonPortefeuille(); 
					
				}
			});
			btnAfficherMonPortefeuilleClients.setForeground(SystemColor.textHighlight);
			btnAfficherMonPortefeuilleClients.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnAfficherMonPortefeuilleClients.setBounds(210, 250, 258, 36);
			frame.getContentPane().add(btnAfficherMonPortefeuilleClients);
			
	}
}
