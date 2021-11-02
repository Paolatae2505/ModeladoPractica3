public class Lechuga extends IngredientesInternos {
    public Lechuga(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "lechuga \n";
    }

    public double getCosto() {
        return super.getCosto() + .25;
    }
}
