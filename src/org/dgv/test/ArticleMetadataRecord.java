package org.dgv.test;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ArticleMetadataRecord {

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	private List<Issn> issn;
	private String companyName = "Hello";

	public ArticleMetadataRecord() {
	}

	public List<Issn> getIssn() {
		return issn;
	}

	public void setIssn(List<Issn> issn) {
		this.issn = issn;
	}

}
