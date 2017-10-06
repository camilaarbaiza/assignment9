public class LinearEquation {


    private double a, b, c, d, e, f; //private attributes of the class


    public LinearEquation(double a, double b, double c, double d, double e, double f) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    /**
     * Method isSolvable determines whether the boolean is true or false
     *
     * @return  true if the condition is true or false if the condition is false
     */
    public boolean isSolvable() {

        if (((a * d) - (b * c)) != 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Method getX calculates the value of X
     *
     * @return   x
     */
    public double getX(){

        double x = (e*d-b*f)/(a*d-b*c);

    return x;}


    /**
     * Method getY calculates the value of y
     *
     * @return  y
     */
    public double getY(){

        double y = (a*f-e*c)/(a*d-b*c);

    return y;}

}
