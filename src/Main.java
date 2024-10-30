
public class Main {

	public static void main(String[] args) {
//Criando instância para funcionário assalariado, testando os métodos interface para calcular bônus e a exibição formatada.
		Funcionario funcionario1 = new FuncionarioAssalariado("Lucas Yoshida", 10000);
			System.out.println("Dados do funcionário: \n" + funcionario1.exibicao());
			System.out.println("Bônus do funcionário: " + funcionario1.calcularBonus() + "\n");
			
//Criando instância para funcionário horista, testando os métodos interface ára calcular bônus e a exibição formatada. 
		Funcionario funcionario2 = new FuncionarioHorista("Irineu da Silva", 20000);
			System.out.println("Dados do funcionário: \n" + funcionario2.exibicao());
			System.out.println("Bônus do funcionário: " + funcionario2.calcularBonus() + "\n");

	}

}
