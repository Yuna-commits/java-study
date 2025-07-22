package chapter03.ex06;

public class SongApp {
	public static void main(String[] args) {
		Song song = new Song();
		
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack(3);
		song.setComposer("이만수");
		
		song.show();
	}
}
