import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class solution2 {

public static void main(String[] args) {
evaluateExpressions();
}

public static void evaluateExpressions() {
try {
// Create a buffered reader to read input from the console
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in
));
String expression;
// Read expressions until "end" is entered
while (!(expression = reader.readLine().trim()).equals("end")) {
// Evaluate the expression and print the result
String result = evaluateExpression(expression);
System.out.println(expression + " => " + result);
}
} catch (Exception e) {
e.printStackTrace();
}
}

public static String evaluateExpression(String expression) {
try {
// Encode the expression to include in the URL
String encodedExpression = java.net
.URLEncoder.encode(expression, "UTF-8");
// Construct the API URL with the encoded expression
String apiUrl = "http://api.mathjs.org/v4/?expr=
" + encodedExpression;

// Create a URL object
URL url = new URL(apiUrl);
// Open a connection to the URL
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");

// Create a buffered reader to read the response from the API
BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
// Read the response
String response = reader.readLine();

// Close the reader and disconnect the connection
reader.close();
connection.disconnect();

return response;
} catch (Exception e) {
e.printStackTrace();
return "Error: Failed to evaluate expression";
}
}
}