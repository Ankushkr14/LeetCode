class Solution {
    private boolean isSet(int x, int bit){
        return (x& (1<<bit)) !=0;
    }
    private int setBit(int x, int bit) {
        return x | (1 << bit);
    }
    private int unsetBit(int x, int bit) {
        return x & ~(1 << bit);
    }
    public int minimizeXor(int num1, int num2) {
        int result = num1;
        int num2Bits = Integer.bitCount(num2);
        int resultBits = Integer.bitCount(num1);

        int curr = 0;

        while(resultBits < num2Bits){
            if(!isSet(result, curr)){
                result = setBit(result, curr);
                resultBits++;
            }

            curr++;
        }
        while(resultBits > num2Bits){
            if(isSet(result, curr)){
                result = unsetBit(result, curr);
                resultBits--;
            }
            curr++;
        }

        return result;
    }
}