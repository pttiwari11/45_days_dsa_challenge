*/ We traverse the array and use two variables:

* zeroIndex to indicate the index where we should put 0
* twoIndex to indicate the index where we should put 2

If current element a[i] is 0, we swap a[i] and a[zeroIndex], if a[i] is 2, we swap a[i] and a[twoIndex], if a[i] is one, we do nothing and continue to process next element. */

# Brute Force
/* Here we keep two pointers, one at the front increasing and another at the rear end decreasing, to place 0's and 2's respectively for the formation of the array, whereas all the 1's remain in the middle. */

public void sortColors(int A[])
{
int n=A.length;
int j = 0;  // front end for 0's
int k = n-1;  // rear end for 2's
for (int i=0; i <= k; i++)   /* swap A[i] annd A[j++] */
{
if (A[i] == 0)
{
int t=A[i];
A[i]=A[j];
A[j]=t;
j++;  /* to increment the pointer so that the next 0 can be placed */
}
else if (A[i] == 2)   // swap A[i--] and A[k--]
{
int t=A[i];
A[i]=A[k];
A[k]=t;
i--;
k--;   /* to deccrement the pointer so that the next 2 can be placed */
}
}

}

