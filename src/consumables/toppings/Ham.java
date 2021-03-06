package consumables.toppings;

import consumables.decorators.Consumable;
import consumables.decorators.ToppingDecorator;

public class Ham extends ToppingDecorator
{
    public Ham(Consumable parent)
    {
        super(parent);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Ham";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}