package com.cse2214.eldorado;

import com.mongodb.client.*;

import org.bson.Document;

public class MongoDB
{
    MongoClient client;
    MongoDatabase db;
    MongoCollection <Document> collection;
    FindIterable <Document> iterdoc;

    public MongoDB()
    {
        client=MongoClients.create("mongodb+srv://ElDorado1:MAcmw0ldFbNTvLdU@eldorado1.wuakt.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        db = client.getDatabase("User");
        collection=db.getCollection("Database");
        iterdoc=collection.find();      //is a list of iterable document

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
    void insertMongoDB()
    {
        Document doc;
    }


}
