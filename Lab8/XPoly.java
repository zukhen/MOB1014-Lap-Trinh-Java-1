package Lab8;

public class XPoly {
    //bai1
    public static double Sum(double ...nums)
    {
        double tong=0;
        for (double i:nums) {
            tong+=i;
        }
        return tong;
    }
    //bai2
    public static double min(double ...nums)
    {
        double min = nums[0];
        for (double i:nums) {
           min=Math.min(min,i);
        }
        return min;
    }
    public static double max(double ...nums)
    {
        double max = nums[0];
        for (double i:nums) {
            max=Math.max(max,i);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("ket qua: "+Sum(1,2,3,7,5,9,3,99));
        System.out.println("Min: "+ min(1,2,3,7,5,9,3,99));
        System.out.println("Max: "+ max(1,2,3,7,5,9,3,99));
    }
}
