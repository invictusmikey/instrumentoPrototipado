package instrumentografico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class ventana10 extends JFrame implements MouseListener,ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero;
	JLabel etiUno;
	JLabel etiDos;
	JLabel etiTres ;
	JLabel etiCuatro;
	JLabel etiCinco;
	JLabel etiSeis;
	JLabel etiSiete;
	JLabel etiOcho;
	JLabel etiNueve;
	JLabel etiDiez;
	JButton btnBorrar;
	String a = "";
	
	public ventana10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiUno = new JLabel("1");
		etiUno.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiUno.setBounds(127, 52, 34, 26);
		contentPane.add(etiUno);
		etiUno.addMouseListener(this);
		
		
		etiDos = new JLabel("2");
		etiDos.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiDos.setBounds(127, 114, 49, 26);
		contentPane.add(etiDos);
		etiDos.addMouseListener(this);
		
		etiTres = new JLabel("3");
		etiTres.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiTres.setBounds(127, 196, 34, 31);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiCuatro.setBounds(127, 290, 34, 39);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiCinco.setBounds(309, 112, 34, 31);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiSeis.setBounds(309, 46, 26, 39);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiSiete.setBounds(309, 196, 34, 31);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiOcho.setBounds(309, 294, 34, 31);
		contentPane.add(etiOcho);
		
		etiNueve = new JLabel("9");
		etiNueve.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiNueve.setBounds(486, 114, 34, 31);
		contentPane.add(etiNueve);
		
		etiDiez = new JLabel("10");
		etiDiez.setFont(new Font("Verdana", Font.PLAIN, 20));
		etiDiez.setBounds(486, 208, 34, 31);
		contentPane.add(etiDiez);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Verdana", Font.PLAIN, 30));
		btnBorrar.setBounds(547, 484, 347, 78);
		contentPane.add(btnBorrar);
		
		txtNumero = new JTextField();
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setFont(new Font("Verdana", Font.PLAIN, 30));
		txtNumero.setBounds(81, 484, 347, 78);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
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
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
	ArrayList<String> listaN = new ArrayList<String>();
		
		if(e.getSource() == etiUno) {
		 
		listaN.add(etiUno.getText());
		}
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
