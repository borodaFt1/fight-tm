package tm.fight;

public class Action {
    public static void action(){

        int hpCh1 = Char.classHP();
        int hpCh2 = Char.classHP();

        int sp1 =0;
        int sp2 =0;
        int spCh1 = Char.Sped(hpCh1);
        int spCh2 = Char.Sped(hpCh2);

        String nmCh1 = Char.NameCh(hpCh1);
        String nmCh2 = Char.NameCh(hpCh2);


        while (hpCh1 > 0 && hpCh2 > 0){
            int dice1 = RandomMashine.dice_value();
            int dice2 = RandomMashine.dice_value();


            int s1 = sp1 + spCh1;
            int s2 = sp2 + spCh2;

            System.out.println("dice 1 thrown : " + dice1);
            System.out.println("dice 2 thrown : " + dice2);

            if(s1 >= 10 && dice1 > 20) {
                hpCh2 -= RandomMashine.Dam_St();
                s1 = s1 - 10;
                System.out.println(nmCh1 + " => " + nmCh2);
            }   else {
                System.out.println("PLAYER " + nmCh1 + " MISSED )))");
            }

            if(s2 >= 10 && dice2 > 20) {
                hpCh1 -= RandomMashine.Dam_St();
                s2 = s2 - 10;
                System.out.println(nmCh1 + " <= " + nmCh2);
            }   else {
                System.out.println("PLAYER " + nmCh2 + " MISSED )))");
            }

            System.out.println(nmCh1 + " " + hpCh1 + "       " + nmCh2 + " " + hpCh2);

            /*
            if(dice1 > dice2){
                hpCh2 -= RandomMashine.Dam_St();
                System.out.println(nmCh1 + " => " + nmCh2);
            } else if (dice1 == dice2){
                System.out.println("PLAYERS MISSED )))");
            } else {
                hpCh1-= RandomMashine.Dam_Ag();
                System.out.println(nmCh1 + " <= " + nmCh2);
            }
            System.out.println("HP1 :" + hpCh1 + "        HP2 : " + hpCh2);
            */

            System.out.println("====================");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            /*
            if(hpCh1 <= 0){
                System.out.println("THE WINNER IS PLAYER "+nmCh1);
            } else {
                System.out.println("THE WINNER IS PLAYER "+nmCh2);
            }
            */

        }
    }
}
