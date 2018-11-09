package tm.fight;

import java.util.Random;

public class Randomizing {

    private static final Random random = new Random();

    public int diceVal(){

        int r_from = 0;
        int r_to   = 100;
        return random.nextInt(r_to - r_from) + r_from;

    }

    public int attackVal(int armor, int atStr_from, int atStr_to, int critical){
        int attack_clean = random.nextInt(atStr_to - atStr_from) + atStr_from;
        System.out.println("CLEAN ATTACK (random) = " + attack_clean);
        if(critical > 0){
            int attack_critical = atStr_to + atStr_to * critical / 100;
            System.out.println("CRITICAL ATTACK = " + attack_critical);
            return attack_critical - armor;
        } else {
            return attack_clean - armor;
        }


    }


}
