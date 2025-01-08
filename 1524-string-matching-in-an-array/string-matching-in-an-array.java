class Solution {

    public List<String> stringMatching(String[] words) {
        List<String> matchingWords = new ArrayList<>();

        for (
            int currentWordIndex = 0;
            currentWordIndex < words.length;
            currentWordIndex++
        ) {
   
            for (
                int otherWordIndex = 0;
                otherWordIndex < words.length;
                otherWordIndex++
            ) {
                if (currentWordIndex == otherWordIndex) continue;

                
                if (
                    isSubstringOf(
                        words[currentWordIndex],
                        words[otherWordIndex]
                    )
                ) {
                    matchingWords.add(words[currentWordIndex]); 
                    break; 
                }
            }
        }

        return matchingWords;
    }

    private boolean isSubstringOf(String sub, String main) {
 
        for (int startIndex = 0; startIndex < main.length(); startIndex++) {
            boolean subFits = true;

  
            for (int subIndex = 0; subIndex < sub.length(); subIndex++) {
                if (
                    startIndex + subIndex >= main.length() ||
                    main.charAt(startIndex + subIndex) != sub.charAt(subIndex)
                ) {
                    subFits = false; 
                    break; 
                }
            }

            if (subFits) {
                return true; 
            }
        }

        return false; 
    }
}