package view;

public class Main {
	
	public static void main(String[] args) {
     
        AgendaTelefonica agenda = new AgendaTelefonica();

     
        agenda.adicionarContato("João", "123456789", "joao@gmail.com");
        agenda.adicionarContato("Maria", "987654321", "maria@gmail.com");

       
        Contato contatoEncontrado = agenda.buscarContato("João");
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome());
            agenda.removerContato("João");
        } else {
            System.out.println("Contato não encontrado na agenda.");
        }
	}
}


