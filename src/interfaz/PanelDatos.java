package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{

	private JLabel label_n1;
	private JLabel label_n2;
	private JTextField campo_n1;
	private JTextField campo_n2;
	private JLabel label_n3;
	private JLabel label_n4;
	private JTextField campo_n3;
	private JTextField campo_n4;
	private JLabel label_n5;
	private JLabel label_n6;
	private JTextField campo_n5;
	private JTextField campo_n6;
	private JLabel campo_n7;
	private JLabel labelImagen;
	
	private JButton botonSumar;
	private JButton botonRestar;
	private JButton botonMultiplicar;
	private JButton botonDividir;
	
	public PanelDatos() {
		setBorder(new TitledBorder("Panel Datos"));
		
		//Panel Auxiliar para que los elementos se distribuyan como diseñamos
		JPanel panelAux_Naranja = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		GridLayout gl = new GridLayout(7,7);
		panelAux_Naranja.setLayout(gl);
		label_n1 = new JLabel("Nombre:");
		campo_n1 = new JTextField("Pedro");
		label_n2 = new JLabel("Apellido: ");
		campo_n2 = new JTextField("Metallana");
		label_n3 = new JLabel("Genero: ");
		campo_n3 = new JTextField("Masculino");
		label_n4 = new JLabel("Fecha de nacimiento: ");
		campo_n4 = new JTextField("16-6-1982");
		label_n5 = new JLabel("Fecha de ingreso: ");
		campo_n5 = new JTextField("5-4-2000");
		label_n6 = new JLabel("Salario: ");
		campo_n6 = new JTextField("$1,500,000");
		campo_n7 = new JLabel();
		campo_n1.setEditable(false);
		campo_n2.setEditable(false);
		campo_n3.setEditable(false);
		campo_n4.setEditable(false);
		campo_n5.setEditable(false);
		campo_n6.setEditable(false);
		
		panelAux_Naranja.add(label_n1);
		panelAux_Naranja.add(campo_n1);
		panelAux_Naranja.add(label_n2);
		panelAux_Naranja.add(campo_n2);
		panelAux_Naranja.add(label_n3);
		panelAux_Naranja.add(campo_n3);
		panelAux_Naranja.add(label_n4);
		panelAux_Naranja.add(campo_n4);
		panelAux_Naranja.add(label_n5);
		panelAux_Naranja.add(campo_n5);
		panelAux_Naranja.add(label_n6);
		panelAux_Naranja.add(campo_n6);
		panelAux_Naranja.add(campo_n6);
		panelAux_Naranja.add(campo_n7);
		botonSumar = new JButton("Modificar Salario");
		panelAux_Naranja.add(botonSumar);


		//Panel Auxiliar para que los elementos se distribuyan como diseñamos
		JPanel panelAux_Verde = new JPanel();
		JPanel panelImagen = new JPanel();
		//Objeto que permite distribuir los widgets dentro del panel auxiliar
		FlowLayout fl = new FlowLayout();
		panelAux_Verde.setLayout(fl);
		ImageIcon image = new ImageIcon("./data/CupiEmpleadoCredencial	.png");
		labelImagen = new JLabel(image);
		panelAux_Verde.add(labelImagen);
		setLayout(new BorderLayout());
		//Layout del Panel Datos, para agregar los dos páneles auxiliares que se definieron más arriba
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		add(panelAux_Naranja, BorderLayout.CENTER);
		add(panelAux_Verde, BorderLayout.EAST);
	
		
	}
}