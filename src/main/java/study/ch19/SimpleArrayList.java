package study.ch19;

import java.util.Arrays;

public class SimpleArrayList {
    private String[] strs;


    public SimpleArrayList() {
        strs = new String[0];

    }

    public void add(String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[strs.length] = str;
        this.strs = newStrs;
    }

    //    크기를 넘어서는 인덱스 위치에 추가는 불가능
    public void add(int index, String str) {
        if (strs.length < 1){
            return;
        }

        String[] newStrs = new String[strs.length + 1];

        for (int i = 0; i < strs.length; i++) {
            int currentIndex = i < index ? i : i + 1;
            newStrs[currentIndex] = strs[i];
        }

        newStrs[index] = str;
        strs = newStrs;
    }


    public void pop() {
        if (strs.length < 1){
            return;
        }
        String[] newStrs = new String[strs.length - 1];
        for (int i = 0; i < newStrs.length; i++) {
            newStrs[i] = strs[i];
        }
        this.strs = newStrs;
    }

    public void remove(int str) {
        int foundIndex = -1;
        for (int i = 0; i < strs.length; i++) {
            foundIndex = -1;
            if (strs[i].equals(str)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            return;
        }
        remove(foundIndex);

    }


    public String[] getStrs() {
        return strs;
    }




}

class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();
        list.add("신동수");
        list.add("헌동수");
        list.add(1,"헌정수");
        list.add(3,"헌정화");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));

        SimpleArrayList list1 = new SimpleArrayList();

        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("6");
        list1.add("5");

        System.out.println(Arrays.toString(list1.getStrs()));

        list1.remove(3);
        System.out.println(Arrays.toString(list1.getStrs()));
    }
}