public class PointClassYaratish {
    private double x;
    private double y;
    private double z;

    public PointClassYaratish(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    public static void main(String[] args) {
        PointClassYaratish point1 = new PointClassYaratish(1.0, 2.0, 3.0);
        PointClassYaratish point2 = new PointClassYaratish(4.0, 5.0, 6.0);

        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);

        point1.setX(7.0);
        point1.setY(8.0);
        point1.setZ(9.0);

        System.out.println("Updated point1: " + point1);
    }
}
