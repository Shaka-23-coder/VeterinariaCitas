package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaMascota extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblTexto;
	private JLabel lblNombre;
	private JLabel lblEspecie;
	private JLabel lblRaza;
	private JLabel lblEdad;
	private JTextField txtNombre;
	private JTextField txtEspecie;
	private JTextField txtRaza;
	private JTextField txtEdad;
	private JButton btnRegistrarMas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMascota frame = new VentanaMascota();
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
	public VentanaMascota() {
		setTitle("Registro de Mascotas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTitulo = new JLabel("REGISTRO DE MASCOTAS");
			lblTitulo.setForeground(new Color(0, 128, 255));
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setBounds(81, 11, 370, 33);
			contentPane.add(lblTitulo);
		}
		{
			lblTexto = new JLabel("Ingrese los datos del cliente:");
			lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTexto.setBounds(50, 55, 191, 14);
			contentPane.add(lblTexto);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(255, 0, 0));
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNombre.setBounds(99, 96, 85, 23);
			contentPane.add(lblNombre);
		}
		{
			lblEspecie = new JLabel("Especie:");
			lblEspecie.setForeground(Color.RED);
			lblEspecie.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblEspecie.setBounds(297, 96, 85, 23);
			contentPane.add(lblEspecie);
		}
		{
			lblRaza = new JLabel("Raza:");
			lblRaza.setForeground(Color.RED);
			lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblRaza.setBounds(99, 151, 85, 23);
			contentPane.add(lblRaza);
		}
		{
			lblEdad = new JLabel("Edad:");
			lblEdad.setForeground(Color.RED);
			lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblEdad.setBounds(297, 151, 85, 23);
			contentPane.add(lblEdad);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(98, 120, 86, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtEspecie = new JTextField();
			txtEspecie.setColumns(10);
			txtEspecie.setBounds(296, 120, 86, 20);
			contentPane.add(txtEspecie);
		}
		{
			txtRaza = new JTextField();
			txtRaza.setColumns(10);
			txtRaza.setBounds(99, 178, 86, 20);
			contentPane.add(txtRaza);
		}
		{
			txtEdad = new JTextField();
			txtEdad.setColumns(10);
			txtEdad.setBounds(297, 178, 86, 20);
			contentPane.add(txtEdad);
		}
		{
			btnRegistrarMas = new JButton("Registrar");
			btnRegistrarMas.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRegistrarMas.setBounds(195, 229, 113, 30);
			contentPane.add(btnRegistrarMas);
		}

	}

}
