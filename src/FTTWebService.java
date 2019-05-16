import static spark.Spark.*;
 
public class FTTWebService {
	
	//Microserviços
	
	//Refer: https://www.baeldung.com/spark-framework-rest-api
	//Refer: http://sparkjava.com/ 
	
    public static void main(String[] args) {
    	
    	System.out.print(new java.util.Date());
    	System.out.println(" - FTT WEB Service...");
    	
  
        get("/hello", (req, res)->"Hello, world " + new java.util.Date());
         
        get("/hello/:name", (req,res)-> {
            return "Hello, " + req.params(":name");
        });
        
        get("/add/:a/:b", (req,res)-> {
            return Integer.valueOf(req.params(":a")) + 
            	   Integer.valueOf(req.params(":b"));
        });

    
    }
}
