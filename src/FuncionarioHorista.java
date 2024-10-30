//Criando classe de funcionario horista com atributos específicos e tendo a implementação do método interface 'Funcionario'.
public class FuncionarioHorista implements Funcionario{
	private String nome;
	private double salarioAnual;

//Constructor para inicialização dos atributos criados.
	public FuncionarioHorista(String nome, double salarioAnual) {
		this.nome = nome;
		this.salarioAnual = salarioAnual;
	}

//Encapsulamento para acessar a alterar atributos privados.
	public String getNome() {
		return
				nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioAnual() {
		return
				salarioAnual;
	}
	
	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}
	
//Método de exibição interface formatada quando puxadas ao main.
	public String exibicao() {
		return
				"Nome: " + getNome() + "\n" +
				"Salário anual: " + getSalarioAnual();
	}
	
//Chamando método interface para calcular o bônus do funcionário horista, puxando seu salário anual e multiplicando por 10%. 
	@Override
	
	public double calcularBonus() {
		return
				getSalarioAnual() * 0.10;
	}
}
