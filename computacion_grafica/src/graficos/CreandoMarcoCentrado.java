package graficos;
import java.awt.*;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado miMarco  = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
		miMarco.setTitle("Computacion Grafica");
		
		
	}
}
class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
	Toolkit miPantalla = Toolkit.getDefaultToolkit();		
	
	Dimension tamanioPantalla = miPantalla.getScreenSize();
	
	int alturaPantalla = tamanioPantalla.height;
	
	int anchoPantalla = tamanioPantalla.width;
	
	setSize(anchoPantalla/2, alturaPantalla/2 );
	
	setLocation(anchoPantalla/4, alturaPantalla/4 );
	
	Image miIcono = miPantalla.getImage("C:/Users/Aless/eclipse-workspace/computacion_grafica/src/graficos/Image.jpg");
	
	setIconImage(miIcono);
	
	
	}
}