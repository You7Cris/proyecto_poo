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

import com.mysql.jdbc.ResultSetMetaData;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
					administrador window = new administrador("");
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
	public administrador(String id_usuario) {
		initialize(id_usuario);
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
	private void initialize(String id_usuario) {
		administrador = new JFrame();
		administrador.setTitle("Inicio Administrador");
		administrador.getContentPane().setBackground(Color.WHITE);
		administrador.setResizable(false);
		administrador.setBounds(100, 100, 1280, 720);
		administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		administrador.getContentPane().setLayout(null);
		
		JPanel funciones = new JPanel();
		funciones.setBackground(new Color(244, 248, 247));
		funciones.setForeground(Color.GREEN);
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
		crearCuenta.setBackground(Color.WHITE);
		crearCuenta.setOpaque(true);
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
		modificarCuenta.setBackground(Color.WHITE);
		modificarCuenta.setOpaque(true);
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
		eliminarCuenta.setBackground(Color.WHITE);
		eliminarCuenta.setOpaque(true);
		eliminarCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		eliminarCuenta.setFont(new Font("Roboto", Font.BOLD, 20));
		eliminarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		eliminarCuenta.setBounds(774, 86, 258, 230);

		
		funciones.add(eliminarCuenta);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.RED);
		menuBar.setBackground(Color.RED);
		menuBar.setBounds(0, 0, 1285, 75);
		funciones.add(menuBar);
		
		JMenuItem mntmNombreDelAdministrador = new JMenuItem("");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			
			int n_id_usuario = Integer.parseInt(id_usuario);
			
			if(conexion != null) {		
				ResultSet resultSet =statement.executeQuery("select nombres from usuario where id_usuario='"+n_id_usuario+"';");
				
				resultSet.next();
				ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
		    	mntmNombreDelAdministrador.setText(resultSet.getString(1));
		    	conexion.close();						
				
				//if(validacion) {
						//if(id_permiso_consulta.equals("1")) {
						//	administrador window2 = new administrador(id_usuario);
						//	window2.administrador.setVisible(true);
							//inicio.dispose();												
					//	}
				//}
			}
			
		} catch(ClassNotFoundException o) {
			// TODO Auto-generated catch block
			o.printStackTrace();
		} catch (SQLException l) {
			// TODO Auto-generated catch block
			l.printStackTrace();					
		}
		menuBar.add(mntmNombreDelAdministrador);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mntmCerrarSesion.setBackground(Color.WHITE);
		menuBar.add(mntmCerrarSesion);
	}
}
