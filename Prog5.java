package Lesson1;

public class Prog5 {
    public static void main(String[] args) {
        int[] num={2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(num);
    }
    public static void secondMin(int[] arrayOfInts)
    {
        int min=Integer.MAX_VALUE;
        for (int i : arrayOfInts)
        {
            if (i<min) min=i;
        }
        int secoudMin=Integer.MAX_VALUE;
        for (int i : arrayOfInts)
        {
            if (i<secoudMin && i>min) secoudMin=i;
        }
        System.out.println(secoudMin);

    }
}
