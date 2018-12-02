package consumables.side;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;
import consumables.decorators.SideDecorator;

public class Coleslaw extends SideDecorator
{
    public Coleslaw(Consumable parent)
    {
        super(parent);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Coleslaw";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}