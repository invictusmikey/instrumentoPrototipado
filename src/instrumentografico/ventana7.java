package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class ventana7 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiTexto;
	JButton btnAzul;
	JButton btnRojo;
	JButton btnVerde;
	JButton btnFondoAzul;
	JButton btnFondoRojo;
	JButton btnFondoVerde;
	JButton btnTransparente;
	JButton btnOpacar;
	
	

	
	public ventana7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JLabel("Mi Texto");
		etiTexto.setBackground(new Color(70, 130, 180));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiTexto.setBounds(321, 23, 123, 38);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(70, 159, 89, 23);
		contentPane.add(btnAzul);
		btnAzul.addActionListener(this);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(70, 236, 89, 23);
		contentPane.add(btnRojo);
		btnRojo.addActionListener(this);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(70, 313, 89, 23);
		contentPane.add(btnVerde);
		btnVerde.addActionListener(this);
		
		btnFondoAzul = new JButton("Fondo azul");
		btnFondoAzul.setBounds(327, 159, 117, 23);
		contentPane.add(btnFondoAzul);
		btnFondoAzul.addActionListener(this);
		
		btnFondoRojo = new JButton("Fondo rojo");
		btnFondoRojo.setBounds(327, 236, 117, 23);
		contentPane.add(btnFondoRojo);
		btnFondoRojo.addActionListener(this);
		
		btnFondoVerde = new JButton("Fondo verde");
		btnFondoVerde.setBounds(327, 313, 117, 23);
		contentPane.add(btnFondoVerde);
		btnFondoAzul.addActionListener(this);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(548, 159, 117, 23);
		contentPane.add(btnTransparente);
		btnTransparente.addActionListener(this);
		
		btnOpacar = new JButton("Opaca");
		btnOpacar.setBounds(548, 236, 100, 23);
		contentPane.add(btnOpacar);
		btnOpacar.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAzul ){
			
			etiTexto.setForeground(Color.BLUE);
			
		}else if(e.getSource() == btnRojo) {
			etiTexto.setForeground(Color.RED);
			
		}else if(e.getSource() == btnVerde) {
			
			etiTexto.setForeground(Color.GREEN);
			
		}else if(e.getSource() == btnFondoAzul) {
			
			etiTexto.setBackground(Color.BLUE);
			
		}else if(e.getSource() == btnFondoRojo) {
			
			etiTexto.setBackground(Color.RED);
			
		}else if(e.getSource() == btnFondoVerde) {
			
			etiTexto.setBackground(Color.GREEN);
			
		}else if(e.getSource() == btnTransparente) {
			
			etiTexto.setOpaque(true);
			
		}else if(e.getSource() == btnOpacar) {
			
			etiTexto.setOpaque(false);
			
		}
		
		
		
	}
}
