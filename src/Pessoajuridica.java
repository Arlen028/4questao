public class Pessoajuridica extends Pessoa {
  
  private String cnpj;
  private String razaoSocial;

  public Pessoajuridica(String nome){
    super(nome);
  }

  public void setCnpj(String cnpj){
    this.cnpj = cnpj;
  }
  public String getCnpj(){
    return cnpj;
  }

  public void setRazaoSocial(String razaoSocial){
    this.razaoSocial = razaoSocial;
  }
  public String getRazaoSocial(){
    return razaoSocial;
  }
  
  public String toString(){
    return nome + cnpj + razaoSocial;
  }
}
