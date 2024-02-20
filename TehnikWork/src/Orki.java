public class Orki {
    String faither = "Ork";

    //private int power, private int orksize
    int power = 0;
    int orkSize = 0;
    int numberOfOrks = 4;

    boolean areOrksOnBattleground = false;

    public void toDisposeOnTheBattle() {
        areOrksOnBattleground = true;
        System.out.println("Число ваших орков, готовых к битве на этом поле боя: " + numberOfOrks + ";" + "" +
                "\nстоят орки вашего типа на поле боя, готовые отоковать?" + " - " + areOrksOnBattleground);
    }
    public Orki(int powerValue, int orkSizeValue){
        power = powerValue;
        orkSize = orkSizeValue;
    }
}
