package session10;

public class _2_UncheckedException {
    public static void main(String[] args){
        // 1
        // int a=50/0;//ArithmeticException


        //2
        String s=null;
        System.out.println(s.length());//NullPointerException

        //3
        String s1="abc";
        int i=Integer.parseInt(s1);//NumberFormatException

        //4
        String s2="abc";
        int i1=Integer.parseInt(s2);//NumberFormatException


    }
}

/*
Exception in thread "main" java.lang.NullPointerException
	at session10._2_UncheckedException.main(_2_UncheckedException.java:11)

 */