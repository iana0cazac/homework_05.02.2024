import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

    Battleground battleground1 = new Battleground(30, 30);
    Battleground battleground2 = new Battleground(50,50);
    Battleground battleground3 = new Battleground(100, 100);

    battleground1.name = "Battleground";

    Orki orki1 = new Orki(30,3);
    Orki orki2 = new Orki(50,5);
    Orki orki3 = new Orki(121,10);
    Orki orki4 = new Orki(120, 20);

        int randNumber = random.nextInt(1,100);
        System.out.println("Тип боевого поля и тип ваших орков определяет номер который вам совпаст.");
        System.out.println("1 до 30, игра на " + battleground1 + " с орками типа: " + orki1 +
                "\n30 до 50, игра на " + battleground2 + " с орками типа: " + orki2 +
                "\n50 do 100, игра на " + battleground3 + " с орками типа: " + orki3 + "\nВаш номер: " + randNumber);

        System.out.println("Название вашего поля боя: " + battleground1.name);
        orki1.toDisposeOnTheBattle();

        System.out.println("Кто сильнее? Орк1 или Oрк2..");
        System.out.println("Сила Орк1 составляет: " + orki1.power);
        System.out.println("Сила Орк2 составляет: " + orki2.power);

        if (orki1.power > orki2.power){
            System.out.println("Орк1 сильнее чем Орк2.");
        }   else {
            System.out.println("Орк2 сильнее чем Орк1.");
        }
        System.out.println("Кто сильнее? Орк3 или Oрк4..");
        System.out.println("Сила Орк3 составляет: " + orki3.power);
        System.out.println("Сила Орк4 составляет: " + orki4.power);

        if (orki3.power <= 110){
            System.out.println("Орк3 на (минимум) 10 баллов слабее чем Орк4, он доджен покинуть поле боя.");
        }   else if (orki3.power > 110 && orki3.power < 120){
            System.out.println("Орк3 не слабее на мнрго чем Ork4, он остается воевать.");
        }   else if (orki3.power == orki4.power){
        System.out.println("Орк3 имеет одинаковую силу с Ork4, он остается воевать.");
        }
        else {
            System.out.println("Орк3 не слабее чем Орк 4, к нему на помощь спешат другие бойцы.");
        }
    }
}
