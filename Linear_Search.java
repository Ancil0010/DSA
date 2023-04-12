import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number to be searched");
        int s=in.nextInt();
        int flag=0;
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==s)
                flag =1;
            else 
                flag =0;
        }
        if (flag==1) 
          System.out.println("Search found ");
        else 
          System.out.println("Search not found");   
    }   
}
