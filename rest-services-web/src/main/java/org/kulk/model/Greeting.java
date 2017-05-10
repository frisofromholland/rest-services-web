package org.kulk.model;

/**
 * User: frisokulk
 * Date: 4/11/17
 * Time: 4:33 PM
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
	this.id = id;
	this.content = content;
    }

    public long getId() {
	return id;
    }

    public String getContent() {
	return content;
    }
}
