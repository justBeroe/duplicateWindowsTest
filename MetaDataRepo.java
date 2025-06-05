package com.zwayam.metadata.metaDb.repository;

import com.zwayam.metadata.metaDb.model.Metadata;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MetaDataRepo extends MongoRepository<Metadata, String> {
    List<Metadata> findByCompanyIdAndKey(String companyId, String key);
}
