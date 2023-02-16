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
        if (args[0].equals("-ktov")) {
            System.out.printf("Kilometers to versts = %.3f", kilToVer(Double.parseDouble(args[1])));
        }
        if (args[0].equals("-mtov")) {
            System.out.printf("Miles to versts = %.3f", milToVer(Double.parseDouble(args[1])));
        }
        if (args[0].equals("-vtom")) {
            System.out.printf("Versts to miles = %.3f", verToMil(Double.parseDouble(args[1])));
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
    double kilToVer(double dist) {
        return dist/1.067;
    }
    double milToVer(double dist) {
        return dist*1.509;
    }
    double verToMil(double dist) {
        return dist/1.509;
    }
}