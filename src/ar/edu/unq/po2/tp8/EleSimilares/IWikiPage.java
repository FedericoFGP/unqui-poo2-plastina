package ar.edu.unq.po2.tp8.EleSimilares;

import java.util.List;
import java.util.Map;

public interface IWikiPage {
	public String getTitle(); /*retorna el título de la página.*/
	public List<IWikiPage> getLinks(); /*retorna una Lista de las páginas de
	Wikipedia con las que se conecta.*/
	public Map<String, IWikiPage> getInfobox(); /*retorna un Map con un valor en
	texto y la pagina que describe ese valor que aparecen en los infobox de la
	página de Wikipedia.*/
}
