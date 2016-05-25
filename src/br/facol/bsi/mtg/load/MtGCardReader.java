package br.facol.bsi.mtg.load;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.facol.bsi.mtg.load.pojos.MtGSet;
import br.facol.bsi.mtg.load.pojos.MtGSet.Border;

public class MtGCardReader {
	private String jsonBruteFile = "/home/fchicout/Documents/nt_AllSets-x-unix.json";

	public MtGSet[] load() {
		// File to test: "/home/fchicout/Documents/nt_AllSets-x-unix.json"
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<MtGSet> result = new ArrayList<MtGSet>();
		try {
			JsonNode rootNode = mapper.readTree(new File(this.jsonBruteFile));
			Iterator<JsonNode> it = rootNode.iterator();
			MtGSet mtgSet;
			while (it.hasNext()) {
				JsonNode setOnJson = (JsonNode) it.next();
				mtgSet = new MtGSet();
				mtgSet.setName(setOnJson.get("name").asText());
				mtgSet.setReleaseDate(verifyDateProperty("releaseDate", setOnJson));
				mtgSet.setCode(setOnJson.get("code").asText());
				mtgSet.setMkm_name(verifyStringProperty("mkm_name", setOnJson));
				mtgSet.setBlock(verifyStringProperty("block", setOnJson));
				mtgSet.setBorder(Border.valueOf(setOnJson.get("border").asText()));
				result.add(mtgSet);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result.toArray(new MtGSet[result.size()]);
	}

	private String verifyStringProperty(String propName, JsonNode jsonNode) {
		if (jsonNode.get(propName) != null) {
			return jsonNode.get(propName).asText();
		}
		return "";
	}

	private Date verifyDateProperty(String propName, JsonNode jsonNode) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		if (jsonNode.get(propName) != null) {
			return dateFormat.parse(jsonNode.get(propName).asText());
		}
		return new Date();
	}

}
