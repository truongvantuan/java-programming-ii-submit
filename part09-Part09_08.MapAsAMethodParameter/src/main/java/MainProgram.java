
import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("hello", "Xin chao");
        maps.put("love", "Yeu thuong");
        maps.put("learn", "Hoc tap");
        System.out.print(returnSize(maps));

    }

    public static int returnSize(Map map) {
        return map.size();
    }
}
