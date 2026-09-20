package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblBienvenida;
	private JButton btnCliente;
	private JButton btnMascota;
	private JButton btnVeterinario;
	private JButton btnCita;
	private JLabel lblFrase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Menú principal de registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 400);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTitulo = new JLabel("MENU PRINCIPAL DE REGISTROS - VETERINARIA LP");
			lblTitulo.setForeground(new Color(0, 128, 255));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 22));
			lblTitulo.setBounds(23, 11, 586, 48);
			contentPane.add(lblTitulo);
		}
		{
			lblBienvenida = new JLabel("¡Hola! Veterinaria LP le da la bienvenida, por favor elija una opción para su registro:");
			lblBienvenida.setForeground(new Color(255, 0, 0));
			lblBienvenida.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBienvenida.setBounds(52, 76, 544, 23);
			contentPane.add(lblBienvenida);
		}
		{
			btnCliente = new JButton("CLIENTE");
			btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnCliente.setBounds(101, 125, 161, 58);
			// Le indicamos que este boton es el listener
			btnCliente.addActionListener(this);
			contentPane.add(btnCliente);
		}
		{
			btnMascota = new JButton("MASCOTA");
			btnMascota.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnMascota.setBounds(357, 125, 161, 58);
			btnMascota.addActionListener(this);
			contentPane.add(btnMascota);
		}
		{
			btnVeterinario = new JButton("VETERINARIO");
			btnVeterinario.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnVeterinario.setBounds(101, 229, 161, 58);
			btnVeterinario.addActionListener(this);
			contentPane.add(btnVeterinario);
		}
		{
			btnCita = new JButton("CITA");
			btnCita.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnCita.setBounds(357, 229, 161, 58);
			btnCita.addActionListener(this);
			contentPane.add(btnCita);
		}
		{
			lblFrase = new JLabel("Ser veterinario es amar la vida en todas sus formas :D");
			lblFrase.setForeground(new Color(0, 128, 64));
			lblFrase.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
			lblFrase.setBounds(125, 310, 376, 40);
			contentPane.add(lblFrase);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCliente) {
			VentanaCliente ventanaCliente = new VentanaCliente();
			ventanaCliente.setVisible(true);
		}
		else if(e.getSource()==btnMascota) {
			VentanaMascota ventanaMascota = new VentanaMascota();
			ventanaMascota.setVisible(true);
		}
		else if(e.getSource()==btnVeterinario) {
			VentanaVeterinario ventanaVeterinario = new VentanaVeterinario();
			ventanaVeterinario.setVisible(true);
		}
		else if(e.getSource()==btnCita) {
			VentanaCita ventanaCita = new VentanaCita();
			ventanaCita.setVisible(true);
		}
		
	}
}
