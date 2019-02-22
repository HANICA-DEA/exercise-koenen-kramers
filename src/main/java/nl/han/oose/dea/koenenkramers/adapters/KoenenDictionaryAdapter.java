package nl.han.oose.dea.koenenkramers.adapters;

import nl.oose.dea.koenenkramers.KoenenDictionary;

public class KoenenDictionaryAdapter implements DictionaryAdapter {
	
	private KoenenDictionary kd;
	
	public KoenenDictionaryAdapter(){
		kd = new KoenenDictionary();
		kd.openEnglishDutch();
		kd.openDutchEnglish();
	}

	public String getName() {
		return "Koenen";
	}

	public String translate(String word) {
		return kd.lookUp(word);
	}

}
