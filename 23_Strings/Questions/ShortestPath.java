
public class ShortestPath {

    public static double shortestPath(String str) {
        float shortestpath = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // WEST
            if (ch == 'W') {
                x--;
            } // EAST
            else if (ch == 'E') {
                x++;
            } // NORTH
            else if (ch == 'N') {
                y++;
            } // SOUTH
            else {
                y--;
            }
        }
        // sqrt() returns a double no.s and it will throw error if the num is float so convert double to float.
        shortestpath = (float) Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));  //displacement formula
        return shortestpath;
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println("The shortest path is = " + shortestPath(path));
    }

}
