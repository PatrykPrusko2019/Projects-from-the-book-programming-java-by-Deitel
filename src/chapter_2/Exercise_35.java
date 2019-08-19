package chapter_2;

import java.util.Scanner;

public class Exercise_35 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.printf("how many km you go to work in car: ");
        double km = sc.nextDouble();
        double averageDiesielConsumption_100km = 7; // 7 litrow na 100 km srednie spalanie
        double costLiterOfDiesel = 5.13;

        double liter = (km / 100) * averageDiesielConsumption_100km; // ilosc km razy srednie spalanie -> ilosc paliwa/diesla

        double costOneDay = liter * costLiterOfDiesel;

        System.out.printf("daily travel cost to work by car one day : %.2f zl %n" , costOneDay);

        System.out.printf("daily travel cost to work by car 20 days : %.2f zl %n" , (costOneDay * 20) );





    }
}
