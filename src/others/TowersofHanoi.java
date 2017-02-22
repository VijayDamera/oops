package others;

import java.util.Scanner;

public class TowersofHanoi {

    public void TOH(int n, String start, String aux, String end) {

        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            TOH(n - 1, start, end, aux);
            System.out.println(start + " -> " + end);
            TOH(n - 1, aux, start, end);
        }
    }

    public static void main(String[] args) {

        TowersofHanoi towersOfHanoi = new TowersofHanoi();

        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.TOH(discs, "A", "B", "C");
    }

}

/*Towers of  Hanoi is a famous game.
-In this game there are three poles and N number of disks placed one over another in increasing in size from top to bottom.

-Objective of this game is to move disks from first pole to last pole.
-And the condition is we can not place bigger disk on top of smaller disk.
-Initially all disks placed in first pole smaller disk will be on top and bigger disk will be on bottom.
-We need to move all the disks from from first pole to last pole.

Rules of tower of  Hanoi:
-We can move only one disk at a time.
-At any poi of time larger disk can not be placed on smaller disk.
-In order to solve this problem we have given a second pole so we can use second pole and move disks from  first pole to third pole.
-We can solve this using rec recursive procedure.

Tower of  Hanoi with Single disk: N=1
-Three poles are A , B ,C
-And a disk is present at A we need to move from A to C
-As it its single disk we can directly move disk A - > C 


 Tower of  Hanoi with Two disks : N=2
-Three poles are A , B ,C
-And two disks are placed in pole A, Disk 1 and Disk2 top to bottom.( assume Disk 2 is smaller and Disk 1 bigger)
-Move Disk2 from A to  B 
-Move Disk1 From A to C.
-Move Disk2 from B to C.


Tower of  Hanoi with Three disks : N=3
-Three poles are A , B ,C
-And three disks are placed in pole A, Disk 1  top to bot, Disk2 and Disk 2 top bottom to .( assume Disk 3 is smaller and Disk 1 bigger)
-In this firs we need to move two disk from  A to B which we already done in above procedure
-So we need to repeat that here.
-Move Disk1 from A to C.
-Now Moving two disks from B to C we have already seen in above procedure so its recursive.


Tower of Hanoi Recursive Algorithm:

N = number of disks

If  N == 1
-Move Single disk from A to C
If   N >1

1.Move n-1 disks from start A to B  TowersofHanoi(n-1,start, end , aux)
2.Move last Disk from A to C
3. Move n-1 disks from B to C.      TowersofHanoi(n-1,start, aux, end )

Step 1 and 3 are recursive procedures.
Lets see hoe to write  java recursive program for this towers of  Hanoi problem
Here B as auxiliary pole.*/