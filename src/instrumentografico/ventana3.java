package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

import javax.swing.JButton;
import java.awt.Color;

public class ventana3 extends JFrame implements KeyListener,ActionListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto;
	JButton btnVaciar;


	public ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTexto.setBounds(298, 127, 208, 37);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		
		etiTexto = new JLabel("\"\"");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(189, 54, 420, 32);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setBackground(new Color(95, 158, 160));
		btnVaciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVaciar.setBounds(318, 204, 176, 73);
		contentPane.add(btnVaciar);
		btnVaciar.addActionListener(this);
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		etiTexto.setText(txtTexto.getText());
		
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == btnVaciar ) {
			
			etiTexto.setText("");
		}
		
		
		
	}

}
