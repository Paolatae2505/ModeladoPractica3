public class PanDeAvenaConMiel extends TipoDePan{
    
    public PanDeAvenaConMiel(ProductoBaguette baguette){
        super(baguette);
    }

    public String getDescripcion(){
       return baguette.getDescripcion() + "Pan de Avena con Miel \n";
    }

    public double getCosto(){
        return baguette.getCosto() + 50;
    }

}
