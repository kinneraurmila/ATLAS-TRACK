package DynamoDb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class DeleteItem {
    public static void main(String[] args) {

        AwsBasicCredentials awsCred = AwsBasicCredentials.create("dummy", "dummy");

        Region region = Region.US_EAST_2;
        // Create a DynamoDbClient
        DynamoDbClient dynamoDbClient = DynamoDbClient.builder()
                .region(region)
                .endpointOverride(URI.create("http://localhost:8000"))
                .credentialsProvider(StaticCredentialsProvider.create(awsCred))
                .build();

        // Define the table name
        String tableName = "Membership";
        Map<String, AttributeValue> original = new HashMap<>();
        original.put("TeamID", AttributeValue.builder().s("123").build()); // Primary key
        original.put("MemberID", AttributeValue.builder().s("Value1").build());

        DeleteItemRequest request = DeleteItemRequest.builder()
                .tableName(tableName)
                .key(original)
                .returnValues(ReturnValue.ALL_OLD)
                .build();
        try {
            // Execute the update
            DeleteItemResponse response = dynamoDbClient.deleteItem(request);
            if (response.attributes() != null && !response.attributes().isEmpty()) {
                System.out.println("Deleted successfully: " + response.attributes());
            } else {
                System.out.println("not found");
            }
        } catch (Exception e) {
            System.out.println("failed to delete item :" + e.getMessage());
        }
        dynamoDbClient.close();

    }
}
