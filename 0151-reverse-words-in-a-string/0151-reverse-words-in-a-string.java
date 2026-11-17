class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length);
        int i = 0;
        int l = 0;
        int r = 0; // yha l or r jo hai wo words ko reverse krne ke liye liye hai
        int n = arr.length;
        while (i < n) {
            while (i < n && arr[i] != ' ') {
                arr[r++] = arr[i++];
                // r++;
                // i++;
            }
            if(l < r) {
                reverse(arr, l, r);
                if(i<n){
                    arr[r] = ' ';
                    r++;
                }
                l = r;
            }
            i++;
        }
        while (r > 0 && arr[r - 1] == ' ') {
            r--;
        }

        return new String(arr, 0, r);
    }

    static void reverse(char[] arr, int start, int end) {
        int left = start;
        int right = end - 1;
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}