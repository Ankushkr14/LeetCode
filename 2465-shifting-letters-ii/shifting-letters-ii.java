class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();

        int[] array = new int[n];

        for(int[] shift : shifts){
            if(shift[2]== 1){
                array[shift[0]]++;
                if(shift[1]+1<n){
                    array[shift[1]+1]--;
                }
            }else{
                array[shift[0]]--;
                if(shift[1]+1 <n){
                    array[shift[1]+1]++;
                }
            }
        }
         StringBuilder result = new StringBuilder(s);
        int numberOfShifts = 0;

        for (int i = 0; i < n; i++) {
            numberOfShifts = (numberOfShifts + array[i]) % 26; 
            if (numberOfShifts < 0) numberOfShifts += 26; 

            char shiftedChar = (char) ('a' +
                ((s.charAt(i) - 'a' + numberOfShifts) % 26));
            result.setCharAt(i, shiftedChar);
        }
        return result.toString();
    }
}