import java.util.HashSet;

public class StateSet {

    private HashSet<State> set;

    public StateSet() {
        this.set = new HashSet<State>();
    }

    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    public int size() {
        return this.set.size();
    }

    public void add(State state) {
        this.set.add(state);
    }

    public boolean contains(State state) {
        return this.set.contains(state);
    }
    
    public void remove(State state) {
        this.set.remove(state);
    }

}
