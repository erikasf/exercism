import java.util.Map;
import java.util.HashMap;

public class RnaTranscription {

  private static final Map<Character, Character> RNA_PAIRS = new HashMap<Character, Character>(){{
        put('C', 'G');
        put('G', 'C');
        put('T', 'A');
        put('A', 'U');
    }};

  public static String ofDna(String input) {

    String result = "";

    for(char c : input.toCharArray()) {
      result += RNA_PAIRS.get(c);
    }

    return result;

  }

}
