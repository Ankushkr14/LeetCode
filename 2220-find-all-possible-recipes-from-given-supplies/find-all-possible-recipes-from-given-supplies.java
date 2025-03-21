class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> available = new HashSet<>(Arrays.asList(supplies));
        List<String> result = new ArrayList<>();
        int n = recipes.length;
        boolean added = true;
        while(added){
            added = false;

            for(int i = 0;i<n;i++){
                String recipe = recipes[i];

                if(available.contains(recipe))
                    continue;
                
                if(available.containsAll(ingredients.get(i))){
                    available.add(recipe);
                    result.add(recipe);
                    added = true;                    
                }
            }
        }
        return result;
    }
}