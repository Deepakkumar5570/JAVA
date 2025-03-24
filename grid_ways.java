public class grid_ways {
    public static int gridWays(int n, int m) {
        if (n == 1 || m == 1) { //last row or column
            return 1;
        }
        return gridWays(n - 1, m) + gridWays(n, m - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(gridWays(n, m));
    }
    
}
