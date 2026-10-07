class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        builder.append(strs.size());
        builder.append(",");
        for(String str : strs) {
            builder.append(str.length());
            builder.append(",");
            builder.append(str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        if(str.isEmpty())
            return new ArrayList<String>();
        Pair<Integer, Integer> pair = getNextNum(0, str);
        int numStrs = pair.getKey();
        if(numStrs == -1)
            return new ArrayList<String>();
        List<String> res = new ArrayList<>();
        int len = 0;
        for(int i = 0; i < numStrs; i++) {
            pair = getNextNum(pair.getValue() + len + 1, str);
            len = pair.getKey();
            int beginIndex = pair.getValue() + 1;
            res.add(str.substring(beginIndex, beginIndex + len));
        }

        return res;
    }

    private Pair<Integer, Integer> getNextNum(int index, String str) {
        for(int i = index; i < str.length(); i++) {
            if(str.charAt(i) == ',') {
                return new Pair<>(Integer.parseInt(str.substring(index, i)), i);

            }
        }
        return new Pair<>(-1, -1);
    }
}
