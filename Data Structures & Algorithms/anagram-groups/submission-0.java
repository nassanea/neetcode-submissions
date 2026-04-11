class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 每個單字排序後都長一樣，長得一樣的就是 Anagrams
        // 用 map 去裝
        
        // 宣告 map
        Map<String, List<String>> res = new HashMap<>();
        // key 是每個單字排序後的結果；value 跟這個排序結果字母出現頻率一致的單字所組成的 list

        for(String s : strs){
            char[] str = s.toCharArray();; // 取得單一單字 ie. act
            Arrays.sort(str); // 重新排序該單字
            String key = new String(str);

            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s); // 加入這個單字
        }

        return new ArrayList<List<String>>(res.values());
    }
}
