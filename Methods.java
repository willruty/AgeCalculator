package Age;

public class Methods {

	private int dia;
	private int mes;
	private int ano;
	
	private int diaR;
	private int mesR;
	private int anoR;
	
	Integer meses[] = {31, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Methods(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	protected String protocoloAniversario(Integer diaN, Integer mesN) {
		
		String parabens = "Parabéns é o seu aniversário!!!!";
			
		if (diaN == dia && mesN == mes) {
			return parabens;
		} else {
			return "Wow!!!";
		}
	
	}

	protected String getDia(Integer diaN) {
		 if(dia > diaN) {
			 diaR = dia - diaN;
			 return "e " + diaR + " dias";
		 } else if (dia < diaN) {
			 diaR = dia + (meses[mes - 1] - diaN);
			 return "e " + diaR + " dias";
		 } else {
			 diaR = 0;
			 mesR += 1;
			 return "";
		 }
	}
	
	protected String getMes(Integer mesN) {
		 if (mes > mesN) {
			mesR = mes - mesN;
			return "e " + mesR + " meses ";
		} else if (mes < mesN) {
			mesR =  mes + (12 - mesN);
			return "e " + mesR + " meses ";
		} else if (mes == mesN){
			anoR += 1;
			mesR = 0;
			return "";
		} else {
			return mesR + " meses ";
		}
	}
	
	protected String getAno(Integer anoN) {
		anoR = ano - anoN;
		return anoR + " anos ";
	}
}
