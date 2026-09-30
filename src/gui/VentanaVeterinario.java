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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import clases.Veterinaria;
import datos.Datos;

public class VentanaVeterinario extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblTexto;
	private JLabel lblNombre;
	private JLabel lblEspecialidad;
	private JLabel lblTelefono;
	private JTextField txtNombre;
	private JTextField txtEspecialidad;
	private JTextField txtTelefono;
	private JButton btnRegistrarVet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVeterinario frame = new VentanaVeterinario();
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
	public VentanaVeterinario() {
		setTitle("Registro de Veterinarios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblTitulo = new JLabel("REGISTRO DE VETERINARIOS");
			lblTitulo.setForeground(new Color(0, 128, 255));
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setBounds(81, 11, 370, 33);
			contentPane.add(lblTitulo);
		}
		{
			lblTexto = new JLabel("Ingrese los datos del veterinario:");
			lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTexto.setBounds(50, 55, 191, 14);
			contentPane.add(lblTexto);
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(255, 0, 0));
			lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNombre.setBounds(81, 96, 85, 23);
			contentPane.add(lblNombre);
		}
		{
			lblEspecialidad = new JLabel("Especialidad:");
			lblEspecialidad.setForeground(Color.RED);
			lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblEspecialidad.setBounds(299, 96, 85, 23);
			contentPane.add(lblEspecialidad);
		}
		{
			lblTelefono = new JLabel("Teléfono:");
			lblTelefono.setForeground(Color.RED);
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblTelefono.setBounds(81, 149, 85, 23);
			contentPane.add(lblTelefono);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(80, 118, 179, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtEspecialidad = new JTextField();
			txtEspecialidad.setColumns(10);
			txtEspecialidad.setBounds(298, 118, 153, 20);
			contentPane.add(txtEspecialidad);
		}
		{
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(81, 173, 100, 20);
			contentPane.add(txtTelefono);
		}
		{
			btnRegistrarVet = new JButton("Registrar");
			btnRegistrarVet.addActionListener(this);
			btnRegistrarVet.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRegistrarVet.setBounds(195, 229, 113, 30);
			contentPane.add(btnRegistrarVet);
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrarVet) {
			do_btnRegistrarVet_actionPerformed(e);
		}
	}
	protected void do_btnRegistrarVet_actionPerformed(ActionEvent e) {
		String nombre = txtNombre.getText();
        String especialidad = txtEspecialidad.getText();
        String telefono = txtTelefono.getText();
        
        if(txtNombre.getText().isEmpty() || txtEspecialidad.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
        	JOptionPane.showMessageDialog(null, "Debe completar todos los cambios");
        	return;
        }
        
        Veterinaria veterinario = new Veterinaria(nombre, especialidad, telefono);
        
        Datos.veterinarios.add(veterinario);
        
        JOptionPane.showMessageDialog(null, "Veterinario registrado correctamente");
	}
}
