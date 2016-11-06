
package org.dgv.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "amsid", "lastupdate", "mediaPath", "pub-id", "doc-title", "elapsed-time", "fig" })
public class Response {

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	private List<Issn> issn = new ArrayList<Issn>();
	private String companyName;

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {

		return additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public List<Issn> getIssn() {
		return issn;
	}

	public void setIssn(List<Issn> issn) {
		this.issn = issn;
	}

	@JsonProperty("company")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
