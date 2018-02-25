/**
 * Auto Generated Java Class.
 */
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {  
    //private int[] flag; // 0-closed 1-open
    //private boolean isBlocked; // if isBlocked is true, it is open
    private int size_;
    private int top_;
    private int bottom_;
    private static int counter_ = 0; // keeps track of opened blocks on grid
    private WeightedQuickUnionUF uf;
    
    public Percolation(int n) { 
        // Create n-by-n grid, with all sites blocked
        //flag = new int[n];
        size_ = n;
        //isBlocked = false; // all blocks in grid are blocked
        uf = new WeightedQuickUnionUF(n*n);
    }
    public void open(int row, int col) {
        // open site (row, col) if it is not already open
        row = uf.find(row);
        col = uf.find(col);
        counter_++;
        }
    
    public boolean isOpen(int row, int col) {
        // is site (row, col) open?
        return true;
    }
    public boolean isFull(int row, int col) {
        // is site (row, col) closed?
        return true;
    }
    public int numberofOpenSites() {
        // number of open sites
        return counter_;
    }
    public boolean percolates() {
        // does the system percolate?
  
    }
    public int sizeOfGrid() {
        return uf.count();
    }
    public boolean isInbounds(int row, int col) {
        if (row < 1 || row > size_ || col < 1 || col > size_) 
            //throw new IndexOutOfBoundsExecption();
            return false;
        return true;    
    }
    public int findElementIn2DGrid(int row, int col) {
        if (isInbounds(row, col)) {            
            int lengthOfRow = size_;
            int index = ((row - 1) * lengthOfRow) + col - 1;
            return index;
        }
    }
    public static void main(String[] args) { 
        Percolation perc = new Percolation(5);
        int i1 = findElementIn2DGrid(2, 4);
        int i2 = findElementIn2DGrid(3, 1);
        System.out.println("Element at i1 = " + i1);
        System.out.println("Element at i2 = " + i2);
    }  
}
