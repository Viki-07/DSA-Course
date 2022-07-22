package OOP.polynimials;

public class Polynomial {

    DynamicArray coefficients = new DynamicArray();

    public void setCoefficients(int degree, int coeff) {
        this.coefficients.set(degree, coeff);
    }

    public void print() {
        coefficients.print();
        System.out.println();
    }

    public void add(Polynomial p2) {
        DynamicArray da1 = this.coefficients;
        DynamicArray da2 = p2.coefficients;
        int mx = Math.max(da1.size, da2.size);
        for (int i = 0; i < mx; i++) {
            da1.set(i, da1.get(i) + da2.get(i));
        }
    }

    public void subtract(Polynomial p2) {
        DynamicArray da1 = this.coefficients;
        DynamicArray da2 = p2.coefficients;
        int mx = Math.max(da1.size, da2.size);
        for (int i = 0; i < mx; i++) {
            da1.set(i, da1.get(i) + da2.get(i));
        }
    }

    public void multiply(Polynomial p2) {
        DynamicArray mult = new DynamicArray();
        DynamicArray da1 = this.coefficients;
        DynamicArray da2 = p2.coefficients;
        
        for(int i = 0;i < da1.size; i++) {
            int i1 = i;
            int v1 = da1.get(i1);
            for(int j = 0;j < da2.size; j++){
                int i2 = j;
                int v2 = da2.get(i2);
                int newi = i1 + i2;
                int newv = v1 * v2;
                mult.set(newi, mult.get(newi) + newv);
            }
        }

        this.coefficients = mult;
    }

}
