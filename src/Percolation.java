/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {  
    private int[] flag; // 0-closed 1-open
    private boolean isBlocked; // if isBlocked is true, it is open
    private int sizeOfGrid;
    private static int counter = 0; // keeps track of opened blocks on grid
    private WeightedQuickUnionUF uf;
    
    public Percolation(int n) { 
        // Create n-by-n grid, with all sites blocked
        flag = new int[n];
        sizeOfGrid = n;
        isBlocked = false; // all blocks in grid are blocked
        uf = new WeightedQuickUnionUF(n);
    }
    public void open(int row, int col) {
        // open site (row, col) if it is not already open
        row = uf.find(row);
        col = uf.find(col);
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
    public int sizeOfGrid() {
        return uf.count();
    }
    public boolean isInbounds(int x, int y) {
        if (x < 1 || x > sizeOfGrid || y < 1 || y > sizeOfGrid) 
            throw new IndexOutOfBoundsExecption();
        return true;    
    }
    public static void main(String[] args) { 
    
    }  
}
