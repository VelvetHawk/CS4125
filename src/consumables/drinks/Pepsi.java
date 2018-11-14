package consumables.drinks;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.DrinkDecorator;

public class Pepsi extends DrinkDecorator
{
    public Pepsi(Consumable parent)
    {
        super(parent);
    }

    public Pepsi(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pepsi";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}