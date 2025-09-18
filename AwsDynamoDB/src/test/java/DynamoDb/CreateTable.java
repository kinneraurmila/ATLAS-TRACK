package DynamoDb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;

public class CreateTable {
    public static void main(String[] args) {

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

        try {
            // Create the table
            CreateTableRequest request = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(
                            KeySchemaElement.builder()
                                    .attributeName("TeamID")
                                    .keyType(KeyType.HASH) // Partition key
                                    .build(),
                            KeySchemaElement.builder()
                                    .attributeName("MemberID")
                                    .keyType(KeyType.RANGE) // Sort key
                                    .build()
                    )
                    .attributeDefinitions(
                            AttributeDefinition.builder()
                                    .attributeName("TeamID")
                                    .attributeType(ScalarAttributeType.S) // String
                                    .build(),
                            AttributeDefinition.builder()
                                    .attributeName("MemberID")
                                    .attributeType(ScalarAttributeType.S) // String
                                    .build()
                    )
                    .provisionedThroughput(
                            ProvisionedThroughput.builder()
                                    .readCapacityUnits(5L)
                                    .writeCapacityUnits(5L)
                                    .build()
                    )
                    .build();

            // Send the request to create the table
            dynamoDbClient.createTable(request);
            System.out.println("Table created successfully: " + tableName);

        } catch (ResourceInUseException e){
            System.out.println("table already exist :" + e.getMessage());
        } catch(DynamoDbException e) {
            System.err.println("Unable to create table: " + e.getMessage());
        } finally {
            // Close the client
            dynamoDbClient.close();
        }
    }
}

