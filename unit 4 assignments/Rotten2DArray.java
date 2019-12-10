import java.util.Scanner;public class Rotten2DArray{
    public static void main (String[]args){
    int[][] nums;
    nums=new int [3][3];//[rows][collums],rows are the number of arrays stored,collums are the number of values in each array that is attached to nums
    nums[1][1]=7;  // set row 2 collum 2 to the value of 7;
    int rows = nums.length;  // outer array is nums;
    int collums = nums[0].length;  // inner array is nums[n] (n is from 0 to the length of nums)   
    int[] n={1,2,3,4,5,6}; // one dimentional array
    int[][] nn={ {1,2,3} , {3,4,5} , {5,6,7}};  //2d array;
    System.out.println(avgCol(nn,0));
    }
    public static double avgCol(int[][] a, int c) {  
       double tot=0;
       for(int r=0; r<a.length;r++){
           tot+=a[r][c];
        }
        
        
       return tot/a.length;
    }
}
