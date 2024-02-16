public class Bagel extends Bread{
    private double oil; // # cup of vegetable oil

    public Bagel(){
        oil = 3;
    }

    public Bagel(double oil){
        this.oil = oil;
    }

    public double getOil(){
        return oil;
    }
    public void setOil(double oil){
        this.oil = oil;
    }
    public String recipeBagel(){
        return "1. Crack egg into a small, nonstick skillet over medium heat.\n"
                + "2. Meanwhile, toast bagel.\n"
                + "3. Spread vegetable oil on both sides of the toasted bagel.\n"
                + "4. Add fried egg to the lower half, season with chile-lime seasoning, salt, and pepper, and add top half.";
    }
    public String toString(){
        return getOil() + " cup of vegetable oil";
    }
}
