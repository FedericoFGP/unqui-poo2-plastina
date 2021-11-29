package ar.edu.unq.po2.tp8.EleSimilares;

import java.util.List;
import java.util.function.Predicate;

public class PropiedadEnComun extends Filtro{

	@Override
	public boolean esSimilar(IWikiPage pagMain, IWikiPage pagComparada) {
		// TODO Auto-generated method stub
		 return pagComparada.getInfobox().keySet().stream().anyMatch(pagMain.getInfobox().keySet()::contains);
	}
	

			
}
