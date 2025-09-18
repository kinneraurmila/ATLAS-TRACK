package DynamoDb;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class Query {
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
            QueryRequest request = QueryRequest.builder()
                    .tableName(tableName)
                    .keyConditionExpression("TeamID = teamID")

                    .expressionAttributeValues(Map.of(":teamID", AttributeValue.builder().s("123").build()))
                    .build();

            QueryResponse response = dynamoDbClient.query(request);
            List<Map<String, AttributeValue>>items = response.items();
            if(items.isEmpty()){
                System.out.println("no item found for TeamID =123");
            }else{
                for(Map<String, AttributeValue>item:items){
                    System.out.println(item);
                }
            }
        }catch (DynamoDbException e){
            System.out.println("unable to query table : "+ e.getMessage());

        }
        dynamoDbClient.close();
    }
}
