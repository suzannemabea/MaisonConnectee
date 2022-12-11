import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Fenetre {

	private JFrame frame;
	private JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre window = new Fenetre();
					window.frame.setTitle("SMART HOME APP");
					window.frame.setVisible(true);
					//window.frame2.setTitle("SMART HOME APP");
					//window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame2=new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JButton btnCrScenario = new JButton("Créer Un Scénario");
		btnCrScenario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[] optionsToChoose = {"Allumer la Télé", "Eteindre la Télé", "Afficher la Température","Ouvrir les portes"};
				JComboBox<String> liste = new JComboBox<>(optionsToChoose);
				liste.setBounds(150, 50, 150, 30);

				JButton jButton = new JButton("Done");
				jButton.setBounds(170, 140, 100, 20);
				frame2.add(jButton);
		        frame2.add(liste);
		        
		        frame2.setLayout(null);
		        frame2.setSize(350, 250);

				frame2.setBounds(100, 100, 450, 300);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.getContentPane().setLayout(null);
				frame2.setTitle("SMART HOME APP");
		        frame.setVisible(false);
		        frame2.setVisible(true);
		        frame2.setLocationRelativeTo(null);
				frame2.setResizable(false);
				
			}
			
		});
		btnCrScenario.setBounds(34, 118, 145, 32);
		frame.getContentPane().add(btnCrScenario);
		
		JButton btnAjtUnApp = new JButton("Ajouter un Appareil");
		btnAjtUnApp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAjtUnApp.setBounds(226, 118, 145, 32);
		frame.getContentPane().add(btnAjtUnApp);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO OUR SMARTHOME");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(92, 52, 241, 32);
		frame.getContentPane().add(lblNewLabel);
	}
}
