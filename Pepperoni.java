/**
 * Instancia de Pepperoni que extiende a IngredientesInternos
 * Esta clase envuelve al ProductoBaguette
 * @author Barón Herrera Victoria Elena
 * @version 1.0 (1 de Noviembre del 2021)
 * @see ProductoBaguette
 * @since Modelado y Pogramacion 2022-1
 */
public class Pepperoni extends IngredientesInternos {

    /**
     * Crea la envoltura de clase Pepperoni para Baguette
     * @param Objeto baguette de tipo ProductoBaguette a envolver
     */
    public Pepperoni(ProductoBaguette baguette) {
        super(baguette);
    }

    /**
     * Regresa la descripción de la baguette con la
     * envoltura Pepperoni
     * @return String descripción de la baguette
     * en la envoltura Pepperoni
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "pepperoni \n";
    }

    /**
     * Regrsa el costo de la Baguette con la
     * envoltura Pepperoni
     * @return double costo de la Baguette con el costo
     * en la envoltura Pepperoni
     */
    @Override
    public double getCosto() {
        return super.getCosto() + 10;
    }
}
