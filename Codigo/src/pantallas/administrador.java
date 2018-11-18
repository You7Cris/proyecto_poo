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
import javax.swing.table.TableModel;

import com.mysql.jdbc.ResultSetMetaData;

import net.proteanit.sql.DbUtils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSeparator;

public class administrador {

	private static final TableModel DBUtils = null;

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
    private JTable tableUsuario;
  
    // default constructor 
    void text() 
    { 
    } 
	private void initialize(String id_usuario) {
		administrador = new JFrame();
		administrador.setTitle("");
		administrador.getContentPane().setBackground(Color.WHITE);
		administrador.setResizable(false);
		administrador.setBounds(100, 100, 1280, 720);
		administrador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		administrador.getContentPane().setLayout(null);

		
		JPanel funciones = new JPanel();
		JPanel panelCrearCuenta = new JPanel();
		
		
		
		
		
		funciones.setBackground(new Color(244, 248, 247));
		funciones.setForeground(Color.GREEN);
		funciones.setBounds(0, 0, 1264, 681);
		administrador.getContentPane().add(funciones);
		funciones.setLayout(null);
		
		
		JLabel nombreTienda = new JLabel("");
		nombreTienda.setFont(new Font("Tahoma", Font.BOLD, 25));
		nombreTienda.setForeground(new Color(58,177,155));
		nombreTienda.setHorizontalAlignment(SwingConstants.CENTER);
		nombreTienda.setBounds(447, 11, 393, 69);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			if(conexion != null & id_usuario.length() != 0) {		
				ResultSet resultSet =statement.executeQuery("select nombre_tienda from tienda INNER JOIN usuario_tienda on usuario_tienda.id_usuario='"+id_usuario+"';");
				
				resultSet.next();
				ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
				nombreTienda.setText("Tienda:  "+resultSet.getString(1).toUpperCase());
				conexion.close();						
			}
			
		} catch(ClassNotFoundException o) {o.printStackTrace();	} catch (SQLException l) {l.printStackTrace();}
		funciones.add(nombreTienda);
		
		
		
		
		JLabel verCuentas = new JLabel("Ver cuentas");
		verCuentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(false);
				panelCrearCuenta.setVisible(true);
			}
		});
		verCuentas.setBackground(Color.WHITE);
		verCuentas.setOpaque(true);
		verCuentas.setFont(new Font("Roboto", Font.BOLD, 20));
		verCuentas.setHorizontalAlignment(SwingConstants.CENTER);
		verCuentas.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		verCuentas.setBounds(258, 152, 258, 230);
		funciones.add(verCuentas);
		
		JLabel modificarCuenta = new JLabel("Modificar cuenta");
		modificarCuenta.setBackground(Color.WHITE);
		modificarCuenta.setOpaque(true);
		modificarCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		modificarCuenta.setFont(new Font("Roboto", Font.BOLD, 20));
		modificarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		modificarCuenta.setBounds(516, 152, 258, 230);
		funciones.add(modificarCuenta);
		
		JLabel eliminarCuenta = new JLabel("Eliminar cuentas");
		eliminarCuenta.setBackground(Color.WHITE);
		eliminarCuenta.setOpaque(true);
		eliminarCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		eliminarCuenta.setFont(new Font("Roboto", Font.BOLD, 20));
		eliminarCuenta.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		eliminarCuenta.setBounds(774, 152, 258, 230);	
		funciones.add(eliminarCuenta);

		
		
		
		
		
		
		
		panelCrearCuenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelCrearCuenta.setVisible(false);
				funciones.setVisible(true);
			}
		});
		panelCrearCuenta.setBounds(0, 0, 1264, 681);
		administrador.getContentPane().add(panelCrearCuenta);
		panelCrearCuenta.setBackground(Color.RED);
		
		JScrollPane scrollPane = new JScrollPane();
		panelCrearCuenta.add(scrollPane);
		
		tableUsuario = new JTable();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			if(conexion != null & id_usuario.length() != 0) {		
				ResultSet resultSet =statement.executeQuery("select id_usuario,nombres,user,descripcion from usuario INNER JOIN permiso ON usuario.id_usuario=permiso.id_permiso;");				
				//ResultSet resultSet =statement.executeQuery("select * from eps;");				
				tableUsuario.setModel(DbUtils.resultSetToTableModel(resultSet));
				conexion.close();						
			}
			
		} catch(ClassNotFoundException o) {o.printStackTrace();	} catch (SQLException l) {l.printStackTrace();}
		scrollPane.setViewportView(tableUsuario);
		
		
		
		int id_permiso=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
			Statement statement = conexion.createStatement();
			if(conexion != null & id_usuario.length() != 0) {		
				ResultSet resultSet =statement.executeQuery("select nombres,id_permiso from usuario where id_usuario='"+id_usuario+"';");
				
				resultSet.next();
				ResultSetMetaData rsmd = (ResultSetMetaData) resultSet.getMetaData();
		    	administrador.setTitle("Bienvenido "+resultSet.getString(1));
		    	id_permiso = Integer.parseInt(resultSet.getString(2));
		    	conexion.close();						
			}
			
		}catch(ClassNotFoundException o) {o.printStackTrace();	} catch (SQLException l) {l.printStackTrace();}
		
		
		if(id_permiso!=1) {												
			administrador.dispose();
			administrador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			administrador=null;
			inicio window = new inicio();
			window.inicio.setVisible(true);
		}
		
	}
}
