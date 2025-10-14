class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    static int helper(int num,int op){
        if(num==0){
            return op;
        }
        if(num % 2 == 0){
            return helper(num/2,op+1);
        }
        else{
            return helper(num-1,op+1);
        }
    }
}