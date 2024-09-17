class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        String [] str1 = s1.split(" ");
        String [] str2 = s2.split(" ");

        Map<String, Integer> count = new HashMap<>();

         for (String word : str1) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        for (String word : str2) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> uncommon = new ArrayList<>();

         for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                uncommon.add(entry.getKey());
            }
        }
        
        return uncommon.toArray(new String[0]);
    }
}