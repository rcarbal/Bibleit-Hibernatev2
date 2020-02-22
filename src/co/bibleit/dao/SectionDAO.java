package co.bibleit.dao;

import java.util.List;

import co.bibleit.entity.BibleSection;

public interface SectionDAO {
	
	public List<BibleSection> getBibleSections();
}
