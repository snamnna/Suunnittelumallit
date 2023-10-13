package Strategy;

import java.util.List;

public class GetMethodStrategy implements ListConverter{

    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            result.append(list.get(i));
            if(i % 3 == 2){
                result.append("\n");
            }
        }
        return result.toString();
    }
    
}
