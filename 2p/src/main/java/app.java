import fraction.*;

public class app {

    public static void main(String[] args) {
        fraction f = new fraction(9,3);
        fraction f2 = new fraction(5,3);
        fraction result = f.simplificar(f.dividir(f,f2));
        System.out.println(result.getN() + "/" + result.getD());
    }
}
