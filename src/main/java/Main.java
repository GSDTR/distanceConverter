public class Main {
    public static void main(String[] args) {
        Main run = new Main ();
        run.start(args);
    }

    void start(String[] args) {
        if (args[0].equals("-ktom")) {
            System.out.printf("Kilometers to miles = %.3f", kilToMil(Double.parseDouble(args[1])));
        }
        if (args[0].equals("-mtok")) {
            System.out.printf("Miles to kilometers = %.3f", milToKil(Double.parseDouble(args[1])));
        }
        if (args[0].equals("-vtok")) {
            System.out.printf("Versts to kilometers = %.3f", verToKil(Double.parseDouble(args[1])));
        }
    }
    double kilToMil(double dist) {
        return dist/1.609;
    }
    double milToKil(double dist) {
        return dist*1.609;
    }
    double verToKil(double dist) {
        return dist*1.067;
    }
}