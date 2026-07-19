package SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.ImplementedClasses;

import SolidPrinciples.Implementation.InterfaceSegregrationPrinciple.Interfaces.IVegetarianMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VegetarianMenu implements IVegetarianMenu {

    public List<String> getVegetarianMenu(){
        return Arrays.asList("Vegetable Curry" , "Vegetable Soup" , "Paneer Tikka" , "Salad") ;

    }
}
