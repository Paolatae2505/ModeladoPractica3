/**
 * Instancia de Plan de Oregano
 * @author Vargas Bravo Paola
 * @version 1.0 (31 de Octubre del 2021)
 * @see ProductoBaguette
 * @since Modelado Y Programacion (2022-1)
 */
public class PanDeOregano extends TipoDePan {

     /**
     * Crea una envoltura de Plan de Oregano
     * @param baguette --- ProductoBaguette 
     *                     a envolver
     */
    public PanDeOregano(ProductoBaguette baguette){
        super(baguette);
    }
    /**
     * Obtiene la descripcion del Baguette con 
     * la encoltura de Pan de Oregano
     * @return ---String del Baguette mas la
     *            envoltura de Pan de Oregano
     */
    @Override
    public String getDescripcion(){
       return baguette.getDescripcion() + "Pan de Oregano \n";
    }

    /**
     * Obtiene el costo de la Baguette mas la 
     * envoltura del Pan de Oregano
     * @return --- double del costo de la baguette 
     *             mas el precio de la envoltura 
     *             de Pan de Oregano
     */
    @Override
    public double getCosto(){
        return baguette.getCosto() + 35;
    }
}
