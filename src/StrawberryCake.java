public class StrawberryCake extends Bread{
    private double syrup; // # cup of Strawberry syrup

    public StrawberryCake(){
        syrup = 3;
    }
    public StrawberryCake(double syrup){
        this.syrup = syrup;
    }

    public double getSyrup() {
        return syrup;
    }

    public void setSyrup(double syrup) {
        this.syrup = syrup;
    }
    public String recipeStrawcake(){
        return "1. Preheat the oven to 350 degrees F (175 degrees C)\n"
                + "2. Combine flour, baking powder, and salt in a mixing bowl.\n"
                + "3. Combine sugar, straberry syrup, eggs, and oil in a small mixing bowl. Beat until just blended.\n"
                + "4. Stir the wet mixture into the dry with a wooden spoon until batter is just moistened\n"
                + "5. Bake in the preheated oven for 50 to 60 minute";
    }
    public String toString(){
        return getSyrup() + " cup of Strawberry syrup";
    }
}
