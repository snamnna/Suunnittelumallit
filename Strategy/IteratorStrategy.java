package Strategy;

import java.util.List;

public class IteratorStrategy implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String item : list) {
            result.append(item).append("\n");
        }
        return result.toString();
    }
    
}
