//EXERCICÍO DE FRAÇÃO
public class Fraction {

    int n;
    int d;

    void set(int n, int d) {
        this.n = n; //COM O THIS REFERENCIA O ATRIBUTO, SEM O THIS REFERENCIA A VARIÁVEL 
        this.d = d;
    }

    Fraction multiply(Fraction f) {
        Fraction r = new Fraction();
        r.n = n * f.n;
        r.d = d * f.d;
        return r;
    }

    void show() {
        System.out.println(n + " / " + d);
    }
    }

