import java.time.LocalDate;

public class Paciente {
	
	private String nome;
	private String sobrenome;
	private char sexo;
	private LocalDate nascimento;
	private byte idade;
	private short altura;
	private double peso;
	private String cpf;
	private double imc;
	
	public Paciente(String nome, String sobrenome, char sexo, LocalDate nascimento, byte idade, short altura,
			double peso, String cpf, double imc) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.cpf = cpf;
		this.imc = imc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public byte getIdade() {
		return idade;
	}

	public short getAltura() {
		return altura;
	}

	public void setAltura(short altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getImc() {
		return imc;
	}
	
	

	public static double obterPesoIdeal() {
		int homens = (int) ((72.7 *5) - 58);
		int mulheres = (int) ((62.1 * 5) - 44.7);
		
		return 0;
		
	}
	
	public static String obterCpfOfuscado() {
	return "cpf";
	
	}
	
	public static String obterSituacaoIMC() {
		return "";		
	}
	
	private static double cacacularIMC() {
		return 0;
	}
	private static byte calcularIdade() {
		return 0;
	}
	private static boolean validarCPF() {
		return false;
	}

}
