class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> temp = new ArrayList<>();
        long rem=1;
        rowIndex = rowIndex +1;
        temp.add(1);
        for(int i=1;i<rowIndex;i++){
            rem =(rem *(rowIndex-i));
            rem= rem/i;
            temp.add((int)rem);
        }
        return temp;
    }
}