package iphone;

public class Iphone {
	
	public static void main(String[] args) {
		Telefone telefone = new Telefone();
		Internet internet = new Internet();
		Ipod ipod = new Ipod();
		
		telefone.Atender();
		telefone.Desligar();
		telefone.Ligar();
		telefone.IniciarCorreioDeVoz();
		
		ipod.TocarMusica();
		ipod.Pausar();
		ipod.SelecionarMusica();
		
		internet.ExibirPagina();
		internet.AdicionarNovaAba();
		internet.AtualizarPagina();
	}
}
 