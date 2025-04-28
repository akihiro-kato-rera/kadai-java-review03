package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam bas01= new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        bas01.report();

        BaseBallTeam bas02 = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        bas02.report();

        BaseBallTeam bas03 = new BaseBallTeam("阪神タイガース",68,71,4);
        bas03.report();

        BaseBallTeam bas04 = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        bas04.report();

        BaseBallTeam bas05 = new BaseBallTeam("広島東洋カープ",66,74,3);
        bas05.report();

        BaseBallTeam bas06 = new BaseBallTeam("中日ドラゴンズ",66,75,2);
        bas06.report();
    }
}
