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
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ventana8 extends JFrame implements ActionListener  {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	JLabel etiTitulo;
	JLabel lblNota1 ;
	JLabel lblN2;
	JLabel lblN3 ;
	JButton btnCalcular;
	JLabel etiNotaFinal ;
	JLabel lblResultado;
	
	

	
	
	
	public ventana8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTitulo = new JLabel("Promedio notas.");
		etiTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etiTitulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiTitulo.setBounds(343, 11, 209, 45);
		contentPane.add(etiTitulo);
		
		lblNota1 = new JLabel("Nota1:");
		lblNota1.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblNota1.setBounds(112, 175, 74, 22);
		contentPane.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(196, 179, 74, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		lblN2 = new JLabel("Nota2:");
		lblN2.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblN2.setBounds(317, 178, 64, 17);
		contentPane.add(lblN2);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(391, 179, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		lblN3 = new JLabel("Nota3:");
		lblN3.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblN3.setBounds(574, 179, 64, 14);
		contentPane.add(lblN3);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(648, 179, 86, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		etiNotaFinal = new JLabel("Nota final:");
		etiNotaFinal.setFont(new Font("Verdana", Font.PLAIN, 17));
		etiNotaFinal.setBounds(83, 241, 596, 38);
		contentPane.add(etiNotaFinal);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblResultado.setBounds(83, 309, 596, 38);
		contentPane.add(lblResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 17));
		btnCalcular.setBounds(364, 379, 113, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnCalcular) {
			double n1 = Integer.parseInt(txtNota1.getText());
			double n2 = Integer.parseInt(txtNota2.getText());
			double n3 = Integer.parseInt(txtNota3.getText());
			double fin = (n1 + n2 + n3)/3;
			
			etiNotaFinal.setText("su nota final es :"+fin);
			
			if(fin >= 5) {
				lblResultado.setForeground(Color.GREEN);
				lblResultado.setText("APROBADO");
				
			}else {
				lblResultado.setForeground(Color.RED);
				lblResultado.setText("SUSPENSO");
			}
			
		}
		
	}
}
