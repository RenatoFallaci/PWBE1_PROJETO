

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestesJSON {

	public static void main(String[] args) {
		
try {
	ObjectMapper objeto = new ObjectMapper();
	Pessoa pes = new Pessoa();
	
	// serializar o obj pes
	String json = objeto.writeValueAsString(pes);
	System.out.println("Obejeto Serealizado");
	System.out.println(json);
	 //desenrializar o json o obj pes 
	
	Pessoa desPessoa= objeto.readValue(json, Pessoa.class);
	System.out.println ("JSON desserealizado para obj pessoa");
	System.out.println ("Nome:" + desPessoa.getNome());
	System.out.println ("idade:"+ desPessoa.getIdade());
}catch (Exception e ){
	e.printStackTrace();
}
	

}
}