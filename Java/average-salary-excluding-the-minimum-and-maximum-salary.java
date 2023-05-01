class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        long sum = 0 ;
        for (int sal : salary) {
            max = Math.max(sal, max);
            min = Math.min(sal, min);
            sum+= sal;
        }

        return (double)(sum-min-max)/(salary.length -2);
    }
}