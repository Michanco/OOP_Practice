package michancoLinkedList;

import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        MichancoLinkedList master = new MichancoLinkedList();
        master.addCell(4.34);
        master.addCell("g");
        master.addCell("wwww");
        master.addCell(76566);
        master.addCell("7wywwhw");
        master.getWight();
        master.printMem();
        master.printMLL();
        Object newO = master.getCellForPosition(2);
        System.out.println(newO);
        master.removeCellForPosition(0);
        master.printMem();
        master.printMLL();
        Object new1 = master.getCellForPosition(2);
        System.out.println(new1);

    }
}
