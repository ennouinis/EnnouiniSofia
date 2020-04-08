package myViews;

import maPremiereApplicationBancaire.CParticulier;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;


public class AjouterClientParticulier {

	private JFrame frame;
	private JTextField nom;
	private JTextField age;
	private JTextField adresse;
	private JTextField codePostal;
	private JTextField ville;
	private JTextField nni;
	private JTextField profession;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterClientParticulier window = new AjouterClientParticulier();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AjouterClientParticulier() {
		initialize();
	}

		private void initialize() {
		frame = new JFrame();
		
		  frame.setTitle("BANQUE ANNECIENNE");
		  frame.setSize(1000, 700);
		  frame.setLocationRelativeTo(null);
		 // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.getContentPane().setLayout(null);
		  frame.setVisible(true);
		
		JLabel lblBanqueAnnecienne = new JLabel("BANQUE ANNECIENNE");
		lblBanqueAnnecienne.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblBanqueAnnecienne.setForeground(new Color(0, 102, 255));
		lblBanqueAnnecienne.setBounds(221, 25, 240, 36);
		frame.getContentPane().add(lblBanqueAnnecienne);
		
		JLabel lblNomComplet = new JLabel("Nom complet");
		lblNomComplet.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomComplet.setBounds(50, 130, 102, 23);
		frame.getContentPane().add(lblNomComplet);
		
		nom = new JTextField();
		nom.setBounds(221, 131, 175, 20);
		frame.getContentPane().add(nom);
		nom.setColumns(10);
		
		JLabel lblAge = new JLabel("Âge");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAge.setBounds(50, 170, 102, 23);
		frame.getContentPane().add(lblAge);
		
		age = new JTextField();
		age.setBounds(221, 171, 175, 20);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse.setBounds(50, 210, 102, 23);
		frame.getContentPane().add(lblAdresse);
		
		adresse = new JTextField();
		adresse.setColumns(10);
		adresse.setBounds(221, 211, 175, 20);
		frame.getContentPane().add(adresse);
		
		JLabel lblCrerUnNouveau = new JLabel("Créer un nouveau client particulier ");
		lblCrerUnNouveau.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCrerUnNouveau.setBounds(221, 72, 254, 36);
		frame.getContentPane().add(lblCrerUnNouveau);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		lblCodePostal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCodePostal.setBounds(50, 290, 102, 23);
		frame.getContentPane().add(lblCodePostal);
		
		codePostal = new JTextField();
		codePostal.setColumns(10);
		codePostal.setBounds(221, 291, 175, 20);
		frame.getContentPane().add(codePostal);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVille.setBounds(50, 330, 102, 23);
		frame.getContentPane().add(lblVille);
		
		ville = new JTextField();
		ville.setColumns(10);
		ville.setBounds(221, 331, 175, 20);
		frame.getContentPane().add(ville);
		
		JLabel lblNni = new JLabel("NNI");
		lblNni.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNni.setBounds(50, 250, 102, 23);
		frame.getContentPane().add(lblNni);
		
		nni = new JTextField();
		nni.setColumns(10);
		nni.setBounds(221, 251, 175, 20);
		frame.getContentPane().add(nni);
		
		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProfession.setBounds(50, 370, 102, 23);
		frame.getContentPane().add(lblProfession);
		
		profession = new JTextField();
		profession.setColumns(10);
		profession.setBounds(221, 377, 175, 20);
		frame.getContentPane().add(profession);
		
		JButton btnCreer = new JButton("Créer");
		btnCreer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CParticulier cpart = new CParticulier (nom.getText(),adresse.getText(),
					       ville.getText(), Integer.parseInt(codePostal.getText()), Integer.parseInt(nni.getText()), profession.getText(), Integer.parseInt(age.getText()));
				} catch (NumberFormatException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} 
			}
		});
		btnCreer.setForeground(new Color(0, 102, 255));
		btnCreer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCreer.setBounds(160, 486, 144, 36);
		frame.getContentPane().add(btnCreer);
		
		JButton btnRinitialiser = new JButton("Réinitialiser");
		btnRinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nom.setText("");
				adresse.setText("");
				codePostal.setText("");
				ville.setText("");
				nni.setText("");
				profession.setText("");
				age.setText("");
				
				
			}
		});
		btnRinitialiser.setForeground(new Color(0, 102, 255));
		btnRinitialiser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnRinitialiser.setBounds(362, 486, 132, 36);
		frame.getContentPane().add(btnRinitialiser);
	}
}
