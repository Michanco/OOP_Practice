package michancoLinkedList;

import lesson3StandartInlerfaces.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public  class MichancoLinkedList implements Iterable<Cell>{
    public int wight = 0;
    private Cell[] masterList = new Cell[2];
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
        wight += 1;
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
        wight += 2;

    }

    @Override
    public String toString() {
        return String.format("[ %s , %s ]", masterList[0].content, masterList[1].content);
    }

    public void printMLL(){
        System.out.println(masterList[0].toString());
        System.out.println(masterList[1].toString());
    }

    public void getWight(){
        System.out.println(wight);
    }

    public void addCell(Object content){
        wight += 1;
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

    public Object getElForPosition(int position){
        int i = 0;
        if (position == 0) return masterList[0].content;
        else if (position == wight - 1) return masterList[1].content;
        else if (position > wight - 1) {
            System.out.println("Position is out of range");
            return null;
        }
        else {
            Cell temp = masterList[0];
            while ( i != position){
                temp = memoryMap.get(temp.nextHash);
                i++;
            } return temp.content;
        }

    }

    @Override
    public Iterator<Cell> iterator() {
        Cell temp = masterList[0];
        return new Iterator<Cell>() {
            @Override
            public boolean hasNext() {
                return temp.nextHash != 0;
            }

            @Override
            public Cell next() {
                return memoryMap.get(temp.nextHash);
            }
        };
    }
}
