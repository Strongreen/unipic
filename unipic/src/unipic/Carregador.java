package unipic;

public class Carregador {
	/***
	 * Le o arquivo com o programa e retorna o objeto Flash com o programa 
	 * armazenado
	 * @param filename nome do arquivo com codigo
	 * @return Flash com programa carregado
	 */
	private String [] codigo = { 
			":020000040000FA",
			":100000002500140A070EE201090801080B0804087C",
			":1000100008080008050806083100FF0C3000F0024F",
			":100020000F0AF1020D0A0008080C06006700000C18",
			":10003000020075007600130202093200030E26004A",
			":10004000030C0C0932031203040F2600030C0C09E5",
			":10005000B5024306B6021402030EE2013B0A400A4F",
			":100060004B0A010C660734001602020F43071B0AF5",
			":1000700074006600030066060300010C34001B0ACE",
			":10008000020C6607460A340075007600F7024A0A39",
			":10009000060C3700560A1602010F4307560A030CD6",
			":1000A000340075007600D70033001B0A15021F0EBE",
			":1000B00043071B0A9302030E4306010C040F33008F",
			":0200C0001B0A19",
			":021FFE00EA0FE8",
			":00000001FF"
	};
	
	private void lerArquivo(){
		codigo = null;
	}
	
	public String getAsm(){
		return "";
	}
	
	Flash load(String filename) {
		return null;
	}
}
