public class Pollo extends IngredientesInternos {

    public Pollo(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "jamón \n";
    }

    public double getCosto() {
        return super.getCosto() + 10;
    }
}
