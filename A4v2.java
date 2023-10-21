/*
Dhruv Patel
Oct 20 2023
This program is supposed to represent the growth of bacteria in a 10x10 panel, the program will get an inital coordinate chosen by the user(that will be the first bacteria spot)
Each bacteria will then spread in a direction either up, down, left, or right at random(depending on whats available).
After 4 cycles a bacteria will die.
*/
import java.util.*;
//Class
public class A4v2 {
    //This method is going to be used to check how many possible baterial points a specific coordinate has in the middle
    public static String direction(int grid[][], int row, int col){
        //To randomly determain the direction of the bacteria, the value which decided the direction will be different for each if statement because im lazy:p


        //Single digit(Onnly one direction)
        int chance=0;
        if(check(grid, row, col)==1){
            return "up";
        }


        //double digits(1-2 directions)
        else if(check(grid,row,col)==10){
            return "down";

        }
        else if(check(grid,row,col)==11){
            chance=(int)((Math.random()*2)+1);
            if(chance==1){
                return "up";
            }
            else if(chance==2){
                return "down";
            }
            //up or down
        }


        //triple digits(1-3 directions)
        else if(check(grid,row,col)==100){
            return "left";
        }
        else if(check(grid,row,col)==101){
            chance=(int)((Math.random()*2)+1);
            if(chance==1){
                return "up";
            }
            else if(chance==2){
                return "left";
            }

            //left or up
        }
        else if(check(grid,row,col)==110){
            chance=(int)((Math.random()*2)+1);
            if(chance==1){
                return "down";
            }
            else if(chance==2){
                return "left";
            }
            //left or down

        }
        else if(check(grid,row,col)==111){
            chance=(int)((Math.random()*3)+1);
            if(chance==1){
                return "up";
            }
            else if(chance==2){
                return "left";
            }
            else if(chance==3){
                return "down";
            }
            //left or up or down

        }


        //Quadruple digits(1-4 directions )
        else if(check(grid,row,col)==1000){
            return "right";
        }
        else if(check(grid,row,col)==1001){
            chance=(int)((Math.random()*2)+1);
            if(chance==1){
                return "up";
            }
            else if(chance==2){
                return "right";
            }
            //right or up
        }
        else if(check(grid,row,col)==1010){
            chance=(int)((Math.random()*2)+1);
            if(chance==1){
                return "down";
            }
            else if(chance==2){
                return "right";
            }
            //right or down
    
        }
        else if(check(grid,row,col)==1011){
            chance=(int)((Math.random()*3)+1);
            if(chance==1){
                return "up";
            }
            else if(chance==2){
                return "right";
            }
            else if(chance==3){
                return "down";
            }
            //right or down or up
    
        }
        else if(check(grid,row,col)==1100){
            chance=(int)((Math.random()*2)+1);
            if(chance==1){
                return "left";
            }
            else if(chance==2){
                return "right";
            }
            //right or left
    
        }
        else if(check(grid,row,col)==1101){
            chance=(int)((Math.random()*3)+1);
            if(chance==1){
                return "up";
            }
            else if(chance==2){
                return "right";
            }
            else if(chance==3){
                return "left";
            }
            //right or left or up
    
        }
        else if(check(grid,row,col)==1110){
            chance=(int)((Math.random()*3)+1);
            if(chance==1){
                return "down";
            }
            else if(chance==2){
                return "right";
            }
            else if(chance==3){
                return "left";
            }

            //right or left or down

    
        }
        else if(check(grid,row,col)==1111){
            chance=(int)((Math.random()*4)+1);
            if(chance==1){
                return "down";
            }
            else if(chance==2){
                return "right";
            }
            else if(chance==3){
                return "left";
            }
            else if(chance==4){
                return "up";
            }
            //right or left or down or up
    
        }
        else{
            return "n/a";
        }
        return "";
    }
    public static int check(int grid[][], int i, int j){
        int possibilities=0;
        //Assigning values to up, down, left, and right
        //Up=1, down=10, left=100, right=1000
        //Top check
        if(i==0){
            if (grid[i+1][j]==1){
                possibilities+=10;
            }
            if(j==0){
                if (grid[i][j+1]==1){
                    possibilities+=1000;
                }
            }
            else if(j==9){
                if (grid[i][j-1]==1){
                    possibilities+=100;
                }
            }
            else{
                if (grid[i][j-1]==1){
                    possibilities+=100;
                }
                if (grid[i][j+1]==1){
                    possibilities+=1000;
                }
            }
            
        }
        //Bottom check
        else if (i==9){
            if (grid[i-1][j]==1){
                possibilities+=1;
            }
            if(j==0){
                if (grid[i][j+1]==1){
                    possibilities+=1000;
                }
            }
            else if(j==9){
                if (grid[i][j-1]==1){
                    possibilities+=100;
                }
            }
            else{
                if (grid[i][j-1]==1){
                    possibilities+=100;
                }
                if (grid[i][j+1]==1){
                    possibilities+=1000;
                }
            }
        }
        //left check
        else if(j==0){
            if (grid[i][j+1]==1){
                possibilities+=1000;
            }
            if(i==0){
                if (grid[i+1][j]==1){
                    possibilities+=10;
                }
            }
            else if(i==9){
                if (grid[i-1][j]==1){
                    possibilities+=1;
                }
            }
            else{
                if (grid[i-1][j]==1){
                    possibilities+=1;
                }
                if (grid[i+1][j]==1){
                    possibilities+=10;
                }
            }
            
        }
        //Right check
        else if (j==9){
            if (grid[i][j-1]==1){
                possibilities+=1;
            }
            if(i==0){
                if (grid[i+1][j]==1){
                    possibilities+=10;
                }
            }
            else if(i==9){
                if (grid[i-1][j]==1){
                    possibilities+=100;
                }
            }
            else{
                if (grid[i+1][j]==1){
                    possibilities+=10;
                }
                if (grid[i-1][j]==1){
                    possibilities+=100;
                }
            }
        }
        //Midcheck
        else{
            if (grid[i+1][j]==1){
                possibilities+=10;
            } 
            if (grid[i-1][j]==1){
                possibilities+=1;
            }
            if (grid[i][j+1]==1){
                possibilities+=1000;
            }
            if (grid[i][j-1]==1){
                possibilities+=100;
            }
        }
            
        return possibilities;

    }
//Main method
    public static void main(String[] args) {
        /*
         * Goal is to create a program to simulate a bacterial growth, the user chooses a random spot on a 10x10 grid, then that bacteria grows either up, down, left, or right
         *  if 4 turns are exceeded then the cell will also die.
         */
        //Variables
        String direction="";
        Scanner input=new Scanner(System.in);
        int v=0;
        int row;
        int col;
        //creating the INITAL grid
        int[][] grid = new int[10][10]; // create a 10x10 grid for testing purposes
        for(int i=0;i<10;i++){
            System.out.println("");
            for (int j=0;j<10;j++) {
                grid[i][j]=1;
                System.out.print(grid[i][j]+" ");
        }
    }
    //Make it look nice
    System.out.println();
    //Inital bacteria coordinate
    System.out.println("Please enter a coordinate to place your bacteria (Row(0-9), col(0-9), no commas, for example: \"2 2\")");
    row=input.nextInt();
    col=input.nextInt();
    //Turn#
    int turn=1;
    int[][]dDay= new int [10][10];
    for(int i=0;i<10;i++){
        for (int j=0;j<10;j++){
            dDay[i][j]=4;
        }
    }
    //START OF LOOP
    while(v<=13){
        
        ArrayList<Integer> tempRow= new ArrayList<Integer>();
        ArrayList<Integer> tempCol= new ArrayList<Integer>();
        //coordinate inputs
        System.out.println("Turn #"+turn);
    grid[row][col]=0;
    //temp
    for(int i=0;i<10;i++){
        for (int j=0;j<10;j++) {
            if(dDay[i][j]==0){
                grid[i][j]=1;
                dDay[i][j]=4;
            }
        }
    }
    //Showing new grid to user
    for(int i=0;i<10;i++){
        System.out.println("");
        for (int j=0;j<10;j++) {
            System.out.print(grid[i][j]+" ");
        }
    }
    //make it look decent
    System.out.println();

    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            //Makes sure the spot had bacteria
            if(grid[i][j]==0){
             tempRow.add(i);
             tempCol.add(j);
        }
        
    }
}
for(int i=0;i<tempRow.size();i++){
    //Determains direction which the next bacteria will turn 
    direction = direction(grid, tempRow.get(i), tempCol.get(i));
    //Does the infecting
    
    if(direction.equalsIgnoreCase("up")){
        grid[tempRow.get(i)-1][tempCol.get(i)]=0;
    }
    if(direction.equalsIgnoreCase("down")){
        grid[tempRow.get(i)+1][tempCol.get(i)]=0;
    }
    if(direction.equalsIgnoreCase("left")){
        grid[tempRow.get(i)][tempCol.get(i)-1]=0;
    }
    if(direction.equalsIgnoreCase("right")){
        grid[tempRow.get(i)][tempCol.get(i)+1]=0;
    }
    dDay[tempRow.get(i)][tempCol.get(i)]--;
}

    System.out.println("tesitng");
    turn++;
    v++;
    try{
        Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
}
input.close();
}
}
