package org.example;


import java.util.ArrayList;
import java.util.List;

public class Q1findline {
    public List<Integer> findline(String qs) {
        String tgt = "line";
        List<Integer> list = new ArrayList<>();
        int len = tgt.length();
        for(int i =0;i+len<qs.length();i++){
            if(qs.substring(i,i+len).equalsIgnoreCase(tgt)) {
                list.add(i);
            }
        }
//        return list;
//        System.out.println(tgt.equals("line"));
        return list;
    }

}
