package com.cse2214.eldorado;
//Badrul

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;

import org.bson.Document;



public class MongoDB
{
    MongoClient client;
    MongoDatabase db;
    MongoCollection <Document> collection;
    MongoCollection <Document> collectionbus;
    FindIterable <Document> iterdoc,iterdocbus;

    public MongoDB()
    {
        client=MongoClients.create("mongodb+srv://ElDorado1:MAcmw0ldFbNTvLdU@eldorado1.wuakt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        db = client.getDatabase("User");
        collection=db.getCollection("Database");
        collectionbus=db.getCollection("BUSDB");
        iterdoc=collection.find();      //is a list of iterable document
        iterdocbus=collectionbus.find();

    }
    void mongoDB()
    {

        for (Document doc : iterdoc)
        {
            /*"_id": "$oid": "61f10679c27e89d5a7163d11"
                "User Number": 997
                "Name": "Arnie Palek"
                "gender": "Male"
                "Passport Number": "10191-1843"
                "Phone Number": "+880-708-458-6044"
                "Email": "apalekro@seattletimes.com"
                "Card Number": "30512113270506"
                "Visa ID": "589-77-8801"
                "City": "Khulna"
                "Country": "Bangladesh"
                "User_Name": "apalekro"
                "Passeord": "7kEgFActJ1"*/



                System.out.println(doc.get("User Number") + "\t|\t" + doc.get("Name"));
            //System.out.println(doc..toJson().replace("{", "").replace("}", "").replace(",","\n"));
        }
    }
    void mongoDBBus()
    {

        for (Document doc : iterdocbus)
        {
            /*"_id": "$oid": "61f10679c27e89d5a7163d11"
                "User Number": 997
                "Name": "Arnie Palek"
                "gender": "Male"
                "Passport Number": "10191-1843"
                "Phone Number": "+880-708-458-6044"
                "Email": "apalekro@seattletimes.com"
                "Card Number": "30512113270506"
                "Visa ID": "589-77-8801"
                "City": "Khulna"
                "Country": "Bangladesh"
                "User_Name": "apalekro"
                "Passeord": "7kEgFActJ1"*/



                System.out.println(doc.get("From_City") + "\t|\t" + doc.get("Fare"));
            //System.out.println(doc..toJson().replace("{", "").replace("}", "").replace(",","\n"));
        }
    }

    

//0-10
    void insertMongoDB(int User_Number,String ...args)
    {
        Document doc=new Document("User Number",User_Number)
                                .append("Name", args[0])
                                .append("gender",args[1])
                                .append("Passport Number",args[2])
                                .append("Phone Number",args[3])
                                .append("Email",args[4])
                                .append("Card Number",args[5])
                                .append("Visa ID",args[6])
                                .append("City",args[7])
                                .append("Country",args[8])
                                .append("User_Name",args[9])
                                .append("Passeord",args[10]);
        collection.insertOne(doc);


    }

    public boolean passwordAuth(String Email, String password) 
    {
        Document doc = collection.find(Filters.eq("Email",Email)).first();
        if(doc==null)
        {
            return false;
        }

        if (doc.get("Passeord").equals(password))
        {
            return true;

        }
        return false;
    }
}
