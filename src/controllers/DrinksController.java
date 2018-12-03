package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import consumables.decorators.Consumable;
import consumables.decorators.ConsumableFactory;
import consumables.decorators.Consumables;
import consumables.decorators.DrinkDecorator;
import consumables.drinks.Drinks;
import consumables.factories.FactoryProducer;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class DrinksController implements Initializable, ControlledScreen
{
    private ScreensController myController;
    private ConsumableFactory drinkFactory;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        drinkFactory = FactoryProducer.getFactory(Consumables.DRINK);
    }    
    
    public void setScreenParent(ScreensController screenParent)
    {
        myController = screenParent;
    }

    @FXML
    private void goToMainMenu(ActionEvent event)
    {
        ((Button)event.getTarget()).getScene().getWindow().hide();
    }

    @FXML
    private void getClubOrange(ActionEvent event)
    {
	    addDrink(Drinks.CLUBORANGE);
    }

    @FXML
    private void getCocacola(ActionEvent event)
    {
	    addDrink(Drinks.COCACOLA);
    }

    @FXML
    private void getDietcocacola(ActionEvent event)
    {
	    addDrink(Drinks.DIETCOCACOLA);
    }

    @FXML
    private void getPepsi(ActionEvent event)
    {
	    addDrink(Drinks.PEPSI);
    }

    @FXML
    private void getPepsiMax(ActionEvent event)
    {
	    addDrink(Drinks.PEPSIMAX);
    }

    @FXML
    private void getSevenUp(ActionEvent event)
    {
	    addDrink(Drinks.SEVENUP);
    }

    @FXML
    private void getSprite(ActionEvent event)
    {
	    addDrink(Drinks.SPRITE);
    }

    @FXML
    private void getWater(ActionEvent event)
    {
	    addDrink(Drinks.SPRITE);
    }
    
    private void addDrink(Drinks drinkType)
    {
	    Consumable drink = drinkFactory.getDrink();
	    drink = drinkFactory.addDrink(drinkType, drink);
	    myController.getCustomerOrder().addDrink((DrinkDecorator) drink);
    }
}
