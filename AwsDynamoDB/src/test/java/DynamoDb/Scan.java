package DynamoDb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scan {
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

        try {
            ScanRequest request = ScanRequest.builder()
                    .tableName(tableName)
                    .build();
            ScanResponse response = dynamoDbClient.scan(request);
            List<Map<String, AttributeValue>> items = response.items();
            for (Map<String, AttributeValue>item:items){
                System.out.println(items);
            }
        }catch (DynamoDbException e){
            System.out.println("unable to scan table : "+ e.getMessage());

        }
    }

}
