/**
 * Instancia de Catsup que extiende a IngredientesInternos
 * Esta clase envuelve al ProductoBaguette
 * @author Barón Herrera Victoria Elena
 * @version 1.0 (1 de Noviembre del 2021)
 * @see ProductoBaguette
 * @since Modelado y Pogramacion 2022-1
 */
public class Catsup extends IngredientesInternos {

    /**
     * Crea la envoltura de clase Catsup para Baguette
     * @param Objeto baguette de tipo ProductoBaguette a envolver
     */
    public Catsup(ProductoBaguette baguette) {
        super(baguette);
    }

    /**
     * Regresa la descripción de la baguette con la
     * envoltura Catsup
     * @return String descripción de la baguette
     * en la envoltura Catusp
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "catsup \n";
    }

    /**
     * Regrsa el costo de la Baguette con la
     * envoltura Catsup
     * @return double costo de la Baguette con el costo
     * en la envoltura Catsup*/
    @Override
    public double getCosto() {
        return super.getCosto() + 1;
    }
}
