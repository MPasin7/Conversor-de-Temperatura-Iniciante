import java.util.Scanner;

public class ConverTemp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Menu do Conversor
        System.out.println("====== Conversor de Temperatura ======");
        System.out.println("Escolha uma opção:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Celsius para Kelvin");
        System.out.println("3: Fahrenheit para Celsius");
        System.out.println("4: Fahrenheit para Kelvin");
        System.out.println("5: Kelvin para Celsius");
        System.out.println("6: Kelvin para Fahrenheit");
        System.out.print("Opção: ");

        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        double temperaturaConvertida;

        switch (escolha) {
            case 1:
                temperaturaConvertida = celsiusParaFahrenheit(temperatura);
                System.out.printf("%.2f °C é igual a %.2f°F\n", temperatura, temperaturaConvertida);
                break;
            case 2:
                temperaturaConvertida = celsiusParaKelvin(temperatura);
                System.out.printf("%.2f °C é igual a %.2fK\n", temperatura, temperaturaConvertida);
                break;
            case 3:
                temperaturaConvertida = fahrenheitParaCelsius(temperatura);
                System.out.printf("%.2f °F é igual a %.2f°C\n", temperatura, temperaturaConvertida);
                break;
            case 4:
                temperaturaConvertida = fahrenheitParaKelvin(temperatura);
                System.out.printf("%.2f °F é igual a %.2fK\n", temperatura, temperaturaConvertida);
                break;
            case 5:
                temperaturaConvertida = kelvinParaCelsius(temperatura);
                System.out.printf("%.2f K é igual a %.2f°C\n", temperatura, temperaturaConvertida);
                break;
            case 6:
                temperaturaConvertida = kelvinParaFahrenheit(temperatura);
                System.out.printf("%.2f K é igual a %.2f°F\n", temperatura, temperaturaConvertida);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
    //Método para Converter Celsius > Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    //Método para Converter Celsius > Kelvin
    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }
    //Método para Converter Fahrenheit > Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    //Método para Converter Fahrenheit > Kelvin
    public static double fahrenheitParaKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    //Método para Converter Kelvin > Celsius
    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    //Método para Converter Kelvin > Fahrenheit
    public static double kelvinParaFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}