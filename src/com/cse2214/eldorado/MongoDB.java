package com.cse2214.eldorado;
//Badrul

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.Formatter;
import java.util.logging.Logger;
import java.util.logging.Level;

//import java.lang.System.Logger;

public class MongoDB {
    MongoClient client;
    MongoDatabase db;
    MongoCollection<Document> collection;
    MongoCollection<Document> collectionbus;
    MongoCollection<Document> collectionedb;
    FindIterable<Document> iterdoc, iterdocbus, iterdocedb;

    public MongoDB() {
        //Logger.getLogger
        Logger.getLogger("org.mongodb.driver").setLevel(Level.OFF);
       // System.out.print("\033[H\033[2J");
        client = MongoClients.create("mongodb+srv://ElDorado1:MAcmw0ldFbNTvLdU@eldorado1.wuakt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        db = client.getDatabase("User");
        collection = db.getCollection("Database");
        collectionbus = db.getCollection("BUSDB");
        collectionedb = db.getCollection("EmergencyContactDatabase");
        iterdoc = collection.find(); // is a list of iterable document
        iterdocbus = collectionbus.find();
        iterdocedb = collectionedb.find();
    }

    void mongoDB() {
        for (Document doc : iterdoc)
            System.out.println(doc.get("User Number") + "\t|\t" + doc.get("Name"));
    }

    void mongoDBBus() {
        for (Document doc : iterdocbus)
            System.out.println(doc.get("From_City") + "\t|\t" + doc.get("Fare"));
    }

    void insertMongoDB(int User_Number, String... args) {
        Document doc = new Document("User Number", User_Number)
                .append("Name", args[0])
                .append("gender", args[1])
                .append("Passport Number", args[2])
                .append("Phone Number", args[3])
                .append("Email", args[4])
                .append("Card Number", args[5])
                .append("Visa ID", args[6])
                .append("City", args[7])
                .append("Country", args[8])
                .append("User_Name", args[9])
                .append("Passeord", args[10]); // 0-10
        collection.insertOne(doc);
    }

    void updateMongoDB(String Email, String password) {
        Document doc = collection.find(Filters.eq("Email", Email)).first();
        if (doc == null){
            System.out.println(Email+"Takrim Nai");
            return;
        }
        doc.replace("Passeword", password);
        collection.updateOne(Filters.eq("Email",Email),new Document("$set",doc));
    }

    public boolean passwordAuth(String Email, String password) {
        Document doc = collection.find(Filters.eq("Email", Email)).first();
        if (doc == null)
            return false;
        if (doc.get("Passeord").equals(password))
            return true;
        return false;
    }

    void mongoDBEmergencyDB() {
        for (Document doc : iterdocedb) {
            System.out.print("\t|");
            System.out.format("%-30s%20s%20s", doc.get("Country") + "\t|\t", doc.get("Category") + "\t|\t",
                    doc.get("Mobile") + "\t|\n");
        }
    }
}
