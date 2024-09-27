class Solution {
    /**
    Time Complexity is O(2 ^ m + n)
    n - length of array and m is the target value.
    Space - O(n) length of an array
     */ 
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        // helperChoseDontChose(candidates, target, 0,path);
        helper(candidates, 0, target,path);
        return res;
    }

    private void helper(int[] candidates, int pivot, int target, List<Integer> path){
        //base
        if(target == 0){
            // res.add(new ArrayList<>(path));
            res.add(path);
            return;
        }

        if(target < 0) return;

        //logic
        //for based recursion
        for(int i = pivot; i < candidates.length; i++){
            //If you do not want to do backtracking then create new list and add elements to that list.
            List<Integer> li = new ArrayList<>(path);
            // path.add(candidates[i]);
            li.add(candidates[i]);
            helper(candidates, i, target - candidates[i], li);
            // path.remove(path.size() - 1);
            
        }
    }
}