
package interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaCalculadora extends JFrame{

	private PanelResultado panelResultado;
	private PanelDatos panelDatos;
	private PanelImagen panelImagen;
	
	public VentanaCalculadora() {

		//Al cerrar ventana, cierre también la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 240);
		setTitle("Sistema de un empleado");
		
		//Objeto que define cómo se distribuyen los widgets en pantalla
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		panelImagen = new PanelImagen();
		add(panelImagen, BorderLayout.NORTH);
		
		panelDatos = new PanelDatos();
		add(panelDatos, BorderLayout.CENTER);
		
		panelResultado = new PanelResultado();
		add(panelResultado, BorderLayout.SOUTH);
		
	
		
	
	
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		VentanaCalculadora v = new VentanaCalculadora();
	}

}
