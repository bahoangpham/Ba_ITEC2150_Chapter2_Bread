public class Pastry extends Bread{
    private double butter; // # cup of honey

    public Pastry(){
        butter = 3;

    }
    public Pastry(double butter1){
        this.butter = butter1;
    }

    public double getButter(){
        return butter;
    }
    public void setButter(double butter2){
        this.butter = butter2;
    }
    public String recipePastry(){
        return "1. Sieve flour.\n" +
                "2. Add butter. Always use soft butter. ...\n" +
                "3. Add the water gently until it forms a soft ball of dough. If you add too much water just add a bit more flour. ...\n" +
                "4. This step is important. ...\n" +
                "5. When you are ready to use the pastry. ...\n" +
                "6.Lightly flour a clean surface and roll out the pastry.";
    }

    public String toString(){
        return getButter() + " cup of butter";
    }

}
