package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import clases.Cita;
import clases.Mascota;
import clases.Veterinaria;
import datos.Datos;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class VentanaCita extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblTexto;
	private JLabel lblFecha;
	private JLabel lblHora;
	private JLabel lblMotivo;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JTextArea txtMotivo;
	private JButton btnRegistrarCit;
	private JLabel lblEstado;
	private JTextField txtEstado;
	private JLabel lblMascota;
	private JLabel lblVeterinario;
	private JComboBox<Mascota> cmbMascota;
	private JComboBox<Veterinaria> cmbVeterinario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCita frame = new VentanaCita();
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
	public VentanaCita() {
		setTitle("Registro de Citas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTitulo = new JLabel("REGISTRO DE CITAS");
			lblTitulo.setForeground(new Color(0, 128, 255));
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setBounds(81, 11, 370, 33);
			contentPane.add(lblTitulo);
		}
		{
			lblTexto = new JLabel("Ingrese los datos de la cita:");
			lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTexto.setBounds(54, 44, 191, 14);
			contentPane.add(lblTexto);
		}
		{
			lblFecha = new JLabel("Fecha:");
			lblFecha.setForeground(new Color(255, 0, 0));
			lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblFecha.setBounds(83, 62, 85, 23);
			contentPane.add(lblFecha);
		}
		{
			lblHora = new JLabel("Hora:");
			lblHora.setForeground(Color.RED);
			lblHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblHora.setBounds(209, 62, 85, 23);
			contentPane.add(lblHora);
		}
		{
			lblMotivo = new JLabel("Motivo:");
			lblMotivo.setForeground(Color.RED);
			lblMotivo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblMotivo.setBounds(83, 157, 85, 23);
			contentPane.add(lblMotivo);
		}
		{
			txtFecha = new JTextField();
			txtFecha.setBounds(85, 84, 86, 20);
			contentPane.add(txtFecha);
			txtFecha.setColumns(10);
		}
		{
			txtHora = new JTextField();
			txtHora.setColumns(10);
			txtHora.setBounds(208, 85, 86, 20);
			contentPane.add(txtHora);
		}
		{
			txtMotivo = new JTextArea();
			txtMotivo.setBackground(new Color(192, 192, 192));
			txtMotivo.setForeground(new Color(0, 0, 0));
			txtMotivo.setBounds(83, 179, 280, 81);
			contentPane.add(txtMotivo);
		}
		{
			btnRegistrarCit = new JButton("Registrar");
			btnRegistrarCit.addActionListener(this);
			btnRegistrarCit.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRegistrarCit.setBounds(206, 271, 113, 30);
			contentPane.add(btnRegistrarCit);
		}
		{
			lblEstado = new JLabel("Estado:");
			lblEstado.setForeground(Color.RED);
			lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblEstado.setBounds(338, 61, 85, 23);
			contentPane.add(lblEstado);
		}
		{
			txtEstado = new JTextField();
			txtEstado.setColumns(10);
			txtEstado.setBounds(337, 84, 86, 20);
			contentPane.add(txtEstado);
		}
		{
			lblMascota = new JLabel("Mascota:");
			lblMascota.setForeground(Color.RED);
			lblMascota.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblMascota.setBounds(29, 106, 85, 23);
			contentPane.add(lblMascota);
		}
		{
			lblVeterinario = new JLabel("Veterinario:");
			lblVeterinario.setForeground(Color.RED);
			lblVeterinario.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblVeterinario.setBounds(267, 106, 85, 23);
			contentPane.add(lblVeterinario);
		}
		{
			cmbMascota = new JComboBox<Mascota>();
			cmbMascota.setBounds(29, 128, 216, 22);
			contentPane.add(cmbMascota);
		}
		{
			cmbVeterinario = new JComboBox<Veterinaria>();
			cmbVeterinario.setBounds(267, 128, 216, 22);
			contentPane.add(cmbVeterinario);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrarCit) {
			do_btnRegistrarCit_actionPerformed(e);
		}
	}
	protected void do_btnRegistrarCit_actionPerformed(ActionEvent e) {
		Mascota mascota = (Mascota) cmbMascota.getSelectedItem();
	    Veterinaria veterinario = (Veterinaria) cmbVeterinario.getSelectedItem();

	    if (mascota == null || veterinario == null) {
	    	JOptionPane.showMessageDialog(null, "Debe seleccionar una mascota y un veterinario");
	    	return;
	    }
	    
	    LocalDate fecha;
	    LocalTime hora;
	    try {
	    	fecha = LocalDate.parse(txtFecha.getText());
	    	hora = LocalTime.parse(txtHora.getText());
	    } catch(DateTimeParseException ex){
	    	JOptionPane.showMessageDialog(null, "La fecha debe tener el formato AAAA-MM-DD y la hora HH:MM");
	    	return;
	    }
	    
	    String motivo = txtMotivo.getText();
	    String estado = txtEstado.getText();
	    
	    if(txtFecha.getText().isEmpty() || txtHora.getText().isEmpty() || txtMotivo.getText().isEmpty() || txtEstado.getText().isEmpty()) {
	    	JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
	    	return;
	    }
	    
	    Cita cita = new Cita(fecha, hora, motivo, estado, mascota, veterinario);
	    
	    Datos.citas.add(cita);
	    
	    JOptionPane.showMessageDialog(null, "Cita registrada correctamente");
	}
}
