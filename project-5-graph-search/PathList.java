import java.util.LinkedList;

public class PathList {

    private LinkedList<Path> list;

    public PathList() {
        this.list = new LinkedList<Path>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int size() {
        return this.list.size();
    }

    public void addFirst(Path path) {
        this.list.addFirst(path);
    }

    public void addLast(Path path) {
        this.list.addLast(path);
    }

    public Path peekFirst() {
        return this.list.peekFirst();
    }

    public Path peekLast() {
        return this.list.peekLast();
    }

    public Path removeFirst() {
        return this.list.removeFirst();
    }

    public Path removeLast() {
        return this.list.removeLast();
    }

}
