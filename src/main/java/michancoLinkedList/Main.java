package michancoLinkedList;

import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cell cell1 = new Cell("Hello world");
        System.out.println(cell1);

        MichancoLinkedList master = new MichancoLinkedList();
        master.addCell(4.34);
        master.addCell("g");
        master.addCell("wwww");
        master.addCell(76566);
        master.addCell("7wywwhw");
        master.getWight();
        master.printMem();
        master.printMLL();
        Object newO = master.getElForPosition(5);
        System.out.println(newO);

    }
}
