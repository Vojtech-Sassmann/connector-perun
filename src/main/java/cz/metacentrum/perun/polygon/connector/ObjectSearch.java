package cz.metacentrum.perun.polygon.connector;

import org.identityconnectors.framework.common.objects.OperationOptions;
import org.identityconnectors.framework.common.objects.ResultsHandler;
import org.identityconnectors.framework.common.objects.filter.Filter;

public interface ObjectSearch {

	public void executeQuery(Filter filter, OperationOptions options, ResultsHandler handler);
}
