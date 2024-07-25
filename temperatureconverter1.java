import java.util.Scanner;

public class temperatureconverter1{

    public static class TemperatureConverter {
        public static double celsiusToFahrenheit(double celcius) {
            return (celcius * 9/5) + 32;
        }

        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;
        }

        public static double fahrenheitToReamur(double fahrenheit) {
            return (fahrenheit - 32) * 4/9;
        }
        public static double celsiusToReamur(double celcius) {
            return celcius * 4/5;
        }

        public static double reamurToCelsius(double reamur) {
            return reamur * 5/4;
        }

        public static double reamurToFahrenheit(double reamur) {
            return (reamur * 9/4) + 32;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");

        System.out.println("Pilih menu (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Masukkan suhu dalam Celsius: ");
            double celsius = scanner.nextDouble();
    
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
    
            double reamur = TemperatureConverter.celsiusToReamur(celsius);
            System.out.println(celsius + " Celsius = " + reamur + " Reamur");
            break;

            case 2:
            System.out.println("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheitInput = scanner.nextDouble();

            double celsiusOutput = TemperatureConverter.fahrenheitToCelsius(fahrenheitInput);
            System.out.println(fahrenheitInput + " Fahrenheit = " + celsiusOutput + " Celsius");

            double reamurOutput = TemperatureConverter.fahrenheitToReamur(fahrenheitInput);
            System.out.println(fahrenheitInput + " Fahrenheit = " + reamurOutput + " Reamur");
            break;

            case 3:
            System.out.println("Masukkan suhu dalam Reamur: ");
            double reamurInput = scanner.nextDouble();

            double celsiusFromReamur = TemperatureConverter.reamurToCelsius(reamurInput);
            System.out.println(reamurInput + " Reamur = " + celsiusFromReamur + " Celsius");

            double fahrenheitFromReamur = TemperatureConverter.reamurToFahrenheit(reamurInput);
            System.out.println(reamurInput + " Reamur =" + fahrenheitFromReamur + "Fahrenheit");

            break;

            default:
                System.out.println("Pilihan tidak ada");
        }

        scanner.close();
    }
}
