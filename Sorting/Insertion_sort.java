

class Solution
{
  static void insert(int arr[],int i, int key)
  {
       // Your code here
       arr[i]=key;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          int key=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>key){
              arr[j+1]=arr[j];
              j--;
          }
          insert(arr, j+1, key);
      }
  }
}