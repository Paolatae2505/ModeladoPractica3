/**
 * Instancia de Baguette que implementa a ProductoBaguette
 * @author Barón Herrera Victoria Elena
 * @version 1.0 (1 de Noviembre del 2021)
 * @see ProductoBaguette
 * @since Modelado y Pogramacion 2022-1
 */

public class Baguette implements ProductoBaguette {
    private String descripcion = "Baguette \n";

    /**
     * Regresa la descripción de la Baguette.
     * @return String sobre la descripción de la baguette.
     * */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Regresa el costo de la Baguette.
     * @return Double con el costo de la baguette.
     * */
    public double getCosto() {
        return 0;
    }
}
