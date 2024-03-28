package view;

public class Musica {
	private String nome;
    private String autor;
    private String gravadora;

    public Musica(String nome, String autor, String gravadora) {
        this.nome = nome;
        this.autor = autor;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public void tocar() {
        System.out.println("Tocando música: " + nome);
    }
}

