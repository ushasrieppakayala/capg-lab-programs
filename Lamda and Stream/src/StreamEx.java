import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
      public static void main(String args[])
      {
    	  List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8);
    	  List<Integer> evens=nums.stream()
    			                  .filter(i->i%2==0)
    			                  .map(i->i*i)
    			                  .collect(Collectors.toList());
    	  System.out.println("squares of evens is:"+evens);
    	 // List<Integer> evens=new ArrayList<>();
    	  //for(int i:nums)
    	  //{
    	//	  if((i%2)==0)
    		//	  evens.add(i);
    	  //}
    	  //int sum = 0;
    	  //for(int e:evens)
    		//  sum=sum+e*e;
    	  //System.out.println("Sum of squares of evens is:"+sum);
    		  
      }
}
