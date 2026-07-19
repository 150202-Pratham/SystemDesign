package SolidPrinciples.Implementation.InterfaceSegregrationPrinciple;

import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.Interfaces.INonVegetarianMenu;
import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.Interfaces.IVegetarianMenu;

public class MenuDisplay {

    public static void displayVegetarianMenu(IVegetarianMenu menu) {
        System.out.println("Vegetarian Menu:");
        for (String item : menu.getVegetarianMenu()) {
            System.out.println("- " + item);
        }
    }


    public static void displayNonVegetarianMenu(INonVegetarianMenu menu) {
        System.out.println("Non-Vegetarian Menu:");
        for (String item : menu.getNonVegetarianMenu()) {
            System.out.println("- " + item);
        }
    }
}
