package tm.fight;

public class Main {

    public static void main(String[] args) {

        int hp1 = 100;
        int hp2 = 100;

        int AtSpAg = 1;
        int AtSpSt = 0;

        int SpAg = SpeedAt.Sped(AtSpAg);
        int SpeedAg;

        int SpSt = SpeedAt.Sped(AtSpSt);
        int SpeedSt;

        while (hp1 > 0 && hp2 > 0){

            int dice1 = RandomMashine.dice_value();
            int dice2 = RandomMashine.dice_value();

            SpeedAg = SpAg + SpeedAt.Sped(AtSpAg);
            SpeedSt = SpSt + SpeedAt.Sped(AtSpSt);


            System.out.println("dice 1 thrown : " + dice1);
            System.out.println("dice 2 thrown : " + dice2);
            System.out.println("dice 2 thrown : " + SpAg);
            System.out.println("dice 2 thrown : " + SpSt);

            if(dice1 > dice2){
                hp2 -= RandomMashine.Dam_St();
                System.out.println("PLAYER St => PLAYER Ag");
            } else if (dice1 == dice2){
                System.out.println("PLAYERS MISSED )))");
            } else {
                hp1-= RandomMashine.Dam_Ag();
                System.out.println("PLAYER St <= PLAYER Ag");
            }
            System.out.println("HP1 :" + hp1 + "        HP2 : " + hp2);

            System.out.println("====================");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        if(hp1 <= 0){
            System.out.println("THE WINNER IS PLAYER Ag");
        } else {
            System.out.println("THE WINNER IS PLAYER St");
        }


    }
}