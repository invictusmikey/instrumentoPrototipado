package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ventana4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	JLabel txtFrase ;
	JButton btnAceptar;
	JButton btnDesactivar;
	JButton btnActivar;
	

	
	public ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1256, 654);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Verdana", Font.PLAIN, 22));
		txtNombre.setBounds(381, 63, 388, 64);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Verdana", Font.PLAIN, 22));
		txtCiudad.setBounds(381, 174, 388, 64);
		contentPane.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtFrase = new JLabel("\"\"");
		txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrase.setFont(new Font("Verdana", Font.PLAIN, 30));
		txtFrase.setBounds(57, 294, 1047, 94);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAceptar.setBounds(189, 484, 152, 37);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnDesactivar.setBounds(473, 484, 152, 37);
		contentPane.add(btnDesactivar);
		btnDesactivar.addActionListener(this);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnActivar.setBounds(799, 484, 152, 37);
		contentPane.add(btnActivar);
		btnActivar.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAceptar) {
			
			txtFrase.setText("se llama "+txtNombre.getText()+" vive en "+txtCiudad.getText());
			
		}else if(e.getSource() == btnDesactivar) {
			
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
			
		}else if (e.getSource() == btnActivar) {
			
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
			
		}
		
	}
}
