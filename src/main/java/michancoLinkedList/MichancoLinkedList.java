package michancoLinkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public  class MichancoLinkedList implements Iterable<Cell>{
    private final Cell[] masterList = new Cell[2];
    Map<Integer, Cell> memoryMap = new HashMap<>();
    public void printMem(){
        System.out.println(memoryMap.values());
    }
    public MichancoLinkedList() {

    }
    public MichancoLinkedList(Object first) {
        masterList[0] = new Cell(first);
        masterList[0].mainHash = masterList[0].hashCode();
        memoryMap.put(masterList[0].mainHash, masterList[0]);
    }
    public MichancoLinkedList(Object first, Object last) {
        masterList[0] = new Cell(first);
        masterList[0].mainHash = masterList[0].hashCode();
        masterList[0].nextHash = masterList[1].mainHash;
        memoryMap.put(masterList[0].mainHash, masterList[0]);
        masterList[1] = new Cell(last);
        masterList[1].mainHash = masterList[1].hashCode();
        masterList[1].prewHash = masterList[0].mainHash;
        memoryMap.put(masterList[1].mainHash, masterList[1]);

    }

    @Override
    public String toString() {
        return String.format("[ %s , %s ]", masterList[0].content, masterList[1].content);
    }

    public void printMLL(){
        System.out.println(masterList[0].toString());
        System.out.println(masterList[1].toString());
    }

    public int getWight(){
        int wight = memoryMap.size();
        return wight;
    }

    public void addCell(Object content){
        Cell newCell = new Cell(content);
        newCell.mainHash = newCell.hashCode();
        if (masterList[0] == null){
            masterList[0] = newCell;
            memoryMap.put(newCell.mainHash,newCell);
        } else if (masterList[1] == null) {
            masterList[0].nextHash = newCell.mainHash;
            masterList[1] = newCell;
            masterList[1].prewHash = masterList[0].mainHash;
            memoryMap.put(newCell.mainHash, newCell);
        }
        else {
            Cell temp = newCell;
            masterList[1].nextHash = temp.mainHash;
            temp.prewHash = masterList[1].mainHash;
            memoryMap.put(masterList[1].mainHash, masterList[1]);
            masterList[1] = temp;
            memoryMap.put(newCell.mainHash, newCell);
        }

    }

    public Object getCellForPosition(int position){
        int i = 0;
        if (position == 0) return masterList[0].content;
        else if (position == memoryMap.size() - 1) return masterList[1].content;
        else if (position > memoryMap.size() - 1 || position < 0) {
            System.out.println("Position is out of range");
            return null;
        }
        else {
            if (position <= memoryMap.size()/2) {
                Cell temp = masterList[0];
                while (i < position) {
                    temp = memoryMap.get(temp.nextHash);
                    i++;
                }
                return temp.content;
            } else {
                i = memoryMap.size() -1;
                Cell temp = masterList[1];
                while (i > position) {
                    temp = memoryMap.get(temp.prewHash);
                    i--;
                }
                return temp.content;
            }
        }
    }
    public void removeCellForPosition ( int position){
        int i = 0;
        if (position == 0) {
            Cell temp = memoryMap.get(masterList[0].nextHash);
            temp.prewHash = 0;
            memoryMap.remove(masterList[0].mainHash);
            masterList[0] = temp;
        } else if (position == memoryMap.size() - 1) {
            Cell temp = memoryMap.get(masterList[1].prewHash);
            temp.nextHash = 0;
            memoryMap.remove(masterList[1].mainHash);
            masterList[1] = temp;
        } else if (position > memoryMap.size() - 1 || position < 0) {
            System.out.println("Position is out of range");
        } else {
            if (position <= memoryMap.size()/2) {
                Cell temp = masterList[0];
                while (i < position) {
                    temp = memoryMap.get(temp.nextHash);
                    i++;
                }
            } else {
                i = memoryMap.size() - 1;
                Cell temp = masterList[1];
                while (i > position) {
                    temp = memoryMap.get(temp.prewHash);
                    i--;
                }
                memoryMap.get(temp.prewHash).nextHash = memoryMap.get(temp.nextHash).mainHash;
                memoryMap.get(temp.nextHash).prewHash = memoryMap.get(temp.prewHash).mainHash;
                memoryMap.remove(temp.mainHash);
            }
        }

    }

    @Override
    public Iterator<Cell> iterator() {
        return new Iterator<Cell>() {
            Cell temp = masterList[0];
            @Override
            public boolean hasNext() {
                return temp.nextHash != 0;
            }

            @Override
            public Cell next() {
                temp = memoryMap.get(temp.nextHash);
                return temp;
            }
        };
    }
}
