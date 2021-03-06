package fiddle.resources;

import fiddle.dbi.DecoratedDbi;
import fiddle.httpclient.ConfiguredFiddleHttpClient;
import fiddle.httpclient.FiddleHttpClient;

public interface Resources {

	public static Resources EMPTY = new EmptyResources();
	
	public ConfiguredFiddleHttpClient http(final String id);
	
	public FiddleHttpClient http();
	
	public DecoratedDbi dbi(final String id);
}
