package previous.q_ali;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String [] args){
        TreeMap<String,ArrayList<String>> map=new TreeMap<>();
        String k1="algorithms";
        ArrayList<String> v1=new ArrayList<>(Arrays.asList("data structures"));
        String k2="calculus";
        ArrayList<String> v2=new ArrayList<>(Arrays.asList("linear algebra"));
        String k3="compliers";
        ArrayList<String> v3=new ArrayList<>(Arrays.asList("data structures",
                "formal languages",
                "computer organization"));
        String k4="data structures";
        ArrayList<String> v4=new ArrayList<>(Arrays.asList("mathematics"));

        map.put(k1,v1);
        map.put(k2,v2);
        map.put(k3,v3);
        map.put(k4,v4);

        printNode(map);

    }

    public static void printNode(TreeMap<String, ArrayList<String>> map){
        while(map.size()>0){
            String s=findStart(map);
            System.out.println(s);
        }
    }

    public static String findStart(TreeMap<String, ArrayList<String>> map){
            String result="";
            for(String s:map.keySet()){
                if(map.get(s).size()==0){
                    result=s;
                    deleteNode(result,map);
                    return result;
                }
                for(int j=0;j<map.get(s).size();j++){
                    if(!map.containsKey(map.get(s).get(j))){
                        result=map.get(s).get(j);
                        deleteNode(result,map);
                        return result;
                    }
                }
            }
            return result;
    }

    public static void deleteNode(String s,TreeMap<String, ArrayList<String>> map){
        map.remove(s);
        for(String s1:map.keySet()){
            ArrayList<String> value=map.get(s1);
            for(int j=0;j<value.size();j++){
                if(value.get(j).equals(s)){
                    value.remove(j);
                    j--;
                }
            }
        }
    }
}
