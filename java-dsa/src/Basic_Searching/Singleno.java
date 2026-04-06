package Basic_Searching;

import java.util.Scanner;

public class Singleno {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of the array");
            int n= sc.nextInt();
            int [] nums= new int[n];
            System.out.println("Enter the array In Descending order");
            for(int i=0;i< nums.length;i++){
                nums[i]= sc.nextInt();
            }
            for(int i=0;i<nums.length;i++){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }if(count==1){
                    System.out.println(nums[i]);
                }
            }

        }
    }

