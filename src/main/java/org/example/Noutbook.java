package org.example;

public class Noutbook {
    private double x;
    private double y;
    private double z;

    public Noutbook(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Noutbook{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     *
     * @return
     */
    public double NoutbookLengt(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    /**
     *
     * @return скалярное произведение
     */
    public double NoutbookScal(Noutbook vector){
        return x*vector.x + y*vector.y + z*vector.z;
    }

    /**
     *
     * @return векторное произведение
     */
    public Noutbook vectorProduct(Noutbook vector){
        return new Noutbook(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x
        );
    }


    public static Noutbook[] noutbookRandom(int n){
        Noutbook[] noutbook = new Noutbook[n];
        for (int i = 0; i < n; i++) {
            noutbook[i] = new Noutbook(
                    Math.random(),
                    Math.random(),
                    Math.random()
            );
        }
        return noutbook;
    }

}