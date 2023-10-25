public class Nurellat {
    public static void main(String[] args) {
        int sumEven = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 ){
                sumEven = sumEven + i;
            }
        }
        System.out.println("Sum=" + sumEven);
    }
}
