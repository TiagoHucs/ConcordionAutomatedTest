package tests;

public class Result {
	   private String primeiroNome;
	   private String ultimoNome;
	   
	   public String getPrimeiroNome() {
	      return primeiroNome;
	   }
	   public void setPrimeiroNome(String primeiroNome) {
	      this.primeiroNome = primeiroNome;
	   }
	   //o getUltimoNome é usado pelo concordion #result.ultimoNome
	   public String getUltimoNome() {
	      return ultimoNome;
	   }
	   public void setUltimoNome(String ultimoNome) {
	      this.ultimoNome = ultimoNome;
	   } 
	}
