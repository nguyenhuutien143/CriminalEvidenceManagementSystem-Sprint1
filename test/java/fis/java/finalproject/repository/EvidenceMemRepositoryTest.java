package fis.java.finalproject.repository;

import fis.java.finalproject.model.*;
import fis.java.finalproject.repository.mem.EvidenceMemRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EvidenceMemRepositoryTest {

    @Test
    void getInstance() {
    }

    @Test
    void insertOrUpdate() {
        EvidenceMemRepository evidenceMemRepository= EvidenceMemRepository.getInstance();
        Evidence e1= new Evidence(1, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e2= new Evidence(2, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e3= new Evidence(3, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e4= new Evidence(4, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;

        evidenceMemRepository.insertOrUpdate(e1);
        evidenceMemRepository.insertOrUpdate(e2);

        assertEquals(2, evidenceMemRepository.findAll().size());

    }

    @Test
    void findById() {
        EvidenceMemRepository evidenceMemRepository= EvidenceMemRepository.getInstance();
        Evidence e1= new Evidence(1, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e2= new Evidence(2, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e3= new Evidence(3, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e4= new Evidence(4, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;

        evidenceMemRepository.insertOrUpdate(e1);
        evidenceMemRepository.insertOrUpdate(e2);

        assertEquals(1L,evidenceMemRepository.findById(1L).getId());
    }

    @Test
    void findAll() {
        EvidenceMemRepository evidenceMemRepository= EvidenceMemRepository.getInstance();
        Evidence e1= new Evidence(1, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e2= new Evidence(2, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e3= new Evidence(3, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e4= new Evidence(4, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;

        evidenceMemRepository.insertOrUpdate(e1);
        evidenceMemRepository.insertOrUpdate(e2);

        assertEquals(2,evidenceMemRepository.findAll().size());
    }

    @Test
    void deleteById() {
        EvidenceMemRepository evidenceMemRepository= EvidenceMemRepository.getInstance();
        Evidence e1= new Evidence(1, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e2= new Evidence(2, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e3= new Evidence(3, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;
        Evidence e4= new Evidence(4, 1, LocalDateTime.now(), LocalDateTime.now(), null,
                null, "1", "item name", "notes", true, null) ;

        evidenceMemRepository.insertOrUpdate(e1);
        evidenceMemRepository.insertOrUpdate(e2);
        evidenceMemRepository.deleteById(1L);

        assertEquals(1,evidenceMemRepository.findAll().size());
    }
}