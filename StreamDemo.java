import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;
public class StreamDemo {

public static void main(String[] args){

    int[] arr = {3, 6, 7,2, 10, 4};

    List<Integer> list=new ArrayList<Integer>(arr.length);

    for (int i:arr){
        list.add(i);
    }

   Collections.sort(list);
   Collections.reverse(list);  

   System.out.println(list.get(0));

   /*
   for(Integer element:list){
       System.out.println(element);
   }
   */

   //System.out.println("Second largest is  = " + list.get(list.get(2)));

 


}

}