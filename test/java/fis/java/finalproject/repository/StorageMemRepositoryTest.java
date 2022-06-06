package fis.java.finalproject.repository;

import fis.java.finalproject.model.Storage;
import fis.java.finalproject.repository.mem.StorageMemRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StorageMemRepositoryTest {

    @Test
    void insertOrUpdate() {
        StorageMemRepository storageMemRepository= StorageMemRepository.getInstance();
        Storage s1= new Storage(1, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);
        Storage s2= new Storage(2, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);

        storageMemRepository.insertOrUpdate(s1);
        storageMemRepository.insertOrUpdate(s2);

        assertEquals(2,storageMemRepository.findAll().size());
    }

    @Test
    void findById() {
        StorageMemRepository storageMemRepository= StorageMemRepository.getInstance();
        Storage s1= new Storage(1, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);
        Storage s2= new Storage(2, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);

        storageMemRepository.insertOrUpdate(s1);
        storageMemRepository.insertOrUpdate(s2);

        assertEquals(1, storageMemRepository.findById(1L).getId());
    }

    @Test
    void findAll() {
        StorageMemRepository storageMemRepository= StorageMemRepository.getInstance();
        Storage s1= new Storage(1, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);
        Storage s2= new Storage(2, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);

        storageMemRepository.insertOrUpdate(s1);
        storageMemRepository.insertOrUpdate(s2);

        assertEquals(2,storageMemRepository.findAll().size());
    }

    @Test
    void deleteById() {
        StorageMemRepository storageMemRepository= StorageMemRepository.getInstance();
        Storage s1= new Storage(1, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);
        Storage s2= new Storage(2, 1, LocalDateTime.now(),LocalDateTime.now(), "name",
                "location", null);

        storageMemRepository.insertOrUpdate(s1);
        storageMemRepository.insertOrUpdate(s2);
        storageMemRepository.deleteById(1L);

        assertEquals(1,storageMemRepository.findAll().size());
    }
}