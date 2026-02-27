package org.example;


public class Q3capTheFirst {
    public String findpos(String st){
        String[] str = st.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            char ch =  Character.toUpperCase(s.charAt(0));
            sb.append(ch).append(s.substring(1,s.length())).append(" ");
        }
        return sb.toString();

    }
}
