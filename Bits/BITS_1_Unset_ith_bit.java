import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if((int)(n&(1<<k))==0){
            System.out.println(n);
        }
        else{
            System.out.println(n^(1<<k));
        }
        }
    }