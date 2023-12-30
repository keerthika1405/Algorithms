public class fibonnaciloop {
    
    public static void main (String[]args){
        int n=8;
        int first=0, second=1;
        System.out.print("fibbonacci series of "+ n +" number is ");
        for(int i=0;i<n;i++){
            System.out.print(first+" ");

        int third=first+second;
        first=second;
        second=third;
        }  
}
}
