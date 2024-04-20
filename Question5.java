import java.util.*;

public class Question5 {
    private static final Scanner sc = new Scanner(System.in);
    private final ArrayList<Integer> list;


    public ArrayList<Integer> getList() {
        return list;
    }


    public Question5() {
        this.list = new ArrayList<>();
    }

    public Question5(ArrayList<Integer> list) {
        this.list = list;
    }

    public void inputList() {
        System.out.println("How many numbers do you want to add?");
        int n = sc.nextInt();
        System.out.println("Input the numbers");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
    }

    public void deleteFirst(int a) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == a) {
                list.remove(i);
                break;
            }
        }
    }

    public void replaceElement(int pos, int num){
        list.remove(list.size()-1);
        list.add(pos, num);
    }

    public void duplicateFinder(){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (Integer number : list) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }
    public void duplicateDeleter(){
        HashSet<Integer> seen = new HashSet<>();
        list.removeIf(i -> !seen.add(i));
        System.out.println(list);
    }

}