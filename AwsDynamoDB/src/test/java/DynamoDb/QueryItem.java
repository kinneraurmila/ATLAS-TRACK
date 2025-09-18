package DynamoDb;


import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.QueryRequest;
import software.amazon.awssdk.services.dynamodb.model.QueryResponse;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class QueryItem {
    public static void main(String[] args) {
        // Create DynamoDbClient
        AwsBasicCredentials awsCred = AwsBasicCredentials.create("dummy", "dummy");

        Region region = Region.US_EAST_2;
        // Create a DynamoDbClient
        DynamoDbClient dynamoDbClient = DynamoDbClient.builder()
                .region(region)
                .endpointOverride(URI.create("http://localhost:8000"))
                .credentialsProvider(StaticCredentialsProvider.create(awsCred))
                .build();

        // Define the table name and key condition
        String tableName = "Membership";
        String partitionKeyName = "TeamID";
        String partitionKeyValue = "123";

        // Build the key condition expression
        Map<String, String> expressionAttributeNames = new HashMap<>();
        expressionAttributeNames.put("#pk", partitionKeyName);

        Map<String, AttributeValue> expressionAttributeValues = new HashMap<>();
        expressionAttributeValues.put(":pkValue", AttributeValue.builder().s(partitionKeyValue).build());

        // Create the QueryRequest
        QueryRequest queryRequest = QueryRequest.builder()
                .tableName(tableName)
                .keyConditionExpression("#pk = :pkValue")
                .expressionAttributeNames(expressionAttributeNames)
                .expressionAttributeValues(expressionAttributeValues)
                .build();

        // Execute the query
        QueryResponse queryResponse = dynamoDbClient.query(queryRequest);

        // Process the results
        queryResponse.items().forEach(item -> {
            System.out.println("Item: " + item);
        });

        // Close the client
        dynamoDbClient.close();
    }
}
