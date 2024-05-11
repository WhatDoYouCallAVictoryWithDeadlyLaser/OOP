public class Question3 {

    private int number;

    public Question3() {
    }

    public Question3(int number) {
        this.number = number;
    }

    public void HailStone() {
        while (number != 1) {
            if(number % 2 != 0 & number != 1) {
                System.out.println(number + " is an odd, so we take 3*n+1: " + (number*3+1));
                number = number*3+1;
            } else {
                System.out.println(number + " is an even, so we take n/2: " + number/2);
                number /= 2;
            }
        }
    }
}
