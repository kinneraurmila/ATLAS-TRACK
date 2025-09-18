package DynamoDb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;


public class AddItem {
    public static void main(String[] args) {
        AwsBasicCredentials awsCred =AwsBasicCredentials.create("dummy","dummy");

        Region region= Region.US_EAST_2;

        // Create DynamoDB client
        DynamoDbClient dynamoDbClient = DynamoDbClient.builder()
                .region(region)
                .endpointOverride(URI.create("http://localhost:8000"))
                .credentialsProvider(StaticCredentialsProvider.create(awsCred))
                .build();

        // Define the table name
        String tableName = "Membership";
        try {
            // Create the item to insert
            Map<String, AttributeValue> item = new HashMap<>();
            item.put("TeamID", AttributeValue.builder().s("123").build()); // Primary key
            item.put("MemberID", AttributeValue.builder().s("Value1").build());
            item.put("attribute2", AttributeValue.builder().n("42").build());

            // Create the PutItemRequest
            PutItemRequest request = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();

            // Insert the item into the table
            dynamoDbClient.putItem(request);

            System.out.println("Item successfully inserted into table: " + tableName);
        }catch (Exception e){
            System.out.println("unable to add items :" + e.getMessage());
        }
        // Close the client
        dynamoDbClient.close();
    }
}
