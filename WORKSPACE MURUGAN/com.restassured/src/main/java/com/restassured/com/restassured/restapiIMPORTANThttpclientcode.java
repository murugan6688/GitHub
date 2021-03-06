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

public class restapiIMPORTANThttpclientcode {

	
public void get(String Url) {
// *********Step:1 - Create client connection using createDefault(),which returns closeablehttpclient object and one instance 'httpclientconnection' will be created
			CloseableHttpClient Var_Rest_Client_initialisation = HttpClients.createDefault();

// ********Step:2 (Enter + Click + response) 
//like Entering the URL in the postman, object initalised	
			HttpGet Var_Enter_URL = new HttpGet(Url); 

// Like clicking "send" button and hit the URL
			Var_Rest_Client_initialisation.execute(Var_Enter_URL); 
			
// Like receiving response after hitting the URL
			CloseableHttpResponse VAR_response_Received = Var_Rest_Client_initialisation.execute(Var_Enter_URL);
			
// Like storing the response code post execution and storing in 'responsecode' variable
			int VAR_responsecode = VAR_response_Received.getStatusLine().getStatusCode(); 
			System.out.println(VAR_responsecode);
			
//how to get the response details and the format we need and store in string variable ++++ print the response in string format 
			String VAR_response_Stringformat = EntityUtils.toString(VAR_response_Received.getEntity(),"UTF-8");
			System.out.println(VAR_response_Stringformat);
	
// convert string response into Jason format // print the response in JSON format
			JSONObject VAR_responseinjsonformat = new JSONObject(VAR_response_Stringformat);
			System.out.println(VAR_responseinjsonformat);

// get all Header details // this will return all headers in Array and we will store in variable 'headerresponse'	
			Header[] headerresponse = VAR_response_Received.getAllHeaders(); 
		
// convert this into HASH MAP as the value in HASH MAP will be stored in KEY:VALUE format
// string format variable
			HashMap <String,String> hashmapformat = new HashMap <String,String>(); 
		
// iterate this array using for loop so that values in arrays are stored.
			for (Header jsonformatvariable : headerresponse) {
			hashmapformat.put(jsonformatvariable.getName(),jsonformatvariable.getValue());
			System.out.println(hashmapformat);
			
				}
					}
}
