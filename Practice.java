public class Practice {
    public static void calculate(int x, int n) {
        
    }
    public static void main(String[] args) {
        calculate(2,5);
    }
}

// public class Practice {
//     public static void factorial(int n, int fact) {
//         if(n==0) {
//             System.out.println(fact);
//             return;
//         }
//         fact *= n;
//         factorial(n-1, fact);
        
//     }
//     public static void main(String[] args) {
//         factorial(5, 1);
//     }
// }


// public class Practice {
//     public static void main(String[] args) {
//         int sum=0;
//         int average=0;
//         int arr[] = {2,9,6,4,2,15,10,4,2};
//         for(int i=0;i<arr.length;i++)
//         {
//             sum=sum+arr[i];
//         }
//         System.out.println(sum);
//         average=sum/arr.length;
//         System.out.println(average);
//     }
// }

// public class Practice {

//     static boolean search(int arr[], int k)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==k)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = {2,9,6,4,2,15,10,4,2};
//         System.out.println(search(arr, 2));
//     }
// }

// public class Practice {
    
//     static int frequency(int arr[], int k)
//     {
//         int count=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==k)
//             {
//                 count=count+1;
//             }
//         }
//         return count;
//     } 

//     public static void main(String[] args) {
//         int arr[] = {2,9,11,17,18,17,1,17};
//         System.out.println(frequency(arr,17));
//     }
// }

// public class Practice {

//     static int turn(int arr[])
//     {
//         int i=0;
//         for(int ar: arr)
//         {
//             if(ar!=0)
//             {
//                 arr[i]=ar;
//                 i++;
//             }
//         }
//         while(i<arr.length)
//         {
//             arr[i]=0;
//             i++;
//         }
//         return arr[];
//     }

//     public static void main(String[] args) {
//         int arr[] = {0,1,0,4,9,2,0};
//         System.out.println(turn(arr));
//     }
// }