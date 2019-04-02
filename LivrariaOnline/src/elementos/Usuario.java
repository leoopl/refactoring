package elementos;

public class Usuario {

	//private int codigo;
	private String senha;
	private String email;
	private String nome;
	private String cpf;
	private String datanascimento;
	private String cep;
	private String endereco;
	private String complemento;
	private String numero;
	private String bairro;
	private String estado;
	private String cidade;
	private String telefone;
	private boolean admin;

	public Usuario(String nome, String senha, String email) {
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.admin = true;
	}

	public Usuario(String nome, String senha, String email, String cpf, String datanascimento, String cep,
			String endereco, String complemento, String numero, String bairro, String estado, String cidade,
			String telefone) {

		this.senha = senha;
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
		this.datanascimento = datanascimento;
		this.cep = cep;
		this.endereco = endereco;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
		this.telefone = telefone;
		this.admin = false;
	}

	/*
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}*/

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
