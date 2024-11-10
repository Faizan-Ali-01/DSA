class Maze
{
    int[][] map={
    {0, -1, -1, 1, 1, 1, 0},
    {-1, 2, 5, 4, 10, 3, -1},
    {3, 2, -1, -1, 0, 3, 8},
    {7, -1, 10, 2, -1, -1, 17},
    {4, 3, 9, -1, -1, 8, 33},
    {17, -1, -1, 1, 0, 44, 100}
    };
    int rowSize=map.length, colSize=map[0].length;
    int goalRow=rowSize-1,goalCol=colSize-1;
    int blocks[][]={{0,-1},{0,1},{-1,-1},{-1,0},{-1,1},{1,-1},{1,0},{1,1}};
    boolean visited[][]=new boolean[rowSize][colSize];

    void pathFinder(int goalRow,int goalCol)
    {
        int currentX=0,currentY=0;
        System.out.println("Starting from: ("+x+","+y+")");
        while(currentX!=goalRow || currentY!=goalCol)
        {
            visited[currentX][currentY]=true;
            int maxValue=Integer.MIN_VALUE;
            int nextX=-1,nextY=-1;
            for(int block[]:blocks)
            {
                int newX=x+block[0];
                int newY=y+block[1];
                if(newX >=0 && newY >=0 && newX < rowSize && newY < colSize && map[newX][newY]!=-1 && !visited[newX][newY])
                {
                    if(map[newX][newY]>maxValue)
                    {
                        maxValue=map[newX][newY];
                        nextX=newX;
                        nextY=newY;
                    }
                }
            }
            if(nextX==-1 && nextY==-1)
            {
                System.out.println("No Possible Path due to Blocks");
                return;
            }
            currentX=nextX;
            currentY=nextY;
            System.out.println("Moving to: ("+x+","+y+") with the value: "+maxValue);
        }
        System.out.println("Reached the goal at: ("+x+","+y+")");
    }
    public static void main(String args[])
    {
        Maze maze=new Maze();
        maze.pathFinder(maze.goalRow,maze.goalCol);
    }
}