package ar.edu.unq.po2.tp8.EleSimilares;

public class MismaLetraInicial extends Filtro{

	@Override
	public boolean esSimilar(IWikiPage pagMain, IWikiPage pagComparada) {
		// TODO Auto-generated method stub
		return pagMain.getTitle().charAt(0) == pagComparada.getTitle().charAt(0) ;
	}

}
