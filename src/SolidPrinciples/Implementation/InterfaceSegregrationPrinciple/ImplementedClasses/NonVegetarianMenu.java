package SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.ImplementedClasses;

import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.Interfaces.INonVegetarianMenu;
import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.Interfaces.IVegetarianMenu;

import java.util.Arrays;
import java.util.List;

public class NonVegetarianMenu implements INonVegetarianMenu {

    public List<String> getNonVegetarianMenu(){
        return Arrays.asList("Chicken Butter Masala" , "Chicken Curry" , "Fish Curry" , "Mutton Biryani") ;
    }
}
