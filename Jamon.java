public class Jamon extends IngredientesInternos {
    public Jamon(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "jamón \n";
    }

    public double getCosto() {
        return super.getCosto() + 10;
    }
}
