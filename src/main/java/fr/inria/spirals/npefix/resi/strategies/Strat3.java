package fr.inria.spirals.npefix.resi.strategies;

import fr.inria.spirals.npefix.resi.context.Decision;
import fr.inria.spirals.npefix.resi.context.Location;
import fr.inria.spirals.npefix.resi.context.instance.PrimitiveInstance;

import java.util.ArrayList;
import java.util.List;

/**
 * if != null
 * @author bcornu
 *
 */
public class Strat3 extends AbstractStrategy {

	@Override
	public boolean isCompatibleAction(ACTION action) {
		return action.equals(ACTION.beforeDeref);
	}

	@Override
	public <T> List<Decision<T>> getSearchSpace(Class<T> clazz,
			Location location) {
		List<Decision<T>> output = new ArrayList<>();
		output.add(new Decision(this, location, new PrimitiveInstance(false), boolean.class));
		return output;
	}
}
