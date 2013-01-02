import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;


public class TwitterUpload
{
  
	public static String getURL()
	{
		OAuthService service = new ServiceBuilder()
	    .provider(TwitterApi.class)
	    .callback("http://alexjam.es/twitter.html")
	    .apiKey("rSULJSl20cw9LZvTx21oDw")
	    .apiSecret("DLgrHDgeW02MK4fktRFPJZQL0BDpGaKtEXByQHnzJg")
	    .build();
		
		Token requestToken = service.getRequestToken();
		
		 return service.getAuthorizationUrl(requestToken);
	}
}
