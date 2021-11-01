public class PanBlanco  extends TipoDePan{

    public PanBlanco(ProductoBaguette baguette){
        super(baguette);
    }

    public String getDescripcion(){
       return baguette.getDescripcion() + "Pan Blanco \n";
    }

    public double getCosto(){
        return baguette.getCosto() + 30;
    }

}
