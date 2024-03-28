package view;

public class Main {
	
	public static void main(String[] args) {
     
        AgendaTelefonica agenda = new AgendaTelefonica();

     
        agenda.adicionarContato("Jo�o", "123456789", "joao@gmail.com");
        agenda.adicionarContato("Maria", "987654321", "maria@gmail.com");

       
        Contato contatoEncontrado = agenda.buscarContato("Jo�o");
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome());
            agenda.removerContato("Jo�o");
        } else {
            System.out.println("Contato n�o encontrado na agenda.");
        }
	}
}


