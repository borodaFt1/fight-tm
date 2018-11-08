package tm.fight;

public class RandomMashine {

    public static int dice_value(){

        int r_from = 0;
        int r_to   = 100;

        //int random_number = 0;
        //random_number = r_from + (int) (Math.random() * r_to);
        //return random_number;

        return r_from + (int) (Math.random() * r_to);

    }

    public static int Dam_St() {
        int r_from = 10;
        int r_to   = 25;

        //int random_number = 0;
        //random_number = r_from + (int) (Math.random() * r_to);
        //return random_number;

        return r_from + (int) (Math.random() * r_to);
    }
    public static int Dam_Ag() {
        int r_from = 5;
        int r_to   = 19;

        //int random_number = 0;
        //random_number = r_from + (int) (Math.random() * r_to);
        //return random_number;

        return r_from + (int) (Math.random() * r_to);
    }

}
