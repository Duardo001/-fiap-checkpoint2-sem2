package br.com.fiap.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.ecommerce.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // <T> T findByNome(String nome, Class<T> type);

    // <T> List<T> findAllByNome(String nome, Class<T> type);

    // <T> List<T> findAllByNomeContains(String nome, Class<T> type);
}
