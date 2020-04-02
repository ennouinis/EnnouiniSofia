package myViews;

import java.awt.EventQueue;

import javax.swing.JFrame;

import maPremiereApplicationBancaire.CProfessionnel;

import javax.swing.JButton;
import java.awt.Font;
//import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class AjouterClientProfessionnel {

	private JFrame frame;
	private JTextField nom;
	private JTextField adresse;
	private JTextField codePostal;
	private JTextField ville;
	private JTextField nSIRET;
	private JTextField activitePrincipale;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterClientProfessionnel window = new AjouterClientProfessionnel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AjouterClientProfessionnel() {
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
		lblBanqueAnnecienne.setBounds(221, 25, 240, 36);
		frame.getContentPane().add(lblBanqueAnnecienne);
		
		JLabel lblNomComplet = new JLabel("Nom complet");
		lblNomComplet.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomComplet.setBounds(41, 128, 102, 23);
		frame.getContentPane().add(lblNomComplet);
		
		nom = new JTextField();
		nom.setBounds(148, 129, 175, 20);
		frame.getContentPane().add(nom);
		nom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse.setBounds(41, 173, 102, 23);
		frame.getContentPane().add(lblAdresse);
		
		adresse = new JTextField();
		adresse.setColumns(10);
		adresse.setBounds(148, 174, 287, 20);
		frame.getContentPane().add(adresse);
		
		JLabel lblCrerUnNouveau = new JLabel("Créer un nouveau client professionnel ");
		lblCrerUnNouveau.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrerUnNouveau.setBounds(221, 72, 227, 36);
		frame.getContentPane().add(lblCrerUnNouveau);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		lblCodePostal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCodePostal.setBounds(41, 222, 102, 23);
		frame.getContentPane().add(lblCodePostal);
		
		codePostal = new JTextField();
		codePostal.setColumns(10);
		codePostal.setBounds(148, 223, 175, 20);
		frame.getContentPane().add(codePostal);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVille.setBounds(41, 275, 102, 23);
		frame.getContentPane().add(lblVille);
		
		ville = new JTextField();
		ville.setColumns(10);
		ville.setBounds(148, 276, 175, 20);
		frame.getContentPane().add(ville);
		
		JLabel lblNumroDeSiret = new JLabel("Num\u00E9ro SIRET");
		lblNumroDeSiret.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumroDeSiret.setBounds(41, 326, 102, 23);
		frame.getContentPane().add(lblNumroDeSiret);
		
		nSIRET = new JTextField();
		nSIRET.setColumns(10);
		nSIRET.setBounds(148, 327, 175, 20);
		frame.getContentPane().add(nSIRET);
		
		JLabel lblActivitPrincipale = new JLabel("Activité principale");
		lblActivitPrincipale.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivitPrincipale.setBounds(41, 373, 102, 23);
		frame.getContentPane().add(lblActivitPrincipale);
		
		activitePrincipale = new JTextField();
		activitePrincipale.setColumns(10);
		activitePrincipale.setBounds(148, 374, 175, 20);
		frame.getContentPane().add(activitePrincipale);
		
		JButton btnCrer = new JButton("Valider");
		btnCrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CProfessionnel cpro = new CProfessionnel (nom.getText(),adresse.getText(),
					       ville.getText(), Integer.parseInt(codePostal.getText()), Integer.parseInt(nSIRET.getText()), activitePrincipale.getText());
				} catch (NumberFormatException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} 
			}
		});
		btnCrer.setForeground(new Color(0, 102, 255));
		btnCrer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCrer.setBounds(161, 448, 144, 36);
		frame.getContentPane().add(btnCrer);
		
		JButton btnRinitialiser = new JButton("Réinitialiser");
		btnRinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nom.setText("");
				adresse.setText("");
				codePostal.setText("");
				ville.setText("");
				nSIRET.setText("");
				activitePrincipale.setText("");
				
				
			}
		});
		btnRinitialiser.setForeground(new Color(0, 102, 255));
		btnRinitialiser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnRinitialiser.setBounds(366, 448, 132, 36);
		frame.getContentPane().add(btnRinitialiser);
	}
}
