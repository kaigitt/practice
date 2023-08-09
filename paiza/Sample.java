class Sample {
  public static void main(String[] args) {
        int[] a = { 65, 95, 33 };
        System.out.println("合計は：" + total(a) + "点");
    }

    public static Integer total(int[] nums) {
      int sum = 0;
      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
      }
      return sum;
    }
    
    public static Integer average(int[] ) {
      
    }
}