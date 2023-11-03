package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;

public class ventana2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField etiTexto1;
	private JTextField etiTexto2;
	JButton btnTraspasa1;
	JButton btnTraspasa2;
	JLabel txtTexto;
	
	public ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 481);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto1 = new JTextField();
		etiTexto1.setBounds(245, 150, 325, 20);
		contentPane.add(etiTexto1);
		etiTexto1.setColumns(10);
		
		etiTexto2 = new JTextField();
		etiTexto2.setBounds(245, 206, 325, 20);
		contentPane.add(etiTexto2);
		etiTexto2.setColumns(10);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setBackground(new Color(95, 158, 160));
		btnTraspasa1.setForeground(new Color(0, 0, 0));
		btnTraspasa1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTraspasa1.setBounds(151, 269, 137, 79);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
	    btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setBackground(new Color(95, 158, 160));
		btnTraspasa2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTraspasa2.setBounds(464, 269, 137, 79);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
		
		txtTexto = new JLabel("Texto");
		txtTexto.setForeground(new Color(95, 158, 160));
		txtTexto.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 36));
		txtTexto.setBounds(333, 29, 192, 43);
		contentPane.add(txtTexto);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnTraspasa1 ) {
			
			etiTexto2.setText(etiTexto1.getText());
			etiTexto1.setText(" ");	
		}else if(e.getSource() == btnTraspasa2 ) {
			
			etiTexto1.setText(etiTexto2.getText());
			etiTexto2.setText(" ");	
			
		}
		
	}
	
	
	
}
