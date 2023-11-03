package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ventana1 extends JFrame  implements ActionListener {

	private JPanel contentPane;
	JLabel etiNombre;
	JButton btnOcultarCiudad;
	JButton btnVisuNombre;
	JButton btnOcultarNombre;
	JLabel etiCiudad;
	JButton btnVisuCiudad ;
	
	public ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("JHON JURADO");
		etiNombre.setForeground(new Color(25, 25, 112));
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiNombre.setBounds(266, 35, 127, 14);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("ARMENIA");
		etiCiudad.setForeground(new Color(25, 25, 112));
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiCiudad.setBounds(471, 35, 127, 14);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setForeground(new Color(255, 255, 255));
		btnOcultarNombre.setBackground(new Color(0, 128, 128));
		btnOcultarNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnOcultarNombre.setBounds(313, 82, 208, 46);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setForeground(new Color(255, 255, 255));
		btnVisuNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVisuNombre.setBackground(new Color(0, 139, 139));
		btnVisuNombre.setBounds(313, 161, 208, 46);
		contentPane.add(btnVisuNombre);
		btnVisuNombre.addActionListener(this);
		
		 btnOcultarCiudad = new JButton("Ocultar ciudad");
		btnOcultarCiudad.setForeground(new Color(255, 255, 255));
		btnOcultarCiudad.setBackground(new Color(0, 139, 139));
		btnOcultarCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));	
		btnOcultarCiudad.setBounds(313, 245, 208, 46);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		btnVisuCiudad = new JButton("Visualizar ciudad");
		btnVisuCiudad.setForeground(new Color(255, 255, 255));
		btnVisuCiudad.setBackground(new Color(0, 139, 139));
		btnVisuCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVisuCiudad.setBounds(313, 318, 208, 46);
		contentPane.add(btnVisuCiudad);
		btnVisuCiudad.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnOcultarNombre ) {
			
			etiNombre.setVisible(false);
			
			
		}else if(e.getSource() == btnVisuNombre) {
			
			etiNombre.setVisible(true);
			
		}else if( e.getSource() == btnOcultarCiudad) {
			
			etiCiudad.setVisible(false);
			
		}else if(e.getSource() == btnVisuCiudad) {
			
			etiCiudad.setVisible(true);
			
		}
		
	}
	
	
	
}
