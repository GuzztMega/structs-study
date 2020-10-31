package org.guzz.action;

import org.guzz.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestSite;
	private String language;

	public String getTutor() {
		
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		System.out.println(getLanguage());
		setBestSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		
		System.out.println("getTutor method called");
		return "success";

	}
	
public String addTutor() {
		
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		System.out.println(getLanguage());
		setBestSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
	
		System.out.println("addTutor method called");
		return "success";
	}

	public String getBestSite() {
		return bestSite;
	}

	public void setBestSite(String bestSite) {
		this.bestSite = bestSite;
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}