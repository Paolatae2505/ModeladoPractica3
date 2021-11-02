public class Catsup extends IngredientesInternos {

    public Catsup(ProductoBaguette baguette) {
        super(baguette);
    }

    public String getDescripcion() {
        return super.getDescripcion() + "catsup \n";
    }

    public double getCosto() {
        return super.getCosto() + 1;
    }
}
