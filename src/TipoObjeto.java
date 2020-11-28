
public class TipoObjeto {
	private int ID_tipo_objeto;
	private String tipo_desc;
	
	
	
	
	public TipoObjeto(int iD_tipo_objeto, String tipo_desc) {

		ID_tipo_objeto = iD_tipo_objeto;
		this.tipo_desc = tipo_desc;
	}
	public int getID_tipo_objeto() {
		return ID_tipo_objeto;
	}
	public void setID_tipo_objeto(int iD_tipo_objeto) {
		ID_tipo_objeto = iD_tipo_objeto;
	}
	public String getTipo_desc() {
		return tipo_desc;
	}
	public void setTipo_desc(String tipo_desc) {
		this.tipo_desc = tipo_desc;
	}
	
}
