package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblTexto;
	private JLabel lblNombre;
	private JLabel lblTelefono;
	private JLabel lblDireccion;
	private JLabel lblDocumento;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDocumento;
	private JTextField txtDireccion;
	private JButton btnRegistrarCli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente frame = new VentanaCliente();
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
	public VentanaCliente() {
		setTitle("Registro de Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTitulo = new JLabel("REGISTRO DE CLIENTES");
			lblTitulo.setForeground(new Color(0, 128, 255));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblTitulo.setBounds(94, 11, 322, 38);
			contentPane.add(lblTitulo);
		}
		{
			lblTexto = new JLabel("Ingrese los datos del cliente:");
			lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTexto.setBounds(48, 63, 179, 14);
			contentPane.add(lblTexto);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(255, 0, 0));
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNombre.setBounds(49, 88, 72, 23);
			contentPane.add(lblNombre);
		}
		{
			lblTelefono = new JLabel("Teléfono:");
			lblTelefono.setForeground(Color.RED);
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTelefono.setBounds(319, 88, 72, 23);
			contentPane.add(lblTelefono);
		}
		{
			lblDireccion = new JLabel("Dirección:");
			lblDireccion.setForeground(Color.RED);
			lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblDireccion.setBounds(49, 142, 72, 23);
			contentPane.add(lblDireccion);
		}
		{
			lblDocumento = new JLabel("DNI:");
			lblDocumento.setForeground(Color.RED);
			lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblDocumento.setBounds(319, 142, 72, 23);
			contentPane.add(lblDocumento);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(48, 111, 200, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtTelefono = new JTextField();
			txtTelefono.setBounds(319, 111, 86, 20);
			contentPane.add(txtTelefono);
			txtTelefono.setColumns(10);
		}
		{
			txtDocumento = new JTextField();
			txtDocumento.setColumns(10);
			txtDocumento.setBounds(319, 164, 86, 20);
			contentPane.add(txtDocumento);
		}
		{
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(48, 164, 200, 20);
			contentPane.add(txtDireccion);
		}
		{
			btnRegistrarCli = new JButton("Registrar");
			btnRegistrarCli.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRegistrarCli.setBounds(205, 219, 113, 30);
			contentPane.add(btnRegistrarCli);
		}

	}
}
