package instrumentografico;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.Color;


public class ventana5 extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiPal1 ;
	JLabel etiPal2;
	JLabel etiPal3;
	JLabel etiPal4;

	
	public ventana5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("etiN1");
		etiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal1.setFont(new Font("Verdana", Font.PLAIN, 17));
		etiPal1.setBounds(74, 44, 318, 65);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("etiN2");
		etiPal2.setFont(new Font("Verdana", Font.PLAIN, 17));
		etiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal2.setBounds(74, 141, 318, 58);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("etiN3");
		etiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal3.setFont(new Font("Verdana", Font.PLAIN, 16));
		etiPal3.setBounds(74, 226, 318, 65);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("etiN4");
		etiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal4.setFont(new Font("Verdana", Font.PLAIN, 16));
		etiPal4.setBounds(74, 323, 318, 58);
		contentPane.add(etiPal4);
		
		JLabel etiOcultar = new JLabel("Ocultar");
		etiOcultar.setForeground(new Color(147, 112, 219));
		etiOcultar.setBackground(new Color(147, 112, 219));
		etiOcultar.setFont(new Font("Verdana", Font.ITALIC, 30));
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setBounds(444, 181, 137, 98);
		contentPane.add(etiOcultar);
		etiOcultar.addMouseListener(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {

		
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
		etiPal1.setVisible(false);
		etiPal2 .setVisible(false);
		etiPal3.setVisible(false);
		etiPal4.setVisible(false);
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		etiPal1.setVisible(true);
		etiPal2 .setVisible(true);
		etiPal3.setVisible(true);
		etiPal4.setVisible(true);
		
	}

}
