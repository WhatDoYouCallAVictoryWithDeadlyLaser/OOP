public class Question2 {

    private int x1;
    private int x2;
    private int x3;

    public Question2() {
    }

    public Question2(int x1, int x2, int x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public int MinNumber() {
        int min = x1;
        if (min>x2) {
            min = x2;
        }
        if (min>x3) {
            min = x3;
        }
        return x1 + x2 + x3;
    }
}
