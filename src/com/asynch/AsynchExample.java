package com.asynch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AsynchExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 // Simulate the database query using CompletableFuture
        CompletableFuture<String> queryResult = getDataFromDatabaseAsync(1);

        // Do some other work while waiting for the database query to complete
        System.out.println("Doing other work while waiting for the database query...");

        // Get the result of the database query (this will block until the query is done)
        String result = queryResult.get();  // This blocks here, waiting for database result

        // Process the result after the query completes
        System.out.println("Database query result: " + result);

	}

	 // Simulate a database call that takes time
    private static CompletableFuture<String> getDataFromDatabaseAsync(int id) {
        // Return a CompletableFuture that simulates fetching data from the database
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a delay as if fetching data from a real database
                System.out.println("Fetching data from database...");
                TimeUnit.SECONDS.sleep(3); // Simulate a 3-second database query delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Return the simulated data
            return "User data for ID " + id;
        });
    }

}
