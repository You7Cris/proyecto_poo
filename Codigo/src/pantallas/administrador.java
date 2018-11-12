package pantallas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
    // frame 
    static JFrame f; 
  
    // label to diaplay text 
    static JLabel l; 
  
    // default constructor 
    void text() 
    { 
    } 
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
			
		JLabel crearCuenta = new JLabel("Crear cuentas");
		crearCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				crearCuenta.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				crearCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
			}
		});
		crearCuenta.setFont(new Font("Roboto", Font.BOLD, 20));
		crearCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		crearCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		crearCuenta.setBounds(258, 86, 258, 230);
		funciones.add(crearCuenta);
		
		JLabel modificarCuenta = new JLabel("Modificar cuentas");
		modificarCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				modificarCuenta.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				modificarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
			}
		});
		modificarCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		modificarCuenta.setFont(new Font("Roboto", Font.BOLD, 20));
		modificarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		modificarCuenta.setBounds(516, 86, 258, 230);
		funciones.add(modificarCuenta);
		
		JLabel eliminarCuenta = new JLabel("Eliminar cuentas");
		eliminarCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				eliminarCuenta.setBorder(new LineBorder(new Color(192, 192, 192), 2));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				eliminarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
			}
		});
		eliminarCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		eliminarCuenta.setFont(new Font("Roboto", Font.BOLD, 20));
		eliminarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		eliminarCuenta.setBounds(774, 86, 258, 230);

		
		funciones.add(eliminarCuenta);
	}
}
