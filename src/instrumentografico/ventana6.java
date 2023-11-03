package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class ventana6 extends JFrame implements ActionListener ,MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnEsquina;
	JButton btnCentro;
	JButton btnAgrandar;
	JButton btnAchicar;
	JLabel etiNombre;

	
	public ventana6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1261, 371);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JLabel("Jhon Edison Jurado Gomez");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Verdana", Font.PLAIN, 30));
		etiNombre.setBounds(258, 10, 721, 90);
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setFont(new Font("Verdana", Font.PLAIN, 18));
		btnEsquina.setBounds(99, 208, 244, 61);
		contentPane.add(btnEsquina);
		btnEsquina.addActionListener(this);
		
		btnCentro = new JButton("Centro");
		btnCentro.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnCentro.setBounds(374, 209, 244, 61);
		contentPane.add(btnCentro);
		btnCentro.addActionListener(this);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAgrandar.setBounds(648, 209, 244, 61);
		contentPane.add(btnAgrandar);
		btnAgrandar.addMouseListener(this);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnAchicar.setBounds(935, 209, 244, 61);
		contentPane.add(btnAchicar);
		btnAchicar.addMouseListener(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
		if(e.getSource() == btnAgrandar) {
			
			btnAgrandar.setSize(260, 70);
		}else if(e.getSource() == btnAchicar) {
			
			btnAchicar.setSize(200, 50);
		}
		
		
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == btnAgrandar) {
			btnAgrandar.setSize(244,61);
		}else if(e.getSource() == btnAchicar) {
		
			btnAchicar.setSize(244, 61);
			
		}
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnEsquina ){
			
			etiNombre.setLocation(5, 5);
			
			
		}else if(e.getSource() == btnCentro) {
			
			etiNombre.setLocation(258, 10);
		}
	}
}
