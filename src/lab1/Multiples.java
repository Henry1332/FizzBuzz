package lab1;

public class Multiples {
    public static void main(String[] args){
        int count = multiples();
        System.out.println(count);
    }
    public static int multiples(){
        return multiples(1000,3,5);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }

        }
        return count;
    }
}
