package com.kiran.fanatasyPremierLeageue;

import java.util.ArrayList;
import java.util.Arrays;

import org.bson.BSON;
import org.bson.Document;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.BsonField;

public class TestClass {

	private final static String HOST = "localhost";
	private final static int PORT = 27017;

	public static void main(String args[]) {
		try {
			// Connect to mongodb server on localhost
			MongoClient mongoClient = new MongoClient(HOST, PORT);

			// DB db = mongoClient.getDB( "test" );

			DBObject query = new BasicDBObject("web_name", "Mustafi");

			System.out.println("Successfully connected to MongoDB");
			DB db = mongoClient.getDB("fpl");
			MongoDatabase database = mongoClient.getDatabase("fpl");
			MongoCollection<Document> collection = database.getCollection("Players");
			int totalplayers = 0;
			DBCollection coll = db.getCollection("Players");
			DBCursor cursor = coll.find(query);

			/*
			 * Aggregation aggregation = ( // );
			 */
			ArrayList<String> alDivivide = new ArrayList<>();
			alDivivide.add("$total_points");
			alDivivide.add("$points_per_game");

			AggregateIterable<Document> output1 = collection
					.aggregate(Arrays.asList(new Document("$match", new Document("element_type", "1")),
							new Document("$project", new Document("web_name", 1)),
							//new Document("$project",new Document("total_points",1)),
							new Document("$project", new Document("total", new Document("$divide", alDivivide)))));
			/*
			 * AggregateIterable<Document> output = collection.aggregate( Arrays.asList(new
			 * Document("$sort", new Document("total_points", -1)), new Document("$limit",
			 * 20)));
			 */
			System.out.println("start");
			
			for (Document player : output1) {
				System.out.println();
				System.out.println(" playerList " + player.toJson());
			}
			
			  /*Query query1 = new
			  Query(Criteria.where("title").is("File").andOperator(Criteria.where("")));
			  try { while (cursor.hasNext()) { DBObject object = cursor.next();
			  System.out.println(object); totalplayers++;
			  
			  } System.out.println(totalplayers); }
			  
			  finally { cursor.close(); }*/

		}

		catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}