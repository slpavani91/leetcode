/* Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]

*/


class Solution {
    public void duplicateZeros(int[] arr) {     
     int N = arr.length;
     
    // Find the count of
    // total number of zeros
    int cnt = count(arr, 0);
     
    // Variable to store index
    // where elements will be
    // written in the final array
    int write_idx = N + cnt - 1;
     
    // Variable to point the current index
    int curr = N - 1;
     
    while (curr >= 0 && write_idx >= 0)
    {
         
        // Keep the current element
        // to its correctposition, if
        // that is within teh size N
        if (write_idx < N)
            arr[write_idx] = arr[curr];
     
        write_idx -= 1;
     
        // Check if the current element is also
        // zero then again write its duplicate
        if (arr[curr] == 0)
        {
            if (write_idx < N)
                arr[write_idx] = 0;
                 
            write_idx -= 1;
        }
        --curr;
    }
   }
    static int count(int []arr, int num)
    {
    int ans = 0;
    for(int i : arr)
     
       if(i == num)
          ans++;
    return ans;
   }
}
