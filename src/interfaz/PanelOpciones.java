package interfaz;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel{
	
	private JButton botonEmpleado;
	private JButton Opcion_1;
	private JButton Opcion_2;

	public PanelOpciones() {
		setBorder(new TitledBorder("Opciones"));
		
		
		botonEmpleado = new JButton("Cambiar Empleado");
		add(botonEmpleado);
		Opcion_1 = new JButton("Cambiar Empleado");
		add(Opcion_1);
		Opcion_2 = new JButton("Cambiar Empleado");
		add(Opcion_2);
		
		add(botonEmpleado);
		add(Opcion_1);
		add(Opcion_2);
		
	}
	
}