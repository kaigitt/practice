class Sample2{
  public static void main(String[] args) {
    int[] a = {65, 95, 33};
    int[] b = {50, 46, 100};
    int[] c = {25, 87, 65};

    int[][] abc = { a, b, c };

    System.out.println("全生徒平均: " + average(abc) + "点");
  }

  public static Integer total(int[] nums) {
      int sum = 0;
      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
      }
      return sum;
    }

  public static int average(int[][] arr) {
    int sum = 0;
    int count = 0; // すべての要素数のカウント用
    for (int i = 0; i < arr.length; i++) {
      sum += total(arr[i]);
      count += arr[i].length;
    }
    return sum / count;
  }
}