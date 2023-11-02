package restApi.utils;

import org.json.JSONObject;

import java.util.Iterator;

public class JsonUtil {

    public boolean isequalJson(String expectedResult, String actualResult){
        boolean areEqual = true;
        JSONObject actualJson = new JSONObject(actualResult);
        JSONObject expectedJson = new JSONObject(expectedResult);
        Iterator<?> keys = expectedJson.keys();

        while(keys.hasNext()) {
            String key = (String) keys.next();
            String expectedValue = String.valueOf(expectedJson.get(key));
            String actualValue = String.valueOf(actualJson.get(key));
            if (actualJson.has(key)) {
                if (expectedValue.contains("IGNORE") || actualValue.contains("IGNORE")) {
                    System.out.println("INFO > ignorando la comparacion del key [" + key + "]");
                } else if (!expectedValue.equals(actualValue)) {
                    areEqual = false;
                    System.out.println("ERROR>el key [" + key + "] tiene como expected: [" + expectedValue + "] vs actual [" + actualValue + "]");
                }
            }else{
                areEqual=false;
                System.out.println("ERROR>El actual result no tiene el key: ["+key+"]");
            }
        }

        return areEqual;
    }
}
