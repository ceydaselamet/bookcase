package com.bookcase.libraryservice.repository;

import com.bookcase.libraryservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, String> {
}
