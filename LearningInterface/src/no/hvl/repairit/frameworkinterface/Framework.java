package no.hvl.repairit.frameworkinterface;

import java.util.List;

public interface Framework {
	
	List<Action> getPossibleActions();
	
	List<Error> getErrors(Model model);


}
