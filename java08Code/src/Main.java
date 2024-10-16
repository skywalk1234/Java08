import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>();
        //创建一个列表返回getSongStrings()返回的已经排序好的歌曲列表
        songs = MockSongs.getSongStrings();
        for(String s : songs){
            System.out.println(s);
        }
        System.out.println("=========用泛型实现=========");
        //用泛型增加歌曲列表
        MockSongs2.addSong(new Song("稻香","周杰伦",70));
        MockSongs2.addSong(new Song("shallow","Lady Gaga",100));
        MockSongs2.addSong(new Song("unstoppable","sia",120));
        //不知道确切的bpm所以是随便写的
        MockSongs2.getSongString();
    }
}
