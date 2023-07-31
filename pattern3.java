import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int nsp=n/2;
int nst=1;

        if(n%2==1){
for (int i=1; i<=n; i++){
    for(int j=1; j<=nsp; j++){
        System.out.print(" ");
    }
    for (int k=1; k<=nst; k++){
        System.out.print("*");
    }
    System.out.println();
    if (i<=n/2){
        nsp=nsp-1;
        nst=nst+2;
    }
    
    else{
        nsp++;
        nst=nst-2;
    }
}
}
    }
}