package java_start.homework3;

/* Cоздайте класс Volume.
Напишите программу расчета объема - V и площади поверхности - S цилиндра.
Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR² + 2πRh = 2πR(R + h)
Результаты расчетов выведите на экран. */

public class Volume {
    public static void main(String[] args) {
        final double PI = 3.141592653;
        double R = 5.0;
        double h = 10.0;

        double V = Math.PI * Math.pow(R, 2) * h;    // Объем цилиндра
        double S = 2 * Math.PI * R * (R + h);       // Площадь

        System.out.println("V = : " + V);
        System.out.println("S = : " + S);
    }
}
