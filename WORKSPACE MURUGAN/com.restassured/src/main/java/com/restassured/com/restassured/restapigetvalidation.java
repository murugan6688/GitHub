package com.restassured.com.restassured;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONObject;
import static org.hamcrest.Matcher.*;

public class restapigetvalidation {

	
public void get(String Url) {

	hassize()
	
			CloseableHttpClient Var_Rest_Client_initialisation = HttpClients.createDefault();
			
			HttpGet Var_Enter_URL = new HttpGet(Url); 
			
			Var_Rest_Client_initialisation.execute(Var_Enter_URL);
			
		CloseableHttpResponse VAR_response_Received = Var_Rest_Client_initialisation.execute(Var_Enter_URL);
		
		int VAR_responsecode = VAR_response_Received.getStatusLine().getStatusCode(); 
			System.out.println(VAR_responsecode);
			
		String VAR_response_Stringformat = EntityUtils.toString(VAR_response_Received.getEntity(),"UTF-8");
			System.out.println(VAR_response_Stringformat);
			
			JSONObject VAR_responseinjsonformat = new JSONObject(VAR_response_Stringformat);
			System.out.println(VAR_responseinjsonformat);
			
			Header[] headerresponse = VAR_response_Received.getAllHeaders(); 
		
			HashMap <String,String> hashmapformat = new HashMap <String,String>(); 
		
			for (Header jsonformatvariable : headerresponse) {
			hashmapformat.put(jsonformatvariable.getName(),jsonformatvariable.getValue());
			System.out.println(hashmapformat);
			
				}
					}
}
