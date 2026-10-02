package SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.ImplementedClasses;

import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.Interfaces.IDrinksMenu;

import java.util.Arrays;
import java.util.List;

public class DrinksMenu implements IDrinksMenu {

    public List<String> getDrinkItems(){
        return Arrays.asList("Water" , "Soda" , "Juice") ;

    }
}
