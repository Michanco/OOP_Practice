package michancoLinkedList;

import java.util.Iterator;

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
        int wight = master.getWight();
        System.out.println(wight);
        master.printMem();
        master.printMLL();
        Object newO = master.getCellForPosition(2);
        System.out.println(newO);
//        master.removeCellForPosition(0);
//        master.printMem();
//        master.printMLL();
//        Object new1 = master.getCellForPosition(5);
//        System.out.println(new1);
        System.out.println();
        Iterator<Cell> itr = master.iterator();
        Object new2 = master.getCellForPosition(0);
        System.out.println(new2);
        while(itr.hasNext()) {
            Cell element = itr.next();
            System.out.println(element.content);
        }

    }
}
