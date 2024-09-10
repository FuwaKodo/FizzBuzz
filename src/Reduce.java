public class Reduce {
    public static void main(String[] args) {
        int max_val = 100;
        int counter = 0;
        while (max_val != 0) {
            if (max_val % 2 == 0) {
                max_val = max_val / 2;
            }

            else{
                max_val--;
            }

            counter += 1;
        }

        System.out.println(counter);
    }
}
