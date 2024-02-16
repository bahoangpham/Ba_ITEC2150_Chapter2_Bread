public class Muffin extends Bread{
    private int egg;

    public Muffin(){
        egg = 3;
    }

    public Muffin(int egg ){
        this.egg = egg;
    }

    public int getEgg(){
        return egg;
    }

    public void setEgg(int egg){
        this.egg = egg;
    }

    public String recipeMuffin(){
        return "1. Stir the dry ingredients together and make a well in the center.\n"
                + "2. Beat the egg, then whisk in the milk and oil.\n"
        + "3. Pour the egg mixture into the flour mixture and stir.\n"
        + "4. Spoon the batter into prepared muffin cups.\n"
                + "5. Bake until the tops spring back when lightly pressed.";
    }

    public String toString(){
        return getEgg() + " eggs";
    }

}
