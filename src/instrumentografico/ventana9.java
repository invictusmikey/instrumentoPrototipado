package instrumentografico;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ventana9 extends JFrame  implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	JButton btnConcatenar;
	JLabel etiTexto;

	public ventana9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtPalabra1.setBounds(140, 83, 244, 46);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtPalabra2.setBounds(511, 87, 244, 46);
		contentPane.add(txtPalabra2);
		txtPalabra2.setColumns(10);
		
		btnConcatenar = new JButton("Concatenar");
		btnConcatenar.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnConcatenar.setBounds(319, 391, 281, 51);
		contentPane.add(btnConcatenar);
		btnConcatenar.addActionListener(this);
		
		etiTexto = new JLabel("\"\"");
		etiTexto.setFont(new Font("Verdana", Font.PLAIN, 25));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(252, 256, 374, 46);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnConcatenar) {
			
			etiTexto.setText(txtPalabra1.getText()+""+txtPalabra2.getText());
		}
		
		
	}
}
