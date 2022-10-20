// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Add your answer here
class Solution {
    public int subtractProductAndSum(int n) {
        int dig=0,sum=0,pro=1;
        
        while(n>0)
        {
            dig=n%10;
            sum+=dig;
            pro*=dig;
            n/=10;
        }
        dig=pro-sum;
        return dig;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();//input in the value n
        
        int res=subtractProductAndSum(n);//function call
        System.out.println(res);//result of the question
    }
}
