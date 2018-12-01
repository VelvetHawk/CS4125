package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Ham extends FoodDecorator
{
    public Ham(Consumable parent)
    {
        super(parent);
    }

    public Ham(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + "Ham";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}