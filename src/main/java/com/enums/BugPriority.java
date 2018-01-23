package com.enums;

public enum BugPriority {
	
	    HIGH("high"),
	    advance("advance"),
	    LOW("low");

	    private String url;

	    BugPriority(String url) {
	        this.url = url;
	    }

	    public String url() {
	        return url;
	    }
}
