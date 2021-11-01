public class PanDeOregano extends TipoDePan {
    
    public PanDeOregano(ProductoBaguette baguette){
        super(baguette);
    }

    public String getDescripcion(){
       return baguette.getDescripcion() + "Pan de Oregano \n";
    }

    public double getCosto(){
        return baguette.getCosto() + 35;
    }
}
