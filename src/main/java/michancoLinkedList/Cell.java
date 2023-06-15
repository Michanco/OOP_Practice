package michancoLinkedList;

public class Cell {
    Object content;
    int prewHash;
    int mainHash;
    int nextHash;

    public Cell(Object content) {
        this.content = content;
        this.prewHash = 0;
        this.mainHash = 0;
        this.nextHash = 0;
    }

    @Override
    public String toString() {
        return String.format("%s  %d %d %d", content, prewHash, mainHash, nextHash);
    }
}
