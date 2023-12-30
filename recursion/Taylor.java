public class Taylor {
    public static void main(String[]args){
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Input n: " );
        // int n=scan.nextInt();
        // System.out.println("Input x: " );
        // float x=scan.nextInt();
        // scan.close();
        int n=25;
        float x=0;
        if(n>0 && x>=0){
            System.out.println("e^+x ="+taylorexponential(n,x));
        }
    }
    static float taylorexponential(int n,float x){
            float exp_sum=1;
            for(int i=n-1;i>0;--i){
                exp_sum=1+x*exp_sum/i;  
            }
            return exp_sum;
        }
}

//     // return n!
//     public static int factorial(int n) {
//         if (n == 0) return 1;
//         return n * factorial(n-1);
//     }


//     public static double main(String[] args) {

//         // number of terms
//         int N = Integer.parseInt(args[0]);

//         // Taylor series for e^x
//         RationalPolynomial e = RationalPolynomial.ZERO;
//         for (int i = 0; i < N; i++) {
//             BigRational coef = new BigRational(1, factorial(i));
//             RationalPolynomial term = new RationalPolynomial(coef, i);
//             e = e.plus(term);
//         }
//         System.out.println("e^x = " + e);

//         // Taylor series for sin(x)
//         RationalPolynomial sin = RationalPolynomial.ZERO;
//         for (int i = 0; i < N; i++) {
//             BigRational coef;
//             if      (i % 4 == 0) coef = BigRational.ZERO;
//             else if (i % 4 == 1) coef = new BigRational(1, factorial(i));
//             else if (i % 4 == 2) coef = BigRational.ZERO;
//             else                 coef = new BigRational(-1, factorial(i));
//             RationalPolynomial term = new RationalPolynomial(coef, i);
//             sin = sin.plus(term);
//         }
//         System.out.println("sin(x) = " + sin);

//         System.out.println("e^x sin(x) = " + e.times(sin).truncate(N));

//    }

// }
