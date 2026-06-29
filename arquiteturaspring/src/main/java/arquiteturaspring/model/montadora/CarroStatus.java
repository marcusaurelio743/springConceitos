package arquiteturaspring.model.montadora;

public class CarroStatus {
	private String mensagem;
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	public CarroStatus(String mensagem) {
		super();
		this.mensagem = mensagem;
	}
	
}
