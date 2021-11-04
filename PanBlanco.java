/**
 * Instancia de PlanBlanco
 * @author Vargas Bravo Paola
 * @version 1.0 (31 de Octubre del 2021)
 * @see ProductoBaguette
 * @since Modelado Y Programacion (2022-1)
 */
public class PanBlanco  extends TipoDePan{

    /**
     * Crea una envoltura de Plan Blanco
     * @param baguette --- ProductoBaguette
     *                     a envolver
     */
    public PanBlanco(ProductoBaguette baguette){
        super(baguette);
    }
    /**
     * Obtiene la descripcion del Baguette con
     * la envoltura de Pan Blanco
     * @return ---String del Baguette mas la
     *            envoltura de Pan Blanco
     */
     @Override
    public String getDescripcion(){
       return baguette.getDescripcion() + "Pan Blanco \n";
    }
     /**
     * Obtiene el costo de la Baguette mas la
     * envoltura del Plan Blanco
     * @return --- double del costo de la baguette
     *             mas el precio de la envoltura
     *             de Pan Blanco
     */
    @Override
    public double getCosto(){
        return baguette.getCosto() + 30;
    }
}
