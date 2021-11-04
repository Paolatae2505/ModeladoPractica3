/**
 * Instancia Abstracta de los ingredientes para la Baguette
 * @author Barón Herrera Victoria Elena
 * @version 1,0 (1 de Noviembre del 2021)
 * @see ProductoBaguette
 * @since Modelado y Programacion (2022-1)
 */
public abstract class IngredientesInternos implements ProductoBaguette {
    protected ProductoBaguette baguette;

    /**
     * Constructor Abstracto que crea una envoltura de
     * IngredientesInternos
     * @param baguette ProductoBaguette a envolver
     */
    public IngredientesInternos(ProductoBaguette baguette) {
        this.baguette = baguette;
    }

    /**
     * Obtiene la descripcion de la Baguette con
     * el ingrediente con el que fue envuelto
     * @return String de la descripción del Baguette más el ingrediente
     */
    public String getDescripcion() {
        return baguette.getDescripcion();
    }

    /**
     * Obtiene el costo de la Baguette más la envoltura
     * del ingrediente
     * @return double costo de la Baguette más costo del
     * ingrediente
     */
    public double getCosto() {
        return baguette.getCosto();
    }

}
