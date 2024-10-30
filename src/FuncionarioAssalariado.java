//Criando classe funcionário assalariado contendo atributos específicos e a implementação do método interface Funcionario. 
public class FuncionarioAssalariado implements Funcionario{
	private String nome;
	private double salario;
	private double bonusAssalariado = 5000;
	
//Constructor para inicialização dos atributos criados.
	public FuncionarioAssalariado(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
//Encapsulamento para acessar e alterar atributos privados. 
	public String getNome() {
		return
				nome;	
	}
	
	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public double getSalario() {
		return
				salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
//Método de exibição interface formatada quando puxadas ao main.
	@Override
	public String exibicao() {
		return
				"Nome: " + getNome() + " \n" +
				"Salário: " + getSalario();
				
		
	}
//Chamando método interface para calcular o bônus do funcionário assalariado, retornando o valor de bônus fixo de R$5000,00.
	@Override
	public double calcularBonus() {
		return
				bonusAssalariado;
	}


	
}
