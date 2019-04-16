public class Pedido {
	private LocalDateTime data;
	private char estado;
	private LocalDateTime dataUltimoContacto;
	private Animal animal;
	private UtilizadorComum utilizadorComum;

	public void setData(LocalDateTime aData) {
		this.data = aData;
	}

	public LocalDateTime getData() {
		return this.data;
	}

	public void setEstado(char aEstado) {
		this.estado = aEstado;
	}

	public char getEstado() {
		return this.estado;
	}

	public void setDataUltimoContacto(LocalDateTime aDataUltimoContacto) {
		this.dataUltimoContacto = aDataUltimoContacto;
	}

	public LocalDateTime getDataUltimoContacto() {
		return this.dataUltimoContacto;
	}
}