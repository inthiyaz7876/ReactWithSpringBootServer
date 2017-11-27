import java.util.Map;

public class UserSerializer implements Serializer {
  @Override public void configure(Map<String, ?> map, boolean b) {
  }
  @Override public byte[] serialize(String arg0, User arg1) {
    byte[] retVal = null;
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      retVal = objectMapper.writeValueAsString(arg1).getBytes();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return retVal;
  }
  @Override public void close() {
  }
}