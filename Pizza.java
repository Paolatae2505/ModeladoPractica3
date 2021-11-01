public abstract class Pizza{
    
    protected double costo;
    protected String nombre;

    public String getNombre(){
       return nombre;
    }

    public abstract String getQueso();

    public  abstract String getCarne();

    public abstract  String getMasa();

    public double getCosto(){
        return costo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

}