package pantallas;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JTextField;

public class inicio {

	private JFrame frame;
	private JTextField usuario;
	private JTextField contrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
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
	public inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_izquierdo = new JPanel();
		panel_izquierdo.setBackground(new Color(58,177,155));
		panel_izquierdo.setBounds(0, 0, 640, 681);
		frame.getContentPane().add(panel_izquierdo);
		panel_izquierdo.setLayout(null);
		
		JLabel lblBienvenidoDeNuevo = new JLabel("Bienvenido de nuevo!");
		lblBienvenidoDeNuevo.setBounds(87, 238, 460, 52);
		lblBienvenidoDeNuevo.setFont(new Font("Roboto", Font.BOLD, 44));
		lblBienvenidoDeNuevo.setForeground(Color.WHITE);
		panel_izquierdo.add(lblBienvenidoDeNuevo);
		
		JTextArea txtrIngresaTusCredenciales = new JTextArea();
		txtrIngresaTusCredenciales.setForeground(Color.WHITE);
		txtrIngresaTusCredenciales.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtrIngresaTusCredenciales.setText("Ingresa tus credenciales para ingresar a la plataforma.");
		txtrIngresaTusCredenciales.setBounds(113, 301, 415, 30);
		txtrIngresaTusCredenciales.setLineWrap(true);
		txtrIngresaTusCredenciales.setWrapStyleWord(true);
		txtrIngresaTusCredenciales.setOpaque(false);
		txtrIngresaTusCredenciales.setEditable(false);
		panel_izquierdo.add(txtrIngresaTusCredenciales);
		
		JPanel panel_derecho = new JPanel();
		panel_derecho.setBackground(Color.WHITE);
		panel_derecho.setBounds(640, 0, 626, 681);
		frame.getContentPane().add(panel_derecho);
		panel_derecho.setLayout(null);
		
		usuario = new JTextField();
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setText("usuario");
		usuario.setBounds(159, 236, 355, 61);
		panel_derecho.add(usuario);
		usuario.setColumns(10);
		
		contrasena = new JTextField();
		contrasena.setHorizontalAlignment(SwingConstants.CENTER);
		contrasena.setText("contrase\u00F1a");
		contrasena.setColumns(10);
		contrasena.setBounds(159, 328, 355, 61);
		panel_derecho.add(contrasena);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setBounds(260, 455, 147, 37);
		btnIngresar.setBackground(new Color(58,177,155));
		panel_derecho.add(btnIngresar);
	}
}

