package SolidPrinciples.Implementation.InterfaceSegregrationPrinciple;

import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.ImplementedClasses.DrinksMenu;
import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.ImplementedClasses.NonVegetarianMenu;
import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.ImplementedClasses.VegetarianMenu;

public class Main {
    public static void main(String[] args) {
        VegetarianMenu vegMenu = new VegetarianMenu();
        NonVegetarianMenu nonVegMenu = new NonVegetarianMenu();
        DrinksMenu drinkMenu = new DrinksMenu();

        MenuDisplay.displayVegetarianMenu(vegMenu);
        MenuDisplay.displayNonVegetarianMenu(nonVegMenu);
    }
}
