package view;

public class Main {
	public static void main(String[] args) {
      
        Musica musica1 = new Musica("Oceano", "Djavan", "Sony");
        Musica musica2 = new Musica("Tempos Modernos", "Lulu Santos", "Sony");
        Musica musica3 = new Musica("Menina Veneno", "Richie", "Sony");

     
        Playlist playlist = new Playlist("Dono da Playlist");

       
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);
        playlist.adicionarMusica(musica3);

        playlist.tocarMusicaAleatoria();
    }
}

