package Lesson1;

import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {

       //String[] arr={"horse", "dog", "cat", "horse", "dog"};
        String[] arr=args;
       String[] newArr=new String[arr.length];
       int count=0;
       for (int i=0; i<arr.length;i++)
       {
           var flag=false;
           for (int j=0;j<count;j++)
            {
                if (arr[i]==newArr[j])
                    flag=true;
            }
           if (flag==false)
           {
               newArr[count++]=arr[i];
           }
       }
       newArr=Arrays.copyOf(newArr,count);
       System.out.println(Arrays.toString(newArr));
    }

}
