import java.util.Scanner;;

public class App {

    public static Scanner scanner = new Scanner(System.in);
    static char seatsMap[][] = new char[10][10];
    static int optionSelected;
    static boolean status = false;


    public static void main(String[] args) throws Exception {
        showStart();
    }

    public static void showStart(){
        System.out.println("\nTHIS IS THE SEATING RESERVATION SYSTEM OF THE AMPHITHEATER:");
        generateCleanSeatsMap();

        do {
            System.out.println("What do you want to do?:");
            System.out.println("1. Reserve a seat.\n2. Exit");
            
            try {
                optionSelected = scanner.nextInt();
                status = true;
                
            } catch (Exception e) {
                System.out.println("This option isn't available, please, select a valid option.\n");
                scanner.next(); // Without it, the programa loops infinitely in the catch.
            }

        } while (status == false);

    }

    public static void generateCleanSeatsMap() {
        for (int i=0; i < seatsMap.length; i++){
            for (int j=0; j < seatsMap[i].length; j++) {
                seatsMap[i][j] = 'L';
            }
            
            // Prints map
            for (int j=0; j< seatsMap[i].length; j++){
                System.out.print(seatsMap[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
