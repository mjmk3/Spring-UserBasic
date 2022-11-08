package io.basic.basicspring.DAO;

import io.basic.basicspring.Entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUpload extends JpaRepository<File, String> {
}
