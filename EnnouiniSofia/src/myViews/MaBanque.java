package myViews;

import java.awt.EventQueue;

import javax.swing.JFrame;

import maPremiereApplicationBancaire.CProfessionnel;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class MaBanque {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaBanque window = new MaBanque();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MaBanque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		  frame.setTitle("BANQUE ANNECIENNE");

		  frame.setSize(700, 700);
		  frame.setLocationRelativeTo(null);

		
		  //frame.setBounds(100, 100, 450, 300);
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
		
		textField = new JTextField();
		textField.setBounds(148, 129, 175, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse.setBounds(41, 173, 102, 23);
		frame.getContentPane().add(lblAdresse);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 174, 287, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblCrerUnNouveau = new JLabel("Cr\u00E9er un nouveau client professionnel ");
		lblCrerUnNouveau.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrerUnNouveau.setBounds(221, 72, 227, 36);
		frame.getContentPane().add(lblCrerUnNouveau);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		lblCodePostal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCodePostal.setBounds(41, 222, 102, 23);
		frame.getContentPane().add(lblCodePostal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 223, 175, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVille.setBounds(41, 275, 102, 23);
		frame.getContentPane().add(lblVille);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 276, 175, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNumroDeSiret = new JLabel("Num\u00E9ro SIRET");
		lblNumroDeSiret.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumroDeSiret.setBounds(41, 326, 102, 23);
		frame.getContentPane().add(lblNumroDeSiret);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 327, 175, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblActivitPrincipale = new JLabel("Activit\u00E9 principale");
		lblActivitPrincipale.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblActivitPrincipale.setBounds(41, 373, 102, 23);
		frame.getContentPane().add(lblActivitPrincipale);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(148, 374, 175, 20);
		frame.getContentPane().add(textField_5);
		
		JButton btnCrer = new JButton("Cr\u00E9er");
		btnCrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrer.setForeground(new Color(0, 102, 255));
		btnCrer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCrer.setBounds(161, 448, 144, 36);
		frame.getContentPane().add(btnCrer);
		
		JButton btnRinitialiser = new JButton("Réinitialiser");
		btnRinitialiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.removeAll();
				
			}
		});
		btnRinitialiser.setForeground(new Color(0, 102, 255));
		btnRinitialiser.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnRinitialiser.setBounds(366, 448, 132, 36);
		frame.getContentPane().add(btnRinitialiser);
	}
}
