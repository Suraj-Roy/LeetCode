class Solution {
    public int square(int n){
        int temp = n;
        int res = 0;
        while(temp!=0){
            res += Math.pow(temp%10,2);
            temp /= 10;
        }
        return res;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> checkOccurance = new HashSet<>();
        while(n != 1 && !checkOccurance.contains(n)){
            checkOccurance.add(n);
            n = square(n);
        }
        return n == 1;
    }
}