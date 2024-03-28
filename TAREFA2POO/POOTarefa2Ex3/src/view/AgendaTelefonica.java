package view;

public class AgendaTelefonica {
	private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(String nome, String telefone, String email) {
        Contato novoContato = new Contato(nome, telefone, email);
        contatos.add(novoContato);
    }

    public void removerContato(String nome) {
        Contato contatoParaRemover = buscarContato(nome);
        if (contatoParaRemover != null) {
            contatos.remove(contatoParaRemover);
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se o contato não for encontrado
    }
}


