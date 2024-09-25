public class MathUtil
{
    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for(int i = 2; i < n; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b)
    {
        if(a == 0 || b == 0)
        {
            return 0;
        }
        return Math.abs(a*b) / gcd(a, b);
    }
    public static int fibonacci(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        int a = 0, b = 1, c = 0;
        for(int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static long factorial(int n)
    {
        long ans = 1;
        for(int i = 1; i <= n; i++)
        {
            ans = ans * i;
        }
        return ans;
    }

    public boolean isPerfectNumber(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int sum = 0;
        for(int i = 1; i <= n/2; i++)
        {
            if(n%i == 0)
            {
                sum += i;
            }
        }
        return sum == n;
    }
    public int sumOfDigits(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public int reverseNumber(int n)
    {
        String str = Integer.toString(n);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reverseStr);
    }
    public boolean isArmstrongNumber(int n)
    {
        int length = 0;
        int count = n;
        while(count>0)
        {
            length++;
            count /= 10;
        }

        count = n;
        int sum = 0;
        while(count>0)
        {
            int temp = count % 10;
            count /= 10;
            sum += Math.pow(temp, length);
        }
        return (int)sum == n;
    }
    public int nextPrime(int n)
    {
        int nextPrime = n + 1;
        while(true)
        {
            if(isPrime(nextPrime))
            {
                return nextPrime;
            }
            nextPrime++;
        }
    }
}
