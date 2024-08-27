import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // float redi = sc.nextFloat();
        // float area = 3.14f * (redi * redi);
        // System.out.println(area);

        // char a = 'a';
        // char b = 'b';

        // System.out.println(b-a);



    //    int a = 10;
    //    int b = ++a;
    //    System.out.println(b);




       // loops 

    //    int count = 1;
    //    while (count<=10) {
    //     System.out.println(count); 
    //     count++;
    //    }

    //    int num = 1;
    //    System.out.println("enter your no.");
    //    int user = sc.nextInt();
    //    while (num<=user) {
    //     System.out.println(num);
    //     num+=1;     
    //    }


    // int nat = 5;
    // int sum = 0;
    // int i = 1;
    // while (i<=nat) {
    //     sum*=i;
    //     i++;     
    // }
    // System.out.println(sum);

    // int r = 10899;
    // while (r>0) {
    //      int lastDigit = r%10;
    //      System.out.print(lastDigit + " ");
    //      r = r/10;

        
    // }
    // System.out.println();

    // int fact = 4;
    // int num = 0;
    // for(int i=num; i<=fact; i++){
    //      fact = fact * i;
    //      i++;

    // }
    // System.out.println(b);


    
         
    // for(int i = 1; i<=4;i++){
    //     for (int j = 1; j<=i; j++){
    //         System.out.print("*");
    //     }
    // System.out.println();
    // }


    // int counter = 0;
    // while(counter<=10){
    //     System.out.println("hello world");
    //     counter++;
    // }

    // int count = 1;
    // while(count<= 10){
    //     System.out.println(count);
    //     count++ ;
    // }

    // System.out.print("enter your no. ");
    // int n = sc.nextInt();
    // int b = 1;
    // // for(int i=1; i<=n;i++){
    // //     System.out.print(i+" ");
    // // }

    // while(b<=n){
    //     System.out.print(b+" ");
    //     b++;
    // }
    // int num =10;
    // int sum =0;
    // int count =1;
    // while(count<=num){
    //     sum = sum+count;
    //     count++;
    // }
    // System.out.println("this is natural no. "+ sum );

    // for(int i=1; i<=4;i++){ 
    //     System.out.println("* * * *");
        
        
    // }
// reverse number
    

        // int r = 10899;
        // while (r>0) {
        //     int lastdigit= r%10;
        //     System.out.print(lastdigit);

        //      r= r/10;
        // }

        // int count = 1;
        // do { 
        //     System.out.println("hello world");
        //     count++;
        // } while (count<=10);

        
        
        
        
        // for(int i=1;i<=10;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        //  int n = sc.nextInt();

        //  boolean isprime = true;

        //  if(n==2){
        //     System.out.print("n is prime");
        //  }else{

        //     for(int i = 2;i<=n-1;i++){
        //         if(n%i==0){
        //             isprime =  false;
        //         }
        //     }

        //     if(isprime == true){
        //         System.out.println("n is prime");
        //     }else{
        //         System.out.println("n is not prime");
        //     }
        //  }




        // Pattern

        for(int line=1; line<=5; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        int a = 5;
        for(int i=1; i<=a; i++){
            for(int j=1; j<=a; j++){
                if(i==j){
                    System.out.print(i);
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }


















    


    








    }
    
}
