void main() {
    double grausCelsius = 35.6;
    double grausFahrenheit = (grausCelsius * 1.8) + 32;

    String grausConvertidos = String.format("%f graus Celsius equivalem a %f graus Fahrenheit", grausCelsius, grausFahrenheit);
    System.out.println(grausConvertidos);

    int grausInteiros = (int) grausFahrenheit;
    System.out.println(grausFahrenheit + " graus Fahrenheit em números inteiros ficam: " + grausInteiros);
}
