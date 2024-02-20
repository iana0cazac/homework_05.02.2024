import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.next();

        switch (dayOfWeek){
            case "Monday":{
                System.out.println("You receive the letter1.");
                break;
            }
            case "Tuesday":{
                System.out.println("You receive the letter2.");
                break;
            }
            default: {
                System.out.println("..");
        }
        boolean iswensday = dayOfWeek.equals("Wensday");
            String wensdayMessage = "You receive the letter3.";
            String notwensdayMessage = "..";
            if (dayOfWeek.equals("Wensday")) {
                System.out.println(wensdayMessage);
            } else
            System.out.println(notwensdayMessage);
            }
        boolean isthursday = dayOfWeek.equals("Thursday");
          if (isthursday) {
            System.out.println("You receive the letter4.");
        } else {
            System.out.println("..");
        }
        boolean isfriday = dayOfWeek.equals("Friday");
        if (isfriday) {
            System.out.println("You receive the letter5.");
        } else {
            System.out.println("..");
        }



    }
}