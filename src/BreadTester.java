public class BreadTester {
    public static void main(String[] args){
        // create object of Superclass
        Bread bread = new Bread();

        // create object of SourdoughBread Subclass
        SourdoughBread sourdoughBread = new SourdoughBread();
        // set values for SourdoughBread Subclass
        sourdoughBread.setFlour(4.00);
        sourdoughBread.setWater(1.5);
        sourdoughBread.setSalt(2.5);
        sourdoughBread.setSugar(0);
        sourdoughBread.setBakingPowder(0);
        sourdoughBread.setYeast(1);

        System.out.println("\nIngredients of Sourdough Bread are: \n"+ sourdoughBread.getIngredients() + sourdoughBread + "\n");
        // display recipe of SourdoughBread Subclass
        System.out.println("A recipe of Sourdough Bread: \n" + sourdoughBread.recipeSourdough());
        // change bake status of Sourdough Bread
        System.out.println("Sourdough Bread " + sourdoughBread.getState());
        System.out.println("Sourdough Bread " + sourdoughBread.bake());

        // creat object of Pastry Subclass
        Pastry pastry = new Pastry();
        pastry.setFlour(3);
        pastry.setWater(5);
        pastry.setSalt(0);
        pastry.setSugar(0);
        pastry.setBakingPowder(0);
        pastry.setYeast(0);
        System.out.println("\nIngredients of Pastry are: \n" + pastry.getIngredients() + pastry);

        // display recipe of Pastry Subclass
        System.out.println("A recipe of Pastry: \n" + pastry.recipePastry());
        // change bake status of Pastry
        System.out.println("Pastry " + pastry.getState());
        System.out.println("Pastry " + pastry.bake());

        // create object of Muffin Subclass
        Muffin muffin = new Muffin();
        muffin.setFlour(2);
        muffin.setWater(1);
        muffin.setSalt(0.5);
        muffin.setSugar(1.5);
        muffin.setBakingPowder(3);
        muffin.setYeast(0);
        System.out.println("\nIngredients of Muffin are: " + muffin.getIngredients() + muffin);
        // display recipe of Muffin
        System.out.println("Recipe of Muffin: " + muffin.recipeMuffin());
        // change bake status of Muffin
        System.out.println("Muffin " + muffin.getState());
        System.out.println("Muffin " + muffin.bake());

        // create object of Bagel
        Bagel bagel = new Bagel();
        bagel.setFlour(3);
        bagel.setWater(2);
        bagel.setSalt(2);
        bagel.setSugar(0);
        bagel.setBakingPowder(0);
        bagel.setYeast(0);
        System.out.println("\nIngredients of Bagel: " + bagel.getIngredients() + bagel);
        // display recipe of bagel
        System.out.println("Recipe of Bagel: " + bagel.recipeBagel());
        // change bake status of Bagel
        System.out.println("Bagel: " + bagel.getState());
        System.out.println("Bagel: " + bagel.bake());

        // create object of Strawberrycake subclass
        StrawberryCake strawberryCake = new StrawberryCake();
        strawberryCake.setFlour(3);
        strawberryCake.setWater(2);
        strawberryCake.setSalt(1);
        strawberryCake.setSugar(0);
        strawberryCake.setBakingPowder(3);
        strawberryCake.setYeast(0);
        System.out.println("\nIngredients of Strawberry Cake: " + strawberryCake.getIngredients() + strawberryCake);
        // display recipe of Strawberry cake
        System.out.println("Recipe of Strawberry cake: " + strawberryCake.recipeStrawcake());
        // change bake status of Strawberry cake
        System.out.println("Strawberry cake: " + strawberryCake.getState());
        System.out.println("Strawberry cake: " + strawberryCake.bake());

    }

}
