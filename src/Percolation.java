/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {  
    private int[] flag; // 0-closed 1-open
    private int sizeOfGrid;
    private boolean isBlocked; // if isBlocked is true, it is open
    private static int counter = 0; // keeps track of opened blocks on grid
    private WeightedQuickUnionUF uf;
    
    public Percolation(int n) { 
        // Create n-by-n grid, with all sites blocked
        flag = new int[n*n];
        sizeOfGrid = n*n;
        isBlocked = false; // all blocks in grid are blocked
    }
    public void open(int row, int col) {
        // open site (row, col) if it is not already open
        if (isBlocked == false) {
            isBlocked == true;
            counter++;
        }
    }
    public boolean isOpen(int row, int col) {
        // is site (row, col) open?
  
    }
    public boolean isFull(int row, int col) {
        // is site (row, col) closed?
  
    }
    public int numberofOpenSites() {
        // number of open sites
        return counter;
    }
    public boolean percolates() {
        // does the system percolate?
  
    }
    public boolean isInbounds(int x, int y) {
        if (x < 1 || x > sizeOfGrid || y < 1 || y > sizeOfGrid) 
            throw new IndexOutOfBoundsExecption();
        return true;    
    }
    public static void main(String[] args) { 
    
    }  
}
