public class maze {

    public static void main(String[] args) {
        // Define the maze as a 2D grid
        int[][] maze = {
                { 1, 1, 0 },
                { 1, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 }
                // {1, 0, 0, 0, 0},
                // {1, 1, 0, 1, 1},
                // {0, 1, 0, 0, 1},
                // {1, 1, 1, 1, 1},
                // {0, 0, 0, 0, 1}
        };

        // Call the maze-solving function
        if (solveMaze(maze)) {
            System.out.println("Path found!");
        } else {
            System.out.println("No path found.");
        }
    }

    // Function to solve the maze
    static boolean solveMaze(int[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;

        // Create a solution matrix to track the path
        int[][] solution = new int[rows][cols];

        // Start the recursive exploration from the top-left corner
        if (solveMazeUtil(maze, 0, 0, solution)) {
            printSolution(solution);
            return true;
        }

        return false;
    }

    // Recursive utility function to explore paths in the maze
    static boolean solveMazeUtil(int[][] maze, int row, int col, int[][] solution) {
        int rows = maze.length;
        int cols = maze[0].length;
  
        // Check if the current cell is a valid position
        if (row >= 0 && col >= 0 && row < rows && col < cols && maze[row][col] == 1) {

            // Mark the current cell as part of the path
            System.out.println(row +" "+col);
     
            solution[row][col] = 1;

            // If reached the bottom-right corner, the maze is solved
            if (row == rows - 1 && col == cols - 1) {
                
                return true;
            }

        
            if (solveMazeUtil(maze, row + 1, col, solution)) {    // Move down       
              
                return true;
            }

            if (solveMazeUtil(maze, row, col + 1, solution)) { // Move right
                
                return true;
            }

            // If no valid move, backtrack by marking the current cell as not part of the
            // path
            solution[row][col] = 0;
        }

        return false;
    }

    // Function to print the solution matrix
    static void printSolution(int[][] solution) {
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

// {1, 0, 0, 0, 0},
// {1, 1, 0, 1, 1},
// {0, 1, 0, 0, 1},
// {1, 0, 1, 1, 1},
// {0, 0, 0, 0, 1}
// path not found

// {1, 0, 0, 0, 0},
// {1, 1, 0, 1, 1},
// {1, 1, 1, 1, 1},
// {1, 1, 1, 1, 1},
// {0, 0, 0, 0, 1}

// path found