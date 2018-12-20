/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
import java.util.Scanner;
public class JumpIt {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Board Size: ");
        int x = scan.nextInt();
        int [] board = new int[x];
        board[0] = 0;
        System.out.println("First Number is 0, Enter " + (x-1) + " more numbers: ");
        for(int i = 1; i < x; i++)
        {
            System.out.println("Enter a Number: ");
            int n = scan.nextInt();
            board[i] = n;
        }
        
        for(int i = 0; i < x; i++)
        {
            System.out.print(board[i] + " | ");
        }
        System.out.println();
        System.out.println("Total Cheapest Cost: " + getCost(board,0));
        
    }
    
    public static int getCost(int [] board, int position)
    {
        int size = board.length - 1;
        
        if(position == size)
        {
            return board[size];
        }
        
        else if(position == size - 1)
        {
            return board[position] + getCost(board, position + 1);
        }
        
        else 
        {
            if(getCost(board, position + 1) < getCost(board, position + 2))
            {
                return board[position] + getCost(board, position + 1);
            }
            else
            {
                return board[position] + getCost(board, position + 2);
            }
        }
        
    }
}

/* OUTPUT

run:
Enter Board Size: 
6
First Number is 0, Enter 5 more numbers: 
Enter a Number: 
3
Enter a Number: 
80
Enter a Number: 
6
Enter a Number: 
57
Enter a Number: 
10
0 | 3 | 80 | 6 | 57 | 10 | 
Total Cheapest Cost: 19
BUILD SUCCESSFUL (total time: 6 seconds)


run:
Enter Board Size: 
6
First Number is 0, Enter 5 more numbers: 
Enter a Number: 
3
Enter a Number: 
1
Enter a Number: 
6
Enter a Number: 
57
Enter a Number: 
10
0 | 3 | 1 | 6 | 57 | 10 | 
Total Cheapest Cost: 17
BUILD SUCCESSFUL (total time: 6 seconds)


run:
Enter Board Size: 
8
First Number is 0, Enter 7 more numbers: 
Enter a Number: 
3
Enter a Number: 
15
Enter a Number: 
65
Enter a Number: 
42
Enter a Number: 
31
Enter a Number: 
19
Enter a Number: 
75
0 | 3 | 15 | 65 | 42 | 31 | 19 | 75 | 
Total Cheapest Cost: 151
BUILD SUCCESSFUL (total time: 20 seconds)




*/


