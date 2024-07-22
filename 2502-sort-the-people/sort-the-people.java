class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair<Integer,String>> list = new ArrayList<>();
        int n = heights.length;
        for(int i =0;i<n;i++){
            list.add(new Pair<>(heights[i], names[i]));
        }
        Collections.sort(list, (a, b) -> b.getKey() - a.getKey());

        for(int i=0;i<n;i++){
            names[i] = list.get(i).getValue();
        }
        return names;
    }
}