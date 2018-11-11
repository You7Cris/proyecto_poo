package pantallas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class cliente {

	JFrame cliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cliente window = new cliente();
					window.cliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public cliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cliente = new JFrame();
		cliente.setTitle("Inicio Cliente");
		cliente.setBounds(100, 100, 450, 300);
		cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cliente.getContentPane().setBackground(Color.WHITE);
		cliente.setResizable(false);
		cliente.setBounds(100, 100, 1280, 720);
		cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cliente.getContentPane().setLayout(null);
	}

}
