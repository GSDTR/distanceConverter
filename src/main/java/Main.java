public class Main {
    public static void main(String[] args) {
        Main run = new Main ();
        run.start(args);
    }

    void start(String[] args) {
        if (args[0].equals("-ktom")) {
            System.out.printf("Kilometers to miles = %.3f", kilToMil(Double.parseDouble(args[1])));
        }
    }
    double kilToMil(double dist) {
        return dist/1.609;
    }
}