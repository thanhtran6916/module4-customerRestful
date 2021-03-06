package com.customer.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T> {
    Page<T> findAll(Pageable pageable);

    T save(T t);

    void deleteById(Long id);

    Optional<T> findById(Long id);

}
