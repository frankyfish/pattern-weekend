package patterns.singleton;

public class CheckSingle {
    public static void main(String[] args) {
        Single single = Single.getInstance();
        System.out.println(single.hashCode());
        Single single1 = Single.getInstance();
        System.out.println(single1.hashCode());

        System.out.println("Same?  " + single.equals(single1));
    }
}
