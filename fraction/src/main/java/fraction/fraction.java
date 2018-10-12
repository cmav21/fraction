package fraction;

public class fraction {

    int n, d;

    public fraction() {
        this.n = 1;
        this.d = 1;
    }

    public fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public int getN() { return this.n; }
    public int getD() { return this.d; }

    void setN(int n) { this.n = n; }
    void setD(int d) {this.d = d;}

    public fraction sumar(fraction a, fraction b) {
        fraction newResult = new fraction();
        newResult.setD(a.getD() * b.getD());
        newResult.setN((a.getN()*b.getD()) + (a.getD() * b.getN()));
        return newResult;
    }

    public fraction restar(fraction a, fraction b) {
        fraction newResult = new fraction();
        newResult.setD(a.getD() * b.getD());
        newResult.setN((a.getN()*b.getD()) - (a.getD() * b.getN()));
        return newResult;
    }

    public fraction multiplicar(fraction a, fraction b) {
        fraction newResult = new fraction();
        newResult.setD(a.getD() * b.getD());
        newResult.setN(a.getN() * b.getN());
        return newResult;
    }

    public fraction dividir(fraction a, fraction b) {
        fraction newResult = new fraction();
        newResult.setN(a.getN() * b.getD());
        newResult.setD(a.getD() * b.getN());
        return newResult;
    }

    public fraction simplificar(fraction f) {

        int x = 2;
        if(f.getD() == 0){
            return  null;
        }else{
            while(f.getN()>=x && f.getD()>=x){
                if(f.getN()%x == 0 && f.getD() % x == 0){

                    int n = f.getN()/x;
                    int d = f.getD()/x;

                    f.setN(n);
                    f.setD(d);

                    x = 2;

                }else{
                    x++;
                }
            }
            return f;
        }
    }
}
