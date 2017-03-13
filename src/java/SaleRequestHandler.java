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

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alankritha
 */
public class SaleRequestHandler extends RequestHandler {

    public SaleRequestHandler() {
        super("craigslist_users");
        document.put("firstname","firstname");
        document.put("lastname","lastname");
        document.put("what","sold-item");
        document.put("description","desc");
        document.put("price","price");
        
        
    }
    
}
