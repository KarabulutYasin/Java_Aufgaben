package de.month_1.fundamentals.day_8.List;

import de.helper.utiltiy.MainProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ListTask {

    public List returnInstanceOfList(){
        //TODO
        // Write a method that returns an instance of List, it does not matter which type of List

        return new ArrayList();
    }

    public List returnListWithNumbersOneToTen(){
        //TODO
        // Write a method that returns a list with the numbers from 1 to 10

        //Possible solution 1:
        return new ArrayList(List.of(1,2,3,4,5,6,7,8,9,10));

        //Possible solution 2:
        /*List<Integer> numberList = new ArrayList<>();
        for(int i = 1; i <=10;i++){
            numberList.add(i);
        }
        return numberList;*/
    }

    public String listToString(List list){
        //TODO
        // Write a method that takes a list as a parameter and returns it as a string
        // If the list is null, the string "null" should be returned

        return list == null ? "null": list.toString();
    }

    public List removeElement(List list, String element){
        //TODO
        // Write a method that removes an element from the list and returns the modified list
        // If the list is null, null should be returned

        if(list == null) return null;
        list.remove(element);
        return list;
    }

    public Boolean isElementInList(List list, String element){
        //TODO
        // Write a method that checks if an element is contained in the list
        // If the list is null, false should be returned

        if(list == null) return false;
        return list.contains(element);
    }

    public List sortList(List<Integer> list) {
        //TODO
        // Write a method that takes a list of numbers as a parameter and returns it sorted in ascending order
        // If the list is null, null should be returned

        if (list == null) return null;
        //Possible solution 1:
        list.sort(Integer::compareTo); // Integer::compareTo is the same as (a,b) -> a.compareTo(b)
        return list;

        //Possible solution 2:
        /*list.sort((a, b) -> a.compareTo(b)); // Lambda expression
        return list;*/
    }

    public static void main(String[] args) {
        //Does not need to be edited
        Method[] methods = ListTask.class.getDeclaredMethods();
        Class<?> clazz = ListTask.class;

        MainProvider.printAscii();
        for (Method method: methods) {
            if(method.getName().equals("main")) continue;
            if ("sortList".equals(method.getName())) MainProvider.exec(method,clazz, new ArrayList<>(List.of(3,1,2)));
            if ("listToString".equals(method.getName())) MainProvider.exec(method,clazz, new ArrayList<>(List.of(1,2,3)));
            if ("removeElement".equals(method.getName())) MainProvider.exec(method,clazz, new ArrayList<>(List.of("A","B","C")),"B");
            if ("isElementInList".equals(method.getName())) MainProvider.exec(method,clazz, new ArrayList<>(List.of("A","B","C")),"B");
            if ("returnInstanceOfList".equals(method.getName())) MainProvider.exec(method,clazz);
            if ("returnListWithNumbersOneToTen".equals(method.getName())) MainProvider.exec(method,clazz);
        }
    }
}