/**
 * Vector
 *
 * A program that defines variables
 *
 * Purdue University CS180
 *
 * @author Mason Knight
 *
 * @version February 28 2021
 */

public class Vector {

    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        v = new Vector(x, y, z);
    }

    public Vector() {
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }

    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public Vector unitVector() {
        double x1 = x/length();
        double y1 = y/length();
        double z1 = z/length();
        Vector unitVector = new Vector(x1, y1, z1);
        return unitVector;
    }

    public Vector add(Vector v) {
        double xa = x + v.x;
        double ya = y + v.y;
        double za = z + v.z;
        Vector add = new Vector(xa, ya, za);
        return add;
    }

    public Vector subtract(Vector v) {
        double xs = x - v.x;
        double ys = y - v.y;
        double zs = z - v.z;
        Vector subtract = new Vector(xs, ys, zs);
        return subtract;
    }

    public double dotProduct(Vector v) {
        double xd = x * v.x;
        double yd = y * v.y;
        double zd = z * v.z;
        double dotProduct = xd + yd + zd;
        return dotProduct;
    }

    public Vector crossProduct(Vector v) {
        double xc = y * v.z - z * v.y;
        double yc = -1 * (x * v.z - z * v.x);
        double zc = x * v.y - y * v.x;
        Vector crossProduct = new Vector(xc, yc, zc);
        return crossProduct;
    }

    public boolean isOrthogonal(Vector v) {
        return dotProduct(v) == 0;


    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }








    /**
     * Returns the {@code String} representation of this vector. The returned {@code String} consists of a
     * comma-separated list of this vector's numerator and denominator surrounded by this class' name and
     * square brackets ("[]").
     *
     * <p>
     *     <b>
     *         Example:
     *     </b>
     * </p>
     * <pre>
     *     Vector v = new Vector(1, 2, 3);
     *     System.out.println(v);
     *     //"Vector[1, 2, 3]" is printed
     * </pre>
     *
     * @return the {@code String} representation of this rational number
     */
    @Override
    public String toString() {
        return "Vector[" + x + ", " + y + ", " + z + ']';
    }


    /**
     * Determines whether or not the specified object is equal to this Vector. {@code true} is returned if and
     * only if the specified object is an instance of {@code Vector} and x, y, and z components are
     * equal to this Vector's.
     *
     * @param o the object to be used in the comparisons
     * @return {@code true}, if the specified object is equal to this Vector and {@code false} otherwise
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(vector.x, x) == 0 &&
                Double.compare(vector.y, y) == 0 &&
                Double.compare(vector.z, z) == 0;
    }

}
