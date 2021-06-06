package com.javapractice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberPlaylist {

    public static void main(String[] args) {

      List<Integer> list = new ArrayList<Integer>();
      for(int i=1;i<=10;i++){
          list.add(i);
      }
        Iterator<Integer> I = list.iterator();
        while(I.hasNext()){
            Integer i = I.next();
            System.out.println(i);
        }
    }
}


