package michancoLinkedList;

import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        MichancoLinkedList master = new MichancoLinkedList();
        master.addCell(4.34);
        master.addCell("g");
        master.addCell("wwww");
        master.addCell(99999);
        master.addCell(100000);
        master.addCell(23);
        master.addCell(2.456);
        master.getWight();
        master.printMem();
        master.printMLL();
        Object newO = master.getCellForPosition(2);
        System.out.println(newO);
//        master.removeCellForPosition(0);
//        master.printMem();
//        master.printMLL();
        Object new1 = master.getCellForPosition(5);
        System.out.println(new1);

    }
}
