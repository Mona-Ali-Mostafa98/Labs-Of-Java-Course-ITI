import java.math.BigDecimal;

class ComplexNumber<T extends BigDecimal, R extends BigDecimal> {
    T real;
    T img;

    public ComplexNumber(T _real, T _img) {
        this.real = _real;
        this.img = _img;
    }

    public ComplexNumber<R, R> addComplex(ComplexNumber<T, R> complexNum){
        R realSum = (R)this.real.add(complexNum.real);
        R imgSum = (R)this.img.add(complexNum.img);
        return new ComplexNumber<R, R> (realSum, imgSum);
    }

    public ComplexNumber<R, R> subtractComplex(ComplexNumber<T, R> complexNum){
        R realSub = (R)this.real.subtract(complexNum.real);
        R imgSub = (R)this.img.subtract(complexNum.img);
        return new ComplexNumber<R, R> (realSub, imgSub);
    }
}

class Complex {
    public static void main(String args[]) {
        BigDecimal real1 = new BigDecimal(10);
        BigDecimal img1 = new BigDecimal(5);
        BigDecimal real2 = new BigDecimal(21);
        BigDecimal img2 = new BigDecimal(25);

        ComplexNumber<BigDecimal, BigDecimal> complex1 = new ComplexNumber<>(real1, img1);
        ComplexNumber<BigDecimal, BigDecimal> complex2 = new ComplexNumber<>(real2, img2);

        ComplexNumber<BigDecimal, BigDecimal> resultAdd = complex1.addComplex(complex2);
        ComplexNumber<BigDecimal, BigDecimal> resultSubtract = complex1.subtractComplex(complex2);

        System.out.println("Addition : " + resultAdd.real + " + " + resultAdd.img + "i");
        System.out.println("Subtraction : " + resultSubtract.real + " + " + resultSubtract.img + "i");
    }
}