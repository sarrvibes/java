package tugas2;

class MathDemo {
    public static void main(String args[]) {
        System.out.println("Nilai mutlak dari -5: " + Math.abs(-5));
        System.out.println("Nilai mutlak dari 5: " + Math.abs(5));
        System.out.println("Bilangan random (maksimum adalah 10): " + (Math.random() * 10));
        System.out.println("Maksimum dari 3.5 dan 1.2: " + Math.max(3.5, 1.2));
        System.out.println("Minimum dari 3.5 dan 1.2: " + Math.min(3.5, 1.2));
        System.out.println("Ceil dari 3.5: " + Math.ceil(3.5));
        System.out.println("Floor dari 3.5: " + Math.floor(3.5));
        System.out.println("e pangkat 1: " + Math.exp(1));
        System.out.println("log 10: " + Math.log(10));
        System.out.println("10 pangkat 3: " + Math.pow(10, 3));
        System.out.println("Round dari nilai pi: " + Math.round(Math.PI));
        System.out.println("Akar dari 5 = " + Math.sqrt(5));
        System.out.println("10 radian = " + Math.toDegrees(10) + " derajat");
        System.out.println("sin(90): " + Math.sin(Math.toRadians(90)));
    }
}

