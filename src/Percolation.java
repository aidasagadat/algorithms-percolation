import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;


public class Percolation {


    int[][] grid;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        grid = new int[n][n];
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){}

    // is the site (row, col) open?
    public void isOpen(int row, int col){}

    // is the site (row, col) full?
    public void isFull(int row, int col){}

    // returns the number of open sites
    public void numberOfOpenSites(){}

    // does the system percolate?
    public void percolates(){}

    // test client (optional)
    public static void main(String[] args){}
}
