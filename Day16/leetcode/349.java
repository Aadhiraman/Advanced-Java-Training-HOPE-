class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));

        HashSet<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new));

        set1.retainAll(set2);

        return set1.stream().mapToInt(Integer::intValue).toArray();

    }
}