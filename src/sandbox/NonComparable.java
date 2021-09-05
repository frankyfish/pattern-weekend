package sandbox;

public class NonComparable implements Comparable<NonComparable> {
    Integer id;

    public NonComparable(int i) {
        this.id = i;
    }

    @Override
    public int compareTo(NonComparable o) {
        if(o != null) {
            return this.id.compareTo(o.id);
        }
        return 1;
    }

    @Override
    public String toString() {
        return "NonComparable_" + this.id;
    }
}
