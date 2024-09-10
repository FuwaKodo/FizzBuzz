public class Multiples {
    public static void main(String[] args) {
        int max_val = 1000;
        int counter = 0;
        max_val -= 1; //Since below max_val
        while (max_val >= 1) {
            if (max_val % 3 == 0 || max_val % 5 == 0) {
                counter++;
            }

            max_val -= 1;
        }

        System.out.println(counter);
    }
}
