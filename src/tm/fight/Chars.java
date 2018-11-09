package tm.fight;

public class Chars {

    public static int[] get_class_chars(String Ch_class){

        /*
        test
        Животные ебаные
         * 0 = HP
         * 1 = ARMOR
         * 2 = MISS_PERCENT
         * 3 = attack_min
         * 4 = attack_max
         *
         *
         * */


        int[] class_chars = new int[5];
        if(Ch_class.equals("tank")){
            class_chars[0] = 500;
            class_chars[1] = 5;
            class_chars[2] = 10;
            class_chars[3] = 50;
            class_chars[4] = 70;

        } else if (Ch_class.equals("agility")){
            class_chars[0] = 350;
            class_chars[1] = 3;
            class_chars[2] = 30;
            class_chars[3] = 35;
            class_chars[4] = 50;

        }

        return class_chars;

    }

    public static double get_speed_attack(String Ch_class){

        double speed_attack = 0;
        if (Ch_class.equals("tank")){
            speed_attack = 0.7;
        } else if (Ch_class.equals("agility")){
            speed_attack = 1.0;
        }

        return speed_attack;

    }




}
