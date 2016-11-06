
package org.dgv.test;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {})
public class Issn {

	private String format;
	private String val;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	private HashMap isbnDisplayMap = new HashMap<String, String>() {
		{
			put("electronic", "Electronic ISSN");
			put("paper", "Print ISSN");
			put("online", "Online ISSN");
			put("usb", "USB ISSN");
			put("cd", "CD-ROM ISSN");
			put("dvd", "DVD ISSN");
			put("pod", "Print on Demand(PoD) ISSN");
		}
	};

	/**
	 * 
	 * @return The format
	 */
	@JsonProperty("format")
	public String getFormat() {
		return (String) isbnDisplayMap.get(format);
	}

	@JsonIgnore
	public String getRawFormat() {
		return format;
	}

	/**
	 * 
	 * @param format
	 *            The format
	 */

	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * 
	 * @return The val
	 */
	@JsonProperty("value")
	public String getVal() {
		return val;
	}

	/**
	 * 
	 * @param val
	 *            The val
	 */

	public void setVal(String val) {
		this.val = val;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
