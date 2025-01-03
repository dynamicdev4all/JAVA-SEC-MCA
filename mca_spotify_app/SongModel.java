public class SongModel {
    String _songName;
    String _singerName;
    String _albumName;
    String _songImage;
    String _audioUrl;

    SongModel(String songName, String singerName, String albumName, String songImage, String audioUrl) {
        _songName = songName;
        _singerName = singerName;
        _albumName = albumName;
        _songImage = songImage;
        _audioUrl = audioUrl;
    }

    void printSongData() {
        System.out.println("Song Name :" + _songName);
        System.out.println("Singer Name :" + _singerName);
        System.out.println("Album Name :" + _albumName);
        System.out.println("Song Image :" + _songImage);
        System.out.println("Audio Url :" + _audioUrl);
    }
}
