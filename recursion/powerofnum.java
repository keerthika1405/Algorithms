public class powerofnum {
    public static void main (String[]args){
        int b=2;
        int p=6;
        System.out.println(power(b,p));
    }
    public static int power (int b ,int p){
        if(p==0){
            return 1;
        }
        return b*power(b,p-1);
    }
}

// Recursion call
// power(2, 6) is not the base case, so it returns 2 * power(2, 5).
// power(2, 5) is not the base case, so it returns 2 * power(2, 4).
// power(2, 4) is not the base case, so it returns 2 * power(2, 3)
// power(2, 3) is not the base case, so it returns 2 * power(2, 2).
// power(2, 2) is not the base case, so it returns 2 * power(2, 1)
// power(2, 1) is not the base case, so it returns 2 * power(2, 0)
// power(2, 0) is the base case, so it returns 1.


// Back to recursion
//           return
//  p(2,0)--->1
//  p(2,1)--->2*p(2,0)------->2*1------------->2
//  p(2,2)--->2*p(2,1)------->2*2------------->4
//  p(2,3)--->2*p(2,2)------->2*4------------->8
//  p(2,4)--->2*p(2,3)------->2*8------------->16
//  p(2,5)--->2*p(2,4)------->2*16------------->36
//  p(2,6)--->2*p(2,5)------->2*36------------->64

//space complexity is O(1)
//time complexity id O(p)
