public class Multiples {
    public static void main(String[] args) {

        //number of multiples of 3 or 5 in 1000
        int multiples = 0;
        for (int i=1; i< 1000; i++){
            if (i%5 == 0 || i%3 ==0) {
                multiples++;
            }
        }
        System.out.print("Multiples: " + multiples);
    }
}
