public class Mostaza extends IngredientesInternos {
    public Mostaza(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "mostaza \n";
    }

    public double getCosto() {
        return super.getCosto() + 1;
    }
}
