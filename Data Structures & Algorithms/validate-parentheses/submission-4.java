class Solution {
    public boolean isValid(String s) {
        // 寫法二：有相鄰的合法括號就把它替換掉
        // 最後字串不為空代表字串不合法

        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty(); //最後不是空 → ❌ invalid
    }
}
