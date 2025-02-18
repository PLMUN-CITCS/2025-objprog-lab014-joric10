public class ParametersAndArguments {
    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;
        int area = calculateArea(roomWidth, roomHeight);
        
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate area
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}
