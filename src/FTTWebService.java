import static spark.Spark.*;
 
public class FTTWebService {
	
	//Microserviços - GitHub: danielscarvalho/FTT-API-Microservice-SparkJava
	
	//Refer: https://www.baeldung.com/spark-framework-rest-api
	//Refer: http://sparkjava.com/
	//Refer: https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826
	
    public static void main(String[] args) {
    	
    	System.out.print(new java.util.Date());
    	System.out.println(" - FTT WEB Service...");    	
  
        get("/hello", (req, res)-> "Hello, world " + new java.util.Date());
         
        get("/hello/:name", (req,res)-> {
            return "Hello, " + req.params(":name");
        });
        
        get("/add/:a/:b", (req,res)-> {
            return Integer.valueOf(req.params(":a")) + 
            	   Integer.valueOf(req.params(":b"));
        });

        //curl -X PUT http://localhost:4567/user/344

        put("/user/:id", (req,res)-> {
            return "New user, " + req.params(":id");
        });

        post("/user/:id", (req,res)-> {
            return "User, " + req.params(":id") + " updated!!!";
        });

        //curl -X DELETE http://localhost:4567/user/344
        
        delete("/user/:id", (req,res)-> {
            return "User, " + req.params(":id") + " removed!!";
        });

        
    
    }
}
