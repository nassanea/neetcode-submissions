class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 建立一個哈希表，其中每個鍵是一個長度為 26 的元組，
        // 代表字符頻率，而每個值則是一組屬於該字母異位詞群的字串列表。

        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){ // 要先轉為 char[]
                count[c - 'a']++; // 對每一個 s 中的字母 s 計算數量
            }
            String key = Arrays.toString(count); // 必須要把計數陣列轉成字串 才能存進 map
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<List<String>>(res.values());
        
        
    }
}
