package JAR;
public class Funcao2 {

    
    private double a;
    private double b;
    private double c;

    /**
     * @param a Número multiplicando x²
     * @param b Número multiplicando x
     * @param c Número independente
     */
    public Funcao2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    /**
     * 
     * @return Lista com as raizes reais
     */
    public double[] calcularRaizes() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        }
    }
}