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
}
