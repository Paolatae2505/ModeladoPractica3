/**
 * Instancia de Plan de Avena con Miel
 * @author Vargas Bravo Paola
 * @version 1.0 (31 de Octubre del 2021)
 * @see ProductoBaguette
 * @since Modelado Y Programacion (2022-1)
 */
public class PanDeAvenaConMiel extends TipoDePan{


     /**
     * Crea una envoltura de Plan de Avena con Miel
     * @param baguette --- ProductoBaguette 
     *                     a envolver
     */
    public PanDeAvenaConMiel(ProductoBaguette baguette){
        super(baguette);
    }
    /**
     * Obtiene la descripcion del Baguette con 
     * la encoltura de Pan de Avena con Miel
     * @return ---String del Baguette mas la
     *            envoltura de Pan de Avena con 
     *            Miel
     */
    @Override
    public String getDescripcion(){
       return baguette.getDescripcion() + "Pan de Avena con Miel \n";
    }
     /**
     * Obtiene el costo de la Baguette mas la 
     * envoltura del Pan de Avena con Miel
     * @return --- double del costo de la baguette 
     *             mas el precio de la envoltura 
     *             de Pan de Avena con Miel
     */
    @Override
    public double getCosto(){
        return baguette.getCosto() + 50;
    }

}
