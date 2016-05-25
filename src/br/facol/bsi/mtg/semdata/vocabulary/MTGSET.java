package br.facol.bsi.mtg.semdata.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;

public class MTGSET {
	
	public static final String uri = "http://www.facol.br/2016/mtgset-rdf/0.1#";
	
	public static String getURI(){
		return uri;
	}
	
	private static final Model m = ModelFactory.createDefaultModel();
	public static final Property BORDER = m.createProperty(uri,"BORDER");
	public static final Property Name = m.createProperty(uri,"Name");
	public static final Property Code = m.createProperty(uri,"Code");
	public static final Property ReleaseDate = m.createProperty(uri,"ReleaseDate");
	

}
