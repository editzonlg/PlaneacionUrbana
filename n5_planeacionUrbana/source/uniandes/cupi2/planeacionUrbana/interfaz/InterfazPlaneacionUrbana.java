package uniandes.cupi2.planeacionUrbana.interfaz;

import javax.swing.JFrame;

/**
 * Interfaz del juego planeacion urbana.
 */

public class InterfazPlaneacionUrbana extends JFrame{
	
	
	// -----------------------------------------------------------------
    // Constructor
    // -----------------------------------------------------------------

    /**
     * Crea la interfaz del juego planeacion urbana.
     * @throws Exception Error al cargar los archivos.
     */
	public InterfazPlaneacionUrbana() throws Exception
	{
        setTitle( "Planeación Urbana" );
        setSize( 820, 740 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
	}
	
	

}
