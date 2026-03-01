import java.util.*;

public class check_knight_tour_confriguation {

    // Recursive helper function to verify if a valid knight's tour exists from a given position
    public static boolean helper(int[][] grid, int row, int col, int num) {
        int i, j;

        // Base case: if current cell is the last in the knight's tour
        if (grid[row][col] == ((grid.length) * (grid.length)) - 1) {
            return true;
        }

        // Try all 8 possible moves a knight can make from current position
        // For each move, check bounds and whether the next cell has the expected number (num + 1)

        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < grid.length && j < grid.length && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < grid.length && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < grid.length && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < grid.length && j >= 0 && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 right 1 down 
        i = row + 1;
        j = col + 2;
        if (i < grid.length && j < grid.length && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < grid.length && grid[i][j] == num + 1)
            return helper(grid, i, j, num + 1);

        // If none of the moves lead to a valid tour, return false
        return false;
    }

    // Main method to check if the knight's tour configuration is valid
    public static boolean check(int[][] grid) {
        // The knight's tour must start at the top-left corner with value 0
        if (grid[0][0] != 0) return false;

        // Start recursive checking from position (0,0) and step number 0
        return helper(grid, 0, 0, 0);
    }

   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Example of a valid knight's tour configuration
        int grid[][] = {
            {0, 11, 16, 5, 20},
            {17, 4, 19, 10, 15},
            {12, 1, 8, 21, 6},
            {3, 18, 23, 14, 9},
            {24, 13, 2, 7, 22}
        };

        // Example of an invalid knight's tour (uncomment to test)
        // int grid[][] = {
        //     {0, 11, 16, 6, 20},
        //     {17, 4, 19, 10, 15},
        //     {12, 1, 8, 21, 6},
        //     {3, 18, 23, 14, 9},
        //     {24, 13, 2, 7, 22}
        // };
        boolean bool = check(grid);
        if(bool==true){
        System.out.println("tour was correct...");
    } else System.out.println("tour was not correct...");
    }
}