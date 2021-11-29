package ar.edu.unq.po2.tp8.EleSimilares;

public class LinkEnComun extends Filtro{

	@Override
	public boolean esSimilar(IWikiPage pagMain, IWikiPage pagComparada) {
		// TODO Auto-generated method stub
		return pagComparada.getLinks().stream().anyMatch(pagMain.getLinks()::contains);
	}

}
