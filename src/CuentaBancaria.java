
public class CuentaBancaria {

	private String iban;
	private String dni;
	private float saldo;
	private char c;
	
	//CONSTRUCTORES
	public CuentaBancaria(){
		iban = null;
		dni = null;
		saldo = 0;
	}
//	
	public CuentaBancaria(String iban,String dni){
		//this.iban = iban;
		setIban(iban);
		//this.dni = dni;
		this.setDNI(dni);
	}
	
	
	
	
	
	
	// M�todos de acceso . Setter y Getter
	
	public void setIban(String i){
		//C�digo de verificaci�n del ib�n: Dos primeras letras = ES
		if(i.startsWith("ES")){
			this.iban = i;
			
		}
	}
	
	public void setDNI(String dni){
		//C�digo de verificaci�n
		if(dni.length() == 9){
			if(Character.isLetter(dni.charAt(8))){
				this.dni = dni;
			}
		}
	}
	
	public void setSaldo(float saldo){
		if(saldo > 0){
			this.saldo = saldo;
			
		}
	}
	
	//M�todos de lectura: getters.
	public String getIban(){
		return this.iban;
	}
	
	public String getDNI(){
		return this.dni;
	}
	
	public float getSaldo(){
		return this.saldo;
	}
	
	
	@Override
	public String toString(){
		
		return "IBAN: " + this.iban + " DNI: " + this.dni + " Saldo: " + this.saldo;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
