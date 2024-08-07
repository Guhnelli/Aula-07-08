package Aula_07_08;

public class Ativadade01 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Califoria, USA");
		pessoa1.setProfissao("Ator");
		pessoa2.setCpf("456456456.00");
		pessoa2.setRg("123456789");

		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setCpf("123123123.00");
		pessoa2.setRg("789456123");
		
		System.out.println("----- OBEJETO -----");
		System.out.println(pessoa1.getNome ());
		System.out.println(pessoa1.getIdade ());
		System.out.println(pessoa1.getEndereço ());
		System.out.println(pessoa1.getProfissao ());
		System.out.println(pessoa1.getCpf ());
		System.out.println(pessoa1.getRg ());
		
		System.out.println("----- OBEJETO -----");;
		System.out.println(pessoa2.getNome ());
		System.out.println(pessoa2.getIdade ());
		System.out.println(pessoa2.getEndereço ());
		System.out.println(pessoa2.getProfissao ());
		System.out.println(pessoa2.getCpf ());
		System.out.println(pessoa2.getRg ());
	}

}
