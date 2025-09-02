public class App {
    public static void main(String[] args) throws Exception {
        //Visar upp menyn
        System.out.println("Meny:");
        String[] meny = {"Addition", "Subtraktion", "Multiplikation", "Division", "Avsluta"};
        for (int i = 0; i < meny.length; i++) {
            System.out.println(i+1 + "." + meny[i]);
        }
    }
}
