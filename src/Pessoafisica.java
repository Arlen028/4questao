public class Pessoafisica extends Pessoa {
  
  private String cpf;
  private String sobrenome;
  
  public Pessoafisica(String nome){
    super(nome);
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public String getCpf(){
    return cpf;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
  public String getSonrenome(){
    return sobrenome;
  }
  public String toString(){
    return nome + cpf + sobrenome;
  }

}
