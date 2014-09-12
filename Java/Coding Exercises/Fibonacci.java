public class Fibonacci {
	public Fibonacci() {
		solveLoop(1);
    System.out.println(solveRecursion(1));
	}

	public void solveLoop(int num) {
    int ans = 0;
    int temp = 0;

    for(int i = 0; i <= num; i++) {
      if(i < 2) {
        temp = ans;
        ans = i;
      }
      else {
        int temp2 = ans;
        ans = ans + temp;
        temp = temp2;
      }
    }

    System.out.println(ans);
	}

  public int solveRecursion(int num) {
    if(num < 2)
      return num;
    else
      return solveRecursion(num - 1) + solveRecursion(num - 2);
  }

	public static void main(String[] args) {
		new Fibonacci();
	}
}