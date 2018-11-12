package pantallas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

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
		
		JPanel funciones = new JPanel();
		funciones.setBackground(Color.WHITE);
		funciones.setForeground(Color.WHITE);
		funciones.setBounds(0, 0, 1264, 681);
		administrador.getContentPane().add(funciones);
		funciones.setLayout(null);
		
		JLabel lblArtistas = new JLabel("Artistas");
		lblArtistas.setFont(new Font("Roboto", Font.BOLD, 20));
		lblArtistas.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtistas.setBounds(54, 82, 258, 230);
		funciones.add(lblArtistas);
	}
}
