package interfaz;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImagen extends JPanel{

	private JLabel labelImagen;
	
	public PanelImagen() {
		ImageIcon image = new ImageIcon("./data/CupiEmpleadoLogo.png");
		labelImagen = new JLabel(image);
		setLayout(new BorderLayout());
		add(labelImagen, BorderLayout.CENTER);
	
	}
	
}





