public class gcd {
   /*  static int gcdfind(int a,int b ) // brute force method 
    { 
       int min = Math.min(a,b);
        for (int i = min; i>=1; i--) {
            if (a%i==0 && b%i==0) {
                return i;
            }
        }
        return 1;
    }*/
    static int lameGCD(int a,int b)   //Lame approach --> most efficient
    {   while (a!=0 && b!=0) {
        
    
          if(a>b)
          {
            a=a%b;  // replace the larger number by the max % min
          }
          else 
          b=b%a;
    }
    if (a!=0)
    return a;
    else
    return b;
}
    public static void main(String[] args) {
        int a=30 ;
        int b= 20;
       // System.out.println(gcdfind(a,b));
       System.out.println(lameGCD(a,b));
    }


}
// for lcm we will use hcf* lcm= a*b;
