class Point{

    public double x;
    public double y;

    public Point(final double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public double getDistance() {
        double distance;
        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distance;
    }

    public Point getMidpoint() {
        Point midpoint;
        midpoint = new Point(x/2, y/2);
        return midpoint;
    }

    public double getrectarea(){
        double rectarea;
        rectarea = (x * y);
        return rectarea;
    }

}