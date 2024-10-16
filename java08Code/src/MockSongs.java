import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        //模拟将要处理的列表
        songs.add("sunrise");
        songs.add("noprice");
        songs.add("thanks");
        songs.add("$100");
        songs.add("havana");
        songs.add("114514");
        Comparator<String> firstcharacter = new Comparator<String>(){
            public int compare(String s1, String s2){
                char first = s1.charAt(0);
                char seconed = s2.charAt(0);
                return first-seconed;
                //定义一个匿名内部类来实现Comparator接口，在类中重写了compare方法
                //通过返回正数，0，和负数表示两个首字符的大小关系，符合compare返回的参数的要求
            }
        };
        Collections.sort(songs, firstcharacter);
        //sort()方法会反复将songs中的元素传入到compare方法中进行比较，由底层的二叉树排序（binary sort)算法进行排序
        return songs;
    }
}