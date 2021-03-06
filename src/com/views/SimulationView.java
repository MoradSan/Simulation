package com.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class SimulationView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimulationView frame = new SimulationView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimulationView() {
		setTitle("Simulation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane paramLoiArrivee = new JTextPane();
		paramLoiArrivee.setBounds(321, 86, 123, 27);
		contentPane.add(paramLoiArrivee);
		
		JButton btnLancer = new JButton("Lancer");
		btnLancer.setBounds(163, 243, 117, 29);
		contentPane.add(btnLancer);
		
		JComboBox<String> comboLoiArrivee = new JComboBox<String>();
		comboLoiArrivee.setModel(new DefaultComboBoxModel<String>(new String[] {"Loi exponentielle", "Loi normale", "Loi de poisson "}));
		comboLoiArrivee.setBounds(108, 86, 123, 27);
		contentPane.add(comboLoiArrivee);
		
		JLabel lblParamtre = new JLabel("paramètre:");
		lblParamtre.setBounds(249, 86, 67, 27);
		contentPane.add(lblParamtre);
		
		JLabel lblNewLabel = new JLabel("arrivée");
		lblNewLabel.setBounds(29, 90, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblService = new JLabel("service");
		lblService.setBounds(29, 145, 61, 16);
		contentPane.add(lblService);
		
		JComboBox<String> comboLoiService = new JComboBox<String>();
		comboLoiService.setModel(new DefaultComboBoxModel<String>(new String[] {"Loi exponentielle", "Loi normale", "Loi de poisson"}));
		comboLoiService.setBounds(108, 141, 123, 27);
		contentPane.add(comboLoiService);
		
		JLabel label = new JLabel("paramètre:");
		label.setBounds(249, 145, 67, 27);
		contentPane.add(label);
		
		JTextPane paramLoiService = new JTextPane();
		paramLoiService.setBounds(321, 141, 123, 27);
		contentPane.add(paramLoiService);
	}
}
