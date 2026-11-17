// class Solution {
//     public String reverseVowels(String s) {
//         char[] temp = s.toCharArray();
//         int i=0;
//         int j = s.length()-1;
//         while(i<j){
//             while(temp[i]>='a'&& temp[i]<='z')
//         }

//     }
// }

// class Solution {
//     public String reverseVowels(String s) {
//         char[] str = s.toCharArray();
//         int l = 0;
//         int r = s.length() - 1;
//         String vowels = "aeiouAEIOU";
//         while (l < r) {
//             while (l < r && vowels.indexOf(str[l]) == -1)
//                 l++;
//             while (l < r && vowels.indexOf(str[r]) == -1)
//                 r--;
//             char temp = str[l];
//             str[l] = str[r];
//             str[r] = temp;
//             l++;
//             r--;
//         }
//         return (new String(str));
//     }
// }

class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            if (!isVowel(sb.charAt(i))) {
                i++;
            } else if (!isVowel(sb.charAt(j))) {
                j--;
            } else {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}