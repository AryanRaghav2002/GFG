class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> res=new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(i>0 && arr1[i]==arr1[i-1]){i++; continue;}
            if(j>0 && arr2[j]==arr2[j-1]){j++; continue;}
            if(arr1[i]<arr2[j]){
                res.add(arr1[i]);
                i++;
            }else if(arr2[j]<arr1[i]){
                res.add(arr2[j]);
                j++;
            }else if(arr1[i]==arr2[j]){
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            if(i>0 && arr1[i]==arr1[i-1]){i++; continue;}
            res.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(j>0 && arr2[j]==arr2[j-1]){j++; continue;}
            res.add(arr2[j]);
            j++;
        }
        return res;
    }
}