package Lesson1;

public class Prog4 {
    public static void main(String[] args) {

        System.out.println(calculationA(20));
        System.out.println(calculationB(20));

    }
    public static double calculationA(int v)
    {
        double sum=0;
        for (int i=0; i<v;i++)
        {
            double tmp=1.0 / (2 * i + 1);
            if (i % 2 ==1)
                tmp *=-1;
            sum +=tmp;
        }
        return sum;
    }

    public static double calculationB(int v)
    {
        double sum=0;
        for (int i=1; i<=v;i++)
        {
            double tmp=i / (Math.pow(2,i));
            if (i % 2 ==0)
                tmp *=-1;
            sum +=tmp;
        }
        return sum;
    }
}
