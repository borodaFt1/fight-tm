package tm.fight;

public class Char {
    public static int classHP() {
        int hpCh;
        if (RandomMashine.typeCh() > 50) {
            hpCh = 150;
        } else {
            hpCh = 100;
        }
        return hpCh;
    }

    public static int Sped(int hp) {

        int sp;
        if (hp <= 100 ) {
            sp = 10;
        } else {
            sp = 10;
        }
        return sp;
    }

    public static String NameCh(int hp) {

        String sp;
        if (hp <= 100 ) {
            sp = "Agility";
        } else {
            sp = "Strange";
        }
        return sp;
    }
}
