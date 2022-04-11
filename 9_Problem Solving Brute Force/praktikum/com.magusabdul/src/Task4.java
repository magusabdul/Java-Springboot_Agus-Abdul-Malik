public class Task4 {
    public static void main(String args[]) {  
        int a[] = {1, 1, 3, 5, 5, 6, 7};
        int val = 3;
        int n = a.length;
        System.out.println(binarySearch(a, 0, n-1, val));
        int b[] = {12, 15, 15, 19, 24, 31, 53, 59, 60};
        val = 3;
        n = b.length;
        System.out.println(binarySearch(b, 0, n-1, val));
    }

    static int binarySearch(int a[], int beg, int end, int val)    
    {    
        int mid;    
        if(end >= beg)     
        {  
            mid = (beg + end)/2;    
            if(a[mid] == val)    
            {    
                return mid;
            }    
            else if(a[mid] < val)     
            {  
                return binarySearch(a, mid+1, end, val);    
            } 
            else    
            {  
                return binarySearch(a, beg, mid-1, val);    
            }    
        }    
        return -1;    
    }  
}  