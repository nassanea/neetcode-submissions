class Solution {
    public boolean isPalindrome(String s) {
        // 回文 雙指針
        int i=0;
        int j=s.length()-1;

        while(i<j){
            // 判斷左邊或是右邊是否不合法 -> 不合法：持續跳過不比對
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++; // 判斷是否為字元或是數字
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            // 走到合法處：開始比對
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false; // 全部轉小寫去比較
            }
            i++; 
            j--;
        }
        return true;
    }
}
