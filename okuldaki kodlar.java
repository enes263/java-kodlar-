import java.util.Scanner;

//import java.util.Scanner;
//
//public class sayfa2 {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("sayı girin: ");
//        int number= input.nextInt();
//        if(number%2==0)
//        System.out.println("çift sayı");
//        else
//        System.out.println("tek sayı");
//    }
//
//}
//public class sayfa2 {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("1. sayıyı girin:");
//        int say1= input.nextInt();
//        System.out.print("2. sayıyı girin");
//        int say2= input.nextInt();
//        if (say1>say2)
//            System.out.println(say1+ "büyüktür"+ say2);
//        if (say1==say2)
//            System.out.println("Sayılar birbirine eşittir");
//        else
//            System.out.println(say1+"küçüktür "+say2+"den");
//    }
//}
public class sayfa2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz ");
        int say1= input.nextInt();
        int toplam=0;
        for (int i=0;i<=say1;i++)
            toplam+=i;
        System.out.println("toplam="+toplam);
  }
}

