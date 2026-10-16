package model;
 import java.util.Objects;
  public class Container { 
    private String id; 
    private String nomeApp; 
    private double ramNecessaria;
    public Container(String id, String nomeApp, double ramNecessaria) {
         this.id = id; 
         this.nomeApp = nomeApp;
          this.ramNecessaria = ramNecessaria;
         }
    public String getId() { 
        return id; 
    }
    public String getNomeApp() { 
        return nomeApp;
    }
    public double getRamNecessaria() { 
        return ramNecessaria; 
    }
    @Override public boolean equals(Object o) {
         if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false; 
          Container container = (Container) o; 
          return Objects.equals(id, container.id); 
        }
        @Override public int hashCode() {
             return Objects.hash(id);
             } }
             //VALIDA SE A ID DO CONTENER RELAMETE EXISTE E RETORNA CONTERNER 
    // 253640972
