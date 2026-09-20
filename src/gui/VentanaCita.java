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

public class VentanaCita extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	private JLabel lblTexto;
	private JLabel lblFecha;
	private JLabel lblHora;
	private JLabel lblMotivo;
	private JTextField txtFecha;
	private JTextField txtHora;
	private JTextArea textArea;
	private JButton btnRegistrarCit;

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
			lblTexto.setBounds(50, 55, 191, 14);
			contentPane.add(lblTexto);
		}
		{
			lblFecha = new JLabel("Fecha:");
			lblFecha.setForeground(new Color(255, 0, 0));
			lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblFecha.setBounds(79, 80, 85, 23);
			contentPane.add(lblFecha);
		}
		{
			lblHora = new JLabel("Hora:");
			lblHora.setForeground(Color.RED);
			lblHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblHora.setBounds(276, 80, 85, 23);
			contentPane.add(lblHora);
		}
		{
			lblMotivo = new JLabel("Motivo:");
			lblMotivo.setForeground(Color.RED);
			lblMotivo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblMotivo.setBounds(81, 133, 85, 23);
			contentPane.add(lblMotivo);
		}
		{
			txtFecha = new JTextField();
			txtFecha.setBounds(81, 102, 86, 20);
			contentPane.add(txtFecha);
			txtFecha.setColumns(10);
		}
		{
			txtHora = new JTextField();
			txtHora.setColumns(10);
			txtHora.setBounds(275, 103, 86, 20);
			contentPane.add(txtHora);
		}
		{
			textArea = new JTextArea();
			textArea.setBackground(new Color(192, 192, 192));
			textArea.setForeground(new Color(0, 0, 0));
			textArea.setBounds(81, 155, 280, 81);
			contentPane.add(textArea);
		}
		{
			btnRegistrarCit = new JButton("Registrar");
			btnRegistrarCit.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnRegistrarCit.setBounds(204, 247, 113, 30);
			contentPane.add(btnRegistrarCit);
		}

	}
}
