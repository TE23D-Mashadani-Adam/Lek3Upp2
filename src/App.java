import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        // Visar upp menyn
        System.out.println("Meny:");
        String[] meny = { "Addition", "Subtraktion", "Multiplikation", "Division", "Avsluta" };
        for (int i = 0; i < meny.length; i++) {
            System.out.println(i + 1 + "." + meny[i]);
        }

        //Användaren får välja metod
        int val = 0;
        boolean correctVal = false;
        System.out.println("Välj typ:");
        while (!correctVal) {
            try{
                val = scanner.nextInt();
            }catch(InputMismatchException b){
                correctVal = false;
                scanner.nextLine();
            }

            if (val >= 1 && val <= 5) {
                correctVal = true;
            }else{
                System.out.println("Snälla skriv en siffra 1-5");
                correctVal = false;
            }
        }

        if (val == 5) {
            break;
        }

        double tal1 = 0;
        double tal2 = 0;

        //Användaren väljer sina tal
        boolean correctVal2 = false;
        while (!correctVal2) {
              try{
                System.out.println("Välj tal 1:");
                tal1 = scanner.nextDouble();
                System.out.println("Välj tal 2:");
                tal2 = scanner.nextDouble();

                correctVal2 = true;
            }catch(InputMismatchException b){
                System.out.println("Välj endast siffror!");
                scanner.nextLine();
            }
        }

        //Metoder tillämpas beroende på användarens val
        double resultat = 0;
        switch (val) {
            case 1:
                resultat = Addition(tal1, tal2);
                break;
            case 2:
                resultat = Subtraktion(tal1, tal2);
                break;
            case 3:
                resultat = Multiplikation(tal1, tal2);
                break;
            case 4:
                resultat = Division(tal1, tal2);
                break;
            default:
                break;
        }
        System.out.println("Resultat: " + resultat);

    }
    }

    //Metoder för miniräknaren

    static double Addition(double tal1, double tal2) {
        return tal1 + tal2;
    }

    static double Subtraktion(double tal1, double tal2) {
        return tal1 - tal2;
    }

    static double Multiplikation(double tal1, double tal2) {
        return tal1 * tal2;
    }

    static double Division(double tal1, double tal2) {
        return tal1 / tal2;
    }

}
