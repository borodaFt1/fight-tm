package tm.fight;

import java.sql.SQLOutput;

public class Action {

    public static void fight() {


        Randomizing Randomizing = new Randomizing();

        String ch_class1 = "tank";
        String ch_class2 = "agility";

        int[] chChars1 = Chars.get_class_chars(ch_class1);
        int[] chChars2 = Chars.get_class_chars(ch_class2);

        double speedAtt1 = Chars.get_speed_attack(ch_class1);
        double speedAtt2 = Chars.get_speed_attack(ch_class2);
        double sp1 = 0.0;
        double sp2 = 0.0;


        int critical = 0;

        while (chChars1[0] > 0 && chChars2[0] > 0) {
            int dice1 = Randomizing.diceVal();
            int dice2 = Randomizing.diceVal();

            sp1 += speedAtt1;
            sp2 += speedAtt2;

            System.out.println("dice 1 thrown : " + dice1);
            System.out.println("dice 2 thrown : " + dice2);


            if (sp1 >= 1.0 && dice1 > chChars2[2]) {

                if (dice1 > 95) {
                    critical = 20;
                } else {
                    critical = 0;
                }

                chChars2[0] -= Randomizing.attackVal(chChars2[2], chChars1[3], chChars1[4], critical);
                sp1 -= 1.0;
                System.out.println(ch_class1 + " => " + ch_class2);
            } else if (sp1 < 1.0 && dice1 > chChars2[2]) {
                System.out.println("Игрок " + ch_class1 + " готовится удартить.");
            } else {
                System.out.println("PLAYER " + ch_class1 + " MISSED )))");
            }


            if (sp2 >= 1.0 && dice2 > chChars1[2]) {

                if (dice2 > 95) {
                    critical = 20;
                } else {
                    critical = 0;
                }

                chChars1[0] -= Randomizing.attackVal(chChars1[2], chChars2[3], chChars2[4], critical);
                sp2 -= 1.0;
                System.out.println(ch_class2 + " => " + ch_class1);
            } else if (sp2 < 1.0 && dice2 > chChars1[2]) {
                System.out.println("Игрок " + ch_class2 + " готовится удартить.");
            } else {
                System.out.println("PLAYER " + ch_class2 + " MISSED )))");
            }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("=======================");
        }

        if (chChars1[0] <= 0) {
            System.out.println("THE WINNER IS PLAYER " + ch_class2);
        } else if (chChars2[0] <= 0) {
            System.out.println("THE WINNER IS PLAYER " + ch_class1);
        } else if (chChars1[0] <= 0 && chChars2[0] <= 0) {
            System.out.println("Самоубилися!!! ");
        }


    }


}