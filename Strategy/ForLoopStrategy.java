package Strategy;

import java.util.List;

public class ForLoopStrategy implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        String[] array = list.toArray(new String[0]);
        for(int i = 0; i < array.length; i++){
            result.append(array[i]);
            if( i % 2 == 1){
                result.append("\n");
            }
        }
        return result.toString();
    }
    
}
