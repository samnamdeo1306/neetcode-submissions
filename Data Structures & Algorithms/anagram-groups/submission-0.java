class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)
            return new ArrayList<List<String>>();
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sorted = new String(sArr);
            if(map.containsKey(sorted)) {
                map.get(sorted).add(s);
                //map.put(sArr, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sorted, list);
                // res.add(list);
            }
        }

        for(List<String> l : map.values()) {
            res.add(l);
        }
        return res;
    }
}
