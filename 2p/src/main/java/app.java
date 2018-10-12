import fraction.*;

public class app {

    public static void main(String[] args) {
        fraction f = new fraction(9,3);
        fraction f2 = new fraction(5,3);
        fraction resultD = f.simplificar(f.dividir(f,f2));
        fraction resultS = f.simplificar(f.sumar(f,f2));
        fraction resultR = f.simplificar(f.restar(f,f2));
        fraction resultM = f.simplificar(f.multiplicar(f,f2));
        System.out.println(resultD.getN() + "/" + resultD.getD());
        System.out.println(resultS.getN() + "/" + resultS.getD());
        System.out.println(resultR.getN() + "/" + resultR.getD());
        System.out.println(resultM.getN() + "/" + resultM.getD());
        
    }
}
