// EEEEE
// DDDD
// CCC
// BB
// A
public class reversealphabetpattern {public static void main(String args[])
    {
    int n=5; 
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(n-i+1+64));
            }
            System.out.println("");
        }
    }
}
