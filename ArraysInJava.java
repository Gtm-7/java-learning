package com.red_sandel;
import java.util.Scanner;
public class ArraysInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int [] mat = {1,2,3,4,5,6,7};
        for (int i = 0;i< (mat.length);i++){
          System.out.print(mat[i]+" ");
        }*/
      /*  int [] array = new int[5];
        for(int i = 0; i<5; i++){
            array [i] = sc.nextInt();
        }
        for( int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }*/
        /* Muti-dimensional arrays: (array of array)

         */
        // 2D array
/*        int [] [] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for(int i=0;i < flats.length;i++){
            for(int j=0; j < flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }*/
        //Arrays practice
        //Problem:1 create an arrray of 5 floats and add them
       /* float [] flo = {45.6f,72.3f,33.34f,75.36f,7.62f};
        float sum=0;
        for(float floatsd: flo){
            sum = sum + floatsd;
        }
        System.out.println(" The sum of the floats:"+ sum);*/
        // Problem:2 write an program to find the given number is in the array or not
        /*float [] num = {45.6f,72.3f,33.34f,75.36f,7.62f};
        float n = 736f;
        boolean x = false;
        for(float fsd: num) {
            if (n==fsd){
                System.out.println("Element is present in the array");
                x = true;
                break;
            }
        }
        if (x==false){
            System.out.println("There is no such element");
        }*/
//  problem3: calculate the average maaks of the students in an array
      /*int [] marks = {75,76,95,82,75,59};
        int sum = 0;
        for(int ele: marks){
            sum=sum+ele;

        }
        System.out.println("The average no of marks is: " + sum/marks.length);*/
//  Problem-4: create a java program to add the matrices of size 2 X 3
     /*int [] [] mat1 = {{1,2,3},
                        {4,5,6}};
        int [] [] mat2 = {{1,2,3},
                        {4,5,6}};
        int [] [] result = {{0,0,0},
                        {0,0,0}};
        for(int i = 0;i< mat1.length;i++){
            for(int j=0;j< mat1[i].length;j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");// prints a new line
        }*/
//        int a = Math.floorDiv(5,2); //--> Gives integer value when 5 divided by 2

//  problem-5: java program to reverse an array
    /*    int [] arr = {1,5,6,7,9,10,12};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0;i<n ; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for(int el: arr){
            System.out.print(el+" ");
        }*/
//  Problem-6: Find the maximum number in the array
    /*    int [] arr = {1,5,-6,75,9,10,12};
        int temp = arr[0];
        for(int i =0 ; i<arr.length-1;i++){
            if(temp<arr[i]){
                temp=arr[i];
            }
        }
        System.out.println(" MAximum element in the array is " + temp);*/
//  problem-8: Find weather the given array is sorted
        int [] arr = {1,5,6,7,9,10,12};
        boolean isSorted = true;
        for(int i = 0;i< arr.length-1; i++ ){
            if (arr[i] > arr[i+1] ){
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        
    }

}
