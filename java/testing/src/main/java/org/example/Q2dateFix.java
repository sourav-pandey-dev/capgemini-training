package org.example;


public class Q2dateFix {
    public String datefix(String date) {
        String[] st = date.split("[^0-9]+");

        if(st[0].length()<2){
            st[0] = "0"+st[0];
        }

        if(st[1].length()<2){
            st[1] = "0"+st[1];
        }
        if(st[2].length()<=4){
            if(Integer.parseInt(st[2])>25){
                st[2] = "19"+st[2];
            }
            else {
                st[2] = "20"+st[2];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String str: st){
            sb.append(str);
        }
        return sb.toString();
    }
}