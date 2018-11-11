package pantallas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;

public class administrador {

	JFrame administrador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administrador window = new administrador();
					window.administrador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public administrador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		administrador = new JFrame();
		administrador.setTitle("Inicio Administrador");
		administrador.getContentPane().setBackground(Color.WHITE);
		administrador.setResizable(false);
		administrador.setBounds(100, 100, 1280, 720);
		administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		administrador.getContentPane().setLayout(null);
		
		JMenuBar menuSuperior = new JMenuBar();
		administrador.setJMenuBar(menuSuperior);
		
		JMenu dropGestion = new JMenu("Gestion");
		dropGestion.setFont(new Font("Roboto", Font.BOLD, 20));
		menuSuperior.add(dropGestion);
		
		JMenuItem artistas = new JMenuItem("Artistas");
		dropGestion.add(artistas);
		
		JMenuItem canciones = new JMenuItem("Canciones");
		dropGestion.add(canciones);
		
		JMenuItem generos = new JMenuItem("Generos");
		dropGestion.add(generos);
		
		JMenuItem disquera = new JMenuItem("Disquera");
		dropGestion.add(disquera);
	}
}
