package myViews;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class AfficherMonPortefeuilleClients {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherMonPortefeuilleClients window = new AfficherMonPortefeuilleClients();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public AfficherMonPortefeuilleClients() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setTitle("BANQUE ANNECIENNE");
		  frame.setSize(1000, 700);
		  frame.setLocationRelativeTo(null);
		 //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.getContentPane().setLayout(null);
		  frame.setVisible(true);
	}

}
