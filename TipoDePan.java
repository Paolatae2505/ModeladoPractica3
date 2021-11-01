public abstract class TipoDePan implements ProductoBaguette{

    protected ProductoBaguette baguette;

    public TipoDePan(ProductoBaguette baguette){
        this.baguette = baguette;
    }

    public String getDescripcion(){
        return baguette.getDescripcion();
    }

    public double getCosto(){
        return baguette.getCosto();
    }

    
}
