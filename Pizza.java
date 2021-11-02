/**
 * Instancia abstracta de la Pizza
 * @author Vargas Bravo Paola
 * @version 1.0 (31 Octubre 2021)
 * @since Modelado Y Programacion (2022-1)
 */

public abstract class Pizza{
    
    protected double costo;
    protected String nombre;

    /**
     * Obtiene el atributo nombre.
     * @return --- String el atributo nombre
     */
    public String getNombre(){
       return nombre;
    }
    /**
     * Obtiene el tipo de Queso de la Pizza 
     * @return ---- String el tipo de Queso de 
     *              la Pizza
     */
    public abstract String getQueso();

    /**
     * Obtiene el tipo de Carne de la Pizza  
     * @return  --- String del tipo de Carne
     *              de la Pizza
     */
    public  abstract String getCarne();
    
    /**
     * Obtiene el tipo de masa de la Pizza 
     * @return  --- String del tipo de Masa de la Pizza
     */
    public abstract  String getMasa();
    
    /**
     * Obtiene el atributo Costo.
     * @return --- double del atributo costo
     */
    public double getCosto(){
        return costo;
    }
    /**
     * Asigna un nuevo String al atributo nombre
     * @param nombre  --- String a asignar a el 
     *                    atributo nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Asigna un nuevo double al atributo costo
     * @param costo --- double costo a asignar 
     *                 al atributo costo
     */
    public void setCosto(double costo){
        this.costo = costo;
    }

}