package DynamoDb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.ReturnValue;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemResponse;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class UpdateItem {
    public static void main(String[] args) {
        // Create DynamoDbClient
        AwsBasicCredentials awsCred =AwsBasicCredentials.create("dummy","dummy");

        Region region= Region.US_EAST_2;
        // Create a DynamoDbClient
        DynamoDbClient dynamoDbClient = DynamoDbClient.builder()
                .region(region)
                .endpointOverride(URI.create("http://localhost:8000"))
                .credentialsProvider(StaticCredentialsProvider.create(awsCred))
                .build();

        // Define the table name
        String tableName = "Membership";

        // Define the update expression and attribute values
        Map<String, AttributeValue> original = new HashMap<>();
        original.put("TeamID", AttributeValue.builder().s("123").build()); // Primary key
        original.put("MemberID", AttributeValue.builder().s("Value1").build());

        Map<String, AttributeValue> expressionAttributeValues = new HashMap<>();
        expressionAttributeValues.put(":attrValue", AttributeValue.builder().s("456").build());

        // Create UpdateItemRequest
        UpdateItemRequest updateItemRequest = UpdateItemRequest.builder()
                .tableName(tableName)
                .key(original)
                .updateExpression("SET MemberName =:attrValue")
                .expressionAttributeValues(expressionAttributeValues)
                .returnValues(ReturnValue.ALL_NEW)
                .build();

        try{
        // Execute the update
            UpdateItemResponse response = dynamoDbClient.updateItem(updateItemRequest);
            // Print response
            System.out.println("Item updated successfully: " + response);
        } catch (Exception e) {
            System.out.println("failed to update item :"+ e.getMessage());
        }
    }
}
