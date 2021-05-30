package previous;

import java.util.*;

public class TryJava {
    public static void main(String [] args){
        int a=101;
        String s=Integer.toString(a);
        int b=Integer.parseInt(s);
        System.out.println(b);
//        Integer [] data = new Integer [3];
//        data[0]=5;
//        data[1]=0;
//        data[2]=2;
//
//
//        String a="111";
//        a.length();
//        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(data));
//        Collections.sort(arr,Collections.reverseOrder());
//        for (int b:arr){
//            System.out.println(b);
//        }
//
//        Integer[] kk=(Integer[])arr.toArray(new Integer[3]);
//        for (int b:kk){
//            System.out.println(b);
//        }
//
//        Map<String,Integer> mp = new TreeMap<>();
//        mp.put("1",1);
//        mp.put("2",2);
//        mp.put("0",0);
//        mp.put("0",100);
//        mp.remove("1");
//        for (String key : mp.keySet()){
//            System.out.println(mp.get(key));
//        }
//
//        Set<Integer> set=new HashSet<Integer>(Arrays.asList(data));
//        set.add(5);
//        set.remove(0);
//        for (Integer i : set){
//            System.out.println(i);
//        }
//        System.out.println(set.contains(6));
    }

    static void changeVal(int [] arr){
        arr[0]=100;
    }



}
