package uniandes.cupi2.planeacionUrbana.interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel para presentar la información del estado del juego.
 */
public class PanelEstadoDeJuego extends JPanel{
	
	/**
     * Crea el panel de estado de juego.
     */
    public PanelEstadoDeJuego( )
    {
        // Establece el layout como una grilla de 3 filas y 2 columnas
        setLayout( new GridLayout( 3, 2 ) );

        // Adiciona un marco con título
        TitledBorder border = new TitledBorder( "Descuentos" );
        border.setTitleColor( Color.BLUE );
        setBorder( border );

        // Crea los objetos del panel
        cbPPago = new JCheckBox( "Pronto pago" );
        cbSPublico = new JCheckBox( "Servicio público" );
        cbTCuenta = new JCheckBox( "Traslado de cuenta" );

        // Adiciona los objetos del panel
        add( cbPPago );
        add( cbTCuenta );
        add( cbSPublico );
    }

}
