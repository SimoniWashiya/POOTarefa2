package view;

public class Playlist {

	    private List<Musica> musicas = new ArrayList<>();
	    private String donoPlaylist;

	    public Playlist(String donoPlaylist) {
	        this.donoPlaylist = donoPlaylist;
	    }

	    public void adicionarMusica(Musica musica) {
	        musicas.add(musica);
	    }

	    public void tocarMusicaAleatoria() {
	        if (musicas.isEmpty()) {
	            System.out.println("Playlist vazia.");
	            return;
	        }

	        Random random = new Random();
	        int indiceAleatorio = random.nextInt(musicas.size());
	        Musica musicaAleatoria = musicas.get(indiceAleatorio);
	        musicaAleatoria.tocar();
	    }
	}

