/*package com.cse2214.eldorado;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.*;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import org.bson.Document;

import io.github.cdimascio.dotenv.Dotenv;


public class Authentication
{
    private static MongoClient client;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    public static void init() 
    {
        Dotenv env = Dotenv.load();
        String connString = env.get("mongodb+srv://ElDorado1:MAcmw0ldFbNTvLdU@eldorado1.wuakt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        String db = env.get("User");
        client = MongoClients.create(connString);
        database = client.getDatabase(db);
        collection = database.getCollection("Database");
    }

    public static boolean passwordAuth(String username, String password) {

        collection = database.getCollection("Database");
        Document doc = collection.find(Filters.eq("User_Name
        ", username)).first();

        if (doc.get("Passeord").equals(password)) {
            return true;
        }
        return false;
    }




}
*/
