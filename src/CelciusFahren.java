import java.util.Scanner;

public class CelciusFahren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter °C : ");
        float celcius = sc.nextFloat();
        System.out.println("Enter °F : ");
        float fah = sc.nextFloat();

        float result = celciusToFah(celcius);
        System.out.print("°F : " +result);

        float result2 = fahTocelcius(fah);
        System.out.println("\n°C : " + result2);
    }

    public static float celciusToFah(float celcius) {
        return (celcius * 9.0f / 5) + 32;

    }

    public static float fahTocelcius(float fah) {
        return (fah - 32) / (9.0f / 5);


    }
}
