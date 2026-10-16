 package model; 
 import java.util.Objects; 
 public class Cliente { 
    private String cpf; 
    private String nome; 
    public Cliente(String cpf, String nome) { 
        this.cpf = cpf; this.nome = nome;
     } 
     public String 
     getCpf() {
         return cpf; } 
    public String getNome() { 
            return nome; } 
            @Override 
    public boolean equals(Object o) {
                 if (this == o) return true;
                  if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o; return Objects.equals(cpf, cliente.cpf); }
     @Override 
    public int hashCode() { return Objects.hash(cpf); } }
    //FAZ VALIDAÇÃO E VERIFICA SE A DADOS DE CLIENTE NÃO SÃO NULL RETORNA DADOS CLIENTE 
 //253640972
