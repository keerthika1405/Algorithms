public class towerofhanoi {
    private static int moveCount = 0;
    public static void main(String args[])
    {
    int n = 4;
    
    // A, B and C are names of rods
    towerOfHanoi(n, 'A','B','C');
    System.out.println("Total number of moves: " + moveCount);
    }
    public static void towerOfHanoi(int n, char src,char aux, char des)
    {
    if (n == 1) {
        System.out.print("Move disk 1 from rod " +src+"-->"+des+"\n");
        moveCount++;
        return;
    }
    towerOfHanoi(n - 1, src, des, aux);
      System.out.print("Move disk " + n + " from rod "+src+"-->"+des+"\n");
    //   or
    // towerOfHanoi(1, src, aux,des);
     moveCount++;
    towerOfHanoi(n - 1, aux,src,des);
    }
}
//  A-->B
//  A-->C
//  B-->C
//  A-->B
//  C-->A
//  C-->B
//  A-->B
//  A-->C
//  B-->C
//  B-->A
//  C-->A
//  B-->C
//  A-->B
//  A-->C
//  B-->C

// Move disk 1 from rod A-->B
// Move disk 2 from rod A-->C
// Move disk 1 from rod B-->C
// Move disk 3 from rod A-->B
// Move disk 1 from rod C-->A
// Move disk 2 from rod C-->B
// Move disk 1 from rod A-->B
// Move disk 4 from rod A-->C
// Move disk 1 from rod B-->C
// Move disk 2 from rod B-->A
// Move disk 1 from rod C-->A
// Move disk 3 from rod B-->C
// Move disk 1 from rod A-->B
// Move disk 2 from rod A-->C
// Move disk 1 from rod B-->C
// Total number of moves: 15