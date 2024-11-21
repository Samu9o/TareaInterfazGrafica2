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

public class PanelResultado extends JPanel{

	private JButton labelEdad;
	private JTextField campoEdad;
	private JButton labelAntiguedad;
	private JTextField campoAntiguedad;
	private JButton labelPrestaciones;
	private JTextField campoPrestaciones;
	private JButton botonEmpleado;
	private JButton Opcion_1;
	private JButton Opcion_2;
  
	
	public PanelResultado() {
		setBorder(new TitledBorder("Calculos"));
		JPanel panelAux_Naranja = new JPanel();
		GridLayout gl = new GridLayout(3,3);
		panelAux_Naranja.setLayout(gl);
		labelEdad = new JButton("Calcular edad");
		campoEdad = new JTextField();
		labelAntiguedad = new JButton("Calcular antiguedad");
		campoAntiguedad = new JTextField();
		labelPrestaciones = new JButton("Calcular prestaciones");
		campoPrestaciones = new JTextField();
		campoEdad.setEditable(false);
		campoPrestaciones.setEditable(false);
		campoAntiguedad.setEditable(false);
		//Panel Auxiliar para que los elementos se distribuyan como diseñamos
		JPanel panelAux_Verde = new JPanel();
				//Objeto que permite distribuir los widgets dentro del panel auxiliar
		FlowLayout fl = new FlowLayout();
		panelAux_Verde.setLayout(fl);
		panelAux_Verde.setBorder(new TitledBorder("Opciones"));

				//Layout del Panel Datos, para agregar los dos páneles auxiliares que se definieron más arriba
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		panelAux_Naranja.add(labelEdad);
		panelAux_Naranja.add(campoEdad);
		panelAux_Naranja.add(labelAntiguedad);
		panelAux_Naranja.add(campoAntiguedad);
		panelAux_Naranja.add(labelPrestaciones);
		panelAux_Naranja.add(campoPrestaciones);
		
		
		
		botonEmpleado = new JButton("Cambiar Empleado");
		panelAux_Verde.add(botonEmpleado);
		Opcion_1 = new JButton("Opcion 1");
		panelAux_Verde.add(Opcion_1);
		Opcion_2 = new JButton("Opcion 2");
		panelAux_Verde.add(Opcion_2);
		
		add(panelAux_Naranja, BorderLayout.NORTH);
		add(panelAux_Verde, BorderLayout.SOUTH);
	}
	
}
