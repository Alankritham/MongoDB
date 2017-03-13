
import com.mongodb.MongoClient;

import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.Block;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alankritha
 */
public class RequestHandler {
        private static final MongoClient mongo =new MongoClient("localhost",27017);


    protected String collection; // == craigslist_users
    protected HashMap<String, String> document = new HashMap<>();

    protected RequestHandler(String collection) {
        this.collection = collection;

    }
    
    
    public void insert(HttpServletRequest request) {
        DB db = mongo.getDB("test");
        DBCollection dbc = db.getCollection(collection);
        BasicDBObject add = new BasicDBObject();
      
        for(Map.Entry<String, String> ent : this.document.entrySet()) {
            add.append(ent.getKey(),request.getParameter(ent.getValue()));
        }
        dbc.insert(add);
        System.out.print(add);
        
        
        }
    public void retrieve(HttpServletRequest request, HttpServletResponse response){
        DB db = mongo.getDB("test");
        DBCollection dbc = db.getCollection(collection);
        BasicDBObject add = new BasicDBObject();
        
        
               try (PrintWriter out = response.getWriter()) {
            /*TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><script>" + "function myFunction(elt) {" +
" elt.setAttribute('selected_object_id', elt.getAttribute('id'));" +
                    "var xhr = new XMLHttpRequest();" +
"    xhr.open('GET', 'http://localhost:8080/MongoCraig/DeleteInfo', true);" +
"    xhr.send(null);}" +
"</script></head>");
            DBCursor cursor = dbc.find();
            out.println("<body>");
           for(DBObject record : cursor){
            out.println("<p>First Name : "+record.get("firstname")+"</p>");
            out.println("<p>Last Name : "+record.get("lastname")+"</p>");
            out.println("<p>What : "+record.get("what")+"</p>");
            out.println("<p>Price : "+record.get("price")+"</p>");
            out.println("<button id=" + record.get("_id") +" onclick='myFunction(this); '>DELETE</button> ");
            
            }
            out.println("</body>");
            out.println("</html>");
               } catch(Exception e){
                    
                }
    }
     public void delete(HttpServletRequest request, HttpServletResponse response){
        DB db = mongo.getDB("test");
        DBCollection dbc = db.getCollection(collection);
        BasicDBObject add = new BasicDBObject();
        try {
            PrintWriter out = response.getWriter();
            out.println(request.getParameter("selected_object_id"));
        } catch(Exception e) {
            
        }
        System.out.println(request.getParameter("selected_object_id"));
        add.put("_id",request.getParameter("selected_object_id"));
        dbc.remove(add);
        retrieve(request, response);
    
     } 
    }


