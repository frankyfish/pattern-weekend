package patterns.singleton;

public class SingleChild {
    private static SingleChild childSelf;

    private SingleChild() {
    }

    public static SingleChild getInstance() {
        if(childSelf == null) {
            childSelf = new SingleChild();
        }
        return childSelf;
    }
}
