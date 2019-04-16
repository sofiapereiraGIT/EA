import java.util.Vector;

public class Canil extends Utilizador {
	private String morada;
	private String horario;
	private String siteOficial;
	private String facebook;
	private String instagram;
	private Vector<FAT> listaPedidosFAT = new Vector<FAT>();

	public void setMorada(String aMorada) {
		this.morada = aMorada;
	}

	public String getMorada() {
		return this.morada;
	}

	public void setHorario(String aHorario) {
		this.horario = aHorario;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setSiteOficial(String aSiteOficial) {
		this.siteOficial = aSiteOficial;
	}

	public String getSiteOficial() {
		return this.siteOficial;
	}

	public void setFacebook(String aFacebook) {
		this.facebook = aFacebook;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public void setInstagram(String aInstagram) {
		this.instagram = aInstagram;
	}

	public String getInstagram() {
		return this.instagram;
	}
}