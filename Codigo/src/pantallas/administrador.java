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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;

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
    private JTable tableUsuario;
    private JTextField nuevoNombre;
    private JTextField nuevoUsuario;
    private JTextField nuevoContrasena;
  
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
		JPanel panelGestionCuentas = new JPanel();
		
				
				
				
				
				
				
				
				panelGestionCuentas.setBounds(0, 0, 1264, 681);
				administrador.getContentPane().add(panelGestionCuentas);
				
						panelGestionCuentas.setBackground(new Color(244, 248, 247));
						panelGestionCuentas.setLayout(null);
						
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setBounds(584, 28, 646, 598);
						panelGestionCuentas.add(scrollPane);
						
						tableUsuario = new JTable();
						scrollPane.setViewportView(tableUsuario);
						
						JLabel lblRegistrarUsuario = new JLabel("Registrar usuario");
						lblRegistrarUsuario.setBounds(47, 60, 191, 53);
						lblRegistrarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
						lblRegistrarUsuario.setFont(new Font("Roboto", Font.BOLD, 20));
						panelGestionCuentas.add(lblRegistrarUsuario);
						
						nuevoNombre = new JTextField();
						nuevoNombre.setText("Nombre completo");
						nuevoNombre.setBounds(106, 126, 248, 35);
						nuevoNombre.addFocusListener(new FocusAdapter() {
							@Override
							public void focusGained(FocusEvent arg0) {
								nuevoNombre.setText("");
							}
						});
						panelGestionCuentas.add(nuevoNombre);
						nuevoNombre.setColumns(10);
						
						nuevoUsuario = new JTextField();
						nuevoUsuario.setText("Usuario");
						nuevoUsuario.setColumns(10);
						nuevoUsuario.setBounds(106, 172, 248, 35);
						nuevoUsuario.addFocusListener(new FocusAdapter() {
							@Override
							public void focusGained(FocusEvent arg0) {
								nuevoUsuario.setText("");
							}
						});
						panelGestionCuentas.add(nuevoUsuario);
						
						nuevoContrasena = new JTextField();
						nuevoContrasena.setText("Contrase\u00F1a");
						nuevoContrasena.setColumns(10);
						nuevoContrasena.setBounds(106, 218, 248, 35);
						nuevoContrasena.addFocusListener(new FocusAdapter() {
							@Override
							public void focusGained(FocusEvent arg0) {
								nuevoContrasena.setText("");
							}
						});
						panelGestionCuentas.add(nuevoContrasena);
						
						JLabel lblRegresar = new JLabel("Regresar");
						lblRegresar.setFont(new Font("Roboto", Font.PLAIN, 15));
						lblRegresar.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								panelGestionCuentas.setVisible(false);
								funciones.setVisible(true);
							}
						});
						lblRegresar.setBounds(10, 11, 85, 24);
						panelGestionCuentas.add(lblRegresar);
						
						JButton btnRegistrarUsuario = new JButton("Registrar");
						btnRegistrarUsuario.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								try {
									java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
									Statement statement = conexion.createStatement();
									String sql = "insert into usuario(nombres,user,pass) values('"+nuevoNombre.getText()+"','"+nuevoUsuario.getText()+"','"+nuevoContrasena.getText()+"');";								
									int resultSet = statement.executeUpdate(sql);
									update_usuarios();
								}catch(SQLException ex) {Logger.getLogger(JTable.class.getName()).log(Level.SEVERE, null, ex);}
							}
						});
						btnRegistrarUsuario.setFont(new Font("Roboto", Font.PLAIN, 10));
						btnRegistrarUsuario.setBounds(402, 172, 117, 35);
						panelGestionCuentas.add(btnRegistrarUsuario);
		
		
		
		
		
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
		
		
		
		
		JLabel gestionCuentas = new JLabel("Gestionar cuentas");
		gestionCuentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				funciones.setVisible(false);
				panelGestionCuentas.setVisible(true);
			}
		});
		gestionCuentas.setBackground(Color.WHITE);
		gestionCuentas.setOpaque(true);
		gestionCuentas.setFont(new Font("Roboto", Font.BOLD, 20));
		gestionCuentas.setHorizontalAlignment(SwingConstants.CENTER);
		gestionCuentas.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		gestionCuentas.setBounds(258, 152, 258, 230);
		funciones.add(gestionCuentas);
		
		JLabel otra1 = new JLabel("otra funcion");
		otra1.setBackground(Color.WHITE);
		otra1.setOpaque(true);
		otra1.setHorizontalAlignment(SwingConstants.CENTER);
		otra1.setFont(new Font("Roboto", Font.BOLD, 20));
		otra1.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		otra1.setBounds(516, 152, 258, 230);
		funciones.add(otra1);
		
		JLabel otra2 = new JLabel("otra funcion");
		otra2.setBackground(Color.WHITE);
		otra2.setOpaque(true);
		otra2.setHorizontalAlignment(SwingConstants.CENTER);
		otra2.setFont(new Font("Roboto", Font.BOLD, 20));
		otra2.setBorder(new LineBorder(new Color(230, 230, 230), 1));
		otra2.setBounds(774, 152, 258, 230);	
		funciones.add(otra2);
		
		//carga la lista de usuario y los pone en la tabla
		try {
			update_usuarios();
		}catch (SQLException l) {l.printStackTrace();}
		
		
		
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
		
		
		/*if(id_permiso!=1) {												
			administrador.dispose();
			administrador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			administrador=null;
			inicio window = new inicio();
			window.inicio.setVisible(true);
		}*/
		
	}
	void update_usuarios() throws SQLException {
		java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo3","root","");
		Statement statement = conexion.createStatement();
		ResultSet resultSet =statement.executeQuery("select Id_usuario ,nombres AS Nombre,user AS Usuario,descripcion AS Tipo_de_usuario from usuario INNER JOIN permiso ON permiso.id_permiso=usuario.id_permiso ORDER BY Tipo_de_usuario;");
		tableUsuario.setModel(DbUtils.resultSetToTableModel(resultSet));
	}
}
