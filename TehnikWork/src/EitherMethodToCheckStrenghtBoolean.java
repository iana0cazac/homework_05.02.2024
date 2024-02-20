public class EitherMethodToCheckStrenghtBoolean {
    public static void main(String[] args) {

        String ork1 = "Ork1";
        String ork2 = "Ork2";

        boolean isOrk1Stronger;
        boolean hasOrk1Power100 = true;
        boolean hasOrk1Speed100 = true;
        boolean hasOrk1Size100 = true;
        isOrk1Stronger = hasOrk1Power100 && hasOrk1Speed100 && hasOrk1Size100;

        boolean isOrk2Stronger;
        boolean hasOrk2Power100 = false;
        boolean hasOrk2Speed100 = true;
        boolean hasOrk2Size100 = true;
        isOrk2Stronger = hasOrk2Power100 && hasOrk1Speed100 && hasOrk2Size100;

        if (isOrk1Stronger = isOrk2Stronger) {
            System.out.println("Ork1 is not stronger than Ork2.");
        } else {
            System.out.println("Ork1 is stronger than Ork2.");
        }

    }

}
