package ar.edu.unq.po2.tp8.EleSimilares;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class Filtro {
	public List<IWikiPage> getSimilarPages(IWikiPage page, List<IWikiPage> wikipedia){
		//return this.wikipedia.
		return wikipedia.stream().filter(pag -> this.esSimilar(page, pag)).collect(Collectors.toList());
	}
	
	public abstract boolean esSimilar(IWikiPage pagMain, IWikiPage pagComparada);
}
