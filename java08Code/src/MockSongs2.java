import java.util.ArrayList;

public class MockSongs2 {
    public static void getSongString(){
        for(Song song:songs_){
            song.getInfo();
        }
    }
    static ArrayList<Song> songs_ = new ArrayList<Song>();
    //用泛型对传入的元素做限制，只能是Song类或者它的子类
    public static void addSong(Song song){
        songs_.add(song);//以每一个Song对象作为一个列表的元素
    }
}
