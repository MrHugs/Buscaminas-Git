package vista;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class UIbusqui extends JFrame {

	protected JPanel contentPane;
	private int tamaño=10;
	protected JButton[][] botonera = new JButton[tamaño][tamaño];
	protected JLabel lblBuscaminah;
	private JMenuBar menuBar;
	private JMenu mnJuego;
	private JTabbedPane tabbedPane;
	private JPanel pnlBuscaminas;
	private JPanel pnlMinijuego;
	private JMenu mnPersonalizado;
	private JMenu mnDificultad;
	private JButton btnParatontos;
	private JButton btnAcetable;
	private JButton btnReto;
	private JButton btnBuenaSuerte;
	private JLabel lblTamao;
	private JLabel lblMinas;
	private JMenu mnOpciones;
	private JMenu mnColores;
	private JMenu mnSonidos;
	

	/**
	 * Create the frame.
	 */
	public UIbusqui() {
		setMinimumSize(new Dimension(500, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 432);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnJuego = new JMenu("Juego");
		menuBar.add(mnJuego);
		
		mnPersonalizado = new JMenu("Personalizado");
		mnJuego.add(mnPersonalizado);
		
		lblTamao = new JLabel("Tama\u00F1o");
		mnPersonalizado.add(lblTamao);
		
		JTextField textField = new JTextField();
		mnPersonalizado.add(textField);
		textField.setColumns(10);
		
		lblMinas = new JLabel("Minas");
		mnPersonalizado.add(lblMinas);
		
		JTextField textField_1 = new JTextField();
		mnPersonalizado.add(textField_1);
		textField_1.setColumns(10);
		
		mnDificultad = new JMenu("Dificultad");
		mnJuego.add(mnDificultad);
		
		btnParatontos = new JButton("ParaTontos");
		mnDificultad.add(btnParatontos);
		
		btnAcetable = new JButton("Acetable");
		mnDificultad.add(btnAcetable);
		
		btnReto = new JButton("Reto");
		mnDificultad.add(btnReto);
		
		btnBuenaSuerte = new JButton("Buena Suerte");
		mnDificultad.add(btnBuenaSuerte);
		
		mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		mnColores = new JMenu("Colores");
		mnOpciones.add(mnColores);
		
		mnSonidos = new JMenu("Sonidos");
		mnOpciones.add(mnSonidos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
				
				pnlBuscaminas = new JPanel();
				tabbedPane.addTab("Buscaminas", null, pnlBuscaminas, null);
				pnlBuscaminas.setLayout(new BorderLayout(0, 0));
				
				JPanel Buscaminas = new JPanel();
				pnlBuscaminas.add(Buscaminas, BorderLayout.CENTER);
				Buscaminas.setLayout(new GridLayout(0, botonera.length, 0, 0));
								
										lblBuscaminah = new JLabel("Buscaminah");
										pnlBuscaminas.add(lblBuscaminah, BorderLayout.SOUTH);
										lblBuscaminah.setHorizontalAlignment(SwingConstants.CENTER);
										lblBuscaminah.setBounds(new Rectangle(50, 0, 50, 0));
										lblBuscaminah.setAlignmentX(Component.RIGHT_ALIGNMENT);
										lblBuscaminah.setFont(new Font("Tahoma", Font.BOLD, 20));
										
										pnlMinijuego = new JPanel();
										tabbedPane.addTab("Minijuego", null, pnlMinijuego, null);
										tabbedPane.setEnabledAt(1, false);
		
		
		for (int i = 0; i < botonera.length; i++) {
			for (int j = 0; j < botonera.length; j++) {
				botonera[i][j] = new JButton();
				Buscaminas.add(botonera[i][j]);
				botonera[i][j].setName(i+","+j);
				 
			}
		}
	}
}
