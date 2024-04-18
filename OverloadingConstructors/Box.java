package OverloadingConstructors;

public class Box {
    // Create Class Attributes
    double width;
    double height;
    double depth;

    // Constructor used when  all dimensions specified
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when no dimensions specified
    Box(){
        width=-1;  // Uae -1 to indicate
        height=-1; // an uninitialiZed
        depth=-1;  // box
    }

    // constructor used when cube is created
    Box(double len){
        width=height=depth=len;
    }

    // compute and return volume
    double volume(){
        return width*height*depth;
    }
}
