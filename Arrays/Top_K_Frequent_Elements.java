class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buc = new ArrayList[nums.length + 1];

        for (int ke : map.keySet()) {
            int freq = map.get(ke);
            if (buc[freq] == null) {
                buc[freq] = new ArrayList<>();
            }
            buc[freq].add(ke);
        }

        int[] result = new int[k];
        int ind = 0;

        for (int i = buc.length - 1; i >= 0 && ind < k; i--) {
            if (buc[i] != null) {
                for (int num : buc[i]) {
                    result[ind++] = num;
                    if (ind == k) break;
                }
            }
        }

        return result;
    }
}
