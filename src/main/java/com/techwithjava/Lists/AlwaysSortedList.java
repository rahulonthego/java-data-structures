/**
 * @author rahul
 * @created 08/09/2018
 */
package com.techwithjava.Lists;

/**
 * @author rahul
 * @created 08/09/2018
 */
import java.util.LinkedList;

/**
 * Maintain a sorted linked list
 */
public class AlwaysSortedList<T> {

    private LinkedList<T> list;
    private ORDER order;

    public AlwaysSortedList(ORDER order){
        list = new LinkedList<T>();
        this.order = order;
    }

    private boolean compare(T item, T itemb){
        if(item == null || itemb == null){
            return false;
        }

        if (order == ORDER.ASCENDING){
            return item.hashCode() >= itemb.hashCode();
        }
        return item.hashCode() <= itemb.hashCode();
    }

    /**
     * Worst case insert assuming we can use hashcode to compare objects in question
     * Big O(n) for insert
     * @param item
     */
    public void insert(T item){

        //add the item in the right order
        //for ascending order list - you want a move forward until you find the position
        //to insert the new item
        int i = 0;
        while (i < list.size() && compare(item, list.get(i))){
            i++;
        }

        list.add(i, item);

    }

    public T getValue(int index){
        return list.get(index);
    }

    public int getSize(){
        return list.size();
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        for(T item : list){
            builder.append(item.toString() + "-->");
        }

        return builder.toString();
    }

    public static enum ORDER{
        ASCENDING,
        DESCENDING;
    }

}



