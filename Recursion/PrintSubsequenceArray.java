import java.util.*;

public class Main {
    public static void main(String[] args) {
    int arr [] = {3,1,2};
    ArrayList<Integer> list = new ArrayList<>();
     subsequence(0,arr,list);
  
  }
  public static void subsequence(int index,int arr[],ArrayList<Integer> list){
    if(index==arr.length){
      if(list.size()>0)
      System.out.println(list);
      return;
    }
      
    list.add(arr[index]);
    subsequence(index+1,arr,list);
    list.remove(list.size()-1);
     subsequence(index+1,arr,list);
  }
}